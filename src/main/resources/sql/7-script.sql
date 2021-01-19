# resposta 7
select distinct name from 
	(select d.name as name from dogs d
		union
	select c.name as name from cats c ) as animais_de_estimacao;

/*
# criacao das tabelas dogs e cats
CREATE TABLE dogs
(
id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL
);

CREATE TABLE cats
(
id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL
);

# supondo que tem valores duplos nas dois tabelas.
insert into dogs (name) value ('Julia');
insert into dogs (name) value ('Fofinha');
insert into dogs (name) value ('Julia');
insert into dogs (name) value ('Fofinha');
insert into cats (name) value ('Linda');
insert into cats (name) value ('Creme');
insert into cats (name) value ('Julia');
insert into cats (name) value ('Linda');
insert into cats (name) value ('Fofinha');
insert into cats (name) value ('Julia');
*/