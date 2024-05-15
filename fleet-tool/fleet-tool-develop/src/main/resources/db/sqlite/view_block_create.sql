CREATE TABLE IF NOT EXISTS `develop_view_block` (
    `id` VARCHAR(32) NOT NULL,
    `code` VARCHAR(32) NOT NULL,
    `name` VARCHAR(32) NOT NULL DEFAULT '',
    `path` VARCHAR(255) NULL DEFAULT '',
    `sequence` INT NULL DEFAULT '10',
    `is_master_view` TINYINT NULL DEFAULT '0',
    `parent` VARCHAR(32) NULL DEFAULT NULL,
    `module` VARCHAR(32) NULL DEFAULT NULL,
    `created_by` VARCHAR(32) NULL DEFAULT NULL,
    `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_by` VARCHAR(32) NULL DEFAULT NULL,
    `updated_at` DATETIME NULL DEFAULT NULL,
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL,
    `deleted_at` DATETIME NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
