-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.22 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 导出 fleet_table 的数据库结构
DROP DATABASE IF EXISTS `fleet_table`;
CREATE DATABASE IF NOT EXISTS `fleet_table` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `fleet_table`;

-- 导出  表 fleet_table.apps 结构
DROP TABLE IF EXISTS `apps`;
CREATE TABLE IF NOT EXISTS `apps` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `port` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '8080' COMMENT '端口',
  `description` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '描述',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  `ext_seg` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '扩展字段',
  PRIMARY KEY (`id`),
  UNIQUE KEY `apps_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.app_modules 结构
DROP TABLE IF EXISTS `app_modules`;
CREATE TABLE IF NOT EXISTS `app_modules` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `app` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '应用',
  `module` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模块',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `app_modules_app_index` (`app`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.data_types 结构
DROP TABLE IF EXISTS `data_types`;
CREATE TABLE IF NOT EXISTS `data_types` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `Booleans` tinyint(1) DEFAULT '0' COMMENT 'Booleans',
  `Strings` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT 'Strings',
  `Texts` text COLLATE utf8mb4_unicode_ci COMMENT 'Texts',
  `Integers` int DEFAULT NULL COMMENT 'Integers',
  `Floats` decimal(12,4) NOT NULL COMMENT 'Floats',
  `Dates` datetime(3) DEFAULT NULL COMMENT 'Dates',
  `Enums` int NOT NULL DEFAULT '0' COMMENT 'Enums',
  `Models` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'Models',
  `Jsons` json DEFAULT NULL COMMENT 'Jsons',
  `Files` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'Files',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `is_system` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.departments 结构
DROP TABLE IF EXISTS `departments`;
CREATE TABLE IF NOT EXISTS `departments` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `departments_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.dictionaries 结构
DROP TABLE IF EXISTS `dictionaries`;
CREATE TABLE IF NOT EXISTS `dictionaries` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `votes` bigint NOT NULL,
  `vote` int NOT NULL,
  `votess` mediumint NOT NULL,
  `votesss` smallint NOT NULL,
  `votesssss` tinyint NOT NULL,
  `vote_num` bigint unsigned NOT NULL,
  `vote_nums` int unsigned NOT NULL,
  `vote_numss` mediumint unsigned NOT NULL,
  `vote_numsss` smallint unsigned NOT NULL,
  `vote_numssss` tinyint unsigned NOT NULL,
  `data` blob NOT NULL,
  `confirmed` tinyint(1) NOT NULL,
  `names` char(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `create` datetime NOT NULL,
  `created` datetime NOT NULL,
  `sunrise` time NOT NULL,
  `added_at` timestamp NOT NULL,
  `created_on` date NOT NULL,
  `amount` decimal(16,4) NOT NULL,
  `amounts` double NOT NULL,
  `amounting` double(53,2) NOT NULL,
  `difficulty` enum('easy','hard') COLLATE utf8mb4_unicode_ci NOT NULL,
  `visitor` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `options` json NOT NULL,
  `option` json NOT NULL,
  `description` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `datas` longblob NOT NULL,
  `descriptions` mediumtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `notes` tinytext COLLATE utf8mb4_unicode_ci NOT NULL,
  `device` varchar(17) COLLATE utf8mb4_unicode_ci NOT NULL,
  `taggable_type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `taggable_id` bigint unsigned NOT NULL,
  `flavors` set('strawberry','vanilla') COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_id` bigint unsigned NOT NULL,
  `positions` geometry NOT NULL,
  `taggables_type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `taggables_id` char(36) COLLATE utf8mb4_unicode_ci NOT NULL,
  `uid` char(36) COLLATE utf8mb4_unicode_ci NOT NULL,
  `birth_year` year NOT NULL,
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `number` decimal(12,4) unsigned NOT NULL COMMENT '数值',
  `content` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `count` double(16,2) NOT NULL COMMENT '总数',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dictionaries_code_unique` (`code`),
  KEY `dictionaries_taggable_type_taggable_id_index` (`taggable_type`,`taggable_id`),
  KEY `dictionaries_taggables_type_taggables_id_index` (`taggables_type`,`taggables_id`),
  KEY `dictionaries_number_note_index` (`number`,`note`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.enumerations 结构
DROP TABLE IF EXISTS `enumerations`;
CREATE TABLE IF NOT EXISTS `enumerations` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `full_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '全称',
  `module` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模块',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `enumerations_code_unique` (`code`),
  KEY `enumerations_module_index` (`module`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.enumeration_values 结构
DROP TABLE IF EXISTS `enumeration_values`;
CREATE TABLE IF NOT EXISTS `enumeration_values` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `value` tinyint NOT NULL DEFAULT '0' COMMENT '值',
  `enumeration` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '枚举',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `enumeration_values_code_unique` (`code`),
  KEY `enumeration_values_enumeration_index` (`enumeration`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.failed_jobs 结构
DROP TABLE IF EXISTS `failed_jobs`;
CREATE TABLE IF NOT EXISTS `failed_jobs` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `uuid` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `connection` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `queue` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `payload` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `exception` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `failed_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `failed_jobs_uuid_unique` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.menus 结构
DROP TABLE IF EXISTS `menus`;
CREATE TABLE IF NOT EXISTS `menus` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `path` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '路径',
  `icon` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '图标',
  `sequence` int NOT NULL COMMENT '序号',
  `parent` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '父级',
  `note` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '名称',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `menus_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.migrations 结构
DROP TABLE IF EXISTS `migrations`;
CREATE TABLE IF NOT EXISTS `migrations` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `migration` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.models 结构
DROP TABLE IF EXISTS `models`;
CREATE TABLE IF NOT EXISTS `models` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `full_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '全称',
  `description` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '描述',
  `module` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '模块',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `models_code_unique` (`code`),
  KEY `models_module_index` (`module`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.model_fields 结构
DROP TABLE IF EXISTS `model_fields`;
CREATE TABLE IF NOT EXISTS `model_fields` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `data_type` tinyint NOT NULL COMMENT '数据类型',
  `data_length` int NOT NULL COMMENT '数据长度',
  `enum_type` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '枚举类型',
  `model_type` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模型类型',
  `is_slave_model` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否从模型',
  `is_nullable` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可空',
  `is_searchable` tinyint(1) NOT NULL DEFAULT '0' COMMENT '可搜索',
  `is_hidden` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否隐藏',
  `is_default_display` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否默认显示',
  `is_default_hidden` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否默认隐藏',
  `note` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `sequence` int NOT NULL COMMENT '顺序',
  `model` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模型',
  `notes` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `model_fields_code_unique` (`code`),
  KEY `model_fields_model_index` (`model`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.modules 结构
DROP TABLE IF EXISTS `modules`;
CREATE TABLE IF NOT EXISTS `modules` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `description` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '描述',
  `storage_type` tinyint NOT NULL DEFAULT '0' COMMENT '存储类型',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `modules_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.orgs 结构
DROP TABLE IF EXISTS `orgs`;
CREATE TABLE IF NOT EXISTS `orgs` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orgs_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.org_roles 结构
DROP TABLE IF EXISTS `org_roles`;
CREATE TABLE IF NOT EXISTS `org_roles` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `org` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '组织',
  `role` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '角色',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `org_roles_org_index` (`org`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.org_users 结构
DROP TABLE IF EXISTS `org_users`;
CREATE TABLE IF NOT EXISTS `org_users` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `org` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '组织',
  `user` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `org_users_org_index` (`org`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.password_reset_tokens 结构
DROP TABLE IF EXISTS `password_reset_tokens`;
CREATE TABLE IF NOT EXISTS `password_reset_tokens` (
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.personal_access_tokens 结构
DROP TABLE IF EXISTS `personal_access_tokens`;
CREATE TABLE IF NOT EXISTS `personal_access_tokens` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `tokenable_type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tokenable_id` bigint unsigned NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL,
  `abilities` text COLLATE utf8mb4_unicode_ci,
  `last_used_at` timestamp NULL DEFAULT NULL,
  `expires_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `personal_access_tokens_token_unique` (`token`),
  KEY `personal_access_tokens_tokenable_type_tokenable_id_index` (`tokenable_type`,`tokenable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.resource_files 结构
DROP TABLE IF EXISTS `resource_files`;
CREATE TABLE IF NOT EXISTS `resource_files` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '文件名',
  `size` bigint unsigned NOT NULL COMMENT '文件大小',
  `type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '文件类型',
  `path` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '文件路径',
  `url` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '文件URL',
  `location` tinyint NOT NULL COMMENT '存储位置',
  `directory` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '目录',
  `category` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '分类',
  `status` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '状态',
  `scope` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '域',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.roles 结构
DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `roles_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.role_menus 结构
DROP TABLE IF EXISTS `role_menus`;
CREATE TABLE IF NOT EXISTS `role_menus` (
  `id` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `role` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '角色',
  `menu` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '菜单',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `role_menus_role_index` (`role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.situations 结构
DROP TABLE IF EXISTS `situations`;
CREATE TABLE IF NOT EXISTS `situations` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `situations_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.tenants 结构
DROP TABLE IF EXISTS `tenants`;
CREATE TABLE IF NOT EXISTS `tenants` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tenants_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.tenant_roles 结构
DROP TABLE IF EXISTS `tenant_roles`;
CREATE TABLE IF NOT EXISTS `tenant_roles` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `tenant` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '租户',
  `role` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '角色',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `tenant_roles_tenant_index` (`tenant`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.tenant_users 结构
DROP TABLE IF EXISTS `tenant_users`;
CREATE TABLE IF NOT EXISTS `tenant_users` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `tenant` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '租户',
  `user` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `tenant_users_tenant_index` (`tenant`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.types 结构
DROP TABLE IF EXISTS `types`;
CREATE TABLE IF NOT EXISTS `types` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `Booleans` tinyint(1) NOT NULL COMMENT 'Booleans',
  `Strings` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'Strings',
  `Texts` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'Texts',
  `Integers` int NOT NULL COMMENT 'Integers',
  `Floats` decimal(12,4) NOT NULL COMMENT 'Floats',
  `Dates` datetime(3) NOT NULL COMMENT 'Dates',
  `Enums` int NOT NULL COMMENT 'Enums',
  `Models` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'Models',
  `Jsons` json NOT NULL COMMENT 'Jsons',
  `Files` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'Files',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `is_system` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `types_remark_updated_count_index` (`remark`,`updated_count`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.users 结构
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `username` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `email` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '邮箱',
  `phone` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '手机',
  `userType` tinyint NOT NULL COMMENT '类型',
  `userStatus` tinyint NOT NULL COMMENT '状态',
  `isSuperAdmin` tinyint(1) NOT NULL DEFAULT '0' COMMENT '超级管理员',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `users_username_unique` (`username`),
  UNIQUE KEY `users_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.user_profiles 结构
DROP TABLE IF EXISTS `user_profiles`;
CREATE TABLE IF NOT EXISTS `user_profiles` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `user` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `email` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `address` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地址',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `user_profiles_user_index` (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.user_roles 结构
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE IF NOT EXISTS `user_roles` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `user` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户',
  `role` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '角色',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `user_roles_user_index` (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.views 结构
DROP TABLE IF EXISTS `views`;
CREATE TABLE IF NOT EXISTS `views` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `path` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '路径',
  `is_master_view` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否主视图',
  `view_type` tinyint NOT NULL DEFAULT '0' COMMENT '视图类型',
  `parent` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '父级',
  `sequence` int NOT NULL DEFAULT '10' COMMENT '顺序',
  `module` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模块',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `views_code_unique` (`code`),
  KEY `views_module_index` (`module`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

-- 导出  表 fleet_table.view_blocks 结构
DROP TABLE IF EXISTS `view_blocks`;
CREATE TABLE IF NOT EXISTS `view_blocks` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `block_type` tinyint NOT NULL DEFAULT '0' COMMENT '视图类型',
  `sequence` int NOT NULL DEFAULT '10' COMMENT '顺序',
  `model` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '模型',
  `view` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '视图',
  `note` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '备注',
  `isSystem` tinyint(1) NOT NULL DEFAULT '1' COMMENT '系统预置',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '备注',
  `is_valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `created_by` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建人ID',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人ID',
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `updated_count` int unsigned DEFAULT '0' COMMENT '更新总次数',
  `deleted_by` char(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '删除人ID',
  `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `view_blocks_code_unique` (`code`),
  KEY `view_blocks_view_index` (`view`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 数据导出被取消选择。

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
