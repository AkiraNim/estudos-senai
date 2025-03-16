#cineSenai

SELECT
	nome,
    valor AS valor_original,
    CASE 
		WHEN valor < 20 THEN  ROUND ((valor * 10/100) + valor, 2)
        ELSE valor
   END valor_com_acrescimo,
   CASE 
		WHEN valor < 20 THEN 'COM ACRESCIMO'
        ELSE 'VALOR NORMAL'
	END legenda
FROM tp_ingressos;

SELECT
    CONCAT('R$', REPLACE(valor, '.', ',')) valor_com_virgula
FROM tp_ingressos;

#jorge_db
SELECT 
	nome,
    data_nascimento,
	YEAR(NOW()) - YEAR(data_nascimento) idade,
    CASE 
		WHEN YEAR(NOW()) - YEAR(data_nascimento) > 18 THEN 'MAIOR DE IDADE'
        ELSE 'MENOR DE IDADE'
   END status_idade
FROM clientes;

SELECT
	DAY(data_nascimento) dia,
    MONTH(data_nascimento) mês,
    YEAR(data_nascimento) ano,
    CONCAT(
		DAY(data_nascimento),
        '/',
        MONTH(data_nascimento),
        '/',
        YEAR(data_nascimento))
        data_completa
    
FROM clientes;