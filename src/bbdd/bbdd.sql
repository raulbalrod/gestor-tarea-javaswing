CREATE DATABASE IF NOT EXISTS gestor_tarea;
USE gestor_tarea;

CREATE TABLE tarea (
    tarea_id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(1000) NOT NULL,
    fecha_entrega DATE,
    prioridad ENUM('alta', 'media', 'baja') NOT NULL,
    estado ENUM('pendiente', 'en progreso', 'revisar', 'completa') NOT NULL,
    PRIMARY KEY (tarea_id)
);