use jdbc_examples;
/*Data for the table `customers` */

insert into `customers`(`id`, `name`, `email`, `birth`, `photo`)
values (1, '汪峰', 'wf@126.com', '2010-02-02', NULL),
       (2, '王菲', 'wangf@163.com', '1988-12-26', NULL),
       (3, '林志玲', 'linzl@gmail.com', '1984-06-12', NULL),
       (4, '汤唯', 'tangw@sina.com', '1986-06-13', NULL),
       (5, '成龙', 'Jackey@gmai.com', '1955-07-14', NULL),
       (6, '迪丽热巴', 'reba@163.com', '1983-05-17', NULL),
       (7, '刘亦菲', 'liuyifei@qq.com', '1991-11-14', NULL),
       (8, '陈道明', 'bdf@126.com', '2014-01-17', NULL),
       (10, '周杰伦', 'zhoujl@sina.com', '1979-11-15', NULL),
       (12, '黎明', 'LiM@126.com', '1998-09-08', NULL),
       (13, '张学友', 'zhangxy@126.com', '1998-12-21', NULL),
       (16, '朱茵', 'zhuyin@126.com', '2014-01-16', NULL),
       (18, '贝多芬', 'beidf@126.com', '2014-01-17', NULL);


/*Data for the table `examstudent` */

insert into `examstudent`(`FlowID`, `Type`, `IDCard`, `ExamCard`, `StudentName`, `Location`, `Grade`)
values (1, 4, '412824195263214584', '200523164754000', '张锋', '郑州', 85),
       (2, 4, '222224195263214584', '200523164754001', '孙朋', '大连', 56),
       (3, 6, '342824195263214584', '200523164754002', '刘明', '沈阳', 72),
       (4, 6, '100824195263214584', '200523164754003', '赵虎', '哈尔滨\r\n', 95),
       (5, 4, '454524195263214584', '200523164754004', '杨丽', '北京', 64),
       (6, 4, '854524195263214584', '200523164754005', '王小红', '太原', 60);

/*Data for the table `order` */

insert into `order`(`order_id`, `order_name`, `order_date`)
values (1, 'AA', '2010-03-04'),
       (2, 'BB', '2000-02-01'),
       (4, 'GG', '1994-06-28');

/*Data for the table `user` */

insert into `user`(`id`, `name`, `password`, `address`, `phone`)
values (1, '章子怡', 'qwerty', 'Beijing', '13788658672'),
       (2, '郭富城', 'abc123', 'HongKong', '15678909898'),
       (3, '林志颖', '654321', 'Taiwan', '18612124565'),
       (4, '梁静茹', '987654367', 'malaixiya', '18912340998'),
       (5, 'LadyGaGa', '123456', 'America', '13012386565');

/*Data for the table `user_table` */

insert into `user_table`(`user`, `password`, `balance`)
values ('AA', '123456', 1000),
       ('BB', '654321', 1000),
       ('CC', 'abcd', 2000),
       ('DD', 'abcder', 3000);