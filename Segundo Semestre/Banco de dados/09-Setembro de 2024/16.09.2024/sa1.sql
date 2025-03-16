CREATE database aria;
use aria;

CREATE TABLE cliente (
	cli_id INT AUTO_INCREMENT PRIMARY KEY,
    cli_nome VARCHAR(100) NOT NULL,
    cli_tel VARCHAR(15),
    cli_endereço VARCHAR(255),
    cli_fk_cidade INT,
    cli_data_cadastro DATETIME DEFAULT NOW(),
    cli_data_nascimento DATE,
    cli_fK_sexo INT,
    Cli_cpf VARCHAR(20) UNIQUE
);

CREATE TABLE categoria (
    _fk_categoria INT AUTO_INCREMENT PRIMARY KEY,
    categoria_nome VARCHAR(100) NOT NULL
);

Create table genero_cliente_funcionario(
	sex_cli_fun_id INT AUTO_INCREMENT PRIMARY KEY,
	sex_cli_fun_descrição VARCHAR(100)
);

CREATE TABLE funcionario(
	fun_id INT AUTO_INCREMENT PRIMARY KEY,
    fun_nome VARCHAR(100) NOT NULL,
    fun_tel VARCHAR(15),
    fun_endereço VARCHAR(255),
    fun_fk_cidade INT,
	fun_data_cadastro DATETIME DEFAULT NOW(),
    fun_data_nascimento DATE,
    fun_fk_sexo INT,
    fun_cpf VARCHAR(20) UNIQUE,
    fun_salario DECIMAL(10,2),
    fun_cargo VARCHAR(100)
); 

CREATE TABLE recebimento(
	receb_id INT AUTO_INCREMENT PRIMARY KEY,
	receb_fk_pedido INT,
	receb_data DATETIME DEFAULT NOW(),
	receb_valor DECIMAL(10,2) NOT NULL,
	receb_fk_formapag INT,
	receb_fk_status INT
);

CREATE TABLE forma_pagamento(
	form_pag_id INT AUTO_INCREMENT PRIMARY KEY,
	form_pag_nome VARCHAR(100)
);


CREATE TABLE status_recebimento (
    status_receb_id INT AUTO_INCREMENT PRIMARY KEY,
    status_receb_descricao VARCHAR(100) NOT NULL
);

CREATE TABLE status_pedido (
    status_pedido_id INT AUTO_INCREMENT PRIMARY KEY,
    status_pedido_descricao VARCHAR(100) NOT NULL
);

CREATE TABLE cidade(
	cid_id INT AUTO_INCREMENT PRIMARY KEY,
    cid_nome VARCHAR(100),
    cid_fk_estado INT
);

CREATE TABLE estado(
	est_id INT AUTO_INCREMENT PRIMARY KEY,
    est_nome VARCHAR(100)
);


CREATE TABLE produto(
	produto_id INT AUTO_INCREMENT PRIMARY KEY,
    produto_nome VARCHAR(100),
    produto_fk_categoria INT,
    produto_fk_tamanho INT,
    produto_fk_recheio INT,
    produto_fk_recheioad INT,
    produto_descriçao VARCHAR(100),
    produto_valor DECIMAL(10,2)
);




CREATE TABLE produto_massa(
	_massa_id INT AUTO_INCREMENT PRIMARY KEY,
    _massa_nome VARCHAR(100),
    _massa_descriçao VARCHAR(100),
    _massa_valor_tipo DECIMAL(10,2)
);

CREATE TABLE recheio(
	recheio_id INT AUTO_INCREMENT PRIMARY KEY,
    recheio_nome VARCHAR(100),
    recheio_fk_categoria INT,
    recheio_descriçao VARCHAR(100)
);



CREATE TABLE produto_tamanho(
	produto_tamanho_id INT AUTO_INCREMENT PRIMARY KEY,
    produto_tamanho VARCHAR(100),
    produto_valor_tamanho DECIMAL(10,2)
);

CREATE TABLE pedido (
    pedido_id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_fk_cliente INT,
    pedido_fk_funcionario INT,
    pedido_data DATETIME DEFAULT NOW(),
    pedido_valor_total DECIMAL(10,2),
    pedido_fk_status INT
);

CREATE TABLE itens_pedido (
    item_id INT AUTO_INCREMENT PRIMARY KEY,
    item_fk_pedido INT,
    item_fk_produto INT,
    item_fk_bebida INT,
    item_quantidade INT,
    item_valor_unitario DECIMAL(10,2)
);

CREATE TABLE estoque (
	estoque_id INT AUTO_INCREMENT PRIMARY KEY,
    estoque_nome VARCHAR(100),
    estoque_descrição VARCHAR(100),
    estoque_qtd FLOAT
);



CREATE TABLE bebidas(
bebida_id INT AUTO_INCREMENT PRIMARY KEY,
bebida_nome VARCHAR(100),
bebida_descriçao VARCHAR(100),
bebida_valor DECIMAL(10,2)
);

CREATE TABLE feedback (
    feedback_id INT AUTO_INCREMENT PRIMARY KEY,
    feedback_fk_cliente INT,
    feedback_texto TEXT, 
    feedback_fk_pedido INT,
    feedback_data DATETIME DEFAULT NOW(),
    feedback_classificacao INT
);


ALTER TABLE cliente
ADD CONSTRAINT fk_cliente_cidade 
FOREIGN KEY (cli_fk_cidade) 
REFERENCES cidade(cid_id);

ALTER TABLE cliente
ADD CONSTRAINT fk_cliente_sexo 
FOREIGN KEY (cli_fK_sexo) 
REFERENCES genero_cliente_funcionario(sex_cli_fun_id);


ALTER TABLE funcionario
ADD CONSTRAINT fk_funcionario_cidade 
FOREIGN KEY (fun_fk_cidade) 
REFERENCES cidade(cid_id);

ALTER TABLE funcionario
ADD CONSTRAINT fk_funcionario_sexo 
FOREIGN KEY (fun_fk_sexo) 
REFERENCES genero_cliente_funcionario(sex_cli_fun_id);


ALTER TABLE recebimento
ADD CONSTRAINT fk_recebimento_pedido 
FOREIGN KEY (receb_fk_pedido) 
REFERENCES pedido(pedido_id);

ALTER TABLE recebimento
ADD CONSTRAINT fk_recebimento_formapag 
FOREIGN KEY (receb_fk_formapag) 
REFERENCES forma_pagamento(form_pag_id);

ALTER TABLE recebimento
ADD CONSTRAINT fk_recebimento_status 
FOREIGN KEY (receb_fk_status) 
REFERENCES status_recebimento(status_receb_id);

ALTER TABLE pedido
ADD CONSTRAINT fk_pedido_cliente 
FOREIGN KEY (pedido_fk_cliente) 
REFERENCES cliente(cli_id);

ALTER TABLE pedido
ADD CONSTRAINT fk_pedido_funcionario 
FOREIGN KEY (pedido_fk_funcionario) 
REFERENCES funcionario(fun_id);

ALTER TABLE pedido
ADD CONSTRAINT fk_pedido_status 
FOREIGN KEY (pedido_fk_status) 
REFERENCES status_pedido(status_pedido_id);


ALTER TABLE itens_pedido
ADD CONSTRAINT fk_itens_pedido 
FOREIGN KEY (item_fk_pedido) 
REFERENCES pedido(pedido_id);

ALTER TABLE itens_pedido
ADD CONSTRAINT fk_itens_pedido_ 
FOREIGN KEY (item_fk_produto) 
REFERENCES produto(produto_id);

ALTER TABLE itens_pedido
ADD CONSTRAINT fk_itens_pedido_bebida 
FOREIGN KEY (item_fk_bebida) 
REFERENCES bebidas(bebida_id);


ALTER TABLE cidade
ADD CONSTRAINT fk_cidade_estado 
FOREIGN KEY (cid_fk_estado) 
REFERENCES estado(est_id);


ALTER TABLE feedback
ADD CONSTRAINT fk_feedback_cliente 
FOREIGN KEY (feedback_fk_cliente) 
REFERENCES cliente(cli_id);

ALTER TABLE feedback
ADD CONSTRAINT fk_feedback_pedido 
FOREIGN KEY (feedback_fk_pedido) 
REFERENCES pedido(pedido_id);

ALTER TABLE produto
ADD CONSTRAINT produto_recheio1
FOREIGN KEY (produto_fk_recheio) 
REFERENCES recheio(recheio_id);

ALTER TABLE produto
ADD CONSTRAINT produto_recheio2
FOREIGN KEY (produto_fk_recheioad) 
REFERENCES recheio(recheio_id);









