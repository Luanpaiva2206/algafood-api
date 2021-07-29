insert into cozinha(id, nome) values (1, 'Tailandesa');
insert into cozinha(id, nome) values (2, 'Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', 10, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', 9.5, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida', 15, 2);

insert into estado (nome) values ('Bahia');
insert into estado (nome) values ('Minas Gerais');
insert into estado (nome) values ('Rio de Janeiro');
insert into estado (nome) values ('São Paulo');

insert into cidade (nome, estado_id) values ('Itaboraí', 3);
insert into cidade (nome, estado_id) values ('Niterói', 3);
insert into cidade (nome, estado_id) values ('Rio de Janeiro', 3);
insert into cidade (nome, estado_id) values ('São Paulo', 4);