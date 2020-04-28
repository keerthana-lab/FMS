delimiter $$

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `role_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1$$

delimiter $$

CREATE TABLE `event` (
  `event_no` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(45) DEFAULT NULL,
  `base_location` varchar(45) DEFAULT NULL,
  `beneficiary_name` varchar(100) DEFAULT NULL,
  `council_name` varchar(45) DEFAULT NULL,
  `event_name` varchar(100) DEFAULT NULL,
  `event_description` varchar(200) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `emp_id` bigint(20) DEFAULT NULL,
  `emp_name` varchar(45) DEFAULT NULL,
  `volunteer_hours` int(11) DEFAULT NULL,
  `travel_hours` int(11) DEFAULT NULL,
  `lives_impacted` int(11) DEFAULT NULL,
  `business_unit` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `iiep_category` varchar(45) DEFAULT NULL,
  `summary_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1$$
delimiter $$

CREATE TABLE `summary` (
  `summary_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(45) DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `base_location` varchar(45) DEFAULT NULL,
  `beneficiary_name` varchar(45) DEFAULT NULL,
  `venue_address` varchar(100) DEFAULT NULL,
  `council_name` varchar(45) DEFAULT NULL,
  `project` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `event_name` varchar(45) DEFAULT NULL,
  `event_description` varchar(200) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `total_volunteers` int(11) DEFAULT NULL,
  `total_volunteer_hours` int(11) DEFAULT NULL,
  `total_travel_hours` int(11) DEFAULT NULL,
  `overall_hours` int(11) DEFAULT NULL,
  `lives_impacted` int(11) DEFAULT NULL,
  `activity_type` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `poc_id` bigint(20) DEFAULT NULL,
  `poc_name` varchar(45) DEFAULT NULL,
  `poc_contact` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`summary_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1$$


CREATE  TABLE `fms`.`feed_back_questions` (
  `ques_id` INT NOT NULL AUTO_INCREMENT ,
  `question` VARCHAR(200) NULL ,
  `feedback_type` VARCHAR(60) NULL,
  PRIMARY KEY (`ques_id`) 
)ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1$$


CREATE  TABLE `fms`.`feed_back_answers` (
  `ans_id` INT NOT NULL AUTO_INCREMENT ,
  `ques_id` INT NULL ,
  `question` VARCHAR(200) NULL ,
  `answer` VARCHAR(200) NULL ,
  `user_id` BIGINT NULL ,
  PRIMARY KEY (`ans_id`) );


