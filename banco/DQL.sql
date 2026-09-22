CREATE DATABASE bdUniaoShape;
USE bdUniaoShape;


CREATE TABLE tbAluno (
    codAluno INT PRIMARY KEY AUTO_INCREMENT,
    nomeAluno VARCHAR(50),
    emailAluno VARCHAR(180),
    cpfAluno CHAR(11),
    sexoAluno CHAR(1)
);

CREATE TABLE tbTelefoneAluno (
    codTelefoneAluno INT PRIMARY KEY AUTO_INCREMENT,
    codAluno INT, FOREIGN KEY (codAluno) REFERENCES tbAluno(codAluno),
    numeroTelefoneAluno INT
);

CREATE TABLE tbFuncionario (
    codFuncionario INT PRIMARY KEY AUTO_INCREMENT,
    nomeFuncionario VARCHAR(50),
    emailFuncionario VARCHAR(180),
    cpfFuncionario CHAR(11),
    senhaFuncionario VARCHAR(200),
    cargoFuncionario VARCHAR(50),
    sexoFuncionario CHAR(1),
    salarioFuncionario FLOAT
);

CREATE TABLE tbPlano (
    codPlano INT PRIMARY KEY AUTO_INCREMENT,
    nomePlano VARCHAR(50),
    precoPlano FLOAT
);

CREATE TABLE tbGerente (
    codGerente INT PRIMARY KEY AUTO_INCREMENT,
    nomeGerente VARCHAR(50),
    emailGerente VARCHAR(180),
    senhaGerente VARCHAR(200),
    cpfGerente CHAR(11),
    sexoGerente CHAR(1)
);

CREATE TABLE tbMetodoPagamento (
    codMetodoPagamento INT PRIMARY KEY AUTO_INCREMENT,
    nomeMetodoPagamento VARCHAR(50)
);

CREATE TABLE tbAula (
    codAula INT PRIMARY KEY AUTO_INCREMENT,
    codFuncionario INT, FOREIGN KEY (codFuncionario) REFERENCES tbFuncionario(codFuncionario),
    nomeAula VARCHAR(50),
    diaSemanaAula CHAR(3)
);

CREATE TABLE tbMatricula (
    codMatricula INT PRIMARY KEY AUTO_INCREMENT,
    codAluno INT, FOREIGN KEY (codAluno) REFERENCES tbAluno(codAluno),
    codPlano INT, FOREIGN KEY (codPlano) REFERENCES tbPlano(codPlano),
    codMetodoPagamento INT, FOREIGN KEY (codMetodoPagamento) REFERENCES tbMetodoPagamento(codMetodoPagamaneto)
);

CREATE TABLE tbPagamento (
	codPagamento INT PRIMARY KEY AUTO_INCREMENT,
	codGerente INT, FOREIGN KEY (codGerente) REFERENCES tbGerente(codGerente),
	codFuncionario INT, FOREIGN KEY (codFuncionario) REFERENCES tbFuncionario(codFuncionario),
	dataPagamento DATETIME,
	porcentagemAumento FLOAT
);