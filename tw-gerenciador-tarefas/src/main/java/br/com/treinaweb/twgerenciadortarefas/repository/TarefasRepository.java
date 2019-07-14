package br.com.treinaweb.twgerenciadortarefas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.treinaweb.twgerenciadortarefas.models.Tarefa;

public interface TarefasRepository extends JpaRepository<Tarefa, Long> {
	
	@Query("SELECT t FROM Tarefa t WHERE t.usuario.email = :emailUsuario")
	List<Tarefa> carregarTarefaPorUsuario(@Param("emailUsuario") String email);
	
}
