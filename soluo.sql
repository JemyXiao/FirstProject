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