--Laboratorio 8--
--�scar Trejos Esquivel--
--Daniel Quiros Picado--

create database lab8
use lab8

create schema esquema

--Tablas--

create table esquema.sala(
identificador varchar(50) not null primary key,
ubicacion varchar(50) not null,
capacidad int not null,
fecha date not null,
organizador varchar(50) not null,
--Participantes
)

/*create table esquema.participante(
)*/

create table esquema.usuario(
nombre varchar(50) not null primary key,
contrase�a varchar(30) not null
)