package br.com.clinicavet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.clinicavet.models.PedidoModels;
import br.com.clinicavet.repository.PedidoRepository;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	PedidoRepository repository;
	PedidoModels pedidos;

	@GetMapping("/carrinho")
	public String abrirTelaCarrinho() {
		
		return "carrinho";
	}
	
	@GetMapping("/frete")
	public String abrirTelaFrete() {
		return "frete";
	}
	
	@GetMapping("/novo-endereco")
	public String abrirTelaMudarEnd() {
		return "NvEnd";
	}
	
	
	@GetMapping("/pagamento")
	public String abrirTelaPagamentos() {
		return "payment";
	}
	
	@GetMapping("/detalhes")
	public String abrirTelaDetalhes() {
		return "detalhes-pedido";
	}
}