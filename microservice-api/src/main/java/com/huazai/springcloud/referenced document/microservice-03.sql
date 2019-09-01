/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.182.128
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : 192.168.182.128:3306
 Source Schema         : microservice-03

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 01/09/2019 17:09:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `dname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  `db_source` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库标识',
  INDEX `主键索引`(`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1006 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1001, '研发部', 'microservice-03');
INSERT INTO `department` VALUES (1002, '业务部', 'microservice-03');
INSERT INTO `department` VALUES (1003, '产品部', 'microservice-03');
INSERT INTO `department` VALUES (1004, '财务部', 'microservice-03');
INSERT INTO `department` VALUES (1005, '市场部', 'microservice-03');

SET FOREIGN_KEY_CHECKS = 1;
