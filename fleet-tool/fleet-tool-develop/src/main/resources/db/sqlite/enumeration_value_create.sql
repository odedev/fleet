CREATE TABLE IF NOT EXISTS `develop_enumeration_value` (
    `id` VARCHAR(32) NOT NULL,
    `value` TINYINT NOT NULL DEFAULT '0',
    `name` VARCHAR(32) NOT NULL DEFAULT '',
    `enumeration` VARCHAR(32) NOT NULL,
    `created_by` VARCHAR(32) NULL DEFAULT NULL,
    `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_by` VARCHAR(32) NULL DEFAULT NULL COMMENT,
    `updated_at` DATETIME NULL DEFAULT NULL,
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL,
    `deleted_at` DATETIME NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
