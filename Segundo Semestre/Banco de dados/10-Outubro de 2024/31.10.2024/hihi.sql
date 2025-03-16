CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE livros(
	isbn INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(45),
    editora VARCHAR (45),
    PRIMARY KEY (isbn)
    );
    
DELIMITER $$
CREATE PROCEDURE sp_cad_livro (IN nome_livro varchar(45), IN ed_livro varchar(45))
BEGIN 
	INSERT INTO livros VALUES (null, nome_livro, ed_livro);
END $$
DELIMITER ;   
     
CALL sp_cad_livro ('Banco de dados', 'SENAI');
CALL sp_cad_livro ('As aventuras de Samuka', 'Ellen');

SELECT * FROM livros;
     
DELIMITER $$
CREATE PROCEDURE sp_del_livro(IN cod_livro int,
out retorno varchar(45))
BEGIN
DELETE FROM livros WHERE isbn = cod_livro;
IF row_count() = 0 THEN
	SET retorno = 'Nenhum livro foi excluído';
else	
		SET retorno = 'Livro excluído com sucesso!';
        SELECT retorno;
END IF;
END $$
DELIMITER ;

CALL sp_del_livro(1,@saida);        
