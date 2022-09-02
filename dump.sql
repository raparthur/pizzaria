CREATE SCHEMA `pizzaria` DEFAULT CHARACTER SET utf8;
use pizzaria;

create table cliente(
id int primary key auto_increment,
nome varchar(50),
sobrenome varchar(50),
tel varchar(20))
engine InnoDB;

create table tipo_pizza(
id int primary key auto_increment,
nome varchar(50),
precoUnidArea decimal(4,2))
engine InnoDB;

create table forma(
id int primary key auto_increment,
min_dim smallint,
max_dim smallint)
engine InnoDB;

create table pedido(
id int primary key auto_increment,
cliente_id int,
estado smallint)
engine InnoDB;

create table pizza(
id int primary key auto_increment,
sabor varchar(50),
forma_id int,
tipo1_id int,
tipo2_id int,
pedido_id int,
foreign key(forma_id) references forma(id) on delete cascade,
foreign key (tipo1_id) references tipo_pizza(id) on delete cascade,
foreign key(pedido_id) references pedido(id) on delete cascade)
engine InnoDB;

