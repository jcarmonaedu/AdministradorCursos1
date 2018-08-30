CREATE TABLE curso (
    id_curso int,
    descripcion varchar(255),
    precio int,
    PRIMARY KEY (id_curso)
 );
 
 CREATE TABLE forma_pago (
    id_forma_pago int,
    descripcion varchar(255),
    recargo int,
    PRIMARY KEY (id_forma_pago)
 );

  CREATE TABLE inscripcion (
    id_inscripcion int,
    nombre varchar(255),
    telefono int,
    id_curso int,
    id_forma_pago int,
    PRIMARY KEY (id_inscripcion),
    FOREIGN KEY (id_curso) REFERENCES curso (id_curso),
    FOREIGN KEY (id_forma_pago) REFERENCES forma_pago (id_forma_pago) 
  );
  
  insert into forma_pago(id_forma_pago, descripcion, recargo) values(1,'contado','0');
  insert into forma_pago(id_forma_pago, descripcion, recargo) values(2,'credito','0');
  insert into forma_pago(id_forma_pago, descripcion, recargo) values(3,'debito','0');
  insert into forma_pago(id_forma_pago, descripcion, recargo) values(4,'cheque','0');

  
  insert into curso(id_curso,descripcion,precio) values (1,'java basico',20000);
  insert into curso(id_curso,descripcion,precio) values (2,'java jee',25000);
  insert into curso(id_curso,descripcion,precio) values (3,'angular',200400);
  insert into curso(id_curso,descripcion,precio) values (4,'sql',20000);
