CREATE TABLE IF NOT EXISTS `develop_app` (
    `id` VARCHAR(32) NOT NULL,
    `code` VARCHAR(32) NOT NULL UNIQUE,
    `name` VARCHAR(32) NOT NULL DEFAULT '',
    `port` INT(4) NULL DEFAULT '8080',
    `description` VARCHAR(255) NOT NULL DEFAULT '',
    `created_by` VARCHAR(32) NULL DEFAULT NULL,
    `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_by` VARCHAR(32) NULL DEFAULT NULL,
    `updated_at` DATETIME NULL DEFAULT NULL,
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL,
    `deleted_at` DATETIME NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
