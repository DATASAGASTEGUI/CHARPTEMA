-- ELIMINAR LA BASE DE DATOS SI EXISTE

DROP DATABASE IF EXISTS INSTITUTO;

-- CREAR LA BASE DE DATOS SI NO EXISTE

CREATE DATABASE IF NOT EXISTS INSTITUTO;

-- SELECCIONAR LA BASE DE DATOS PARA SU USO

USE INSTITUTO ;

-- -----------------------------------------------------
-- Table Profesor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Profesor (
  dni        INT         NOT NULL,
  nombre     VARCHAR(45) NOT NULL,
  direccion  VARCHAR(45) NOT NULL,
  telefono   CHAR(9) NOT NULL,
             PRIMARY KEY (dni)
) ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table Modulo
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Modulo (
  codigoModulo VARCHAR(4)  NOT NULL,
  nombre       VARCHAR(45) NOT NULL,
  dni          INT         NOT NULL,
               PRIMARY KEY (codigoModulo),
               FOREIGN KEY (dni) REFERENCES Profesor (dni) ON DELETE CASCADE
) ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table Alumno
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Alumno (
  idAlumno         INT         NOT NULL AUTO_INCREMENT,
  nombre           VARCHAR(45) NOT NULL,
  apellidos        VARCHAR(45) NOT NULL,
  fecha_nacimiento VARCHAR(10) NOT NULL,
  numeroExpediente VARCHAR(30) NOT NULL,
                   PRIMARY KEY (idAlumno)
) ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table INSTITUO.Asignatura
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Asignatura (
  idAsignatura     INT         NOT NULL AUTO_INCREMENT,
  nombre           VARCHAR(45) NOT NULL,
  idDelegadoAlumno INT         NOT NULL,
  codigoModulo     VARCHAR(4)  NOT NULL,
                   PRIMARY KEY (idAsignatura),
                   FOREIGN KEY (codigoModulo) REFERENCES Modulo (codigoModulo) ON DELETE CASCADE
) ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Alumnos_x_Modulo
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Alumnos_x_Modulo (
  codigoModulo VARCHAR(4) NOT NULL,
  idAlumno     INT        NOT NULL,
               PRIMARY KEY (codigoModulo, idAlumno),
               FOREIGN KEY (codigoModulo) REFERENCES Modulo (codigoModulo) ON DELETE CASCADE,
               FOREIGN KEY (idAlumno) REFERENCES Alumno (idAlumno) ON DELETE CASCADE
)ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Alumnos_x_Asignatura
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Alumnos_x_Asignatura (
  idAsignatura INT NOT NULL,
  idAlumno     INT NOT NULL,
               PRIMARY KEY (idAsignatura, idAlumno),
               FOREIGN KEY (idAsignatura) REFERENCES Asignatura (idAsignatura) ON DELETE CASCADE,
               FOREIGN KEY (idAlumno) REFERENCES Alumno (idAlumno) ON DELETE CASCADE
) ENGINE = InnoDB;

-- Datos de Profesor
INSERT INTO Profesor (dni, nombre, direccion, telefono) VALUES
(12345678, 'Juan Pérez', 'Calle 123, Ciudad', '123456789'),
(23456789, 'María Gómez', 'Avenida 456, Pueblo', '987654321'),
(34567890, 'Carlos Martínez', 'Plaza Principal, Villa', '555555555');

-- Datos de Alumnos
INSERT INTO Alumno (nombre, apellidos, fecha_nacimiento, numeroExpediente) VALUES
('Juan', 'García', '2003-03-15', 'A001'),
('María', 'Martínez', '2002-07-20', 'A002'),
('Carlos', 'López', '2004-01-05', 'A003'),
('Laura', 'Sánchez', '2005-09-10', 'A004'),
('Ana', 'Hernández', '2003-11-25', 'A005'),
('Pedro', 'Díaz', '2004-06-30', 'A006'),
('Sofía', 'Gómez', '2002-04-12', 'A007'),
('Daniel', 'Muñoz', '2005-02-28', 'A008'),
('Lucía', 'Álvarez', '2003-08-05', 'A009'),
('Pablo', 'Romero', '2004-10-15', 'A010'),
('Arturo', 'Cuba', '2004-10-15', 'A011');

-- Datos de Módulos
INSERT INTO Modulo (codigoModulo, nombre, dni) VALUES
('M001', 'Matemáticas', 12345678),
('L001', 'Lengua', 23456789),
('F001', 'Física', 34567890);

-- Datos de Asignaturas
INSERT INTO Asignatura (nombre, idDelegadoAlumno, codigoModulo) VALUES
('Álgebra', 1, 'M001'),
('Geometría', 2, 'M001'),
('Literatura Española', 3, 'L001'),
('Gramática', 4, 'L001'),
('Mecánica Clásica', 5, 'F001'),
('Termodinámica', 6, 'F001'),
('Historia Antigua', 7, 'F001'),
('Historia Contemporánea', 8, 'F001');

-- CORREGIR LA TABLA ASIGNATURA

-- Relaciones de Alumnos_x_Modulo
INSERT INTO Alumnos_x_Modulo (codigoModulo, idAlumno) VALUES
('M001', 1), ('M001', 2), ('M001', 3), ('M001', 4), ('M001', 5),
('L001', 6), ('L001', 7), ('L001', 8), ('L001', 9), ('L001', 10),
('F001', 1), ('F001', 2), ('F001', 3), ('F001', 4), ('F001', 5),
('F001', 6), ('F001', 7), ('F001', 8), ('F001', 9), ('F001', 10);

-- Relaciones de Alumnos_x_Asignatura
INSERT INTO Alumnos_x_Asignatura (idAsignatura, idAlumno) VALUES
(1, 1), (2, 1),
(1, 2), (2, 2),
(1, 3), (2, 3),
(1, 4), (2, 4),
(1, 5), (2, 5),
(3, 6), (4, 6),
(3, 7), (4, 7),
(3, 8), (4, 8),
(3, 9), (4, 9),
(3, 10), (4, 10),
(5, 1), (6, 1), (7, 1), (8, 1),
(5, 2), (6, 2), (7, 2), (8, 2),
(5, 3), (6, 3), (7, 3), (8, 3),
(5, 4), (6, 4), (7, 4), (8, 4),
(5, 5), (6, 5), (7, 5), (8, 5),
(5, 6), (6, 6), (7, 6), (8, 6),
(5, 7), (6, 7), (7, 7), (8, 7),
(5, 8), (6, 8), (7, 8), (8, 8),
(5, 9), (6, 9), (7, 9), (8, 9),
(5, 10), (6, 10), (7, 10), (8, 10), (1, 11);
