package br.com.uvet.clinicaVet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.uvet.clinicaVet.Repository.UsuarioRepository;
import br.com.uvet.clinicaVet.model.Usuario;

@Controller
@RequestMapping("/")
public class UsuarioController {
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/usuario") 
	public String abrirLogin() {
		return "Login-Cad-Uvet"; 
	}
	

	@GetMapping("cadastro-usuario")
	public String abrirTelaCadastro() {
		return "Login-Cad-Uvet";
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvarUsuario(Usuario usuario) {
		repository.save(usuario);
		List<Usuario> lista = repository.findAll();
		ModelAndView view = new ModelAndView("AdmUvet");
		view.addObject("usuario", lista);
		return view;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editarUsuario(@PathVariable Long id) {
		Usuario usuario = repository.findById(id).get();
		ModelAndView view = new ModelAndView("AdmUvet");
		view.addObject("usuario", usuario);
		return view;
	}
	
	@GetMapping("/excluir/{id}")
	public ModelAndView excluirUsuario(@PathVariable Long id){
		repository.deleteById(id);
		List<Usuario> lista = repository.findAll();
		ModelAndView view = new ModelAndView("AdmUvet");
		view.addObject("usuario", lista);
		return view;
	}
}