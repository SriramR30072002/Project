-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: bank_acc_list
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bank_database`
--

DROP TABLE IF EXISTS `bank_database`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank_database` (
  `Account_Number` int NOT NULL AUTO_INCREMENT,
  `Holders_Name` varchar(50) NOT NULL,
  `Account_Type` varchar(45) NOT NULL DEFAULT 'Savings',
  `Phn_Number` bigint NOT NULL,
  `Security_Code` int NOT NULL,
  `Acc_Balance` int NOT NULL,
  PRIMARY KEY (`Account_Number`),
  UNIQUE KEY `Phn_Number_UNIQUE` (`Phn_Number`),
  UNIQUE KEY `Security_Code_UNIQUE` (`Security_Code`)
) ENGINE=InnoDB AUTO_INCREMENT=2022000023 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_database`
--

LOCK TABLES `bank_database` WRITE;
/*!40000 ALTER TABLE `bank_database` DISABLE KEYS */;
INSERT INTO `bank_database` VALUES (202200001,'Sriram R','Savings',8939285833,3007,988650),(202200002,'Jagan R','Savings',7010422208,2011,16245),(202200003,'Narendran','Savings',7829345320,1404,6976),(202200004,'Prabhakarn','Current',8934562787,5676,1000),(202200005,'Parthiban','Savings',6789853367,7846,23435),(202200006,'Rakesh','Current',7874467558,8397,25473),(202200007,'Santhosh A','Savings',7896324555,8443,8333),(202200008,'Rishi VN','Current',8945437397,3637,1000),(202200009,'Arun Kumar','Savings',9353782484,6474,37367),(202200010,'Afrose Begum','Savings',7822433845,7454,7353),(202200011,'Vishal A','Current',6388308674,9254,6536),(2022000012,'Ramachandran','Savings',9884149444,2812,50000),(2022000013,'Shriram','Current',8935675429,3098,1000),(2022000014,'Rajalkashmi','savings',8939589785,1412,78900),(2022000015,'Anjali','Savings',8953324567,1810,25379),(2022000016,'peter','Savings',8975431279,2528,30987),(2022000018,'Peter','Savings',8934526718,7890,8900),(2022000019,'Tamilselavn','Current',7890654321,1234,5093450),(2022000020,'Matt','Current',9982253677,3304,89765),(2022000021,'Parventhan','Current',7856432345,7,673435),(2022000022,'Yogesh','Current',7834325288,9083,7865);
/*!40000 ALTER TABLE `bank_database` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-27 14:31:34
