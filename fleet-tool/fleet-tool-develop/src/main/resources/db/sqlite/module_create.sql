CREATE TABLE IF NOT EXISTS `develop_module` (
    `id` VARCHAR(32) NOT NULL,
    `code` VARCHAR(32) NOT NULL UNIQUE,
    `name` VARCHAR(32) NOT NULL DEFAULT '',
    `description` VARCHAR(255) NOT NULL DEFAULT '',
    `storage_type` TINYINT NULL DEFAULT '0',
    `created_by` VARCHAR(32) NULL DEFAULT NULL,
    `created_at` DATETIME NULL DEFAULT NULL,
    `updated_by` VARCHAR(32) NULL DEFAULT NULL,
    `updated_at` DATETIME NULL DEFAULT NULL,
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL,
    `deleted_at` DATETIME NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
