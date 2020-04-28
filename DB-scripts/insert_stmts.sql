
INSERT INTO `fms`.`user`
(`id`,`username`,`password`,`role_id`)
VALUES
(1,"Scott","$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK","admin");



INSERT INTO `fms`.`user`
(`id`,`username`,`password`,`role_id`)
VALUES
(2,"Smith","$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK","participant");



INSERT INTO `fms`.`user`
(`id`,`username`,`password`,`role_id`)
VALUES
(3,"John","$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK","poc");



INSERT INTO `fms`.`user`
(`id`,`username`,`password`,`role_id`)
VALUES
(4,"Mary","$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK","pmo");



INSERT INTO `fms`.`event`
(`event_no`,`event_id`,`base_location`,`beneficiary_name`,`council_name`,`event_name`,
`event_description`,`event_date`,`emp_id`,`emp_name`,`volunteer_hours`,`travel_hours`,
`lives_impacted`,`business_unit`,`status`,`iiep_category`,`summary_id`)
VALUES
(1,"EVNT00047261","Singapore","KWONG WAI SHIU HOSPITAL","Outreach Singapore","Bags of Joy Distribution",
"Come be a Santa and distribute these Bags of Joy to elderly low income residents in Central Singapore.",
"18-12-15",802488,"Keerthana",4,2,800,"Banking & Financial Services","Approved","Not Applicable",1);



INSERT INTO `fms`.`event`
(`event_no`,`event_id`,`base_location`,`beneficiary_name`,`council_name`,`event_name`,
`event_description`,`event_date`,`emp_id`,`emp_name`,`volunteer_hours`,`travel_hours`,
`lives_impacted`,`business_unit`,`status`,`iiep_category`,`summary_id`)
VALUES
(2,"EVNT00046103","Chennai","Kamarajar Illam,Tambaram","Chennai BFS Outreach","Be a Teacher @ Kamarajar Illam",
"Teach various subjects to the students in Kamarajar Illam",
"18-12-01",802468,"Ramya",2,1,30,"Intelligent Automation & Tech","Approved","Not Applicable",2);



INSERT INTO `fms`.`event`
(`event_no`,`event_id`,`base_location`,`beneficiary_name`,`council_name`,`event_name`,
`event_description`,`event_date`,`emp_id`,`emp_name`,`volunteer_hours`,`travel_hours`,
`lives_impacted`,`business_unit`,`status`,`iiep_category`,`summary_id`)
VALUES
(3,"EVNT00046385","United Kingdom","St. Edward’s CE Voluntary Aided Primary School","Outreach UK",
"1st Dec PM-Christmas fair to save a school swimming pool",
"The school is hosting a Christmas Fayre to raise money to refurbish their swimming pool that is used by the children in the local community.",
"18-12-01",802509,"Subiksha",6,0,0,"Quality Engineering &Assurance","Approved","Enjoyable Community",3);



INSERT INTO `fms`.`event`
(`event_no`,`event_id`,`base_location`,`beneficiary_name`,`council_name`,`event_name`,
`event_description`,`event_date`,`emp_id`,`emp_name`,`volunteer_hours`,`travel_hours`,
`lives_impacted`,`business_unit`,`status`,`iiep_category`,`summary_id`)
VALUES
(4,"EVNT00046530","Pune","Gurukulam","Pune QEA LBG Outreach","Improve in Co-ordination",
"Through good talk, learning game we will improve co-ordination in between the students.",
"18-12-08",802487,"Nivetha",2,0,2,"CommsMedia","Approved","Enjoyable Community",4);



INSERT INTO `fms`.`event`
(`event_no`,`event_id`,`base_location`,`beneficiary_name`,`council_name`,`event_name`,
`event_description`,`event_date`,`emp_id`,`emp_name`,`volunteer_hours`,`travel_hours`,
`lives_impacted`,`business_unit`,`status`,`iiep_category`,`summary_id`)
VALUES
(5,"EVNT00046588","Chennai","ADW Primary school chitlapakkam","Chennai BPS Outreach","BAT",
"BAT","18-12-03",802600,"Shri Vidhya",2,0,2,"Digital Ops - F&A Delivery","Approved",
"Inspiring Classroom",5);



INSERT INTO `fms`.`event`
(`event_no`,`event_id`,`base_location`,`beneficiary_name`,`council_name`,`event_name`,
`event_description`,`event_date`,`emp_id`,`emp_name`,`volunteer_hours`,`travel_hours`,
`lives_impacted`,`business_unit`,`status`,`iiep_category`,`summary_id`)
VALUES
(6,"EVNT00046611","Coimbatore","Panchayat Union Primary School, Keeranatham Puthupalayam",
"Coimbatore Outreach","TEACHING","Teaches English Grammar","18-12-13",802415,"Bhavadharani",
2,0.5,22,"CDB-AIA-IMS-AISQuAD","Approved","Insightful classroom",6);



INSERT INTO `fms`.`event`
(`event_no`,`event_id`,`base_location`,`beneficiary_name`,`council_name`,`event_name`,
`event_description`,`event_date`,`emp_id`,`emp_name`,`volunteer_hours`,`travel_hours`,
`lives_impacted`,`business_unit`,`status`,`iiep_category`,`summary_id`)
VALUES
(7,"EVNT00047114","Chennai","Panchayat Union Primary School, Amman Nagar","Chennai RCG Outreach",
"Be a Teacher","To teach 'english' (mainly spellings) to 'D' Category students of 4th std students.",
"18-12-04",805896,"Roshini",0.1,1.5,1,"RCGTH-Retail & Consumer Goods","Approved",
"Insightful Classroom",7);





INSERT INTO `fms`.`summary`
(`summary_id`,`event_id`,`month`,`base_location`,`beneficiary_name`,`venue_address`,
`council_name`,`project`,`category`,`event_name`,`event_description`,`event_date`,`total_volunteers`,
`total_volunteer_hours`,`total_travel_hours`,`overall_hours`,`lives_impacted`,`activity_type`,
`status`,`poc_id`,`poc_name`,`poc_contact`)
VALUES
(1,"EVNT00047261","DEC","Singapore","KWONG WAI SHIU HOSPITAL","705, Serangoon Road, Singapore, Singapore, Singapore-328127",
"Outreach Singapore","Donation or Distribution","Essentials or relief","Bags of Joy Distribution",
"Come be a Santa and distribute these Bags of Joy to elderly low income residents in Central Singapore.",
"18-12-15",21,88,42,130,800,1,"Approved",802600,"Shri Vidhya",9876543210);


INSERT INTO `fms`.`summary`
(`summary_id`,`event_id`,`month`,`base_location`,`beneficiary_name`,`venue_address`,
`council_name`,`project`,`category`,`event_name`,`event_description`,`event_date`,`total_volunteers`,
`total_volunteer_hours`,`total_travel_hours`,`overall_hours`,`lives_impacted`,`activity_type`,
`status`,`poc_id`,`poc_name`,`poc_contact`)
VALUES
(2,"EVNT00046103","DEC","Chennai","Kamarajar Illam,Tambaram","18, Mudichur Road, Tambaram, Chennai- 600 0018.",
"Chennai BFS Outreach","Distribution","Essentials","Be a Teacher @ Kamarajar Illam",
"Teach various subjects to the students in Kamarajar Illam",
"18-12-01",1,2,1,3,30,2,"Approved",802510, "Jeniffer",9567453210);



INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`) 
VALUES ('1', 'How do you rate the overall event ?', 'Participated');

INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`) 
VALUES ('2', 'What did you like about this volunteering activity ?', 'Participated');

INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`) 
VALUES ('3', 'What can be improved in this volunteering activity ?', 'Participated');

INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`) 
VALUES ('4', 'Reason for not joining the event : ', 'Not participated');

INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`)
VALUES ('5', 'Please share your feedback for unregistering from the event', 'Unregistered');



INSERT INTO `fms`.`feed_back_answers` (`ans_id`, `ques_id`, `question`, `answer`, 
`user_id`) VALUES 
('1', '1', 'How do you rate the overall event ?', '5-excellent', '802488');
