-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: gradroomnew
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `university`
--

DROP TABLE IF EXISTS `university`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `university` (
  `universityId` int(11) NOT NULL AUTO_INCREMENT,
  `expenseRating` int(11) DEFAULT NULL,
  `feeRating` int(11) DEFAULT NULL,
  `greRequired` int(11) DEFAULT NULL,
  `reputationRating` int(11) DEFAULT NULL,
  `universityLocation` varchar(255) DEFAULT NULL,
  `universityName` varchar(255) DEFAULT NULL,
  `weatherRating` int(11) DEFAULT NULL,
  PRIMARY KEY (`universityId`),
  UNIQUE KEY `universityId` (`universityId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `university`
--

LOCK TABLES `university` WRITE;
/*!40000 ALTER TABLE `university` DISABLE KEYS */;
INSERT INTO `university` VALUES (1,8,8,300,8,'Boston','Northeastern',8),(2,9,7,315,9,'California','UCLA',7),(3,8,8,302,5,'Boston','Boston University',8),(4,6,6,310,8,'Chicago','UIC',8),(5,8,8,290,6,'New Jersey','RIT',8),(6,9,9,310,9,'New York','NYU',9),(7,8,9,290,5,'New Jersey','Stevens',7),(8,7,7,295,7,'Texas','UTD',5),(9,8,8,310,9,'New York','SUNY',9),(10,7,7,315,8,'MI','Georgia Tech',9),(11,5,5,300,5,'MA','Bentley',5),(12,7,7,310,8,'Arizona','ASU',7),(13,8,8,312,9,'NY','CMU',7),(14,8,8,310,8,'CA','Eller',8);
/*!40000 ALTER TABLE `university` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-26  4:29:53
