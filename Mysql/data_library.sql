CREATE DATABASE `java_library_management`
    CHARACTER SET "utf8mb4"
    COLLATE "utf8mb4_general_ci";

USE `java_library_management`;

CREATE TABLE `author` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `firstName` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_general_ci',
    `lastName` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_general_ci',
    `expertise` VARCHAR(200) NOT NULL COLLATE 'utf8mb4_general_ci',
    `about` TEXT NOT NULL COLLATE 'utf8mb4_general_ci',
    PRIMARY KEY (`id`) USING BTREE
);

CREATE TABLE `book_genres` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(200) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    PRIMARY KEY (`id`) USING BTREE
);

CREATE TABLE `members` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `firstName` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `lastName` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `phone` VARCHAR(30) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `email` TEXT NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `gender` VARCHAR(25) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `picture` LONGBLOB NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
);

CREATE TABLE `users` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(120) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `password` VARCHAR(30) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    `usertype` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    PRIMARY KEY (`id`) USING BTREE
);
