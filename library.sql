/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : library

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2016-10-14 08:00:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) DEFAULT NULL,
  `hot` tinyint(1) DEFAULT '0',
  `aid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aid_FK` (`aid`),
  CONSTRAINT `aid_FK` FOREIGN KEY (`aid`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for forder
-- ----------------------------
DROP TABLE IF EXISTS `forder`;
CREATE TABLE `forder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `remark` varchar(20) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `total` decimal(8,2) DEFAULT NULL,
  `post` varchar(20) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `sid` int(11) DEFAULT '1',
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sid_FK` (`sid`),
  KEY `uid_FK` (`uid`),
  CONSTRAINT `sid_FK` FOREIGN KEY (`sid`) REFERENCES `status` (`id`),
  CONSTRAINT `uid_FK` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  `pic` varchar(300) DEFAULT NULL,
  `remark` longtext,
  `xremark` longtext,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `commend` tinyint(1) DEFAULT NULL,
  `open` tinyint(1) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cid_FK` (`cid`),
  CONSTRAINT `cid_FK` FOREIGN KEY (`cid`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sorder
-- ----------------------------
DROP TABLE IF EXISTS `sorder`;
CREATE TABLE `sorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  `number` int(11) NOT NULL,
  `pid` int(11) DEFAULT NULL,
  `fid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pid_FK` (`pid`),
  KEY `fid_FK` (`fid`),
  CONSTRAINT `fid_FK` FOREIGN KEY (`fid`) REFERENCES `forder` (`id`),
  CONSTRAINT `pid_FK` FOREIGN KEY (`pid`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for status
-- ----------------------------
DROP TABLE IF EXISTS `status`;
CREATE TABLE `status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;
