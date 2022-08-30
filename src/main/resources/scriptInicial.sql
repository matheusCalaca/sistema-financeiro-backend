-- Criacao de Categorias

insert into categoria (nome)
values ('TRANSPORTE');

insert into categoria (nome)
values ('SAUPERMERCADO');

insert into categoria (nome)
values ('CURSOS');

insert into categoria (nome)
values ('TELEFONIA');

insert into categoria (nome)
values ('RESTAURANTE');

insert into categoria (nome)
values ('VESTUARIO');

insert into categoria (nome)
values ('HABITAÇÃO');

insert into categoria (nome)
values ('PRESENTES');

insert into categoria (nome)
values ('NAMORO');

insert into categoria (nome)
values ('LAZER');

insert into categoria (nome)
values ('PESSOAL');

insert into categoria (nome)
values ('DOAÇÕES');

insert into categoria (nome)
values ('SAUDE');

insert into categoria (nome)
values ('VIAGEM');

insert into categoria (nome)
values ('MERCADO');

insert into categoria (nome)
values ('ELETRONICOS');

insert into categoria (nome)
values ('PETS');

insert into categoria (nome)
values ('MANUTENÇÃO/REPARO');

select * from categoria;

-- criar Estado

insert into estado (id, nome, uf) values (1, 'GOIAS', 'GO');
select * from Estado;

-- criar Endereco
insert into endereco (id, cep, cidade, complemento, logradouro, id_estado) values
    (1, '73870970', 'Cabeceiras', 'apt 13', 'Rua Ribeiro dos Santos, s/n Quadra 3 Lote 7 Térreo', 1);
select * from endereco;

-- insert cliente

insert into cliente (id, cpf, email, name, id_endereco) values
    (1, '32381020012', 'granada@matheuscalaca.com.br', 'Matheus Calaça', 1);
select * from cliente;

-- criar receita inicial

insert into receita (id, data, descricao, nome, valor, id_cliente)values (1, '2022-07-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (2, '2022-08-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (3, '2022-09-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (4, '2022-10-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (5, '2022-11-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (6, '2022-12-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (7, '2023-01-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (8, '2023-02-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (9, '2023-03-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (10, '2023-04-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
insert into receita (id, data, descricao, nome, valor, id_cliente)values (11, '2023-05-01 00:00:00', 'salario do Mês', 'Salario do Mês', 2500, 1);
commit;

SELECT * FROM RECEITA;

-- despesa

insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PRESENTES'), 1,	'2022-08-01 00:00:00',	3, 'sapato', 'kazzu', 'compra do presente para o dia das maes', 100.00);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'SAUDE'), 1,	'2022-08-02 00:00:00',	1, 'vitamina C e D', 'Millano', 'compra de vtamina C e vitamina D indicado pela receita medica', 88.00);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'LAZER'), 1,	'2022-08-03 00:00:00',	1, 'churrasco', 'Açogue cannan', 'compra de carne para pagar o churrasco de promoção', 251.15);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-08-04 00:00:00',	2, 'gasolina', 'Gasolina', 'colocado gasolina para a eclesia', 50.00);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PESSOAL'), 1,	'2022-08-10 00:00:00',	1, 'itens variados', 'Real utilidades', 'compra de itens diversos no 1,99 da avenida pio 12, dentre os itens estão uma tabua, inforca gato, gavetas para organizar a mesa um caixa', 107.45);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-08-11 00:00:00',	1, 'UBER', 'UBER', 'volta da consulta medica com endecrinologista', 6.35);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-08-12 00:00:00',	1, 'Uber', 'UBER', 'ida ao endecrinologista', 5.87);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-08-13 00:00:00',	1, 'Sanduiche', 'CleoBurguer', 'compra de sanduiche para a janta', 75.00);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PESSOAL'), 1,	'2022-08-14 00:00:00',	1, 'itens banheiro', 'Shopee', 'compra de itens para o banheiro', 38.17);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PRESENTES'), 1,	'2022-08-15 00:00:00',	1, 'bacias', 'Casamanto site', 'compra de itens para o cha de panela do pedro estevam', 99.99);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PESSOAL'), 1,	'2022-08-16 00:00:00',	1, 'HQ', 'Panini', 'Compra de HQ para conhecer', 104.60);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-08-17 00:00:00',	1, 'UBER', 'UBER', 'ida para a empresa tomar a vacina da gripe', 12.50);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-08-18 00:00:00',	1, 'UBER', 'UBER', 'volta da empresa apos tomar a vacina da gripe', 13.74);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-08-20 00:00:00',	1, 'Almoço', 'UBER', 'almoço no caterete como o pessoal do trabalho', 32.41);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-08-21 00:00:00',	1, 'Uber EATS', 'UBER EATS', 'compra de sanduiche para a janta', 111.49);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'SAUDE'), 1,	'2022-08-22 00:00:00',	1, 'Exame Covid', 'Drogaria Pacheco', 'pago o exame de covid para minha avo', 79.90);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'LAZER'), 1,	'2022-08-23 00:00:00',	1, 'Xbox assinatura', 'Xbox', 'compra de assinatura para jorgarmos', 44.99);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-08-24 00:00:00',	1, 'UBER EATS', 'UBER EATS', 'compra de janta para o petro, o mesmo devolveu em dinheiro', 54.54);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-08-25 00:00:00',	1, 'UBER EATS', 'UBER EATS', 'compra de milkshake pois estava com vontade de fazer isso a muito tempo', 45.88);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PRESENTES'), 1,	'2022-09-01 00:00:00',	3, 'sapato', 'kazzu', 'compra do presente para o dia das maes', 100.00);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'SAUDE'), 1,	'2022-09-02 00:00:00',	1, 'vitamina C e D', 'Millano', 'compra de vtamina C e vitamina D indicado pela receita medica', 88.00);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'LAZER'), 1,	'2022-09-03 00:00:00',	1, 'churrasco', 'Açogue cannan', 'compra de carne para pagar o churrasco de promoção', 251.15);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-09-04 00:00:00',	2, 'gasolina', 'Gasolina', 'colocado gasolina para a eclesia', 50.00);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PESSOAL'), 1,	'2022-09-10 00:00:00',	1, 'itens variados', 'Real utilidades', 'compra de itens diversos no 1,99 da avenida pio 12, dentre os itens estão uma tabua, inforca gato, gavetas para organizar a mesa um caixa', 107.45);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-09-11 00:00:00',	1, 'UBER', 'UBER', 'volta da consulta medica com endecrinologista', 6.35);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-09-12 00:00:00',	1, 'Uber', 'UBER', 'ida ao endecrinologista', 5.87);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-09-13 00:00:00',	1, 'Sanduiche', 'CleoBurguer', 'compra de sanduiche para a janta', 75.00);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PESSOAL'), 1,	'2022-09-14 00:00:00',	1, 'itens banheiro', 'Shopee', 'compra de itens para o banheiro', 38.17);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PRESENTES'), 1,	'2022-09-15 00:00:00',	1, 'bacias', 'Casamanto site', 'compra de itens para o cha de panela do pedro estevam', 99.99);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'PESSOAL'), 1,	'2022-09-16 00:00:00',	1, 'HQ', 'Panini', 'Compra de HQ para conhecer', 104.60);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-09-17 00:00:00',	1, 'UBER', 'UBER', 'ida para a empresa tomar a vacina da gripe', 12.50);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'TRANSPORTE'), 1,	'2022-09-18 00:00:00',	1, 'UBER', 'UBER', 'volta da empresa apos tomar a vacina da gripe', 13.74);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-09-20 00:00:00',	1, 'Almoço', 'UBER', 'almoço no caterete como o pessoal do trabalho', 32.41);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-09-21 00:00:00',	1, 'Uber EATS', 'UBER EATS', 'compra de sanduiche para a janta', 111.49);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'SAUDE'), 1,	'2022-09-22 00:00:00',	1, 'Exame Covid', 'Drogaria Pacheco', 'pago o exame de covid para minha avo', 79.90);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'LAZER'), 1,	'2022-09-23 00:00:00',	1, 'Xbox assinatura', 'Xbox', 'compra de assinatura para jorgarmos', 44.99);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-09-24 00:00:00',	1, 'UBER EATS', 'UBER EATS', 'compra de janta para o petro, o mesmo devolveu em dinheiro', 54.54);
insert into despesa (id_categoria, id_cliente, data, meio_de_pagamento, nome, onde, por_que, valor) values ((select id from categoria where nome = 'RESTAURANTE'), 1,	'2022-09-25 00:00:00',	1, 'UBER EATS', 'UBER EATS', 'compra de milkshake pois estava com vontade de fazer isso a muito tempo', 45.88);


