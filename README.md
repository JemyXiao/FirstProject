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
              | pageSize         |    否     |  分页                                  |
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