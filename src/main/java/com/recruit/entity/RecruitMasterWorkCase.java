package com.recruit.entity;

import com.recruit.common.validate.DV;
import lombok.Data;

/**
 * 牛人工作經驗
 */
@Data
public class RecruitMasterWorkCase {

    private Long id;
    /**
     * 工作经验
     */
    private String workName;
    /**
     * 职责
     */
    private String responsibilities;
    /**
     * 作品链接
     */
    private String worksLink;

    /**
     * 上传图片地址(可能多个)
     */
    private String imgUrls;
    /**
     * 作品描述
     */
    @DV(description = "项目类型",maxLength = 500)
    private String worksDesc;
}