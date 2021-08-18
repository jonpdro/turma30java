drop database if exists db_ecommerce;
create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
	id bigint auto_increment, primary key(id),
    valor decimal(10,2) not null,
    nome varchar(50) not null,
	estoque boolean not null,
    quantidade int(10) not null
);

insert into tb_produtos(valor, nome, estoque, quantidade) values (690.99, "PULSEIRA ICY", true, 140);
insert into tb_produtos(valor, nome, estoque, quantidade) values (390.99, "ANEL TOPÁZIO", true, 76);
insert into tb_produtos(valor, nome, estoque, quantidade) values (400.99, "COlAR SAFIRA", true, 30);
insert into tb_produtos(valor, nome, estoque, quantidade) values (590.99, "PULSEIRA LIZ", true, 2);
insert into tb_produtos(valor, nome, estoque, quantidade) values (650.50, "ANEL CRISTAL", true, 200);
insert into tb_produtos(valor, nome, estoque, quantidade) values (800.00, "BRINCO JASPE", true, 46);
insert into tb_produtos(valor, nome, estoque, quantidade) values (740.99, "PINGENTE LUA", false, 0);
insert into tb_produtos(valor, nome, estoque, quantidade) values (500.00, "COLAR AMÉLIA", true, 100);

select * from tb_produtos;
select * from tb_produtos where valor > 500;
select * from tb_produtos where valor < 500;

update tb_produtos set quantidade = quantidade - 1 where id = 8;

select * from tb_produtos;

