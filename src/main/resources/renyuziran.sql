CREATE TABLE IF NOT EXISTS `tbl_user`(
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `account` VARCHAR(100) NOT NULL COMMENT '账号',
  `password` VARCHAR(40) NOT NULL COMMENT '密码',
  `name` VARCHAR(40) COMMENT '名称' ,
  `gender` VARCHAR(1) COMMENT '性别' ,
  `role` int NOT NULL COMMENT '角色1管理员2一般用户'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

INSERT INTO `tbl_admin` VALUES (1, 'admin', 'admin', '张三', '女', 1);
INSERT INTO `tbl_admin` VALUES (2, 'a641022806', '...123', '李四', '男', 2);



CREATE TABLE IF NOT EXISTS `tbl_environment`(
	`id` int PRIMARY KEY AUTO_INCREMENT,
	`temperature` double COMMENT '温度℃',
	`humidity` double COMMENT '湿度%RH',
	`volume` double COMMENT '体积m³',
	`weight` double COMMENT '重量kg',
	`light` double COMMENT '光照lux',
	`wind` double COMMENT '风速m/s',
	`CO2` double COMMENT '二氧化碳PPM',
	`monitor_time` TIMESTAMP  COMMENT '监测时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='监测信息';

INSERT INTO `tbl_environment` VALUES(1,36.2,55.7,20,30,73.2,0.1,456.8,now());
INSERT INTO `tbl_environment` VALUES(2,40.2,60.7,50,60,100.2,0.1,458.2,now());


----------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS `tbl_equipment`(
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `equipment_name` VARCHAR(125) NOT NULL COMMENT '设备名称',
	`equipment_type` VARCHAR(125)  COMMENT '设备型号',
	`product_date` TIMESTAMP  COMMENT '生产日期'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备信息表';

INSERT INTO `tbl_equipment` VALUES (1, '设备NO.1','XS-T','1585810887000');
INSERT INTO `tbl_equipment` VALUES (2, '设备NO.2','BM-W','1585810887000');
----------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS `tbl_equipment_pos`(
  `id` INT PRIMARY KEY AUTO_INCREMENT,
	`equipment_id` INT  COMMENT '设备Id',
	`position` VARCHAR(125) NOT NULL COMMENT '设备位置'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备位置表';

INSERT INTO `tbl_equipment_pos` VALUES (1, 1,'南京江宁上访街道');
INSERT INTO `tbl_equipment_pos` VALUES (2, 2,'1360131,4661166');

----------------------------------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_video_file`(
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `equipment_id` int NOT NULL COMMENT '设备Id',
	`file_path` VARCHAR(500)  COMMENT '视频文件路径',
	`begin_time`  TIMESTAMP COMMENT '开始时间',
	`end_time`  TIMESTAMP COMMENT '结束时间',
	`create_time`  TIMESTAMP COMMENT '创建时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频信息表';

INSERT INTO `tbl_video_file` VALUES (1, 1,'D:/downloads/shinubi.jpg','','','');
