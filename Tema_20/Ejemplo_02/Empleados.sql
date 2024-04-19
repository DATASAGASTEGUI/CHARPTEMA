-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema EmpleadosJson
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema EmpleadosJson
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `EmpleadosJson` DEFAULT CHARACTER SET utf8 ;
USE `EmpleadosJson` ;

-- -----------------------------------------------------
-- Table `EmpleadosJson`.`Direccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EmpleadosJson`.`Direccion` (
  `idDireccion` VARCHAR(4) NOT NULL,
  `calle` VARCHAR(45) NOT NULL,
  `numero` INT NOT NULL,
  `ciudad` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idDireccion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EmpleadosJson`.`Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EmpleadosJson`.`Empleado` (
  `idEmpleado` VARCHAR(4) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `estatura` DOUBLE NOT NULL,
  `casado` TINYINT NOT NULL,
  `sexo` CHAR(1) NOT NULL,
  `idDireccion` VARCHAR(4) NOT NULL,
  PRIMARY KEY (`idEmpleado`),
  INDEX `fk_Empleado_Direccion_idx` (`idDireccion` ASC) VISIBLE,
  CONSTRAINT `fk_Empleado_Direccion`
    FOREIGN KEY (`idDireccion`)
    REFERENCES `EmpleadosJson`.`Direccion` (`idDireccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EmpleadosJson`.`Hobby`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EmpleadosJson`.`Hobby` (
  `idHobby` VARCHAR(4) NOT NULL,
  `descripcion` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idHobby`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EmpleadosJson`.`Empleado_has_Hobby`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EmpleadosJson`.`Empleado_has_Hobby` (
  `idEmpleado` VARCHAR(4) NOT NULL,
  `idHobby` VARCHAR(4) NOT NULL,
  PRIMARY KEY (`idEmpleado`, `idHobby`),
  INDEX `fk_Empleado_has_Hobby_Hobby1_idx` (`idHobby` ASC) VISIBLE,
  INDEX `fk_Empleado_has_Hobby_Empleado1_idx` (`idEmpleado` ASC) VISIBLE,
  CONSTRAINT `fk_Empleado_has_Hobby_Empleado1`
    FOREIGN KEY (`idEmpleado`)
    REFERENCES `EmpleadosJson`.`Empleado` (`idEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Empleado_has_Hobby_Hobby1`
    FOREIGN KEY (`idHobby`)
    REFERENCES `EmpleadosJson`.`Hobby` (`idHobby`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
