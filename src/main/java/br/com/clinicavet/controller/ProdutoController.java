package br.com.clinicavet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import br.com.clinicavet.repository.ProdutoRepository;




@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	
	ProdutoRepository repository;
	
	@GetMapping("/categoria")
	public String abrirTelaProdutos() {
		return "ProdDiversos";
	}
	
	@GetMapping("/produto")
	public String abrirDetalhesProd() {
		return "pagina-detalhes";
	}
}