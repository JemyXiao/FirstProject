# FirstProject
this is my first project
1. 查询首页发布信息
    
        链接: /employer/queryEmpViewHeader
        POST
        
        参数: | name              |  是否必须 |  描述                                 |
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
               
4.添加牛人信息

         链接：/techMaster/add
         
         请求类型:POST
         
         参数：
          {
          	"nickName":"jinming.xiao",
          	"openId":"rwrwrw2332",
          	"cityId":1,
          	"dailyWage":500,
          	"sex":"MAN",
          	"status":"待审核",
          	"personalInfo":"我要得第一",
          	"workExperience":"在饿了了工作1年半",
          	"phone":"12345678912",
          	"recruitBaseSkills":[
          		{"id":1
          			
          		},
          		{
          		  "id":2
          		}
          		]
          }
      返回数据：
          {
            "code":200,
            "data":"添加成功"
          }
5.添加发布信息

         链接：/techMaster/add
         
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