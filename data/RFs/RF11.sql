-- READ

SELECT USUARIOS_ID AS CLIENTE, FECHAFIN AS FECHASALIDA
FROM RESERVAS
WHERE USUARIOS_ID = 1
ORDER BY FECHALLEGADA;

-- UPDATE

UPDATE RESERVAS
SET FECHAFIN = FECHAFIN - 5
WHERE USUARIOS_ID = 1;

-- DELETE

DELETE
FROM RESERVAS
WHERE FECHAFIN <= TO_DATE('2030-01-01', 'YYYY-MM-DD');