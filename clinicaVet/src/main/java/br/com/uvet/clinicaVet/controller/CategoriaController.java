package br.com.uvet.clinicaVet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.uvet.clinicaVet.Repository.CategoriaRepository;


@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	CategoriaRepository repository;
	
	@GetMapping("/produtos") 
	public String abrirCategoria() {
		return "Produtos"; 
	}
}