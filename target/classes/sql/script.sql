#4.
CREATE TABLE `Alunos`
(
 `ID`    int NOT NULL AUTO_INCREMENT ,
 `Nome`  varchar(45) NOT NULL ,
 `Valor` int NOT NULL ,

PRIMARY KEY (`ID`)
);

insert into Alunos (nome,valor) value ('Julia' ,	88);
insert into Alunos (nome,valor) value ('Carol' ,	68);
insert into Alunos (nome,valor) value ('Carol' ,	68);
insert into Alunos (nome,valor) value ('Maria' ,	99);
insert into Alunos (nome,valor) value ('Andreia',	78);
insert into Alunos (nome,valor) value ('Jaqueline' , 63);
insert into Alunos (nome,valor) value ('Marcela' , 81);
select * from Alunos;

CREATE TABLE `Notas`
(
 `NOTA`      int NOT NULL AUTO_INCREMENT ,
 `Valor_Min` int NOT NULL ,
 `Valor_Max` int NOT NULL ,

PRIMARY KEY (`NOTA`)
);
insert into Notas (valor_min,valor_max) value (0 , 9);
insert into Notas (valor_min,valor_max) value (10 , 19);
insert into Notas (valor_min,valor_max) value (20 , 29);
insert into Notas (valor_min,valor_max) value (30 , 39);
insert into Notas (valor_min,valor_max) value (40 , 49);
insert into Notas (valor_min,valor_max) value (50 , 59);
insert into Notas (valor_min,valor_max) value (60 , 69);
insert into Notas (valor_min,valor_max) value (70 , 79);
insert into Notas (valor_min,valor_max) value (80 , 89);
insert into Notas (valor_min,valor_max) value (90 , 100);


##CREATE VIEW problema4_relatorio as
select
case 
	when n.nota = 7 then null
    else a.nome
end as name1, n.NOTA, a.Valor
from Alunos a join Notas n on a.valor between  n.valor_min  and n.valor_max 
order by n.NOTA desc;


/*

*/
