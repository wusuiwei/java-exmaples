USE `jdbc_examples`;

/*Table structure for table `customers` */

DROP TABLE IF EXISTS `customers`;

CREATE TABLE `customers`
(
    `id`    int(10) NOT NULL AUTO_INCREMENT,
    `name`  varchar(15) DEFAULT NULL,
    `email` varchar(20) DEFAULT NULL,
    `birth` date        DEFAULT NULL,
    `photo` mediumblob,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 19
  DEFAULT CHARSET = gb2312;

/*Table structure for table `examstudent` */

DROP TABLE IF EXISTS `examstudent`;

CREATE TABLE `examstudent`
(
    `FlowID`      int(20) NOT NULL AUTO_INCREMENT,
    `Type`        int(20)     DEFAULT NULL,
    `IDCard`      varchar(18) DEFAULT NULL,
    `ExamCard`    varchar(15) DEFAULT NULL,
    `StudentName` varchar(20) DEFAULT NULL,
    `Location`    varchar(20) DEFAULT NULL,
    `Grade`       int(10)     DEFAULT NULL,
    PRIMARY KEY (`FlowID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 7
  DEFAULT CHARSET = gb2312;


/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order`
(
    `order_id`   int(10) NOT NULL AUTO_INCREMENT,
    `order_name` varchar(20) DEFAULT NULL,
    `order_date` date        DEFAULT NULL,
    PRIMARY KEY (`order_id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = gb2312;


/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`
(
    `id`       int(11)     NOT NULL AUTO_INCREMENT,
    `name`     varchar(10) NOT NULL,
    `password` varchar(15) NOT NULL DEFAULT '123456',
    `address`  varchar(25)          DEFAULT NULL,
    `phone`    varchar(15)          DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = gb2312;


/*Table structure for table `user_table` */

DROP TABLE IF EXISTS `user_table`;

CREATE TABLE `user_table`
(
    `user`     varchar(20) DEFAULT NULL,
    `password` varchar(20) DEFAULT NULL,
    `balance`  int(20)     DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = gb2312;

