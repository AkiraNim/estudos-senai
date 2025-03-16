#group by

SELECT 
	id_cargo,
	COUNT(id_cargo) qtd
FROM funcionarios
GROUP BY id_cargo;

#order by

SELECT *
FROM funcionarios
ORDER BY nome ASC;