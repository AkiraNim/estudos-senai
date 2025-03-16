CREATE DATABASE EXEMPLO_VIEW;

USE EXEMPLO_VIEW;

CREATE TABLE EX_CLIENTE(
codcliente int,
nome varchar(60),
datanascimento date,
cpf varchar(11),
CONSTRAINT pk_ex_cliente PRIMARY KEY (codcliente)
);
CREATE TABLE EX_PEDIDO(
codpedido int,
codcliente int,
datapedido date,
nf varchar(12),
valortotal decimal(10,2),
CONSTRAINT pk_ex_pedido PRIMARY KEY (codpedido),
CONSTRAINT pk_ex_pedido_cliente FOREIGN KEY (codcliente) REFERENCES
EX_CLIENTE(codcliente)
);
CREATE TABLE EX_PRODUTO(
codproduto int,
descricao varchar(100),
CONSTRAINT pk_ex_produto PRIMARY KEY (codproduto)
);

CREATE TABLE EX_ITEMPEDIDO(
codpedido int,
numeroitem int,
valorunitario decimal(10,2),
quantidade int,
codproduto int,
CONSTRAINT pk_itempedido PRIMARY KEY (codpedido, numeroitem),
CONSTRAINT fk_codpedido FOREIGN KEY (codpedido) REFERENCES EX_PEDIDO (codpedido),

CONSTRAINT fk_itempedido_produto FOREIGN KEY (codproduto) REFERENCES EX_PRODUTO
(codproduto)
);
INSERT INTO EX_CLIENTE VALUES (1, 'Sylvio Barbon', '1984/12/05', '12315541212');
INSERT INTO EX_CLIENTE VALUES (2, 'Antonio Carlos da Silva', '1970/01/11', '12313345512');
INSERT INTO EX_CLIENTE VALUES (3, 'Thiago Ribeiro', '1964/11/15', '12315544411');
INSERT INTO EX_CLIENTE VALUES (4, 'Carlos Eduardo', '1924/10/25', '42515541212');
INSERT INTO EX_CLIENTE VALUES (5, 'Maria Cristina Goes', '1981/03/11', '67715541212');
INSERT INTO EX_CLIENTE VALUES (6, 'Ruan Manoel Fanjo', '1983/06/12', '32415541212');
INSERT INTO EX_CLIENTE VALUES (7, 'Patrícia Marques', '1944/01/02', '77715541212');
INSERT INTO EX_CLIENTE VALUES (8, 'Jorge Marques', '2007/01/02', '77815541212');
INSERT INTO EX_PRODUTO VALUES (1, 'Mouse');
INSERT INTO EX_PRODUTO VALUES (2, 'Teclado');
INSERT INTO EX_PRODUTO VALUES (3, 'Monitor LCD');
INSERT INTO EX_PRODUTO VALUES (4, 'Caixas Acústicas');
INSERT INTO EX_PRODUTO VALUES (5, 'Scanner de Mesa');
INSERT INTO EX_PEDIDO VALUES (1, 1, '2021/01/04', '00001', 400.00);
INSERT INTO EX_ITEMPEDIDO VALUES (1, 1, 10.90, 1, 1);
INSERT INTO EX_ITEMPEDIDO VALUES (1, 2, 389.10, 1, 3);
INSERT INTO EX_PEDIDO VALUES (2, 2, '2021/05/10', '00002', 10.90);
INSERT INTO EX_ITEMPEDIDO VALUES (2, 1, 10.90, 1, 1);
INSERT INTO EX_PEDIDO VALUES (3, 2, '2021/01/04', '00003', 21.80);
INSERT INTO EX_ITEMPEDIDO VALUES (3, 1, 10.90, 1, 1);
INSERT INTO EX_PEDIDO VALUES (4, 3, '2021/01/05', '00004', 169.10);
INSERT INTO EX_ITEMPEDIDO VALUES (4, 1, 10.90, 1, 1);
INSERT INTO EX_ITEMPEDIDO VALUES (4, 2, 15.90, 2, 2);
INSERT INTO EX_ITEMPEDIDO VALUES (4, 3, 25.50, 1, 4);
INSERT INTO EX_ITEMPEDIDO VALUES (4, 4, 100.90, 1, 5);
INSERT INTO EX_PEDIDO VALUES (5, 4, '2021/01/05', '00005', 100.90);
INSERT INTO EX_ITEMPEDIDO VALUES (5, 1, 100.90, 1, 5);
INSERT INTO EX_PEDIDO VALUES (6, 6, '2021/01/05', '00006', 51.35);
INSERT INTO EX_ITEMPEDIDO VALUES (6, 1, 25.50, 2, 4);
INSERT INTO EX_PEDIDO VALUES (7, 4, '2024/01/05', '00007', 100.90);
INSERT INTO EX_PEDIDO VALUES (8, 6, '2024/01/05', '00008', 51.35);
INSERT INTO EX_PEDIDO VALUES (9, 6, '2024/08/05', '00008', 51.35);
INSERT INTO EX_PEDIDO VALUES (10, 4, '2024/09/05', '00007', 100.90);

-- QUESTAO 1
CREATE OR REPLACE VIEW CLIENTES_MAIORES_VIEW
AS SELECT 
	*, FLOOR(DATEDIFF(NOW(), datanascimento)/365.25) idade
FROM EX_CLIENTE AS cliente
HAVING idade > 18;

SELECT * FROM CLIENTES_MAIORES_VIEW;

-- QUESTAO 2
CREATE OR REPLACE VIEW ULTIMO_PEDIDO_VIEW
AS SELECT 
	cliente.nome AS 'Cliente',
    MAX(pedido.datapedido) AS 'Ultimo pedido'
FROM EX_CLIENTE AS cliente
JOIN EX_PEDIDO AS pedido
ON cliente.codcliente = pedido.codcliente
GROUP BY cliente.codcliente
;

CREATE OR REPLACE VIEW ULTIMO_PEDIDO_VIEW_2 AS

SELECT * 
FROM ex_pedido
WHERE nf IN
(SELECT 
    MAX(nf)
FROM ex_pedido
GROUP BY codcliente);

SELECT * FROM ULTIMO_PEDIDO_VIEW;

SELECT * FROM ULTIMO_PEDIDO_VIEW_2;

-- QUESTAO 3
CREATE OR REPLACE VIEW TABELA_PRODUTO_VIEW
AS SELECT 
	produto.descricao AS 'Produto' ,
    itempedido.valorunitario AS 'Valor'
FROM EX_ITEMPEDIDO as itempedido
JOIN EX_PRODUTO as produto
ON itempedido.codproduto = produto.codproduto
GROUP BY produto.codproduto
;

CREATE OR REPLACE VIEW TABELA_PRODUTO_VIEW_2 AS
SELECT
	p.*,it.valorunitario
FROM ex_itempedido it
JOIN ex_produto p
	ON p.codproduto = it.codproduto
JOIN (SELECT MAX(codpedido)codpedido, codproduto FROM ex_itempedido GROUP BY codproduto) sub
	ON it.codpedido = sub.codpedido AND it.codproduto = sub.codproduto

;

SELECT * FROM TABELA_PRODUTO_VIEW;

SELECT * FROM TABELA_PRODUTO_VIEW_2;

-- QUESTAO 4
CREATE OR REPLACE VIEW LISTA_NOTA_VIEW AS 
SELECT 
	pedido.nf AS 'Nota Fiscal',
    MONTH(pedido.datapedido) AS 'Mes pedido',
    YEAR(pedido.datapedido)  AS 'Ano pedido'
FROM EX_PEDIDO as pedido
WHERE YEAR(pedido.datapedido) = YEAR(curdate())
ORDER BY MONTH(pedido.datapedido)
;

CREATE OR REPLACE VIEW LISTA_NOTA_VIEW_2 AS 
SELECT
	MONTH(datapedido) Mes,
    nf
FROM ex_pedido
WHERE YEAR(datapedido) = YEAR(NOW())
GROUP BY mes
;

SELECT * FROM LISTA_NOTA_VIEW;

SELECT * FROM LISTA_NOTA_VIEW_2;
-- QUESTAO 5
CREATE OR REPLACE VIEW PRODUTO_FAVORITO_VIEW AS
SELECT DISTINCT
	c.nome as Cliente,
	prod.descricao Produto,
    it.quantidade
FROM ex_itempedido it
JOIN ex_pedido ped
	ON ped.codpedido = it.codpedido
JOIN ex_cliente c
	ON c.codcliente = ped.codcliente
JOIN ex_produto prod
	ON prod.codproduto = it.codproduto
WHERE quantidade in (
SELECT 
	MAX(quantidade) 
FROM ex_pedido p 
JOIN ex_itempedido itt 
ON p.codpedido = itt.codpedido 
WHERE it.codpedido = itt.codpedido 
GROUP BY codcliente)
;

SELECT * FROM PRODUTO_FAVORITO_VIEW;

-- QUESTAO 6
CREATE OR REPLACE VIEW PRODUTOS_DEFASADOS_VIEW AS
SELECT 
	produto.descricao AS 'Produto'
FROM EX_PRODUTO AS produto
WHERE produto.codproduto NOT IN(
	SELECT 
		itempedido.codproduto
FROM EX_ITEMPEDIDO AS itempedido
JOIN EX_PEDIDO as pedido
	ON itempedido.codpedido = pedido.codpedido
WHERE pedido.datapedido >= DATE_SUB(curdate(), INTERVAL 3 MONTH)
)
;

SELECT * FROM PRODUTOS_DEFASADOS_VIEW;
