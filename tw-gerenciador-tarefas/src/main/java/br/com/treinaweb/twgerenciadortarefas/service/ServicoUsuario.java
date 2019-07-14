package br.com.treinaweb.twgerenciadortarefas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.treinaweb.twgerenciadortarefas.models.Usuario;
import br.com.treinaweb.twgerenciadortarefas.repository.RepositoryUsuario;

@Service
public class ServicoUsuario {
	
	@Autowired
	private RepositoryUsuario repositoryUsuario;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Usuario encontrarPorEmail(String email) { //Validando usuario pelo email
		return repositoryUsuario.findByEmail(email);
	}
	
	public void salvar(Usuario usuario) { //Criptografando a senha do usuario
		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		repositoryUsuario.save(usuario);
	}
}
