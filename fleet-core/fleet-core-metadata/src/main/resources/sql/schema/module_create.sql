CREATE TABLE IF NOT EXISTS `metadata_module` (
    `id` VARCHAR(32) NOT NULL COMMENT '主键ID',
    `code` VARCHAR(32) NOT NULL COMMENT '编码',
    `name` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '名称',
    `description` VARCHAR(255) NULL DEFAULT '' COMMENT '描述',
    `storage_type` TINYINT NULL DEFAULT '0' COMMENT '存储类型',
    `created_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '创建人ID',
    `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '更新人ID',
    `updated_at` DATETIME NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '删除人ID',
    `deleted_at` DATETIME NULL DEFAULT NULL COMMENT '删除时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `code` (`code`)
);
