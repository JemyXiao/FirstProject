package com.recruit.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruit.entity.*;
import com.recruit.entity.dto.EmployerDto;
import com.recruit.service.*;
import com.recruit.util.ErrorCode;
import com.recruit.util.HttpURLConnectionUtils;
import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * Created by jmx
 * 2017/7/19.
 */
@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private EmployerService employerService;

    @Autowired
    private TechMasterService techMasterService;

    @Autowired
    private BaseSkillService baseSkillService;

    @Autowired
    private CityService cityService;

    @Autowired
    private IndustryService industryService;

    @Autowired
    private DataDictionaryService dataDictionaryService;

    @Autowired
    private BusinessService businessService;

    @Value("${upload.path1}")
    private String path;
    @Value("${upload.path2}")
    private String pathSl;

    /**
     * 任务列表查询
     */
    @GetMapping("/queryEmpList")
    public ResultModel queryEmpList(HttpServletRequest request) {
        EmployerDto record = new EmployerDto();
        record.setStatus(request.getParameter("status"));
        PageInfo pageInfo = PageHelper.startPage(Integer.parseInt(request.getParameter("pageNumber")), Integer.parseInt(request.getParameter("pageSize"))).doSelectPageInfo(() -> employerService.queryEmployerViewHeader(record));
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("rows", pageInfo.getList());
        map.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(map));
    }

    /**
     * 任务详情查询
     */
    @GetMapping("/detailEmp")
    public ResultModel detailEmp(HttpServletRequest request) {
        EmployerDetailEntity employerEntity = employerService.queryEmployerDetail(Long.parseLong(request.getParameter("id")));
        return new ResultModel(200, employerEntity);
    }

    /**
     * 任务审核
     */
    @GetMapping("/checkEmp")
    public ResultModel checkEmp(HttpServletRequest request) {
        employerService.checkEmp(Long.parseLong(request.getParameter("id")), request.getParameter("status"), request.getParameter("reason"));
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 用户列表查询
     */
    @GetMapping("/queryMasterList")
    public ResultModel queryMasterList(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        String status = request.getParameter("status");
        Map<String, Object> map = new HashMap();
        map.put("status", status);
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> techMasterService.selectAllMaster(map));
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 用户详情查询
     */
    @GetMapping("/queryMasterDetail")
    public ResultModel queryMasterDetail(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        RecruitTechMaster master = techMasterService.getTechMasterById(id);
        return new ResultModel(200, master);
    }

    /**
     * 用户审核
     */
    @GetMapping("/checkMaster")
    public ResultModel checkMaster(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        String status = request.getParameter("status");
        String reason = request.getParameter("reason");
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("status", status);
        map.put("reason", reason);
        techMasterService.checkTechMaster(map);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 技能新增
     */
    @PostMapping(value = "/addSkill")
    public ResultModel addSkill(@RequestBody RecruitBaseSkill record) {
        if (record.getId() > 0) {
            baseSkillService.update(record);
        } else {
            baseSkillService.insert(record);
        }
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 技能删除
     */
    @GetMapping("/deleteSkill")
    public ResultModel deleteSkill(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        baseSkillService.delete(id);
        return new ResultModel(200, JSON.toJSON(ErrorCode.DELETE_OK));
    }

    /**
     * 技能查询
     */
    @GetMapping("/querySkillList")
    public ResultModel querySkillList(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> baseSkillService.getBaseSkillInfo());
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 城市列表
     */
    @GetMapping("/queryCityList")
    public ResultModel queryCityList(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> cityService.getAllCity());
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 新增城市
     */
    @PostMapping("/addCity")
    public ResultModel addCity(@RequestBody RecruitCity record) {
        if (record.getId() > 0) {
            cityService.update(record);
        } else {
            cityService.insert(record);
        }
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));
    }

    /**
     * 城市失效
     */
    @GetMapping("/failCity")
    public ResultModel failCity(HttpServletRequest request) {
        cityService.fail(Long.valueOf(request.getParameter("id")));
        return new ResultModel(200, JSON.toJSON(ErrorCode.DELETE_OK));
    }

    /**
     * 行业查询
     */
    @GetMapping("/queryAllIndustry")
    public ResultModel queryAllIndustry(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> industryService.queryAllIndustry());
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 行业新增
     */
    @PostMapping("/addIndustry")
    public ResultModel addIndustry(@RequestBody RecruitIndustry industry) {
        if (industry.getId() > 0) {
            industryService.update(industry);
        } else {
            industryService.insert(industry);
        }
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));
    }

    /**
     * 行业信息失效
     */
    @GetMapping("/failIndustry")
    public ResultModel failIndustry(HttpServletRequest request) {
        industryService.fail(Long.valueOf(request.getParameter("id")));
        return new ResultModel(200, JSON.toJSON(ErrorCode.DELETE_OK));
    }

    /**
     * 数据字典查询
     */
    @GetMapping("/queryDataDictionary")
    public ResultModel queryDataDictionary(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo pageInfo = PageHelper.startPage(pageNumber, pageSize).doSelectPageInfo(() -> dataDictionaryService.getDataDictionary(new HashMap()));
        Map<String, Object> mapResult = new LinkedHashMap<>();
        mapResult.put("rows", pageInfo.getList());
        mapResult.put("total", pageInfo.getTotal());
        return new ResultModel(200, JSON.toJSON(mapResult));
    }

    /**
     * 数据字新增
     */
    @PostMapping("/addDataDictionary")
    public ResultModel addDataDictionary(@RequestBody DataDictionaryEntity entity) {
        if (entity.getId() != null) {
            dataDictionaryService.update(entity);
        } else {
            dataDictionaryService.insert(entity);
        }
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));
    }

    /**
     * 数据字失效
     */
    @GetMapping("/failDataDictionary")
    public ResultModel failDataDictionary(HttpServletRequest request) {
        dataDictionaryService.fail(Long.valueOf(request.getParameter("id")));
        return new ResultModel(200, JSON.toJSON(ErrorCode.DELETE_OK));
    }

    /**
     * 业务类型(策划，设计，活动，影视)
     */
    @GetMapping("/queryBusinessType")
    public ResultModel queryBusinessType() {
        Map<String, Object> map = new HashMap();
        map.put("parentId", 0);
        List<RecruitBusiness> businessList = businessService.getBusinessType(map);
        return new ResultModel(200, businessList);
    }

    /**
     * 查询所有业务数据
     */
    @GetMapping("/queryBusinessList")
    public ResultModel queryBusinessList(HttpServletRequest request) {
        List<RecruitBusiness> businessList = businessService.getBusinessInfo();
        return new ResultModel(200, businessList);
    }

    /**
     * 新增业务
     */
    @PostMapping("/addBusiness")
    public ResultModel addBusiness(@RequestBody RecruitBusiness record) {
        businessService.insert(record);
        return new ResultModel(200, JSON.toJSON(ErrorCode.INSERT_OK));
    }

    /**
     * 文件上传
     */
    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    public ResultModel testUploadFile(HttpServletRequest req, @RequestParam("file") MultipartFile file) throws IOException {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = timeInMillis + suffix;
        File filePath = new File(path + fileName);
        log.info(path);
        if (!file.isEmpty()) {
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filePath));
            out.write(file.getBytes());
            out.flush();
            out.close();
        }
        if (suffix.equals(".png") || suffix.equals(".jpg") || suffix.equals(".JPEG")) {
            /**
             * 缩略图begin
             */
//            long size = file.getSize();
//            double scale = 1.0d;
//            if (size >= 200 * 1024) {
//                if (size > 0) {
//                    scale = (200 * 1024f) / size;
//                }
//            }
            try {
                Thumbnails.of(file.getInputStream()).size(300, 400).outputQuality(1f).toFile(pathSl + fileName);

            } catch (Exception e1) {
                return new ResultModel(400, "操作失败", e1.getMessage());
            }
            /**
             * 缩略图end
             */
        }
        return new ResultModel(200, JSON.toJSON(fileName));

    }

    /**
     * 认证牛人
     *
     * @param request
     * @return
     */
    @GetMapping("verifiedMaster")
    public ResultModel verifiedMaster(HttpServletRequest request) {
        Long masterId = Long.parseLong(request.getParameter("id"));
        int verified = Integer.parseInt(request.getParameter("verified"));
        Map<String, Object> map = new HashMap();
        map.put("masterId", masterId);
        map.put("verified", verified);
        techMasterService.verified(map);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }

    /**
     * 认证发布信息
     */
    @GetMapping("verifiedEmployer")
    public ResultModel verifiedEmployer(HttpServletRequest request) {
        Long empId = Long.parseLong(request.getParameter("id"));
        int verified = Integer.parseInt(request.getParameter("verified"));
        Map<String, Object> map = new HashMap();
        map.put("empId", empId);
        map.put("verified", verified);
        employerService.verified(map);
        return new ResultModel(200, JSON.toJSON(ErrorCode.OK));
    }
}
