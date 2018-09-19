
DROP DATABASE IF EXISTS auto_pecas;
CREATE DATABASE auto_pecas;
USE auto_pecas;

CREATE TABLE produtos(
    id int AUTO_INCREMENT PRIMARY KEY,
    categoria         varchar(50),
    quantidade        int,
    valor             float,
    descricao         Varchar(150),
    aplicacao         varchar(300),
    unidade_de_medida varchar(5),
    localizacao       varchar (50),
    valor_unitario    float,
    status_peca       varchar(20),
    peso              float
);

insert into produtos(categoria, quantidade, valor, descricao, aplicacao, unidade_de_medida,
 localizacao, valor_unitario, status_peca, peso)values
('motor',2,2000,'motor para uno','motor para uno ano/2000','kit','Santa Catarina',2000,'novo',100),
('parachoque',5,5000,'parachoque para fiesta','parachoque para fiesta/2005','kit','São Paulo',2000,'semi novo',600),
('Acessorios',8,12000,'rodas Unique','rodas originais do Nissan New Versa Unique','Peça','Santa Catarina',400,'semi-novo',5);



CREATE TABLE clientes(

nome VARCHAR(100),
telefone VARCHAR(15),
cpf_cnpj VARCHAR(25),
cep      varchar(25),
bairro   varchar(25),
endereco varchar(50),
cidade   Varchar(50),
numero   INT,
email varchar(50)
);
  insert into clientes(nome,telefone,cpf_cnpj,cep,bairro,endereco,cidade,numero,email)values
('Consumidor','','','','','','',0,''),
('Guilherme','30303-3232','123.456.825-10','12345-123','Fortaleza','Rua da Goiaba','Blumenau',85,'gui@gmail.com'),
('Francico','13131-1313','123.123.123-12','12345-123','Escola Agricola','Rua do mamão','Blumenau',69,'fracisco@gmail.com');

CREATE table funcionarios(
nome VARCHAR(50),
cpf VARCHAR(50),
cep VARCHAR(50),
bairro varchar(50),
endereco varchar(50),
cidade  varchar(50),
numero int,
email VARCHAR(50),
salario FLOAT,
data_admissao  varchar(50),
cargo VARCHAR(50),
pis varchar(50)
);

 insert into funcionarios(nome,cpf,cep,bairro,endereco,cidade,numero,email,salario,data_admissao,cargo,pis)values
('FrancisGod','123.123.123-12','12345-123','Escola Agricola','Rua das uvas','Blumenau',15,'fracisGod@gmai.com',
  5000,'15/03/2015','Deus','696.69696.69-6');






