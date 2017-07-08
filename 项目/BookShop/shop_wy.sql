/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : shop_wy

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-07-08 10:39:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `price` bigint(20) DEFAULT NULL COMMENT '当前价格',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `icon` varchar(50) DEFAULT NULL COMMENT '图片',
  `abstracts` varchar(200) DEFAULT NULL COMMENT '摘要',
  `text` varchar(500) DEFAULT NULL COMMENT '正文',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of content
-- ----------------------------
INSERT INTO `content` VALUES ('1', '45', '在世界尽头遇见自己', 'http://img3x3.ddimg.cn/96/19/23977203-1_w_6.jpg', '你不知道你的未来在哪里，但是总有一天你总会遇见最好的自己！', '当眼前的浮云遮挡住了我们锐利的目光，当弥漫的阴霾吞噬了我们的心灵，当我们在急功近利的年代迷失了自我，又是什么能让我们追逐梦想，渴望成功，坚持自我，看淡得失？\r\n我们战胜一切，走到生命尽头，恍然回顾，才会看清当初的对错。当我们在世界尽头遇到自己，看清自己，是否会后悔、遗憾今天所走过的路？总体来说，这是一本充满了能量的书，容易让读者产生共呜并从中看到希望，以及学习到不同事物会有不同的选择，这种健康、积极向上的生活态度，是一部非常好的作品。');
INSERT INTO `content` VALUES ('2', '30', '变身', 'http://img3x8.ddimg.cn/95/25/24012248-2_w_9.jpg', '东野圭吾：变身 （2016版）（天王作家东野圭吾写尽人性的挣扎和爱情的美好）', '《变身》内容简介：《变身》是日本作家东野圭吾创作的长篇小说。日本版销量突破125万册。苍井优、玉木宏主演同名电影原著小说。东野圭吾在谈及《变身》 的创作缘起时曾说：“距今约十五年前，我将住家与工作室分开，每天早上搭公交车转电车前去工作室工作。有天在公交车上突然冒出一个灵感，那就是：‘人类有 左脑和右脑，要是其中之一和别人交换会怎么样？’当然，灵感不是凭空而来，当时我对人类的脑很有兴趣而看了好几本相关书籍，我想是因为这样，这个疑问才会 浮上脑海吧。后来这个疑问化为小说的灵感，到我下公交车时，整个故事已经在脑中完成大半了，前后大概只花了二十分钟左右。对我而言，灵感极少像这样浮现， 甚至可说这是唯一的一次。平常我总是得绞尽脑汁，想得满头大汗。”24岁那年，纯一的生活彻底改变了。为了救一个小女孩，他中弹受伤。痊愈出院后，他变得 自信、要强，并展现出从未有过的音乐才华。这简直像是重生一样！但可怕的变化渐渐出现了，愤怒和怨恨在他心中急剧膨胀，面对素不相识的人都会萌生强烈的杀 意。他决心查清真相，却发现有人正暗中监视着他。');
INSERT INTO `content` VALUES ('3', '27', '一生欠安', 'http://img3x2.ddimg.cn/30/27/24032082-1_w_8.jpg', '引万千网友热议，自媒体现象级热文《鲁迅妻子朱安：一生欠安》等结集出版', '陈圆圆\r\n柳如是\r\n影后胡蝶\r\n末代皇后婉容\r\n鲁迅之妻朱安\r\n宋子文初恋盛七小姐\r\n少帅张学良夫人于凤至\r\n……\r\n笔墨这端，岁月那头，揭开十五位传奇女子的情感秘辛。\r\n她们爱过煊赫一世的男人，却终在历史风尘间隐匿、失声、成谜……\r\n女子一生，何以为安？');
INSERT INTO `content` VALUES ('4', '25', '人生的智慧', 'http://img3x2.ddimg.cn/20/32/23798432-1_w_15.jpg', '人生的智慧：如何才能幸福度过一生', '《人生的智慧：如何才能幸福度过一生（插图本珍藏版）》，中国作家榜推荐词——\r\n★ 这是伟大哲人叔本华的巅峰杰作，迷茫者的灯塔之书！被誉为通俗实用的哲学入门经典。\r\n★ 翻开本书，彻底读懂“人是什么”、“人有什么”、“你在他人眼中是什么”。\r\n★ 本书能帮助我们在茫茫人世成为一棵参天大树，坦然无畏、宠辱不惊，幸福度过一生！\r\n★ 本译本与其它译本的四大不同：真正珍藏足本，全新无删节珍藏版，忠实还原叔本华的权威定本；为方便读者阅读，首次划分章节新增标题；首次新增纯手绘插画，装帧设计精美，适合各年龄段读者阅读收藏；荣获当当终身五星级畅销好书奖。');
INSERT INTO `content` VALUES ('39', '26', '三杯茶', 'http://img3x7.ddimg.cn/28/33/23547277-1_w_2.jpg', '一个承诺，十年奔走，感动世界亿万读者', '敬上一杯茶，你是一个陌生人；再奉第二杯，你是我们的朋友；第三杯茶，你是我的家人，我将用生命来保护你。　　一个人，一个承诺，一段辛苦漫长的旅程，许许多多人的爱心，一个美丽的承诺，终于实践。顿森把一次旅行化作了一个生命的承诺，从而改变了他在路途中所遇见的人的命运，并通过文字将看似不相干的人拉在一起，娓娓道来，他朴素的心便很快让你跳进《三杯茶》的友情世界里去，令你也嗅到茶的清幽香味。');
INSERT INTO `content` VALUES ('41', '22', '灿烂千阳', 'http://img3x8.ddimg.cn/42/13/20002398-1_x_7.jpg', '作者献给阿富汗女性的动人故事。关于不可宽恕的时代，不可能的友谊以及不可毁灭的爱。每个布满灰尘的面孔背后都有一个灵魂。', '《灿烂千阳》被称为“女性版《追风筝的人》”，胡塞尼再次以阿富汗战乱为背景，时空跨越三十年，用细腻感人的笔触描绘了阿富汗旧制度于新时代下苦苦挣扎的妇女，她们所怀抱的希望、爱情、梦想与所有的失落。\r\n　　私生女玛丽雅姆在父亲的宅院门口苦苦守候，回到家却看到因绝望而上吊自杀的母亲。那天是她十五岁的生日，而童年嘎然而止。玛丽雅姆随后由父亲安排远嫁喀布尔四十多岁的鞋匠拉希德，几经流产，终因无法生子而长期生活在家暴阴影之下。\r\n　　十八年后，少女莱拉的父母死于战火，青梅竹马的恋人也在战乱中失踪，举目无亲的莱拉别无选择，被迫嫁给拉希德。两名阿富汗女性各自带着属于不同时代的悲惨回忆，共同经受着战乱、贫困与家庭暴力的重压，心底潜藏着的悲苦与忍耐相互交织，让她们曾经水火不容，又让她们缔结情谊，如母女般相濡以沫。然而，多年的骗局终有被揭穿的一天……\r\n　　她们将做出如何的选择？她们的命运又将何去何从？\r\n　　关于不可宽恕的时代，不可能的友谊以及不可毁灭的爱。');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码md5加密',
  `nickName` varchar(50) DEFAULT NULL COMMENT '用户昵称',
  `userType` int(3) DEFAULT NULL COMMENT '类型，买家0，卖家1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'buyer', '111111', 'buyer', '0');
INSERT INTO `person` VALUES ('2', 'seller', 'relles', 'seller', '1');

-- ----------------------------
-- Table structure for trx
-- ----------------------------
DROP TABLE IF EXISTS `trx`;
CREATE TABLE `trx` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `contentId` int(11) DEFAULT NULL COMMENT '内容ID',
  `personId` int(11) DEFAULT NULL COMMENT '用户ID',
  `price` int(11) DEFAULT NULL COMMENT '购买价格',
  `time` varchar(20) DEFAULT NULL COMMENT '购买时间',
  PRIMARY KEY (`id`),
  KEY `trx` (`contentId`),
  CONSTRAINT `trx` FOREIGN KEY (`contentId`) REFERENCES `content` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trx
-- ----------------------------
INSERT INTO `trx` VALUES ('1', '1', '1', '45', '2016-7-24');
INSERT INTO `trx` VALUES ('2', '1', '1', '45', '2017-04-14 21:09:46');
