# Resposta 4.
/*
*/


# A consulta SQL que Eva poder executar para obter o relatorio.
select * from problema4_relatorio_eva;
# Supondo o seguinte ambiente de dados de acordo com o enunciado.
# Criacao de tabela Alunos

CREATE TABLE `Alunos`
(
 `ID`    int NOT NULL AUTO_INCREMENT ,
 `Nome`  varchar(45) NOT NULL ,
 `Valor` int NOT NULL ,

PRIMARY KEY (`ID`)
);

# inclusao de dados na tabela Aluno conforme a o enunciado.
insert into Alunos (nome,valor) value ('Julia' ,	88);
insert into Alunos (nome,valor) value ('Carol' ,	68);
insert into Alunos (nome,valor) value ('Maria' ,	99);
insert into Alunos (nome,valor) value ('Andreia',	78);
insert into Alunos (nome,valor) value ('Jaqueline' , 63);
insert into Alunos (nome,valor) value ('Marcela' , 81);

# Criacao de tabela Notas
CREATE TABLE `Notas`
(
 `NOTA`      int NOT NULL AUTO_INCREMENT ,
 `Valor_Min` int NOT NULL ,
 `Valor_Max` int NOT NULL ,

PRIMARY KEY (`NOTA`)
);

# inclusao de dados na tabela Notas conforme a o enunciado.
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

# Criacao de tabelas Alunos e Notas
CREATE VIEW problema4_relatorio_eva as
select
case 
	when n.nota = 7 then NULL
    else a.nome
end as name1, n.NOTA, a.Valor
from Alunos a join Notas n on a.valor between  n.valor_min  and n.valor_max 
order by n.NOTA desc;


