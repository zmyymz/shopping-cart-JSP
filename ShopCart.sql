/*
Navicat MySQL Data Transfer

Source Server         : win10
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-05-19 14:26:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('112', '【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮', '56.90', '【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮', '100', 'jianguo.jpg');
INSERT INTO `product` VALUES ('113', '4袋 葡萄干 四色葡萄干 提子葡萄干组合 225g/袋', '93.00', '4袋 葡萄干 四色葡萄干 提子葡萄干组合 225g/袋', '120', 'raisin.jpg');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', '123');
INSERT INTO `user` VALUES ('aaa', '123');
INSERT INTO `user` VALUES ('酷玩', '123456');
