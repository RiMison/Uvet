package br.com.uvet.clinicaVet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.uvet.clinicaVet.Repository.ProdutoRepository;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	ProdutoRepository repository;
	
	@GetMapping("detalhes")
	public String abrirTelaCadastro() {
		return "DP";
	}
}
