INSERT INTO propietario (nombre, dni) VALUES ('Ana Gómez', '30111222');
INSERT INTO propietario (nombre, dni) VALUES ('Luis Pérez', '28555666');

INSERT INTO vehiculo (patente, marca, modelo, propietario_id) VALUES ('AB123CD', 'Toyota', 'Corolla', 1);
INSERT INTO vehiculo (patente, marca, modelo, propietario_id) VALUES ('MN456OP', 'Honda', 'Wave', 1);
INSERT INTO vehiculo (patente, marca, modelo, propietario_id) VALUES ('XY789ZZ', 'Ford', 'Fiesta', 2);

-- vehiculo_id 1 (AB123CD) es un auto
INSERT INTO auto (vehiculo_id, cantidad_puertas) VALUES (1, 4);
-- vehiculo_id 3 (XY789ZZ) es un auto
INSERT INTO auto (vehiculo_id, cantidad_puertas) VALUES (3, 3);

-- vehiculo_id 2 (MN456OP) es una moto
INSERT INTO moto (vehiculo_id, cilindrada) VALUES (2, 110);
