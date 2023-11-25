package br.com.clinicavet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.clinicavet.models.ClinicaModels;
import br.com.clinicavet.models.ProdutoModels;
import br.com.clinicavet.models.UsuarioModels;
import br.com.clinicavet.repository.ClinicaRepository;
import br.com.clinicavet.repository.ProdutoRepository;
import br.com.clinicavet.repository.UsuarioRepository;

@Controller
@RequestMapping("/clinica")
public class ClinicaController {
	
	@Autowired
	UsuarioRepository repositoryUsu;
	ClinicaRepository repositoryClin;
	ProdutoRepository repositoryProd;
	ProdutoModels produtos;
	ClinicaModels clinica;
	UsuarioModels usuarios;
	
	@GetMapping("painel")
	public String abrirTelaPainel() {
		return "/PainelAdm";
	}
	
	@GetMapping("crud-produto")
	public String abrirTelaAdmProduto() {
		return "AdmProd";
	}
	
	@GetMapping("crud-clinica")
	public String abrirAdmClinica() {
		return "AdmClin";
	}

	@GetMapping("crud-usuario")
	public String abrirAdmUsuario() {
		return"AdmUsu";
	}
}