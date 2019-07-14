package br.com.treinaweb.twgerenciadortarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twgerenciadortarefas.models.Usuario;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);
	
}
