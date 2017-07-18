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
-- Table structure for table `currentstudent`
--

DROP TABLE IF EXISTS `currentstudent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currentstudent` (
  `course` varchar(255) DEFAULT NULL,
  `gpa` float DEFAULT NULL,
  `greScore` int(11) DEFAULT NULL,
  `review` varchar(255) DEFAULT NULL,
  `toeflScore` int(11) DEFAULT NULL,
  `university` varchar(255) DEFAULT NULL,
  `personID` int(11) NOT NULL,
  PRIMARY KEY (`personID`),
  KEY `FKCE025AA27BC84FD9` (`personID`),
  CONSTRAINT `FKCE025AA27BC84FD9` FOREIGN KEY (`personID`) REFERENCES `person` (`personID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currentstudent`
--

LOCK TABLES `currentstudent` WRITE;
/*!40000 ALTER TABLE `currentstudent` DISABLE KEYS */;
INSERT INTO `currentstudent` VALUES ('MS CS',3.2,307,'This is a great University!\r\n\r\n\r\n\r\n\r\n',110,'Northeastern University',3),('MS CS',3,315,'Great Opportunities!!\r\n\r\n',113,'Northeastern University',7),('MS CS',4,325,'Amazing University!!\r\n\r\n',116,'Northeastern University',9),('MS EE',3,300,'Good Place!\r\n',99,'Boston University',13);
/*!40000 ALTER TABLE `currentstudent` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-26  4:29:54
