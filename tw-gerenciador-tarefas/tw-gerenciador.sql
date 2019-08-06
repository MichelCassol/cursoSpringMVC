CREATE DATABASE tw_gerenciador_tarefas;

use tw_gerenciador_tarefas;

CREATE TABLE tar_tarefas(
	tar_id int primary key auto_increment,
    tar_titulo varchar(50) not null,
    tar_descricao varchar(100)default null,
    tar_data_expiracao date not null,
    tar_concluida bit default false
);

INSERT INTO tar_tarefas(tar_titulo,tar_descricao,tar_data_expiracao)
values('Tarefa 1','Descrição tarefa 1',NOW());

select * FROM tar_tarefas;