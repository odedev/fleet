CREATE TABLE IF NOT EXISTS `develop_view` (
    `id` VARCHAR(32) NOT NULL COMMENT '主键ID',
    `code` VARCHAR(32) NOT NULL COMMENT '编码',
    `name` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '名称',
    `path` VARCHAR(255) NULL DEFAULT '' COMMENT '路径',
    `sn` INT(10) NULL DEFAULT '10' COMMENT '序列号',
    `is_master_view` TINYINT(1) NULL DEFAULT '0' COMMENT '是否主视图',
    `parent` VARCHAR(32) NULL DEFAULT NULL COMMENT '父级',
    `module` VARCHAR(32) NULL DEFAULT NULL COMMENT '模块',
    `created_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '创建人ID',
    `created_at` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
    `updated_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '更新人ID',
    `updated_at` DATETIME NULL DEFAULT NULL COMMENT '更新时间',
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '删除人ID',
    `deleted_at` DATETIME NULL DEFAULT NULL COMMENT '删除时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `code` (`code`)
);
