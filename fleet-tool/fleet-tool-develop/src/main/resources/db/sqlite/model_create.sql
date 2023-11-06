CREATE TABLE IF NOT EXISTS `develop_model` (
    `id` VARCHAR(32) NOT NULL,
    `code` VARCHAR(64) NOT NULL,
    `name` VARCHAR(64) NULL DEFAULT '',
    `description` VARCHAR(255) NULL DEFAULT '',
    `full_name` VARCHAR(255) NOT NULL DEFAULT '',
    `module` VARCHAR(32) NOT NULL DEFAULT '',
    `created_by` VARCHAR(32) NULL DEFAULT NULL,
    `created_at` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_by` VARCHAR(32) NULL DEFAULT NULL,
    `updated_at` DATETIME NULL DEFAULT NULL,
    `deleted_by` VARCHAR(32) NULL DEFAULT NULL,
    `deleted_at` DATETIME NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
