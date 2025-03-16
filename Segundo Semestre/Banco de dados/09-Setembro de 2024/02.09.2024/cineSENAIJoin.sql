SELECT funcionarios.id_cargo,cargos.nome,COUNT(funcionarios.id_cargo) AS total_funcionarios
FROM funcionarios
JOIN cargos
ON funcionarios.id_cargo = cargos.id_cargo
GROUP BY id_cargo;

SELECT 

f.nome,
tp.nome AS tipo_pagamento,
COUNT(*) AS qtd_vendas
FROM vendas AS v
JOIN funcionarios AS f
ON v.id_funcionario = f.id_funcionario
JOIN tipos_pagamentos tp
ON v.id_tp_pagamento = tp.id_tp_pagamento
GROUP BY f.nome, tp.nome;

