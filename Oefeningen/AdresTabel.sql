-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.66-0+squeeze1


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema AdresTabel
--

CREATE DATABASE IF NOT EXISTS AdresTabel;
USE AdresTabel;

--
-- Definition of table `AdresTabel`.`AdresTabel`
--

DROP TABLE IF EXISTS `AdresTabel`.`AdresTabel`;
CREATE TABLE  `AdresTabel`.`AdresTabel` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Voornaam` varchar(255) NOT NULL,
  `Naam` varchar(255) NOT NULL,
  `Adres` varchar(255) NOT NULL,
  `Gemeente` varchar(255) NOT NULL,
  `Postcode` int(11) NOT NULL,
  `Telefoon` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `AdresTabel`.`AdresTabel`
--

/*!40000 ALTER TABLE `AdresTabel` DISABLE KEYS */;
LOCK TABLES `AdresTabel` WRITE;
INSERT INTO `AdresTabel`.`AdresTabel` VALUES  (1,'Paul','Theunis','Steenstraat 14','Brussel',1000,'02-725 78 45'),
 (2,'Jan','Womans','Leopoldstraat 2','Brussel',1020,'02-747 89 86'),
 (3,'Lieve','Thorrens','Madelieflaan 427','Antwerpen',2000,'03-458 79 79'),
 (4,'Manu','Ottens','Spreeuwenlaan 55','Turnhout',2300,'014-20 55 56'),
 (5,'Rachid','Severi','Broekstraat 478','Gent',9000,'09-438 73 79'),
 (6,'Jan','Poelmans','Vaarstraat 45','Leuven',3000,'016-89 56 23'),
 (7,'Mia','Groter','Vaarstraat 45','Leuven',3000,'016-89 56 23'),
 (8,'Omar','Rashoui','Vijverlaan 1','Gent',9000,'09-895 41 41'),
 (9,'Luc','Sels','Beeversestwg 8','Sint-Niklaas',9100,'09-456 23 23'),
 (10,'Lieve','Thorens','Madelieflaan 427','Antwerpen',2000,'03-458 79 79');
UNLOCK TABLES;
/*!40000 ALTER TABLE `AdresTabel` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
