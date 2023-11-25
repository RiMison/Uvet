package br.com.uvet.clinicaVet.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private LocalDate da_ped;
	
	private String itens_pedido;
	
	private int vlr_total;
	
	private int qtd_ped;
	
	private int pagamento;
	
	private String entrega;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDa_ped() {
		return da_ped;
	}

	public void setDa_ped(LocalDate da_ped) {
		this.da_ped = da_ped;
	}

	public String getItens_pedido() {
		return itens_pedido;
	}

	public void setItens_pedido(String itens_pedido) {
		this.itens_pedido = itens_pedido;
	}

	public int getVlr_total() {
		return vlr_total;
	}

	public void setVlr_total(int vlr_total) {
		this.vlr_total = vlr_total;
	}

	public int getQtd_ped() {
		return qtd_ped;
	}

	public void setQtd_ped(int qtd_ped) {
		this.qtd_ped = qtd_ped;
	}

	public int getPagamento() {
		return pagamento;
	}

	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}

	public String getEntrega() {
		return entrega;
	}

	public void setEntrega(String entrega) {
		this.entrega = entrega;
	} 	
}
