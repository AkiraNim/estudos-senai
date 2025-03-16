CREATE DATABASE mercado;

USE mercado;

CREATE TABLE categorias (
    categoria_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome_categoria VARCHAR(50)
);

CREATE TABLE produtos (
    produto_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(50) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    categoria_id INT NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES categorias(categoria_id)
);

CREATE TABLE fornecedores(
fornecedor_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome_fornecedor VARCHAR(50) NOT NULL,
produto_id INT NOT NULL,
FOREIGN KEY (produto_id) REFERENCES produtos(produto_id)
);

INSERT INTO categorias (nome_categoria)
VALUES ('bebida'), 
('higiene'),
('alimento'),
('cereais'),
('grãos'), 
('eletrônicos'), 
('flores'), 
('laticínios'), 
('chocolate'), 
('hortifruti');

select * from categorias;
 
INSERT INTO produtos(nome, preco, categoria_id)
VALUES ('refrigerante', 6.00, 1), 
('pão', 0.50, 2),
('sabonete', 3.00, 3),
('papel higienico', 6.00, 4),
('agua sanitaria', 2.00, 5),
('macarrão spaguetti', 2.00, 6),
('acai', 27.00, 7),
('racao', 32.00, 8),
('sabonete liquido', 7.00, 9),
('quebra-cabeça', 15.00, 10);

select * from produtos;

INSERT INTO fornecedores(nome_fornecedor, produto_id)
VALUES ('goob', 1),
('brendoka', 2),
('lux', 3),
('familiar', 4),
('qboa', 5),
('lilly', 6),
('dmais', 7),
('whiska', 8),
('palmolive', 9),
('sla', 10);

SELECT * FROM produtos;

SELECT categoria_id, nome_categoria, 
       (SELECT nome 
        FROM produtos 
        WHERE produtos.categoria_id = categorias.categoria_id 
        LIMIT 1) AS produto, 
       (SELECT preco 
        FROM produtos 
        WHERE produtos.categoria_id = categorias.categoria_id 
        LIMIT 1) AS preco
FROM categorias
ORDER BY categoria_id;

SELECT fornecedor_id, nome_fornecedor,
       (SELECT nome
        FROM produtos
        WHERE produtos.produto_id = fornecedores.produto_id) AS produto
FROM fornecedores
ORDER BY nome_fornecedor;

SELECT * FROM produtos WHERE preco > 10;

SELECT nome FROM produtos WHERE preco = (SELECT MAX(preco) FROM produtos);

SELECT nome_fornecedor, COUNT(produto_id) AS total_produtos
FROM fornecedores
GROUP BY nome_fornecedor;

SELECT AVG (preco) FROM produtos;






