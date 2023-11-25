package br.com.clinicavet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.clinicavet.models.UsuarioModels;
import br.com.clinicavet.repository.UsuarioRepository;

@Controller
@RequestMapping("cadastro")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;
	UsuarioModels usuarios;

	@GetMapping("/entrar")
	public String abrirTelaEntrar() {
		
		
		return "Login-Cad-UVet";
	}

	@GetMapping("/cadastrar")
	public String abrirTelaCadastrar() {
		return "Login-Cad-UVet2";
	}
	
	@PostMapping("/finalizar-cadastro")
	public String abrirTelaFinalizarCadastro(UsuarioModels usuario ) {		
		repository.save(usuario);
		 return "Cad2";
	}
	
	@GetMapping("/minha-conta")
	public String abrirTelaAtualizarCad() {
		
		return "contaconfig";
	}
	
	@GetMapping("/nova-senha")
	public String abrirTelaTrocarSenha(@PathVariable Long id) {
		
		return "NvSenha1";
	}
	
	@GetMapping("/senha-cadastrada")
	public String abrirTelaConfirmacaoSenha() {
		return "NvSenha2";
	}
	
	@GetMapping("/recupera-senha")
	public String abrirTelaRecuperarSenha() {
		return "RecSenha1";
	}
	
	@GetMapping("/senha-recuperada")
	public String abrirTelaRecuperacaoSenha() {
		return "RecSenha2";
	}
	
	@PostMapping("/autenticar")
		public String autenticar(String email, String senha){
		UsuarioModels usuario = repository.findByemail(email);
		if(usuario != null && usuario.getSenha().equals(senha)){
			return "contaconfig"; 
		};
		return "Login-Cad-UVet"; 
	}

}