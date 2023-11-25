package br.com.clinicavet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.clinicavet.models.ProdutoModels;
import br.com.clinicavet.repository.ProdutoRepository;

	@Controller
	@RequestMapping("/categoria")
	public class CategoriaController {
		
		@Autowired
		ProdutoRepository repository;
		ProdutoModels produto;
		
		@GetMapping("/gato")
		public String abrirProdutosGato( ) {
			return "ProdGatos";
		}
		
		@GetMapping("/cachorro")
		public String abrirProdutosCachorro( ) {
			return "ProdCachorro";
		}
		
		@GetMapping("/farmacia")
		public String abrirProdutosFarmacia( ) {
			return "ProdFarmacia";
		}
		
		@GetMapping("/diversos")
		public String abrirProdutosDiversos( ) {
			return "ProdDiversos";
		}
		
		
	
}