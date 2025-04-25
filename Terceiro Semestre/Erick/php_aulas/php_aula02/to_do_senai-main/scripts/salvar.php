<?php
include "config.php";
$dado = $_POST['add'];

$sql = "INSERT INTO tarefas (tarefa) VALUES ('$dado')";
$query = $mysqli->query($sql);

if($query){ ?>
    <script>
        alert('Salvo com sucesso!');
        window.location.href = ('../index.html');
    </script>
    
<?php
} else { ?>
    <script>
        alert('Erro ao salvar!');
        window.location.href = ('../index.html');
    </script>
    <?php
}

?>