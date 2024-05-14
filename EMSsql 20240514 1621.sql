-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.11-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema employee_management_system
--

CREATE DATABASE IF NOT EXISTS employee_management_system;
USE employee_management_system;

--
-- Definition of table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_on` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `department_head` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department`
--

/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` (`id`,`created_on`,`name`,`department_head`) VALUES 
 (10,'2024-05-14 15:22:54.072000','Human Resources',1),
 (11,'2024-05-14 15:23:33.074000','Resarch and Development',2),
 (12,'2024-05-14 15:23:51.559000','Information and Technology',3);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;


--
-- Definition of table `department_employee_mapping`
--

DROP TABLE IF EXISTS `department_employee_mapping`;
CREATE TABLE `department_employee_mapping` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `departmentid` int(11) DEFAULT NULL,
  `employeeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department_employee_mapping`
--

/*!40000 ALTER TABLE `department_employee_mapping` DISABLE KEYS */;
INSERT INTO `department_employee_mapping` (`id`,`departmentid`,`employeeid`) VALUES 
 (1,10,1),
 (2,11,2),
 (3,12,3),
 (4,12,4),
 (5,12,5),
 (6,12,6),
 (7,12,7),
 (8,12,8),
 (9,12,9),
 (10,12,10),
 (11,11,11),
 (12,11,12),
 (13,11,13),
 (14,11,14),
 (15,11,15),
 (16,11,16),
 (17,11,17),
 (18,11,18),
 (19,10,19),
 (20,10,20),
 (21,10,21),
 (22,10,22),
 (23,10,23),
 (24,10,24),
 (25,10,25);
/*!40000 ALTER TABLE `department_employee_mapping` ENABLE KEYS */;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `date_of_birth` datetime(6) DEFAULT NULL,
  `joining_date` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `salary` double NOT NULL,
  `yearly_bonus_percentage` double NOT NULL,
  `manager` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id`,`address`,`date_of_birth`,`joining_date`,`name`,`role`,`salary`,`yearly_bonus_percentage`,`manager`) VALUES 
 (1,'123 Main St, City','1990-01-12 05:30:00.000000','2019-02-12 05:30:00.000000','John','HR manager',20000,10,NULL),
 (2,'22 Main St, NewYork','1995-01-12 05:30:00.000000','2020-02-12 05:30:00.000000','Abraham','R&D manager',25000,10,NULL),
 (3,'22 Gandhi St, Palakkad','1998-01-12 05:30:00.000000','2021-02-12 05:30:00.000000','Rahul','IT manager',75000,10,NULL),
 (4,'22 Gandhi St, Mannarkkad','2000-01-12 05:30:00.000000','2021-05-12 05:30:00.000000','Amarnath','Developer',35000,5,3),
 (5,'22 Jawahar Nagar, Palakkad','2000-10-12 05:30:00.000000','2022-05-12 05:30:00.000000','Ayaz','Junior Developer',30000,5,3),
 (6,'22 Jawahar Nagar, Ottapalam','2001-10-12 05:30:00.000000','2022-05-10 05:30:00.000000','Arun','Junior Developer',30000,5,3),
 (7,'22, Malappuram','1999-10-12 05:30:00.000000','2022-05-10 05:30:00.000000','Answab','Junior Developer',30000,5,3),
 (8,'22, Mannarkkad','2001-10-12 05:30:00.000000','2020-05-10 05:30:00.000000','Hari','Senior Developer',45000,7,3),
 (9,'21, Kozhikode','2001-05-12 05:30:00.000000','2020-10-10 05:30:00.000000','Subin','Senior Developer',45000,7,3),
 (10,'21, Thrissur','2000-05-12 05:30:00.000000','2021-05-10 05:30:00.000000','Sreejith','Senior Developer',45000,7,3),
 (11,'21, Thrissur','2000-05-12 05:30:00.000000','2021-05-10 05:30:00.000000','Ramesh','Executive',30000,5,2),
 (12,'21, Thrissur','2000-10-12 05:30:00.000000','2021-05-10 05:30:00.000000','Suresh','Junior Executive',30000,5,2),
 (13,'21, Thrissur','2001-10-12 05:30:00.000000','2022-05-10 05:30:00.000000','Silva','Junior Executive',30000,5,2),
 (14,'21, Thrissur','2001-10-12 05:30:00.000000','2022-05-10 05:30:00.000000','Rodri','Junior Executive',30000,5,2),
 (15,'21, Thrissur','1999-10-12 05:30:00.000000','2021-05-10 05:30:00.000000','Arjun','Junior Executive',30000,5,2),
 (16,'21, Thrissur','1999-05-12 05:30:00.000000','2021-10-10 05:30:00.000000','Nithin','Junior Executive',30000,5,2),
 (17,'21, Thrissur','2000-05-12 05:30:00.000000','2021-10-10 05:30:00.000000','Naveen','Junior Executive',30000,5,2),
 (18,'21, Palakkad','2001-05-12 05:30:00.000000','2020-10-10 05:30:00.000000','Nivin','Junior Executive',30000,5,2),
 (19,'Kozhikode','2001-05-12 05:30:00.000000','2020-10-10 05:30:00.000000','Nivin','HR Executive',20000,5,1),
 (20,'Palakkad','2000-05-12 05:30:00.000000','2021-10-10 05:30:00.000000','Amal','HR Executive',20000,5,1),
 (21,'Mannarkkad','2002-05-12 05:30:00.000000','2022-10-10 05:30:00.000000','Shameer','HR Executive',20000,5,1),
 (22,'Mannarkkad','2000-05-12 05:30:00.000000','2022-10-10 05:30:00.000000','Arshadd','HR Executive',22000,5,1),
 (23,'Malappuram','1999-05-10 05:30:00.000000','2022-10-10 05:30:00.000000','Hisham','HR Executive',22000,5,1),
 (24,'Ottapalam','1999-05-10 05:30:00.000000','2022-10-10 05:30:00.000000','Abdulla','HR Executive',22000,5,1),
 (25,'Palakkad','1999-10-10 05:30:00.000000','2024-10-10 05:30:00.000000','Mohan','HR Executive',25000,5,1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
