# Read Me Primeiro

# Comentarios

## Primeiros pasos de analise e desenvolvimento
1. ler as instruções superficialmente para entender o contexto e os primeiros requisitos básicos e o ambiente de para criar um repositório github onde estão os testes java e sql. criar o projeto java spring jpa onde me sentir mais confortável para mostrar os testes básicos.
2. Clone o git remoto, copie o projeto java para o git local.
Configure dependências maven básicas.
Fazer um primer teste para garantir que junit e jpa funcionam, empurrei para git remoto.
Garantia relação com o github.
3. Eu ja tinha feito um exercício FizzBuzz anteriormente, copiei o código e adaptei-o para atender à pergunta nº 1.
4. Leia as perguntas com atenção novamente, selecione primeiro as que parecerem mais simples.
5. Atualize constantemente este arquivo readm.md à medida que respondemos às perguntas.

# Lista com os archivos das respostas a cada pregunta e como testar:

##1. Identificacao

##2. FooBaa imprimir multiplos de 3 e 5

Indicacao    | Comando
------------ | -------------
_Na linha de comando vai para a <br> pasta no projeto radektestes-leon_ | cd ./radektestes-leon/
_Para testar pode usar o seguinte comando_ | 	`mvn test -q -B -Dtest=RadektestesLeonApplicationTests install`
_A solucao esta na clase_ <strong>FooBaa</strong> | 	`radektestes-leon/src/main/java/main/FooBaa.java`

##4. Escreva uma consulta SQL para ajudar Eva.

Indicacao    | Comando
------------ | -------------
_pasta no projeto /radektestes-leon/src/main/resources/sql/<br> vai ter o arquivo de script SQL, <br> pode seguir a os comentarios que estão dentro do arquivo_  	|	4-script.sql
_Foram criadas as tabelas Alunos e Notas  <br> e inseridas com dados semelhantes como no enunciado_  	|	CREATE TABLE Alunos  <br> CREATE TABLE Notas  <br> Insert values(...)  <br> CREATE VIEW problema4_relatorio_eva
<br> <br> _Para simular o ambiente debe rodar os scrips indicados no arquivo onde finalmente vai conseguir <br> uma view con a solucão da pergunta_  	|	 <br>  <br> select  <br>  case  <br> 	when n.nota = 7 then NULL <br>     else a.nome <br> end as name1, n.NOTA,  <br> .Valor <br> from Alunos a join Notas n on a.valor between  n.valor_min  and n.valor_max  <br> order by n.NOTA desc; <br> 


##5. Duas clases C e B que herdan de uma clase A todas com o mesmo metodo.

_resposta indicada no formulario do site que é Polimorfismo_


##6. Calcular String sem usar instrucções tal como strlen() ou lenght());

Indicacao    | Comando
------------ | -------------
_Na linha de comando vai para a <br> pasta no projeto radektestes-leon_ | cd ./radektestes-leon/
_Para testar pode usar o seguinte comando_ | 	`mvn test -q -B -Dtest=RadektestesLeonApplicationTests install`
_A solucao esta na clase <strong>CalcularString</strong>_ | 	`radektestes-leon/src/main/java/main/CalcularString.java`

##7. Diferentes animais de estimacão dogs e cats

Indicacao    | Comando
------------ | -------------
_pasta no projeto /radektestes-leon/src/main/resources/sql/<br> vai ter o arquivo de script SQL, <br> pode seguir a os comentarios que estão dentro do arquivo_  	|	 <br>  <br> "7-script.sql"
_Foram criadas as tabelas dogs e cats  <br> e inseridas com dados semelhantes como no enunciado_  	|	CREATE TABLE dogs <br> CREATE TABLE cats
 <br> _a pos de ser inseridas com dados com nomes <br> duplos de cachorros e gatos, foram usadas <br> as instruçoes <strong>UNION</strong> e <strong>DISTINCT</strong>_  	|	 <br> select distinct name from  <br> (select d.name as name from dogs d <br> 		union <br> 	select c.name as name from cats c ) as animais_de_estimacao;
