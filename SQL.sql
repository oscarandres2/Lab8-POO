--Laboratorio 8--
--Óscar Trejos Esquivel--
--Daniel Quiros Picado--
create database lab8
use lab8

create schema esquema

--Tablas--

create table esquema.usuario(
nombre varchar(50) not null primary key,
contraseña varchar(30) not null
);

create table esquema.sala(
identificador varchar(50) not null primary key,
ubicacion varchar(50) not null,
capacidad int not null,
fecha date not null,
isPublica bit not null,
organizador varchar(50) not null,
foreign key(organizador)references esquema.usuario(nombre)
--Participantes
)

insert into esquema.usuario(nombre,contraseña) values
('daniel98','12345'),
('oscar99','12345');

insert into esquema.sala(identificador,ubicacion,capacidad,fecha,isPublica,organizador) values
('56127','San José',30,'01/12/2019',1,'daniel98'),
('78909','Turrialba',20,'05/11/2019',0,'oscar99');

