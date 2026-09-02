DROP TABLE IF EXISTS auto;
DROP TABLE IF EXISTS moto;
DROP TABLE IF EXISTS vehiculo;
DROP TABLE IF EXISTS propietario;

CREATE TABLE propietario (
    id      INT AUTO_INCREMENT PRIMARY KEY,
    nombre  VARCHAR(100) NOT NULL,
    dni     VARCHAR(20) NOT NULL
);

CREATE TABLE vehiculo (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    patente         VARCHAR(10) UNIQUE NOT NULL,
    marca           VARCHAR(50),
    modelo          VARCHAR(50),
    propietario_id  INT,
    FOREIGN KEY (propietario_id) REFERENCES propietario(id)
);

CREATE TABLE auto (
    id                INT AUTO_INCREMENT PRIMARY KEY,
    vehiculo_id       INT NOT NULL,
    cantidad_puertas  INT,
    FOREIGN KEY (vehiculo_id) REFERENCES vehiculo(id)
);

CREATE TABLE moto (
    id           INT AUTO_INCREMENT PRIMARY KEY,
    vehiculo_id  INT NOT NULL,
    cilindrada   INT,
    FOREIGN KEY (vehiculo_id) REFERENCES vehiculo(id)
);
