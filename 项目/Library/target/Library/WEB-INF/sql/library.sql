/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : library

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2016-10-27 13:34:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '小张', 'zhang');
INSERT INTO `account` VALUES ('2', '小李', 'lixi');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '小说', '1', '1');
INSERT INTO `category` VALUES ('2', '哲学', '2', '2');

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
) ENGINE=InnoDB AUTO_INCREMENT=201605002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of forder
-- ----------------------------
INSERT INTO `forder` VALUES ('201605001', 'July', '17854212137', '山东省青岛市胶州市福州南路236号', '2016-10-24 19:23:03', '27.00', '266300', '配货中', '1', null);

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
  `open` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cid_FK` (`cid`),
  CONSTRAINT `cid_FK` FOREIGN KEY (`cid`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '在世界尽头遇见自己', '25.20', 'http://img3x3.ddimg.cn/96/19/23977203-1_w_6.jpg', '你不知道你的未来在哪里，但是总有一天你总会遇见最好的自己！', '当眼前的浮云遮挡住了我们锐利的目光，当弥漫的阴霾吞噬了我们的心灵，当我们在急功近利的年代迷失了自我，又是什么能让我们追逐梦想，渴望成功，坚持自我，看淡得失？\r\n我们战胜一切，走到生命尽头，恍然回顾，才会看清当初的对错。当我们在世界尽头遇到自己，看清自己，是否会后悔、遗憾今天所走过的路？总体来说，这是一本充满了能量的书，容易让读者产生共呜并从中看到希望，以及学习到不同事物会有不同的选择，这种健康、积极向上的生活态度，是一部非常好的作品，推荐出版。', '2016-06-10 19:10:42', '1', '1');
INSERT INTO `product` VALUES ('2', '变身', '29.80', 'http://img3x8.ddimg.cn/95/25/24012248-2_w_9.jpg', '东野圭吾：变身 （2016版）（天王作家东野圭吾写尽人性的挣扎和爱情的美好）', '《变身》内容简介：《变身》是日本作家东野圭吾创作的长篇小说。日本版销量突破125万册。苍井优、玉木宏主演同名电影原著小说。东野圭吾在谈及《变身》 的创作缘起时曾说：“距今约十五年前，我将住家与工作室分开，每天早上搭公交车转电车前去工作室工作。有天在公交车上突然冒出一个灵感，那就是：‘人类有 左脑和右脑，要是其中之一和别人交换会怎么样？’当然，灵感不是凭空而来，当时我对人类的脑很有兴趣而看了好几本相关书籍，我想是因为这样，这个疑问才会 浮上脑海吧。后来这个疑问化为小说的灵感，到我下公交车时，整个故事已经在脑中完成大半了，前后大概只花了二十分钟左右。对我而言，灵感极少像这样浮现， 甚至可说这是唯一的一次。平常我总是得绞尽脑汁，想得满头大汗。”24岁那年，纯一的生活彻底改变了。为了救一个小女孩，他中弹受伤。痊愈出院后，他变得 自信、要强，并展现出从未有过的音乐才华。这简直像是重生一样！但可怕的变化渐渐出现了，愤怒和怨恨在他心中急剧膨胀，面对素不相识的人都会萌生强烈的杀 意。他决心查清真相，却发现有人正暗中监视着他。', '2016-06-10 19:10:42', '1', '1');
INSERT INTO `product` VALUES ('3', '一生欠安', '27.00', 'http://img3x2.ddimg.cn/30/27/24032082-1_w_8.jpg', '刷爆朋友圈，转发500万+，引万千网友热议，自媒体现象级热文《鲁迅妻子朱安：一生欠安》等结集出版', '陈圆圆\r\n柳如是\r\n影后胡蝶\r\n末代皇后婉容\r\n鲁迅之妻朱安\r\n宋子文初恋盛七小姐\r\n少帅张学良夫人于凤至\r\n……\r\n笔墨这端，岁月那头，揭开十五位传奇女子的情感秘辛。\r\n她们爱过煊赫一世的男人，却终在历史风尘间隐匿、失声、成谜……\r\n女子一生，何以为安？', '2016-09-23 19:17:04', '1', '2');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sorder
-- ----------------------------
INSERT INTO `sorder` VALUES ('1', '一叶知秋', '56.00', '1', null, null);
INSERT INTO `sorder` VALUES ('2', '一叶知秋', '56.00', '1', null, null);

-- ----------------------------
-- Table structure for status
-- ----------------------------
DROP TABLE IF EXISTS `status`;
CREATE TABLE `status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of status
-- ----------------------------
INSERT INTO `status` VALUES ('1', '1');
INSERT INTO `status` VALUES ('2', '0');
INSERT INTO `status` VALUES ('3', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'July', '123456', '女', '17854212137');
INSERT INTO `user` VALUES ('2', '周怡', '654321', '男', '13554202137');
