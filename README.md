# FirstProject
this is my first project
1. 查询首页发布信息
    
        链接: /employer/queryEmpViewHeader
        GET
        
        返回数据： 
        {
            "code": 200,
            "data": [
                {
                    "id": 1,
                    "openId": null,
                    "projectBudget": 0,
                    "issueName": "测试发布项目",
                    "status": "待审核",
                    "recruitBusinessList": [
                        {
                            "id": 1,
                            "businessName": "设计",
                            "businessCode": "100",
                            "parentId": 0,
                            "createdAt": null,
                            "updatedAt": null
                        },
                        {
                            "id": 2,
                            "businessName": "室内设计",
                            "businessCode": "10001",
                            "parentId": 1,
                            "createdAt": null,
                            "updatedAt": null
                        }
                    ],
                    "createdAt": 1497769584000,
                    "updatedAt": 1497769584000,
                    "visitCount": 100,
                    "applyCount": 200,
                    "recommendCount": 300
                },
                {
                    "id": 2,
                    "openId": null,
                    "projectBudget": 0,
                    "issueName": "测试发布项目",
                    "status": "待审核",
                    "recruitBusinessList": [
                        {
                            "id": 1,
                            "businessName": "设计",
                            "businessCode": "100",
                            "parentId": 0,
                            "createdAt": null,
                            "updatedAt": null
                        },
                        {
                            "id": 2,
                            "businessName": "室内设计",
                            "businessCode": "10001",
                            "parentId": 1,
                            "createdAt": null,
                            "updatedAt": null
                        }
                    ],
                    "createdAt": 1497946957000,
                    "updatedAt": 1497946957000,
                    "visitCount": 0,
                    "applyCount": 0,
                    "recommendCount": 0
                }
            ]
        } 
 2.发布信息详情 
       链接: /employer/queryDetail
       
       参数:          | name        |  是否必须  |  描述
                     | ----------- | --------- | -----------------
                     | id          |    是     | 发布信息id
                     | status      |    是     | 发布状态'recruiting'
                      
          请求类型：POST
               
               返回数据： 
               {
                   "code": 200,
                   "data": [
                       {
                           "id": 1,
                           "openId": null,
                           "projectBudget": 0,
                           "issueName": "测试发布项目",
                           "status": "待审核",
                           "recruitBusinessList": [
                               {
                                   "id": 1,
                                   "businessName": "设计",
                                   "businessCode": "100",
                                   "parentId": 0,
                                   "createdAt": null,
                                   "updatedAt": null
                               },
                               {
                                   "id": 2,
                                   "businessName": "室内设计",
                                   "businessCode": "10001",
                                   "parentId": 1,
                                   "createdAt": null,
                                   "updatedAt": null
                               }
                           ],
                           "createdAt": 1497769584000,
                           "updatedAt": 1497769584000,
                           "companyName": "金明发展公司", 
                           "trendComplete": "公司",
                           "projectDesc": "我要睡你", 
                           "publisher": "jinming.xiao",
                           "phone": "18721956624",
                           "objectCycle": "oneMonth"
                       }
                   ]
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
               