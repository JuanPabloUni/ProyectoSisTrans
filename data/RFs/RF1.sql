-- Create

INSER INTO TIPOSUSUARIO (ID, TIPO)
VALUES (1, 'empleado');

-- Read

SELECT *
FROM TIPOSUSUARIO
WHERE TIPO = 'empleado';

-- Update

UPDATE TIPOSUSUARIO
SET TIPO = 'Empleado'
WHERE TIPO = 'empleado';

-- Delete

DELETE
FROM TIPOSUSUARIO
WHERE TIPO = 'Empleado';