-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: fleet_table
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `app_modules`
--

DROP TABLE IF EXISTS `app_modules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `app_modules` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `app_modules`
--

LOCK TABLES `app_modules` WRITE;
/*!40000 ALTER TABLE `app_modules` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_modules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apps`
--

DROP TABLE IF EXISTS `apps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apps` (
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
  UNIQUE KEY `apps_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apps`
--

LOCK TABLES `apps` WRITE;
/*!40000 ALTER TABLE `apps` DISABLE KEYS */;
/*!40000 ALTER TABLE `apps` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departments` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dictionaries`
--

DROP TABLE IF EXISTS `dictionaries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dictionaries` (
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
  `amount` decimal(8,2) NOT NULL,
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
  KEY `dictionaries_taggables_type_taggables_id_index` (`taggables_type`,`taggables_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dictionaries`
--

LOCK TABLES `dictionaries` WRITE;
/*!40000 ALTER TABLE `dictionaries` DISABLE KEYS */;
/*!40000 ALTER TABLE `dictionaries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enumeration_values`
--

DROP TABLE IF EXISTS `enumeration_values`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enumeration_values` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `enumeration` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '枚举',
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
  UNIQUE KEY `enumeration_values_code_unique` (`code`),
  KEY `enumeration_values_enumeration_index` (`enumeration`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enumeration_values`
--

LOCK TABLES `enumeration_values` WRITE;
/*!40000 ALTER TABLE `enumeration_values` DISABLE KEYS */;
/*!40000 ALTER TABLE `enumeration_values` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enumerations`
--

DROP TABLE IF EXISTS `enumerations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enumerations` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `module` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模块',
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
  UNIQUE KEY `enumerations_code_unique` (`code`),
  KEY `enumerations_module_index` (`module`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enumerations`
--

LOCK TABLES `enumerations` WRITE;
/*!40000 ALTER TABLE `enumerations` DISABLE KEYS */;
/*!40000 ALTER TABLE `enumerations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `failed_jobs`
--

DROP TABLE IF EXISTS `failed_jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `failed_jobs` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `failed_jobs`
--

LOCK TABLES `failed_jobs` WRITE;
/*!40000 ALTER TABLE `failed_jobs` DISABLE KEYS */;
/*!40000 ALTER TABLE `failed_jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menus`
--

DROP TABLE IF EXISTS `menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menus` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menus`
--

LOCK TABLES `menus` WRITE;
/*!40000 ALTER TABLE `menus` DISABLE KEYS */;
/*!40000 ALTER TABLE `menus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `migrations`
--

DROP TABLE IF EXISTS `migrations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `migrations` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `migration` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `migrations`
--

LOCK TABLES `migrations` WRITE;
/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;
INSERT INTO `migrations` VALUES (1,'2014_10_12_000000_create_users_table',1),(2,'2014_10_12_100000_create_password_reset_tokens_table',1),(3,'2019_08_19_000000_create_failed_jobs_table',1),(4,'2019_12_14_000001_create_personal_access_tokens_table',1),(5,'2023_12_22_070529_create_menus_table',1),(6,'2023_12_22_070530_create_role_menus_table',1),(7,'2023_12_22_070530_create_roles_table',1),(8,'2023_12_22_070532_create_user_profiles_table',1),(9,'2023_12_22_070532_create_user_roles_table',1),(10,'2023_12_22_070533_create_departments_table',1),(11,'2023_12_22_070534_create_orgs_table',1),(12,'2023_12_22_070535_create_org_roles_table',1),(13,'2023_12_22_070535_create_org_users_table',1),(14,'2023_12_22_070536_create_situations_table',1),(15,'2023_12_22_070537_create_tenants_table',1),(16,'2023_12_22_070538_create_tenant_roles_table',1),(17,'2023_12_22_070538_create_tenant_users_table',1),(18,'2023_12_22_070539_create_resource_files_table',1),(19,'2023_12_22_070540_create_apps_table',1),(20,'2023_12_22_070541_create_app_modules_table',1),(21,'2023_12_22_070541_create_enumerations_table',1),(22,'2023_12_22_070542_create_enumeration_values_table',1),(23,'2023_12_22_070543_create_models_table',1),(24,'2023_12_22_070544_create_model_fields_table',1),(25,'2023_12_22_070544_create_modules_table',1),(26,'2023_12_22_070545_create_views_table',1),(27,'2023_12_22_070546_create_view_blocks_table',1),(28,'2024_03_26_154644_create_dictionaries_table',1);
/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `model_fields`
--

DROP TABLE IF EXISTS `model_fields`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `model_fields` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `model` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模型',
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
  UNIQUE KEY `model_fields_code_unique` (`code`),
  KEY `model_fields_model_index` (`model`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `model_fields`
--

LOCK TABLES `model_fields` WRITE;
/*!40000 ALTER TABLE `model_fields` DISABLE KEYS */;
/*!40000 ALTER TABLE `model_fields` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `models`
--

DROP TABLE IF EXISTS `models`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `models` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `module` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模块',
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
  UNIQUE KEY `models_code_unique` (`code`),
  KEY `models_module_index` (`module`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `models`
--

LOCK TABLES `models` WRITE;
/*!40000 ALTER TABLE `models` DISABLE KEYS */;
/*!40000 ALTER TABLE `models` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modules`
--

DROP TABLE IF EXISTS `modules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modules` (
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
  UNIQUE KEY `modules_code_unique` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modules`
--

LOCK TABLES `modules` WRITE;
/*!40000 ALTER TABLE `modules` DISABLE KEYS */;
/*!40000 ALTER TABLE `modules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `org_roles`
--

DROP TABLE IF EXISTS `org_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `org_roles` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `org_roles`
--

LOCK TABLES `org_roles` WRITE;
/*!40000 ALTER TABLE `org_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `org_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `org_users`
--

DROP TABLE IF EXISTS `org_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `org_users` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `org_users`
--

LOCK TABLES `org_users` WRITE;
/*!40000 ALTER TABLE `org_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `org_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orgs`
--

DROP TABLE IF EXISTS `orgs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orgs` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orgs`
--

LOCK TABLES `orgs` WRITE;
/*!40000 ALTER TABLE `orgs` DISABLE KEYS */;
/*!40000 ALTER TABLE `orgs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `password_reset_tokens`
--

DROP TABLE IF EXISTS `password_reset_tokens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `password_reset_tokens` (
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `password_reset_tokens`
--

LOCK TABLES `password_reset_tokens` WRITE;
/*!40000 ALTER TABLE `password_reset_tokens` DISABLE KEYS */;
/*!40000 ALTER TABLE `password_reset_tokens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal_access_tokens`
--

DROP TABLE IF EXISTS `personal_access_tokens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personal_access_tokens` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal_access_tokens`
--

LOCK TABLES `personal_access_tokens` WRITE;
/*!40000 ALTER TABLE `personal_access_tokens` DISABLE KEYS */;
/*!40000 ALTER TABLE `personal_access_tokens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resource_files`
--

DROP TABLE IF EXISTS `resource_files`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resource_files` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resource_files`
--

LOCK TABLES `resource_files` WRITE;
/*!40000 ALTER TABLE `resource_files` DISABLE KEYS */;
/*!40000 ALTER TABLE `resource_files` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_menus`
--

DROP TABLE IF EXISTS `role_menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_menus` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_menus`
--

LOCK TABLES `role_menus` WRITE;
/*!40000 ALTER TABLE `role_menus` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_menus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `situations`
--

DROP TABLE IF EXISTS `situations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `situations` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `situations`
--

LOCK TABLES `situations` WRITE;
/*!40000 ALTER TABLE `situations` DISABLE KEYS */;
/*!40000 ALTER TABLE `situations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tenant_roles`
--

DROP TABLE IF EXISTS `tenant_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tenant_roles` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tenant_roles`
--

LOCK TABLES `tenant_roles` WRITE;
/*!40000 ALTER TABLE `tenant_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `tenant_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tenant_users`
--

DROP TABLE IF EXISTS `tenant_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tenant_users` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tenant_users`
--

LOCK TABLES `tenant_users` WRITE;
/*!40000 ALTER TABLE `tenant_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `tenant_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tenants`
--

DROP TABLE IF EXISTS `tenants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tenants` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tenants`
--

LOCK TABLES `tenants` WRITE;
/*!40000 ALTER TABLE `tenants` DISABLE KEYS */;
/*!40000 ALTER TABLE `tenants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_profiles`
--

DROP TABLE IF EXISTS `user_profiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_profiles` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `user` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户',
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
  KEY `user_profiles_user_index` (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_profiles`
--

LOCK TABLES `user_profiles` WRITE;
/*!40000 ALTER TABLE `user_profiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_profiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_roles` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `username` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编码',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `email` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '邮箱',
  `phone` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '手机',
  `userType` tinyint NOT NULL COMMENT '类型',
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `view_blocks`
--

DROP TABLE IF EXISTS `view_blocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `view_blocks` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `view` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '视图',
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
  UNIQUE KEY `view_blocks_code_unique` (`code`),
  KEY `view_blocks_view_index` (`view`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `view_blocks`
--

LOCK TABLES `view_blocks` WRITE;
/*!40000 ALTER TABLE `view_blocks` DISABLE KEYS */;
/*!40000 ALTER TABLE `view_blocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `views`
--

DROP TABLE IF EXISTS `views`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `views` (
  `id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'ID',
  `module` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '模块',
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
  UNIQUE KEY `views_code_unique` (`code`),
  KEY `views_module_index` (`module`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `views`
--

LOCK TABLES `views` WRITE;
/*!40000 ALTER TABLE `views` DISABLE KEYS */;
/*!40000 ALTER TABLE `views` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-27  0:22:33
