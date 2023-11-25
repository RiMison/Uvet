package br.com.uvet.clinicaVet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.uvet.clinicaVet.Repository.UsuarioRepository;

@Controller
@RequestMapping("/projetos")
public class ProjetosController {
	@Autowired
	UsuarioRepository repository;
	
	@GetMapping("cadastro-projetos")
	public String abrirTelaCadastro() {
		return "cadastro-usuario";
}
}