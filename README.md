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