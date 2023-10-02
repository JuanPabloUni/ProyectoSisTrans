-- TIPOSUSUARIO

INSERT INTO TIPOSUSUARIO (ID, TIPO)
VALUES (1, 'cliente');

INSERT INTO TIPOSUSUARIO (ID, TIPO)
VALUES (2, 'recepcionista');

INSERT INTO TIPOSUSUARIO (ID, TIPO)
VALUES (3, 'empleado');

INSERT INTO TIPOSUSUARIO (ID, TIPO)
VALUES (4, 'administrador');

INSERT INTO TIPOSUSUARIO (ID, TIPO)
VALUES (5, 'gerente');

-- USUARIOS

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (1, 'John', 'Doe', '123456789', 5);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (2, 'Alex', 'Ricks', '333444222', 4);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (3, 'Terrence', 'Max', '09889392838', 2);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (4, 'Alice', 'Smith', '987654321', 2);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (5, 'Bob', 'Johnson', '567890123', 3);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (6, 'Eva', 'Brown', '654321987', 3);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (7, 'Michael', 'Wilson', '789012345', 3);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (8, 'Sarah', 'Lee', '345678901', 3);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (9, 'David', 'Garcia', '890123456', 1);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (10, 'Linda', 'Miller', '234567890', 1);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (11, 'William', 'Martinez', '456789012', 1);

INSERT INTO USUARIOS (ID, NOMBRE, APELLIDO, DOCUMENTO, TIPOSUSUARIO_ID)
VALUES (12, 'Olivia', 'Taylor', '678901234', 1);

-- TIPOSHABITACION

INSERT INTO TIPOSHABITACION (ID, TIPO, CAPACIDAD, CAMAS, COSTOXNOCHE)
VALUES (1, 'Suite', 6, 6, 120);

INSERT INTO TIPOSHABITACION (ID, TIPO, CAPACIDAD, CAMAS, COSTOXNOCHE)
VALUES (2, 'Double', 2, 2, 80);

INSERT INTO TIPOSHABITACION (ID, TIPO, CAPACIDAD, CAMAS, COSTOXNOCHE)
VALUES (3, 'Single', 1, 1, 60);

-- PLANESDECONSUMO

INSERT INTO PLANESDECONSUMO (ID, NOMBRE, DESCRIPCION, DESCUENTO)
VALUES (1, 'Todo Incluido', 'Incluye todos los servicios del hotel', 0.5);

INSERT INTO PLANESDECONSUMO (ID, NOMBRE, DESCRIPCION, DESCUENTO)
VALUES (2, 'Desayuno Incluido', 'Incluye desayuno continental', 0.2);

INSERT INTO PLANESDECONSUMO (ID, NOMBRE, DESCRIPCION, DESCUENTO)
VALUES (3, 'Pensión Completa', 'Incluye todas las comidas del día', 0.3);

-- RESERVA

INSERT INTO RESERVAS (ID, FECHAINICIO, FECHAFIN, NUMNOCHES, NUMADULTOS, NUMMENORES, USUARIOS_ID, PLANESDECONSUMO_ID)
VALUES (1, TO_DATE('2020-01-01', 'YYYY-MM-DD'), TO_DATE('2020-12-31', 'YYYY-MM-DD'), 365, 2, 3, 1, 1);

INSERT INTO RESERVAS (ID, FECHAINICIO, FECHAFIN, NUMNOCHES, NUMADULTOS, NUMMENORES, USUARIOS_ID, PLANESDECONSUMO_ID)
VALUES (2, TO_DATE('2020-05-15', 'YYYY-MM-DD'), TO_DATE('2020-05-20', 'YYYY-MM-DD'), 5, 2, 1, 2, 2);

INSERT INTO RESERVAS (ID, FECHAINICIO, FECHAFIN, NUMNOCHES, NUMADULTOS, NUMMENORES, USUARIOS_ID, PLANESDECONSUMO_ID)
VALUES (3, TO_DATE('2020-07-10', 'YYYY-MM-DD'), TO_DATE('2020-07-15', 'YYYY-MM-DD'), 5, 3, 0, 3, 1);

INSERT INTO RESERVAS (ID, FECHAINICIO, FECHAFIN, NUMNOCHES, NUMADULTOS, NUMMENORES, USUARIOS_ID, PLANESDECONSUMO_ID)
VALUES (4, TO_DATE('2020-09-20', 'YYYY-MM-DD'), TO_DATE('2020-09-25', 'YYYY-MM-DD'), 5, 2, 2, 4, 3);

INSERT INTO RESERVAS (ID, FECHAINICIO, FECHAFIN, NUMNOCHES, NUMADULTOS, NUMMENORES, USUARIOS_ID, PLANESDECONSUMO_ID)
VALUES (5, TO_DATE('2020-11-05', 'YYYY-MM-DD'), TO_DATE('2020-11-10', 'YYYY-MM-DD'), 5, 1, 0, 5, NULL);

-- HABITACION

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (1, 1, 1, 1, 1);

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (2, 2, 1, NULL, 2);

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (3, 3, 1, 2, 3);

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (4, 3, 2, NULL, 1);

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (5, 4, 2, 3, 2);

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (6, 5, 3, NULL, 3);

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (7, 6, 3, 4, 1);

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (8, 7, 4, NULL, 2);

INSERT INTO HABITACIONES (ID, NUMERO, PISO, RESERVAS_ID, TIPOSHABITACION_ID)
VALUES (9, 8, 4, 5, 3);

-- SERVICIO

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (1, 'Tienda', 'Tienda 2do Piso', 'EstablecimientoConsumo');

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (2, 'Bar', 'Bar Terraza', 'EstablecimientoConsumo');

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (3, 'Piscina', 'Piscina Adultos', 'Piscina');

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (4, 'Gimnasio', 'Gimnasio Principal', 'Gimnasio');

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (5, 'Internet', 'WI-FI 5G', 'Internet');

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (6, 'Lavanderia', 'Lavanderia Sotano', 'Lavanderia');

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (7, 'Prestamo', 'Toallas', 'Prestamo');

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (8, 'Spa', 'Spa 8vo Piso', 'Spa');

INSERT INTO SERVICIOS (ID, NOMBRE, DESCRIPCION, TIPOSERVICIO)
VALUES (9, 'Salon', 'Salon Principal #2', 'Salon');

-- CUENTACONSUMO

INSERT INTO CUENTACONSUMOS (RESERVAS_ID, SERVICIOS_ID)
VALUES (1, 1);

INSERT INTO CUENTACONSUMOS (RESERVAS_ID, SERVICIOS_ID)
VALUES (1, 2);

INSERT INTO CUENTACONSUMOS (RESERVAS_ID, SERVICIOS_ID)
VALUES (2, 3);

INSERT INTO CUENTACONSUMOS (RESERVAS_ID, SERVICIOS_ID)
VALUES (3, 2);

INSERT INTO CUENTACONSUMOS (RESERVAS_ID, SERVICIOS_ID)
VALUES (4, 5);

INSERT INTO CUENTACONSUMOS (RESERVAS_ID, SERVICIOS_ID)
VALUES (4, 6);

INSERT INTO CUENTACONSUMOS (RESERVAS_ID, SERVICIOS_ID)
VALUES (5, 8);

-- RESERVASERVICIO

INSERT INTO RESERVASSERViCIO (ID, FECHA, HORAINICIO, HORAFIN, RESERVAS_ID, SERVICIOS_ID)
VALUES (1, TO_DATE('2021-01-01', 'YYYY-MM-DD'), TO_DATE('10:00', 'HH24:MI'), TO_DATE('12:00', 'HH24:MI'), 1, 1);

-- GIMNASIO

INSERT INTO GIMNASIOS (SERVICIOS_ID, CAPACIDAD, NUMMAQUINAS, HORARIOSERVICIO)
VALUES (3, 10, 20, 'Diurno');