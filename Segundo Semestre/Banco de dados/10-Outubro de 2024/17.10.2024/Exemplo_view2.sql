DELIMITER $$
CREATE OR REPLACE PROCEDURE hello_world (nome VARCHAR(50))
BEGIN
	SELECT CONCAT("Hello, ", nome) AS hello;
END $$
DELIMITER ;

CALL hello_world("Gilson");

CREATE TABLE `ex_endereco` (
  `codendereco` int(11) NOT NULL AUTO_INCREMENT,
  `logradouro` varchar(100) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) NOT NULL,
  `estado` char(2) NOT NULL,
  `codcliente` int(11) NOT NULL,
  PRIMARY KEY (`codendereco`),
  KEY `codcliente` (`codcliente`),
  CONSTRAINT `ex_endereco_ibfk_1` FOREIGN KEY (`codcliente`) REFERENCES `ex_cliente` (`codcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DELIMITER $$
CREATE OR REPLACE PROCEDURE cadastrar_cliente(
	nome VARCHAR(60),
    datanascimento DATE,
    cpf VARCHAR(11),
    logradouro VARCHAR(100),
    bairro VARCHAR (45),
    numero VARCHAR (45),
    cidade VARCHAR (45),
    estado CHAR(2)
)
BEGIN
	DECLARE codcliente INT;
	START TRANSACTION;
		INSERT INTO ex_cliente(nome, datanascimento, cpf)
		VALUES(nome, datanascimento, cpf);
		
		SET codcliente = LAST_INSERT_ID();
		
		INSERT INTO EX_ENDERECO(logradouro, bairro, numero, cidade ,estado, codcliente)
		VALUES(logradouro, bairro, numero, cidade, estado, codcliente);
    COMMIT;
END $$
DELIMITER ;

CALL cadastrar_cliente("Gilson", "2005/02/12", "12345678910", "rua dos lemoes", "Lemoes", "a24", "Lemoeiros", 'LE');
select * from ex_cliente;

DELIMITER $$
CREATE FUNCTION fn_teste(a DECIMAL(10,2), b INT)
RETURNS INT
RETURN a*b;
DELIMITER ;

SELECT fn_teste(2.5, 4) AS Resultado;

CREATE FUNCTION fn_calcula_idade(dt_nasc DATE)
RETURNS INT
RETURN FLOOR(DATEDIFF(NOW(), dt_nasc)/365.25);

SELECT fn_calcula_idade("2005/10/10") AS Idade;

SELECT 
	*,
	fn_calcula_idade(datanascimento) Idade
FROM ex_cliente;

