CREATE TABLE cuentaconsumos (
    reservas_id  NUMBER NOT NULL,
    servicios_id NUMBER NOT NULL
);

ALTER TABLE cuentaconsumos ADD CONSTRAINT cuentaconsumos_pk PRIMARY KEY ( reservas_id,
                                                                          servicios_id );

CREATE TABLE establecimientos (
    servicios_id        NUMBER NOT NULL,
    tipoestablecimiento VARCHAR2(255 BYTE) NOT NULL,
    estilo              VARCHAR2(255 BYTE),
    capacidad           NUMBER NOT NULL
);

ALTER TABLE establecimientos
    ADD CHECK ( tipoestablecimiento IN ( 'Bar', 'Restaurante', 'Supermercado', 'Tienda' ) );

ALTER TABLE establecimientos ADD CONSTRAINT establecimientos_pk PRIMARY KEY ( servicios_id );

CREATE TABLE gimnasios (
    servicios_id    NUMBER NOT NULL,
    capacidad       NUMBER NOT NULL,
    nummaquinas     NUMBER NOT NULL,
    horarioservicio VARCHAR2(255 BYTE) NOT NULL
);

ALTER TABLE gimnasios ADD CONSTRAINT gimnasios_pk PRIMARY KEY ( servicios_id );

CREATE TABLE habitaciones (
    id                 NUMBER NOT NULL,
    numero             NUMBER NOT NULL,
    piso               NUMBER NOT NULL,
    reservas_id        NUMBER,
    tiposhabitacion_id NUMBER NOT NULL
);

ALTER TABLE habitaciones ADD CONSTRAINT habitaciones_pk PRIMARY KEY ( id );

CREATE TABLE internet (
    servicios_id NUMBER NOT NULL,
    capacidad    NUMBER NOT NULL,
    costoxdia    NUMBER NOT NULL
);

ALTER TABLE internet ADD CONSTRAINT internet_pk PRIMARY KEY ( servicios_id );

CREATE TABLE lavanderias (
    servicios_id NUMBER NOT NULL,
    tipoprenda   VARCHAR2(255 BYTE) NOT NULL,
    costoxprenda FLOAT NOT NULL
);

ALTER TABLE lavanderias ADD CONSTRAINT lavanderias_pk PRIMARY KEY ( servicios_id );

CREATE TABLE ofrecenproductos (
    establecimiento_id NUMBER NOT NULL,
    productos_id       NUMBER NOT NULL
);

ALTER TABLE ofrecenproductos ADD CONSTRAINT ofrecenproductos_pk PRIMARY KEY ( establecimiento_id,
                                                                              productos_id );

CREATE TABLE piscinas (
    servicios_id    NUMBER NOT NULL,
    capacidad       NUMBER NOT NULL,
    profundidad     FLOAT NOT NULL,
    horarioservicio VARCHAR2(255 BYTE) NOT NULL
);

ALTER TABLE piscinas ADD CONSTRAINT piscinas_pk PRIMARY KEY ( servicios_id );

CREATE TABLE planesdeconsumo (
    id          NUMBER NOT NULL,
    nombre      VARCHAR2(255 BYTE) NOT NULL,
    descripcion VARCHAR2(255 BYTE) NOT NULL,
    descuento   FLOAT NOT NULL
);

ALTER TABLE planesdeconsumo ADD CONSTRAINT planesdeconsumo_pk PRIMARY KEY ( id );

CREATE TABLE prestamos (
    servicios_id  NUMBER NOT NULL,
    utensilio     VARCHAR2(255 BYTE) NOT NULL,
    costoremplazo FLOAT NOT NULL
);

ALTER TABLE prestamos ADD CONSTRAINT prestamos_pk PRIMARY KEY ( servicios_id );

CREATE TABLE productos (
    id     NUMBER NOT NULL,
    nombre VARCHAR2(255 BYTE) NOT NULL,
    precio FLOAT NOT NULL
);

ALTER TABLE productos ADD CONSTRAINT productos_pk PRIMARY KEY ( id );

CREATE TABLE reservas (
    id                 NUMBER NOT NULL,
    fechainicio        DATE NOT NULL,
    fechafin           DATE NOT NULL,
    numnoches          NUMBER NOT NULL,
    numadultos         NUMBER NOT NULL,
    nummenores         NUMBER NOT NULL,
    usuarios_id        NUMBER NOT NULL,
    planesdeconsumo_id NUMBER
);

ALTER TABLE reservas ADD CONSTRAINT reservas_pk PRIMARY KEY ( id );

CREATE TABLE reservasservicio (
    id           NUMBER NOT NULL,
    fecha        DATE NOT NULL,
    horainicio   DATE NOT NULL,
    horafin      DATE NOT NULL,
    reservas_id  NUMBER NOT NULL,
    servicios_id NUMBER NOT NULL
);

ALTER TABLE reservasservicio ADD CONSTRAINT reservasservicio_pk PRIMARY KEY ( id );

CREATE TABLE salones (
    servicios_id  NUMBER NOT NULL,
    tiposalon     VARCHAR2(255 BYTE) NOT NULL,
    horaslimpieza NUMBER NOT NULL,
    costoxhora    FLOAT NOT NULL
);

ALTER TABLE salones
    ADD CHECK ( tiposalon IN ( 'SalonConferencia', 'SalonReunion' ) );

ALTER TABLE salones ADD CONSTRAINT salones_pk PRIMARY KEY ( servicios_id );

CREATE TABLE servicios (
    id           NUMBER NOT NULL,
    nombre       VARCHAR2(255 BYTE) NOT NULL,
    descripcion  VARCHAR2(255 BYTE) NOT NULL,
    tiposervicio VARCHAR2(255 BYTE) NOT NULL
);

ALTER TABLE servicios
    ADD CHECK ( tiposervicio IN ( 'EstablecimientoConsumo', 'Gimnasio', 'Internet', 'Lavanderia', 'Piscina',
                                  'Prestamo', 'Salon', 'Spa' ) );

ALTER TABLE servicios ADD CONSTRAINT servicios_pk PRIMARY KEY ( id );

CREATE TABLE spas (
    servicios_id NUMBER NOT NULL,
    duracion     NUMBER NOT NULL,
    costo        FLOAT NOT NULL
);

ALTER TABLE spas ADD CONSTRAINT spas_pk PRIMARY KEY ( servicios_id );

CREATE TABLE tiposhabitacion (
    id          NUMBER NOT NULL,
    tipo        VARCHAR2(255 BYTE) NOT NULL,
    capacidad   NUMBER NOT NULL,
    camas       NUMBER NOT NULL,
    costoxnoche FLOAT NOT NULL
);

ALTER TABLE tiposhabitacion ADD CONSTRAINT tiposhabitacion_pk PRIMARY KEY ( id );

CREATE TABLE tiposusuario (
    id   NUMBER NOT NULL,
    tipo VARCHAR2(255 BYTE) NOT NULL
);

ALTER TABLE tiposusuario ADD CONSTRAINT tiposusuario_pk PRIMARY KEY ( id );

CREATE TABLE usuarios (
    id              NUMBER NOT NULL,
    nombre          VARCHAR2(255 BYTE) NOT NULL,
    apellido        VARCHAR2(255 BYTE) NOT NULL,
    documento       VARCHAR2(255 BYTE) NOT NULL,
    tiposusuario_id NUMBER NOT NULL
);

ALTER TABLE usuarios ADD CONSTRAINT usuarios_pk PRIMARY KEY ( id );

ALTER TABLE cuentaconsumos
    ADD CONSTRAINT cuentaconsumos_reservas_fk FOREIGN KEY ( reservas_id )
        REFERENCES reservas ( id )
            ON DELETE CASCADE;

ALTER TABLE cuentaconsumos
    ADD CONSTRAINT cuentaconsumos_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE establecimientos
    ADD CONSTRAINT establecimientos_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE gimnasios
    ADD CONSTRAINT gimnasios_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE habitaciones
    ADD CONSTRAINT habitaciones_reservas_fk FOREIGN KEY ( reservas_id )
        REFERENCES reservas ( id )
            ON DELETE CASCADE;

ALTER TABLE habitaciones
    ADD CONSTRAINT habitaciones_tipo_fk FOREIGN KEY ( tiposhabitacion_id )
        REFERENCES tiposhabitacion ( id )
            ON DELETE CASCADE;

ALTER TABLE internet
    ADD CONSTRAINT internet_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE lavanderias
    ADD CONSTRAINT lavanderias_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE ofrecenproductos
    ADD CONSTRAINT ofreceprod_establecimientos_fk FOREIGN KEY ( establecimiento_id )
        REFERENCES establecimientos ( servicios_id )
            ON DELETE CASCADE;

ALTER TABLE ofrecenproductos
    ADD CONSTRAINT ofreceprod_productos_fk FOREIGN KEY ( productos_id )
        REFERENCES productos ( id )
            ON DELETE CASCADE;

ALTER TABLE piscinas
    ADD CONSTRAINT piscinas_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE prestamos
    ADD CONSTRAINT prestamos_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE reservas
    ADD CONSTRAINT reservas_planesdeconsumo_fk FOREIGN KEY ( planesdeconsumo_id )
        REFERENCES planesdeconsumo ( id )
            ON DELETE CASCADE;

ALTER TABLE reservas
    ADD CONSTRAINT reservas_usuarios_fk FOREIGN KEY ( usuarios_id )
        REFERENCES usuarios ( id )
            ON DELETE CASCADE;

ALTER TABLE reservasservicio
    ADD CONSTRAINT reservasservicio_reservas_fk FOREIGN KEY ( reservas_id )
        REFERENCES reservas ( id )
            ON DELETE CASCADE;

ALTER TABLE reservasservicio
    ADD CONSTRAINT reservasservicio_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE salones
    ADD CONSTRAINT salones_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE spas
    ADD CONSTRAINT spas_servicios_fk FOREIGN KEY ( servicios_id )
        REFERENCES servicios ( id )
            ON DELETE CASCADE;

ALTER TABLE usuarios
    ADD CONSTRAINT usuarios_tiposusuario_fk FOREIGN KEY ( tiposusuario_id )
        REFERENCES tiposusuario ( id )
            ON DELETE CASCADE;