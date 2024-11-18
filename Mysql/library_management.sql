-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema java_library_management
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema java_library_management
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `java_library_management` DEFAULT CHARACTER SET utf8mb4 ;
USE `java_library_management` ;

-- -----------------------------------------------------
-- Table `java_library_management`.`author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `java_library_management`.`author` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(100) CHARACTER SET 'utf8mb4' NOT NULL,
  `lastName` VARCHAR(100) CHARACTER SET 'utf8mb4' NOT NULL,
  `expertise` VARCHAR(200) CHARACTER SET 'utf8mb4' NOT NULL,
  `about` TEXT CHARACTER SET 'utf8mb4' NOT NULL,
  PRIMARY KEY USING BTREE (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `java_library_management`.`book_genres`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `java_library_management`.`book_genres` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `java_library_management`.`books`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `java_library_management`.`books` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `isbn` VARCHAR(25) CHARACTER SET 'latin1' NOT NULL,
  `name` VARCHAR(250) CHARACTER SET 'latin1' COLLATE 'latin1_spanish_ci' NOT NULL,
  `author_id` INT NOT NULL,
  `genre_id` INT NOT NULL,
  `quantity` INT NOT NULL,
  `publisher` VARCHAR(250) CHARACTER SET 'latin1' NOT NULL,
  `price` DOUBLE NOT NULL,
  `date_received` DATETIME NOT NULL,
  `description` TEXT CHARACTER SET 'latin1' NOT NULL,
  `cover_image` LONGBLOB NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `java_library_management`.`issue_book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `java_library_management`.`issue_book` (
  `book_id` INT NOT NULL,
  `member_id` INT NOT NULL,
  `status` VARCHAR(50) NOT NULL,
  `issue_date` DATE NOT NULL,
  `return_date` DATE NOT NULL,
  `note` TEXT NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `java_library_management`.`members`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `java_library_management`.`members` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(100) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  `lastName` VARCHAR(100) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  `phone` VARCHAR(30) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  `email` TEXT CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  `gender` VARCHAR(25) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  `picture` LONGBLOB NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `java_library_management`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `java_library_management`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(120) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  `password` VARCHAR(30) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  `usertype` VARCHAR(50) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `java_library_management`.`users_table`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `java_library_management`.`users_table` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(100) NOT NULL,
  `lastName` VARCHAR(100) NOT NULL,
  `username` VARCHAR(100) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  `user_type` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
