CREATE TABLE IF NOT EXISTS `metadata_view` (
    `id` VARCHAR(32) NOT NULL COMMENT '主键ID',
    `code` VARCHAR(64) NOT NULL COMMENT '编码',
    `name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '名称',
    `path` VARCHAR(255) NULL DEFAULT '' COMMENT '路径',
    `sequence` VARCHAR(64) NULL DEFAULT '10' COMMENT '顺序',
    `is_master_view` TINYINT NULL DEFAULT '0' COMMENT '是否主视图',
    `view_type` TINYINT NULL DEFAULT '0' COMMENT '视图类型',
    `parent` VARCHAR(32) NULL DEFAULT NULL COMMENT '父级',
    `module` VARCHAR(32) NULL DEFAULT NULL COMMENT '模块',
    `created_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '创建人ID',
    `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '更新人ID',
    `updated_at` DATETIME NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '删除人ID',
    `deleted_at` DATETIME NULL DEFAULT NULL COMMENT '删除时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `code` (`code`)
);
