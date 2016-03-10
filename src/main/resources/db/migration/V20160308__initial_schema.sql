
create table cliente(
	idcliente serial not null,
	nomecliente varchar(255) not null,
	constraint cliente_pk primary key (idcliente)
);