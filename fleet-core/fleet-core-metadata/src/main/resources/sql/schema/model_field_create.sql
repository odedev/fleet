CREATE TABLE IF NOT EXISTS `metadata_model_field` (
    `id` VARCHAR(32) NOT NULL COMMENT '主键ID',
    `code` VARCHAR(64) NOT NULL COMMENT '编码',
    `name` VARCHAR(64) NULL DEFAULT '' COMMENT '名称',
    `data_type` TINYINT NOT NULL DEFAULT '1' COMMENT '数据类型',
    `data_length` INT NULL DEFAULT '255' COMMENT '数据长度',
    `enum_type` VARCHAR(32) NULL DEFAULT NULL COMMENT '枚举类型',
    `model_type` VARCHAR(32) NULL DEFAULT NULL COMMENT '模型类型',
    `is_slave_model` TINYINT NULL DEFAULT '0' COMMENT '是否从模型',
    `is_nullable` TINYINT NULL DEFAULT '1' COMMENT '可空',
    `is_searchable` TINYINT NULL DEFAULT '0' COMMENT '可搜索',
    `is_default_display` TINYINT NULL DEFAULT '0' COMMENT '是否默认显示',
    `note` VARCHAR(255) NULL DEFAULT '' COMMENT '备注',
    `sequence` VARCHAR(64) NULL DEFAULT '10' COMMENT '顺序',
    `model` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '模型',
    `created_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '创建人',
    `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '更新人',
    `updated_at` DATETIME NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL COMMENT '删除人',
    `deleted_at` DATETIME NULL DEFAULT NULL COMMENT '删除时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `code_model` (`code`, `model`)
);
