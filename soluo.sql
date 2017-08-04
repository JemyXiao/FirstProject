ALTER TABLE `recruit`.`t_recruit_base_skill`
ADD COLUMN `status` INT NULL DEFAULT 0 COMMENT '状态(0:有效，1:失效)' AFTER `skill_type`;
ALTER TABLE `recruit`.`t_recruit_city`
  ADD COLUMN `status` INT NULL DEFAULT 0 COMMENT '状态(0:有效，1:失效)' AFTER `city_code`;

ALTER TABLE `recruit`.`t_recruit_business`
  ADD COLUMN `status` INT NULL DEFAULT 0 COMMENT '状态(0:有效,1:失效)' AFTER `updated_at`;

ALTER TABLE `recruit`.`t_recruit_industry`
  ADD COLUMN `status` INT NULL DEFAULT 0 COMMENT '状态(0:有效，1:失效)' AFTER `updated_at`;

ALTER TABLE `recruit`.`t_recruit_data_dictionary`
  ADD COLUMN `status` INT NULL DEFAULT 0 COMMENT '状态(0:有效,1:失效)' AFTER `data_desc`;



ALTER TABLE `recruit`.`t_recruit_tech_master`
  ADD COLUMN `headimgurl` VARCHAR(300) NULL COMMENT '图像url' AFTER `industry_id`;

ALTER TABLE `recruit`.`t_recruit_tech_master`
  ADD COLUMN `verified` INT(11) NULL DEFAULT 0 COMMENT '是否认证' AFTER `headimgurl`;

ALTER TABLE `recruit`.`t_recruit_employer`
  ADD COLUMN `verified` INT(11) NULL DEFAULT 0 COMMENT '认证(0:未认证，1:已认证)' AFTER `master_id`;

-- 2017-08-02
use recruit;
DROP TABLE IF EXISTS `t_recruit_score`;
CREATE TABLE `t_recruit_score` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `task_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '任务id',
  `task_type` varchar(45) NOT NULL DEFAULT '' COMMENT '任务类型',
  `attitude_score` DOUBLE  NULL DEFAULT 0 COMMENT '态度分',
  `pay_time_score` DOUBLE  NULL DEFAULT 0 COMMENT '支付及时分',
  `coordination_score` DOUBLE  NULL DEFAULT 0 COMMENT '配合度分',
  `quality_score` DOUBLE  NULL DEFAULT 0 COMMENT '完成质量分',
  `effect_score` DOUBLE  NULL DEFAULT 0 COMMENT '效率分',
  `comment` varchar(200)   NULL DEFAULT '' COMMENT '评价内容',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `ix_created_at` (`created_at`) USING BTREE,
  KEY `ix_updated_at` (`updated_at`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8 COMMENT='评分表';


ALTER TABLE `recruit`.`t_recruit_works_case`
  ADD COLUMN `imag_url` VARCHAR(100) NULL COMMENT '图片url' AFTER `updated_at`;

ALTER TABLE `recruit`.`t_recruit_score`
  ADD COLUMN `be_rated` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '被评分对象id(发包方id;牛人id)' AFTER `updated_at`;
