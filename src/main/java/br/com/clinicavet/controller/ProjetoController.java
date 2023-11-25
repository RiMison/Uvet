package br.com.clinicavet.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.clinicavet.models.ProjetosModels;
import br.com.clinicavet.repository.ProjetosRepository;

@Controller
@RequestMapping("/projetos")
public class ProjetoController {
	
	ProjetosModels projetos;
	ProjetosRepository repository;
	
		@GetMapping("blog")
		public String abrirTelaProdutos() {
			return "blog";
			
		}
	
}
	