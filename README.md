# FirstProject
this is my first project
1. 查询首页发布信息

    
        链接: /employer/queryEmpViewHeader
        POST
        
        参数:  | name              |  是否必须 |  描述                                 |
              | -----------      | --------- | ------------------------------------- |
              | status           |    是     |  状态(默认待审核)                               |
              | businessParentId |    否     |  类型查询参数                    |
              | pageNumber       |    否     |  分页                                  |
              | pageSize         |    否     |  分页  
                                              
                                             |
         
         返回数据： 
          {
          "code": 200,
          "data": {
              "rows": [
                  {
                      "id": 7,
                      "openId": null,
                      "projectBudget": 5000,
                      "projectName": "母鸡啊",
                      "status": "待审核",
                      "businessId": 2,
                      "businessParentId": 1,
                      "baseSkills": [],
                      "recruitBusiness": {
                          "id": 2,
                          "businessName": "室内设计",
                          "businessCode": "10001",
                          "parentId": 1,
                          "children": null,
                          "parentBusiness": {
                              "id": 1,
                              "businessName": "设计",
                              "businessCode": "100",
                              "parentId": 0,
                              "children": null,
                              "parentBusiness": null,
                              "createdAt": 1498015320000,
                              "updatedAt": 1498015320000
                          },
                          "createdAt": 1498015336000,
                          "updatedAt": 1498015336000
                      },
                      "visitCount": 4,
                      "applyCount": 0,
                      "recommendCount": 0,
                      "createdAt": 1498828386000,
                      "updatedAt": 1498829672000
                  },
                  {
                      "id": 6,
                      "openId": null,
                      "projectBudget": 0,
                      "projectName": "母鸡啊",
                      "status": "待审核",
                      "businessId": 2,
                      "businessParentId": 1,
                      "baseSkills": [],
                      "recruitBusiness": {
                          "id": 2,
                          "businessName": "室内设计",
                          "businessCode": "10001",
                          "parentId": 1,
                          "children": null,
                          "parentBusiness": {
                              "id": 1,
                              "businessName": "设计",
                              "businessCode": "100",
                              "parentId": 0,
                              "children": null,
                              "parentBusiness": null,
                              "createdAt": 1498015320000,
                              "updatedAt": 1498015320000
                          },
                          "createdAt": 1498015336000,
                          "updatedAt": 1498015336000
                      },
                      "visitCount": 0,
                      "applyCount": 0,
                      "recommendCount": 0,
                      "createdAt": 1498827445000,
                      "updatedAt": 1498827445000
                  },
                  {
                      "id": 3,
                      "openId": null,
                      "projectBudget": 0,
                      "projectName": "测试发布项目",
                      "status": "待审核",
                      "businessId": 5,
                      "businessParentId": 6,
                      "baseSkills": [
                          {
                              "id": 2,
                              "skillName": "室内设计",
                              "createdAt": null,
                              "updatedAt": null,
                              "skillCode": "10001"
                          },
                          {
                              "id": 3,
                              "skillName": "室外实际",
                              "createdAt": null,
                              "updatedAt": null,
                              "skillCode": "10002"
                          },
                          {
                              "id": 5,
                              "skillName": "室内摄影",
                              "createdAt": null,
                              "updatedAt": null,
                              "skillCode": "20001"
                          }
                      ],
                      "recruitBusiness": {
                          "id": 5,
                          "businessName": "室内摄影",
                          "businessCode": "20001",
                          "parentId": 4,
                          "children": null,
                          "parentBusiness": {
                              "id": 6,
                              "businessName": "室外摄影",
                              "businessCode": "20001",
                              "parentId": 4,
                              "children": null,
                              "parentBusiness": null,
                              "createdAt": 1498584026000,
                              "updatedAt": 1498584026000
                          },
                          "createdAt": 1498584026000,
                          "updatedAt": 1498584026000
                      },
                      "visitCount": 0,
                      "applyCount": 0,
                      "recommendCount": 0,
                      "createdAt": 1498670647000,
                      "updatedAt": 1498810101000
                  }
              ],
              "total": 5
          }
      }
      
 2.发布信息详情 
       
       
       链接: /employer/queryDetail
       
       参数:          | name        |  是否必须  |  描述
                     | ----------- | --------- | -----------------
                     | id          |    是     | 发布信息id
                      
          请求类型：POST
               
               返回数据： 
               {
                   "code": 200,
                   "data": {
                       "id": 7,
                       "openId": null,
                       "projectBudget": 5000,
                       "projectName": "母鸡啊",
                       "status": "待审核",
                       "businessId": 2,
                       "businessParentId": 1,
                       "baseSkills": [
                           {
                               "id": 1,
                               "skillName": "软件开发",
                               "createdAt": null,
                               "updatedAt": null,
                               "skillCode": "100"
                           },
                           {
                               "id": 2,
                               "skillName": "网站设计",
                               "createdAt": null,
                               "updatedAt": null,
                               "skillCode": "101"
                           },
                           {
                               "id": 3,
                               "skillName": "室内装潢",
                               "createdAt": null,
                               "updatedAt": null,
                               "skillCode": "201"
                           }
                       ],
                       "recruitBusiness": {
                           "id": 2,
                           "businessName": "室内设计",
                           "businessCode": "10001",
                           "parentId": 1,
                           "children": null,
                           "parentBusiness": {
                               "id": 1,
                               "businessName": "设计",
                               "businessCode": "100",
                               "parentId": 0,
                               "children": null,
                               "parentBusiness": null,
                               "createdAt": 1498015320000,
                               "updatedAt": 1498015320000
                           },
                           "createdAt": 1498015336000,
                           "updatedAt": 1498015336000
                       },
                       "visitCount": 4,
                       "applyCount": 0,
                       "recommendCount": 0,
                       "createdAt": 1498828386000,
                       "updatedAt": 1498829672000,
                       "companyName": "上海",
                       "trendComplete": "company",
                       "projectDesc": "缝纫机啊",
                       "publisher": "",
                       "phone": null,
                       "projectCycle": "一周以内"
                   }
               }
3.查询所有城市信息
               
               链接："/city/getAllCity"
               
               请求类型：GET
               
               返回数据：
               
                {
                   "code": 200,
                   "data": [
                       {
                           "id": 1,
                           "cityName": "上海",
                           "hotTop": 10,
                           "createdAt": 1498376435000,
                           "updatedAt": 1498376435000,
                           "cityCode": "100"
                       },
                       {
                           "id": 2,
                           "cityName": "北京",
                           "hotTop": 10,
                           "createdAt": 1498376435000,
                           "updatedAt": 1498376435000,
                           "cityCode": "101"
                       },
                       {
                           "id": 3,
                           "cityName": "珠海",
                           "hotTop": 10,
                           "createdAt": 1498376435000,
                           "updatedAt": 1498376435000,
                           "cityCode": "102"
                       },
                       {
                           "id": 4,
                           "cityName": "广州",
                           "hotTop": 10,
                           "createdAt": 1498376435000,
                           "updatedAt": 1498376435000,
                           "cityCode": "103"
                       },
                       {
                           "id": 5,
                           "cityName": "哈尔滨",
                           "hotTop": 0,
                           "createdAt": 1498376435000,
                           "updatedAt": 1498376435000,
                           "cityCode": "104"
                       }
                   ]
               }
               
4.完善牛人基础信息

         链接：/techMaster/update
         
         请求类型:POST
         参数：{
            	"nickName":"dsds",
            	"dailyWage":"1233",
            	"cityId":"12",
            	"sex":"MAN",
            	"jobTitle":"woaini,woow",
            	"workExperience":"yuuoo",
            	"phone":"276343422",
            	"selfIntroduction":"woaid",
            	"skills":[1,2,3]
            }
          
      返回数据：
          {
            "code":200,
            "data":"添加成功"
          }
 5.更新作品案例
             
             链接：/techMasterWorksCase/update        
             请求类型:POST
             参数：
                 
               {
                "workName":"aiai",
                "responsibilities":"rere",
                "industryId":1,
                "industryName":"软件",
                "worksLink":"www.rer",
                "worksDesc":"woaini"
             		}
            返回数据：
                      {
                        "code":200,
                        "data":"添加成功"
                      }
6.添加发布信息

         链接：/employer/add
         
         请求类型:POST
                   
         {
         	"businessParentId":1,
          	 "businessId":2,
          	 "projectName":"母鸡啊",
          	 "projectDesc":"缝纫机啊",
          	 "projectBudget":"5000以上",
          	 "objectCycle":"一周以内",
          	 "companyName":"上海",
          	 "trendComplete":"company",
          	 "status":"招募中",
          	 "skillList":[
          	 	1,2,3
          	 	]
         }
          返回数据：
                    {
                      "code":200,
                      "data":"添加成功"
                    }
                    
7.牛人发送申请意向



    链接：/techMaster/applyEmployer/{id}
           
    请求类型:GET 
   
    返回数据：
   
       {
           "code": 200,
           "data": "申请成功"
       }
           
8.个人发出、接收招募信息
                     
                     链接：/techMaster/getEmployer
                     
                     请求类型:GET 
                     
                      参数:         | name              |  是否必须 |  描述                                   |
                                   | -----------      | --------- | ------------------------------------- |
                                   | status           |    是     |  状态(send or receive)                 |
                                   | pageNumber       |    是     |  分页                                  |
                                   | pageSize         |    是     |  分页               
                      返回数据： 
                           {
                               "code": 200,
                               "data": {
                                   "rows": [
                                       {
                                           "id": 7,
                                           "openId": null,
                                           "projectBudget": 5000,
                                           "projectName": "母鸡啊",
                                           "status": "待审核",
                                           "businessId": 2,
                                           "businessParentId": 1,
                                           "baseSkills": [],
                                           "recruitBusiness": {
                                               "id": 2,
                                               "businessName": "室内设计",
                                               "businessCode": "10001",
                                               "parentId": 1,
                                               "children": null,
                                               "parentBusiness": {
                                                   "id": 1,
                                                   "businessName": "设计",
                                                   "businessCode": "100",
                                                   "parentId": 0,
                                                   "children": null,
                                                   "parentBusiness": null,
                                                   "createdAt": 1498015320000,
                                                   "updatedAt": 1498015320000
                                               },
                                               "createdAt": 1498015336000,
                                               "updatedAt": 1498015336000
                                           },
                                           "visitCount": 4,
                                           "applyCount": 0,
                                           "recommendCount": 0,
                                           "createdAt": 1498828386000,
                                           "updatedAt": 1498829672000
                                       },
                                       {
                                           "id": 6,
                                           "openId": null,
                                           "projectBudget": 0,
                                           "projectName": "母鸡啊",
                                           "status": "待审核",
                                           "businessId": 2,
                                           "businessParentId": 1,
                                           "baseSkills": [],
                                           "recruitBusiness": {
                                               "id": 2,
                                               "businessName": "室内设计",
                                               "businessCode": "10001",
                                               "parentId": 1,
                                               "children": null,
                                               "parentBusiness": {
                                                   "id": 1,
                                                   "businessName": "设计",
                                                   "businessCode": "100",
                                                   "parentId": 0,
                                                   "children": null,
                                                   "parentBusiness": null,
                                                   "createdAt": 1498015320000,
                                                   "updatedAt": 1498015320000
                                               },
                                               "createdAt": 1498015336000,
                                               "updatedAt": 1498015336000
                                           },
                                           "visitCount": 0,
                                           "applyCount": 0,
                                           "recommendCount": 0,
                                           "createdAt": 1498827445000,
                                           "updatedAt": 1498827445000
                                       },
                                       {
                                           "id": 3,
                                           "openId": null,
                                           "projectBudget": 0,
                                           "projectName": "测试发布项目",
                                           "status": "待审核",
                                           "businessId": 5,
                                           "businessParentId": 6,
                                           "baseSkills": [
                                               {
                                                   "id": 2,
                                                   "skillName": "室内设计",
                                                   "createdAt": null,
                                                   "updatedAt": null,
                                                   "skillCode": "10001"
                                               },
                                               {
                                                   "id": 3,
                                                   "skillName": "室外实际",
                                                   "createdAt": null,
                                                   "updatedAt": null,
                                                   "skillCode": "10002"
                                               },
                                               {
                                                   "id": 5,
                                                   "skillName": "室内摄影",
                                                   "createdAt": null,
                                                   "updatedAt": null,
                                                   "skillCode": "20001"
                                               }
                                           ],
                                           "recruitBusiness": {
                                               "id": 5,
                                               "businessName": "室内摄影",
                                               "businessCode": "20001",
                                               "parentId": 4,
                                               "children": null,
                                               "parentBusiness": {
                                                   "id": 6,
                                                   "businessName": "室外摄影",
                                                   "businessCode": "20001",
                                                   "parentId": 4,
                                                   "children": null,
                                                   "parentBusiness": null,
                                                   "createdAt": 1498584026000,
                                                   "updatedAt": 1498584026000
                                               },
                                               "createdAt": 1498584026000,
                                               "updatedAt": 1498584026000
                                           },
                                           "visitCount": 0,
                                           "applyCount": 0,
                                           "recommendCount": 0,
                                           "createdAt": 1498670647000,
                                           "updatedAt": 1498810101000
                                       }
                                   ],
                                   "total": 5
                               }
                           }
9.查询牛人大厅
                      
                      链接：/techMaster/queryMasterList
                                         
                         请求类型:GET 
                                         
                         参数:      | name             |  是否必须    |  描述                                   |
                                   | -----------      | ---------  | ------------------------------------- |
                                   | cityId           |    否      |     城市Id
                                   | queryParam       |    否      |     技能名称模糊匹配
                                   | industryId       |    否      |     行业id
                                   | pageNumber       |    是      |     分页                                  |
                                   | pageSize         |    是      |     分页         
                                     
                                     
                                     
                       返回参数：
                                 {
                                     "code": 200,
                                     "data": {
                                         "rows": [
                                             {
                                                 "industryName": "智能硬件",
                                                 "nickName": "jinming.xiao",
                                                 "openId": null,
                                                 "jobTitle": "woaini,woow",
                                                 "sex": "MAN",
                                                 "workExperience": "5",
                                                 "selfIntroduction": null,
                                                 "worksCases": null,
                                                 "cityId": 1,
                                                 "skills": null,
                                                 "createdAt": null,
                                                 "score": null,
                                                 "industryId": 1,
                                                 "areaId": null,
                                                 "cityName": "上海",
                                                 "phone": "12345678912",
                                                 "dailyWage": "500",
                                                 "id": 5,
                                                 "jobType": null,
                                                 "status": "待审核",
                                                 "updatedAt": null
                                             }
                                         ],
                                         "total": 1
                                     }
                                 }  
                                   
                                   
10.行业信息查询
                                 
                                 链接：/industry/getAllIndustry
                                                                         
                                 请求类型:GET  
                                   
                                 返回数据：
                                 {
                                     "code": 200,
                                     "data": [
                                         {
                                             "id": 1,
                                             "industryCode": 100,
                                             "industryName": "智能硬件",
                                             "createdAt": 1499395796000,
                                             "updatedAt": 1499395796000
                                         },
                                         {
                                             "id": 2,
                                             "industryCode": 101,
                                             "industryName": "互联网产业",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 3,
                                             "industryCode": 102,
                                             "industryName": "商业零售",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 4,
                                             "industryCode": 103,
                                             "industryName": "文化娱乐",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 5,
                                             "industryCode": 104,
                                             "industryName": "共享经济",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 6,
                                             "industryCode": 105,
                                             "industryName": "快消品",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 7,
                                             "industryCode": 106,
                                             "industryName": "服装",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 8,
                                             "industryCode": 107,
                                             "industryName": "美食餐饮",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 9,
                                             "industryCode": 108,
                                             "industryName": "美容医疗",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 10,
                                             "industryCode": 109,
                                             "industryName": "共享经济",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         },
                                         {
                                             "id": 11,
                                             "industryCode": 110,
                                             "industryName": "家具建材",
                                             "createdAt": 1499395797000,
                                             "updatedAt": 1499395797000
                                         }
                                     ]
                                 }
 11. 牛人详情接口
     
                     
                     链接：/techMaster/queryMasterDetail
                                                            
                                            请求类型:GET 
                                                            
                                            参数:      | name             |  是否必须    |  描述                                   |
                                                      | -----------      | ---------  | ------------------------------------- |
                                                      | id               |    否      |    牛人id(个人查询不需要传)
                                                     
                                                        
       
                                             返回数据：
                                               {
                                                   "code": 200,
                                                   "data": {
                                                       "id": 1,
                                                       "nickName": "dsds",
                                                       "openId": null,
                                                       "dailyWage": "1233",
                                                       "cityId": 1,
                                                       "cityName": "上海",
                                                       "areaId": null,
                                                       "sex": "MAN",
                                                       "status": "待审核",
                                                       "jobTitle": "woaini,woow",
                                                       "recruitType": null,
                                                       "workExperience": "yuuoo",
                                                       "phone": "276343422",
                                                       "score": null,
                                                       "selfIntroduction": "woaid",
                                                       "skills": null,
                                                       "industryId": 2,
                                                       "industryName": "互联网产业",
                                                       "worksCases": [
                                                           {
                                                               "id": 6,
                                                               "workName": "aiai",
                                                               "responsibilities": "rere",
                                                               "worksLink": "www.rer",
                                                               "worksDesc": "woaini"
                                                           }
                                                       ],
                                                       "baseSkillList": [
                                                           {
                                                               "id": 1,
                                                               "skillName": "软件开发",
                                                               "createdAt": 1498377131000,
                                                               "updatedAt": 1498377131000,
                                                               "skillCode": "100"
                                                           },
                                                           {
                                                               "id": 2,
                                                               "skillName": "网站设计",
                                                               "createdAt": 1498377131000,
                                                               "updatedAt": 1498377131000,
                                                               "skillCode": "101"
                                                           },
                                                           {
                                                               "id": 3,
                                                               "skillName": "室内装潢",
                                                               "createdAt": 1498377131000,
                                                               "updatedAt": 1498444679000,
                                                               "skillCode": "201"
                                                           }
                                                       ],
                                                       "createdAt": null,
                                                       "updatedAt": null
                                                   }
                                               }
                                               
                                               
                                              
12.任务列表查询
                    
                    链接：/admin/queryEmpList
                                                             
                         请求类型:GET 
                                         
                         参数:      | name             |  是否必须    |  描述                                   |
                                   | -----------      | ---------  | ------------------------------------- |
                                   | status           |    是      |     列表状态()                                  |
                                   | pageNumber       |    是      |     分页                                  |
                                   | pageSize         |    是      |     分页                               
                       返回数据： 
                                 {
                                 "code": 200,
                                 "data": {
                                     "rows": [
                                         {
                                             "id": 7,
                                             "openId": null,
                                             "projectBudget": 5000,
                                             "projectName": "母鸡啊",
                                             "status": "待审核",
                                             "businessId": 2,
                                             "businessParentId": 1,
                                             "baseSkills": [],
                                             "recruitBusiness": {
                                                 "id": 2,
                                                 "businessName": "室内设计",
                                                 "businessCode": "10001",
                                                 "parentId": 1,
                                                 "children": null,
                                                 "parentBusiness": {
                                                     "id": 1,
                                                     "businessName": "设计",
                                                     "businessCode": "100",
                                                     "parentId": 0,
                                                     "children": null,
                                                     "parentBusiness": null,
                                                     "createdAt": 1498015320000,
                                                     "updatedAt": 1498015320000
                                                 },
                                                 "createdAt": 1498015336000,
                                                 "updatedAt": 1498015336000
                                             },
                                             "visitCount": 4,
                                             "applyCount": 0,
                                             "recommendCount": 0,
                                             "createdAt": 1498828386000,
                                             "updatedAt": 1498829672000
                                         },
                                         {
                                             "id": 6,
                                             "openId": null,
                                             "projectBudget": 0,
                                             "projectName": "母鸡啊",
                                             "status": "待审核",
                                             "businessId": 2,
                                             "businessParentId": 1,
                                             "baseSkills": [],
                                             "recruitBusiness": {
                                                 "id": 2,
                                                 "businessName": "室内设计",
                                                 "businessCode": "10001",
                                                 "parentId": 1,
                                                 "children": null,
                                                 "parentBusiness": {
                                                     "id": 1,
                                                     "businessName": "设计",
                                                     "businessCode": "100",
                                                     "parentId": 0,
                                                     "children": null,
                                                     "parentBusiness": null,
                                                     "createdAt": 1498015320000,
                                                     "updatedAt": 1498015320000
                                                 },
                                                 "createdAt": 1498015336000,
                                                 "updatedAt": 1498015336000
                                             },
                                             "visitCount": 0,
                                             "applyCount": 0,
                                             "recommendCount": 0,
                                             "createdAt": 1498827445000,
                                             "updatedAt": 1498827445000
                                         },
                                         {
                                             "id": 3,
                                             "openId": null,
                                             "projectBudget": 0,
                                             "projectName": "测试发布项目",
                                             "status": "待审核",
                                             "businessId": 5,
                                             "businessParentId": 6,
                                             "baseSkills": [
                                                 {
                                                     "id": 2,
                                                     "skillName": "室内设计",
                                                     "createdAt": null,
                                                     "updatedAt": null,
                                                     "skillCode": "10001"
                                                 },
                                                 {
                                                     "id": 3,
                                                     "skillName": "室外实际",
                                                     "createdAt": null,
                                                     "updatedAt": null,
                                                     "skillCode": "10002"
                                                 },
                                                 {
                                                     "id": 5,
                                                     "skillName": "室内摄影",
                                                     "createdAt": null,
                                                     "updatedAt": null,
                                                     "skillCode": "20001"
                                                 }
                                             ],
                                             "recruitBusiness": {
                                                 "id": 5,
                                                 "businessName": "室内摄影",
                                                 "businessCode": "20001",
                                                 "parentId": 4,
                                                 "children": null,
                                                 "parentBusiness": {
                                                     "id": 6,
                                                     "businessName": "室外摄影",
                                                     "businessCode": "20001",
                                                     "parentId": 4,
                                                     "children": null,
                                                     "parentBusiness": null,
                                                     "createdAt": 1498584026000,
                                                     "updatedAt": 1498584026000
                                                 },
                                                 "createdAt": 1498584026000,
                                                 "updatedAt": 1498584026000
                                             },
                                             "visitCount": 0,
                                             "applyCount": 0,
                                             "recommendCount": 0,
                                             "createdAt": 1498670647000,
                                             "updatedAt": 1498810101000
                                         }
                                     ],
                                     "total": 5
                                 }
                             }
                         
13.用户详情接口               
                  
                   链接：/admin/detailEmp
                                                                               
                   请求类型:GET 
                                   
                   参数:      | name             |  是否必须    |  描述                                   |
                             | -----------      | ---------  | ------------------------------------- |
                             | id                |    是          任务id                             | 
                                                                 
                                                                                         
                    
                    返回数据： 
                               {
                                   "code": 200,
                                   "data": {
                                       "id": 7,
                                       "openId": null,
                                       "projectBudget": 5000,
                                       "projectName": "母鸡啊",
                                       "status": "待审核",
                                       "businessId": 2,
                                       "businessParentId": 1,
                                       "baseSkills": [
                                           {
                                               "id": 1,
                                               "skillName": "软件开发",
                                               "createdAt": null,
                                               "updatedAt": null,
                                               "skillCode": "100"
                                           },
                                           {
                                               "id": 2,
                                               "skillName": "网站设计",
                                               "createdAt": null,
                                               "updatedAt": null,
                                               "skillCode": "101"
                                           },
                                           {
                                               "id": 3,
                                               "skillName": "室内装潢",
                                               "createdAt": null,
                                               "updatedAt": null,
                                               "skillCode": "201"
                                           }
                                       ],
                                       "recruitBusiness": {
                                           "id": 2,
                                           "businessName": "室内设计",
                                           "businessCode": "10001",
                                           "parentId": 1,
                                           "children": null,
                                           "parentBusiness": {
                                               "id": 1,
                                               "businessName": "设计",
                                               "businessCode": "100",
                                               "parentId": 0,
                                               "children": null,
                                               "parentBusiness": null,
                                               "createdAt": 1498015320000,
                                               "updatedAt": 1498015320000
                                           },
                                           "createdAt": 1498015336000,
                                           "updatedAt": 1498015336000
                                       },
                                       "visitCount": 4,
                                       "applyCount": 0,
                                       "recommendCount": 0,
                                       "createdAt": 1498828386000,
                                       "updatedAt": 1498829672000,
                                       "companyName": "上海",
                                       "trendComplete": "company",
                                       "projectDesc": "缝纫机啊",
                                       "publisher": "",
                                       "phone": null,
                                       "projectCycle": "一周以内"
                                   }
                               }
14.任务审核接口
              
              
               链接：/admin/checkEmp
                                                                                             
                                 请求类型:GET 
                                                 
                                 参数:      | name             |  是否必须    |  描述                                   |
                                           | -----------      | ---------  | ------------------------------------- |
                                           | id                |    是          任务id                             | 
                                           | status           |    是      |    审核状态(通过，不通过)                                 |                                     
               
                               
                               
                               返回数据：
                                         {
                                           "code":200,
                                           "data":"操作成功"
                                         }
                               
                          
15.用户列表接口
                               
                          链接：/admin/queryMasterList
                                                                                    
                            请求类型:GET 
                                            
                            参数:      | name             |  是否必须    |  描述                                   |
                                      | -----------      | ---------  | ------------------------------------- |
                                      | status           |    是      |     用户状态()                                  |
                                      | pageNumber       |    是      |     分页                                  |
                                      | pageSize         |    是      |     分页     
                                      
                                      
                                      返回参数：
                                      
                                           {
                                               "code": 200,
                                               "data": {
                                                   "rows": [
                                                       {
                                                           "industryName": "智能硬件",
                                                           "nickName": "jinming.xiao",
                                                           "openId": null,
                                                           "jobTitle": "woaini,woow",
                                                           "sex": "MAN",
                                                           "workExperience": "5",
                                                           "selfIntroduction": null,
                                                           "worksCases": null,
                                                           "cityId": 1,
                                                           "skills": null,
                                                           "createdAt": null,
                                                           "score": null,
                                                           "industryId": 1,
                                                           "areaId": null,
                                                           "cityName": "上海",
                                                           "phone": "12345678912",
                                                           "dailyWage": "500",
                                                           "id": 5,
                                                           "jobType": null,
                                                           "status": "待审核",
                                                           "updatedAt": null
                                                       }
                                                   ],
                                                   "total": 1
                                               }
                                           } 
16.用户详情接口

               链接：/admin/queryMasterDetail
                
               请求类型:GET 
                                                  
                  参数:      | name             |  是否必须    |  描述                                   |
                            | -----------      | ---------  | ------------------------------------- |
                            | id                |    是          用户id                             | 
                   
                返回数据：
                       {
                           "code": 200,
                           "data": {
                               "id": 1,
                               "nickName": "dsds",
                               "openId": null,
                               "dailyWage": "1233",
                               "cityId": 1,
                               "cityName": "上海",
                               "areaId": null,
                               "sex": "MAN",
                               "status": "待审核",
                               "jobTitle": "woaini,woow",
                               "recruitType": null,
                               "workExperience": "yuuoo",
                               "phone": "276343422",
                               "score": null,
                               "selfIntroduction": "woaid",
                               "skills": null,
                               "industryId": 2,
                               "industryName": "互联网产业",
                               "worksCases": [
                                   {
                                       "id": 6,
                                       "workName": "aiai",
                                       "responsibilities": "rere",
                                       "worksLink": "www.rer",
                                       "worksDesc": "woaini"
                                   }
                               ],
                               "baseSkillList": [
                                   {
                                       "id": 1,
                                       "skillName": "软件开发",
                                       "createdAt": 1498377131000,
                                       "updatedAt": 1498377131000,
                                       "skillCode": "100"
                                   },
                                   {
                                       "id": 2,
                                       "skillName": "网站设计",
                                       "createdAt": 1498377131000,
                                       "updatedAt": 1498377131000,
                                       "skillCode": "101"
                                   },
                                   {
                                       "id": 3,
                                       "skillName": "室内装潢",
                                       "createdAt": 1498377131000,
                                       "updatedAt": 1498444679000,
                                       "skillCode": "201"
                                   }
                               ],
                               "createdAt": null,
                               "updatedAt": null
                           }
                       } 
                                      
                                      
                                      
17.用户审核接口
 
 
        链接：/admin/checkMaster
                                                                                                    
            请求类型:GET 
                            
            参数:      | name             |  是否必须    |  描述                                   |
                      | -----------      | ---------  | ------------------------------------- |
                      | id                |    是          任务id                             | 
                      | status           |    是      |    审核状态(通过，不通过)                                 |    
                      
                      
         返回数据：
                   {
                     "code":200,
                     "data":"操作成功"
                   }

18.城市列表接口 
             
             链接：/admin/queryCityList
                                                                          
              请求类型:GET 
                              
              参数:      | name             |  是否必须    |  描述                                   |
                        | -----------      | ---------  | ------------------------------------- |
                        | pageNumber       |    是      |     分页                                  |
                        | pageSize         |    是      |     分页                               
              返回数据： 
                        {
                               "code": 200,
                               "data": [
                                 
                                 "rows":[  
                                  
                                 {
                                       "id": 1,
                                       "cityName": "上海",
                                       "hotTop": 10,
                                       "createdAt": 1498376435000,
                                       "updatedAt": 1498376435000,
                                       "cityCode": "100"
                                   },
                                   {
                                       "id": 2,
                                       "cityName": "北京",
                                       "hotTop": 10,
                                       "createdAt": 1498376435000,
                                       "updatedAt": 1498376435000,
                                       "cityCode": "101"
                                   },
                                   {
                                       "id": 3,
                                       "cityName": "珠海",
                                       "hotTop": 10,
                                       "createdAt": 1498376435000,
                                       "updatedAt": 1498376435000,
                                       "cityCode": "102"
                                   },
                                   {
                                       "id": 4,
                                       "cityName": "广州",
                                       "hotTop": 10,
                                       "createdAt": 1498376435000,
                                       "updatedAt": 1498376435000,
                                       "cityCode": "103"
                                   },
                                   {
                                       "id": 5,
                                       "cityName": "哈尔滨",
                                       "hotTop": 0,
                                       "createdAt": 1498376435000,
                                       "updatedAt": 1498376435000,
                                       "cityCode": "104"
                                   }],
                                   "total": 5
                               ]
                       }
                       
                       
19.城市列表接口 
 
                     链接：/admin/addCity
                                                                                              
                     请求类型:POST
                      
                     请求参数：
                           {
                             "cityName":"上海",
                             "hotTop":10
                           }
                      返回数据：
                           {
                             "code":200,
                             "data":"添加成功"
                           }
                           
20.行业列表接口
                  
                     链接：/admin/queryAllIndustry

                     请求类型:GET
                     参数:        
                             | name             |  是否必须    |  描述                                   |
                             | -----------      | ---------  | ------------------------------------- |
                             | pageNumber       |    是      |     分页                                  |
                             | pageSize         |    是      |     分页                               
                     
                     返回数据：  
                        {
                          "code": 200,
                           "rows":[
                                "data": [
                              {
                                  "id": 1,
                                  "industryCode": 100,
                                  "industryName": "智能硬件",
                                  "createdAt": 1499395796000,
                                  "updatedAt": 1499395796000
                              },
                              {
                                  "id": 2,
                                  "industryCode": 101,
                                  "industryName": "互联网产业",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 3,
                                  "industryCode": 102,
                                  "industryName": "商业零售",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 4,
                                  "industryCode": 103,
                                  "industryName": "文化娱乐",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 5,
                                  "industryCode": 104,
                                  "industryName": "共享经济",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 6,
                                  "industryCode": 105,
                                  "industryName": "快消品",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 7,
                                  "industryCode": 106,
                                  "industryName": "服装",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 8,
                                  "industryCode": 107,
                                  "industryName": "美食餐饮",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 9,
                                  "industryCode": 108,
                                  "industryName": "美容医疗",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 10,
                                  "industryCode": 109,
                                  "industryName": "共享经济",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              },
                              {
                                  "id": 11,
                                  "industryCode": 110,
                                  "industryName": "家具建材",
                                  "createdAt": 1499395797000,
                                  "updatedAt": 1499395797000
                              }
                          ],
                          "total":10
                          
                      }
                      
21.行业新增接口

    链接：/admin/addIndustry
                                                                                                 
    请求类型:POST
     
    请求参数：
          {
            "industryName":"金属机械"
          }
     返回数据：
          {
            "code":200,
            "data":"添加成功"
          }
               
22.技能查询列表接口
  
     链接：/admin/getSkillList
    
     请求类型:GET
     
     参数:        
             | name             |  是否必须    |  描述                                   |
             | -----------      | ---------  | ------------------------------------- |
             | pageNumber       |    是      |     分页                                  |
             | pageSize         |    是      |     分页                               
     返回数据：
                           
           {
               "code": 200,
               "data": {
                   "rows": [
                       {
                           "skillName": "Photoshop ",
                           "skillType": "设计",
                           "skillCode": 100,
                           "id": 1
                       },
                       {
                           "skillName": "illusrator",
                           "skillType": "设计",
                           "skillCode": 101,
                           "id": 2
                       },
                       {
                           "skillName": "平面设计",
                           "skillType": "设计",
                           "skillCode": 102,
                           "id": 3
                       },
                       {
                           "skillName": "标志设计",
                           "skillType": "设计",
                           "skillCode": 103,
                           "id": 4
                       },
                       {
                           "skillName": "VI设计",
                           "skillType": "设计",
                           "skillCode": 104,
                           "id": 5
                       }
                   ],
                   "total": 22
               }
           }
           
23.技能新增接口
  
      链接：/admin/addSkill
                                                                                                   
      请求类型:POST
       
      请求参数：
            {
              "skillName":"软件工程",
              "skillType":"设计"
            }
       返回数据：
            {
              "code":200,
              "data":"添加成功"
            }   
            
                  
23.业务类型大类查询接口
  
      链接：/admin/queryBusinessType 
                                                                                                   
      请求类型:GET
       
       返回数据：
            {
                "code": 200,
                "data": [
                    {
                        "id": 1,
                        "businessName": "策划",
                        "businessCode": "200",
                        "parentId": 0,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 2,
                        "businessName": "品牌策划系统服务",
                        "businessCode": "20001",
                        "parentId": 1,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 3,
                        "businessName": "年度营销方案",
                        "businessCode": "20002",
                        "parentId": 1,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 4,
                        "businessName": "招商会策划",
                        "businessCode": "20003",
                        "parentId": 1,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 5,
                        "businessName": "数字营销／微信、APP引流／事件营销",
                        "businessCode": "20004",
                        "parentId": 1,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 6,
                        "businessName": "设计",
                        "businessCode": "100",
                        "parentId": 0,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 7,
                        "businessName": "VI设计",
                        "businessCode": "10001",
                        "parentId": 6,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 8,
                        "businessName": "BP设计",
                        "businessCode": "10002",
                        "parentId": 6,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 9,
                        "businessName": "SI空间设计",
                        "businessCode": "10003",
                        "parentId": 6,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 10,
                        "businessName": "展会设计／办公商业设计",
                        "businessCode": "10004",
                        "parentId": 6,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 11,
                        "businessName": "插画设计",
                        "businessCode": "10005",
                        "parentId": 6,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 12,
                        "businessName": "活动",
                        "businessCode": "300",
                        "parentId": 0,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 13,
                        "businessName": "新闻发布会／新品发布会",
                        "businessCode": "30001",
                        "parentId": 12,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 14,
                        "businessName": "线上活动",
                        "businessCode": "30002",
                        "parentId": 12,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 15,
                        "businessName": "高端时装秀",
                        "businessCode": "30003",
                        "parentId": 12,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 16,
                        "businessName": "高端年会",
                        "businessCode": "30004",
                        "parentId": 12,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 17,
                        "businessName": "会展活动",
                        "businessCode": "30005",
                        "parentId": 12,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 18,
                        "businessName": "明星代言",
                        "businessCode": "30006",
                        "parentId": 12,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 19,
                        "businessName": "影视",
                        "businessCode": "400",
                        "parentId": 0,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 20,
                        "businessName": "品牌微电影 定制",
                        "businessCode": "40001",
                        "parentId": 19,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 21,
                        "businessName": "品牌微栏目 定制",
                        "businessCode": "40002",
                        "parentId": 19,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 22,
                        "businessName": "视频广告 定制",
                        "businessCode": "40003",
                        "parentId": 19,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 23,
                        "businessName": "动漫动画 定制",
                        "businessCode": "40004",
                        "parentId": 19,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 24,
                        "businessName": "高端平面摄影",
                        "businessCode": "40005",
                        "parentId": 19,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 25,
                        "businessName": "品牌短视频 定制",
                        "businessCode": "40006",
                        "parentId": 19,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 26,
                        "businessName": "其他",
                        "businessCode": "500",
                        "parentId": 0,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 27,
                        "businessName": "定制 商业计划书／融资计划书",
                        "businessCode": "50001",
                        "parentId": 26,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    },
                    {
                        "id": 28,
                        "businessName": "公司命名／品牌命名／产品命名",
                        "businessCode": "50002",
                        "parentId": 26,
                        "children": null,
                        "parentBusiness": null,
                        "createdAt": null,
                        "updatedAt": null
                    }
                ]
            } 
               
                
24.业务新增接口
  
      链接：/admin/addBusiness
                                                                                                   
      请求类型:POST
       
      请求参数：
            {
            	"parentId":1,
            	"businessName":"網吧念經"
            }
       返回数据：
            {
              "code":200,
              "data":"添加成功"
            } 
            
            
25.数据字典新增接口
  
      链接：/admin/addDataDictionary
                                                                                                   
      请求类型:POST
       
      请求参数：
            {
                "code":100,
                "desc":"外包公司"
            }
       返回数据：
            {
              "code":200,
              "data":"添加成功"
            } 
            
            
26.数据字典列表接口
                    
           
           链接：/admin/queryDataDictionary

           请求类型:GET
           参数:        
                   | name             |  是否必须    |  描述                                   |
                   | -----------      | ---------  | ------------------------------------- |
                   | pageNumber       |    是      |     分页                                  |
                   | pageSize         |    是      |     分页                       
                   
                   
                   
           返回数据：{
                    "code": 200,
                    "data": {
                        "rows": [
                            {
                                "code": 100,
                                "id": 1,
                                "value": "1",
                                "desc": "个人"
                            },
                            {
                                "code": 100,
                                "id": 2,
                                "value": "2",
                                "desc": "公司"
                            },
                            {
                                "code": 200,
                                "id": 3,
                                "value": "1",
                                "desc": "男"
                            },
                            {
                                "code": 200,
                                "id": 4,
                                "value": "2",
                                "desc": "女"
                            },
                            {
                                "code": 300,
                                "id": 5,
                                "value": "1",
                                "desc": "一周之内"
                            }
                        ],
                        "total": 8
                    }
                }
                 
                 
27.业务数据列表接口

 
 
    链接：/admin/queryBusinessList
 
    请求类型:GET
    
    返回数据：
      {
          "code": 200,
          "data": [
              {
                  "id": 1,
                  "businessName": "策划",
                  "businessCode": "200",
                  "parentId": 0,
                  "children": [
                      {
                          "id": 2,
                          "businessName": "品牌策划系统服务",
                          "businessCode": "20001",
                          "parentId": 1,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694668000,
                          "updatedAt": 1499696124000
                      },
                      {
                          "id": 3,
                          "businessName": "年度营销方案",
                          "businessCode": "20002",
                          "parentId": 1,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694668000,
                          "updatedAt": 1499696124000
                      },
                      {
                          "id": 4,
                          "businessName": "招商会策划",
                          "businessCode": "20003",
                          "parentId": 1,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694668000,
                          "updatedAt": 1499696124000
                      },
                      {
                          "id": 5,
                          "businessName": "数字营销／微信、APP引流／事件营销",
                          "businessCode": "20004",
                          "parentId": 1,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694668000,
                          "updatedAt": 1499696124000
                      }
                  ],
                  "parentBusiness": null,
                  "createdAt": 1499694768000,
                  "updatedAt": 1499694768000
              },
              {
                  "id": 6,
                  "businessName": "设计",
                  "businessCode": "100",
                  "parentId": 0,
                  "children": [
                      {
                          "id": 7,
                          "businessName": "VI设计",
                          "businessCode": "10001",
                          "parentId": 6,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694932000,
                          "updatedAt": 1499696141000
                      },
                      {
                          "id": 8,
                          "businessName": "BP设计",
                          "businessCode": "10002",
                          "parentId": 6,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694932000,
                          "updatedAt": 1499696141000
                      },
                      {
                          "id": 9,
                          "businessName": "SI空间设计",
                          "businessCode": "10003",
                          "parentId": 6,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694932000,
                          "updatedAt": 1499696141000
                      },
                      {
                          "id": 10,
                          "businessName": "展会设计／办公商业设计",
                          "businessCode": "10004",
                          "parentId": 6,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694932000,
                          "updatedAt": 1499696141000
                      },
                      {
                          "id": 11,
                          "businessName": "插画设计",
                          "businessCode": "10005",
                          "parentId": 6,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499694932000,
                          "updatedAt": 1499696141000
                      }
                  ],
                  "parentBusiness": null,
                  "createdAt": 1499694823000,
                  "updatedAt": 1499694823000
              },
              {
                  "id": 12,
                  "businessName": "活动",
                  "businessCode": "300",
                  "parentId": 0,
                  "children": [
                      {
                          "id": 13,
                          "businessName": "新闻发布会／新品发布会",
                          "businessCode": "30001",
                          "parentId": 12,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695904000,
                          "updatedAt": 1499695924000
                      },
                      {
                          "id": 14,
                          "businessName": "线上活动",
                          "businessCode": "30002",
                          "parentId": 12,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695904000,
                          "updatedAt": 1499695924000
                      },
                      {
                          "id": 15,
                          "businessName": "高端时装秀",
                          "businessCode": "30003",
                          "parentId": 12,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695904000,
                          "updatedAt": 1499695924000
                      },
                      {
                          "id": 16,
                          "businessName": "高端年会",
                          "businessCode": "30004",
                          "parentId": 12,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695904000,
                          "updatedAt": 1499695924000
                      },
                      {
                          "id": 17,
                          "businessName": "会展活动",
                          "businessCode": "30005",
                          "parentId": 12,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695904000,
                          "updatedAt": 1499695924000
                      },
                      {
                          "id": 18,
                          "businessName": "明星代言",
                          "businessCode": "30006",
                          "parentId": 12,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695904000,
                          "updatedAt": 1499695924000
                      }
                  ],
                  "parentBusiness": null,
                  "createdAt": 1499695881000,
                  "updatedAt": 1499695889000
              },
              {
                  "id": 19,
                  "businessName": "影视",
                  "businessCode": "400",
                  "parentId": 0,
                  "children": [
                      {
                          "id": 20,
                          "businessName": "品牌微电影 定制",
                          "businessCode": "40001",
                          "parentId": 19,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695985000,
                          "updatedAt": 1499695985000
                      },
                      {
                          "id": 21,
                          "businessName": "品牌微栏目 定制",
                          "businessCode": "40002",
                          "parentId": 19,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695985000,
                          "updatedAt": 1499695985000
                      },
                      {
                          "id": 22,
                          "businessName": "视频广告 定制",
                          "businessCode": "40003",
                          "parentId": 19,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695985000,
                          "updatedAt": 1499695985000
                      },
                      {
                          "id": 23,
                          "businessName": "动漫动画 定制",
                          "businessCode": "40004",
                          "parentId": 19,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695985000,
                          "updatedAt": 1499695985000
                      },
                      {
                          "id": 24,
                          "businessName": "高端平面摄影",
                          "businessCode": "40005",
                          "parentId": 19,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695985000,
                          "updatedAt": 1499695985000
                      },
                      {
                          "id": 25,
                          "businessName": "品牌短视频 定制",
                          "businessCode": "40006",
                          "parentId": 19,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499695985000,
                          "updatedAt": 1499696011000
                      }
                  ],
                  "parentBusiness": null,
                  "createdAt": 1499695945000,
                  "updatedAt": 1499695958000
              },
              {
                  "id": 26,
                  "businessName": "其他",
                  "businessCode": "500",
                  "parentId": 0,
                  "children": [
                      {
                          "id": 27,
                          "businessName": "定制 商业计划书／融资计划书",
                          "businessCode": "50001",
                          "parentId": 26,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499696094000,
                          "updatedAt": 1499696163000
                      },
                      {
                          "id": 28,
                          "businessName": "公司命名／品牌命名／产品命名",
                          "businessCode": "50002",
                          "parentId": 26,
                          "children": null,
                          "parentBusiness": null,
                          "createdAt": 1499696094000,
                          "updatedAt": 1499696163000
                      }
                  ],
                  "parentBusiness": null,
                  "createdAt": 1499696068000,
                  "updatedAt": 1499696081000
              }
          ]
      }
            
            
            
            