CREATE TABLE IF NOT EXISTS `system_role_menu` (
    `id` varchar(32) NOT NULL COMMENT '主键ID',
    `role` varchar(32) NOT NULL DEFAULT '' COMMENT '角色',
    `menu` varchar(32) NOT NULL DEFAULT '' COMMENT '菜单',
    `ext_seg1` varchar(255) NULL DEFAULT NULL COMMENT '扩展段1',
    `ext_seg2` varchar(255) NULL DEFAULT NULL COMMENT '扩展段2',
    `ext_seg3` varchar(255) NULL DEFAULT NULL COMMENT '扩展段3',
    `ext_seg4` varchar(255) NULL DEFAULT NULL COMMENT '扩展段4',
    `ext_seg5` varchar(255) NULL DEFAULT NULL COMMENT '扩展段5',
    `ext_seg6` varchar(255) NULL DEFAULT NULL COMMENT '扩展段6',
    `ext_seg7` varchar(255) NULL DEFAULT NULL COMMENT '扩展段7',
    `ext_seg8` varchar(255) NULL DEFAULT NULL COMMENT '扩展段8',
    `created_by` varchar(32) NULL DEFAULT NULL COMMENT '创建人',
    `created_at` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_by` varchar(32) NULL DEFAULT NULL COMMENT '更新人',
    `updated_at` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updated_count` bigint unsigned NULL DEFAULT '0' COMMENT '更新次数',
    `deleted_by` varchar(32) NULL DEFAULT NULL COMMENT '删除人',
    `deleted_at` datetime NULL DEFAULT NULL COMMENT '删除时间',

    PRIMARY KEY (`id`),
    KEY `system_role_menu__role__index` (`role`)
);
