package br.com.treinaweb.twgerenciadortarefas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.twgerenciadortarefas.repository.TarefasRepository;

@Controller
@RequestMapping("/tarefas")
public class TarefasController {
	
	@Autowired
	private TarefasRepository repositorioTarefas;
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("tarefas/listar");
		mv.addObject("tarefas",repositorioTarefas.findAll());
		return mv;
	}
	//parei no minuto 50:12
	@GetMapping("/inserir")
	public String inserir() {
		return "tarefas/inserir";
	}
}
