package br.com.clinicavet.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoModels {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private LocalDate data_ped;
	
	private String itens_pedido;
	
	private int vlr_total;
	
	private int qtd_ped;
	
	private String cupom;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDa_ped() {
		return data_ped;
	}

	public void setDa_ped(LocalDate da_ped) {
		this.data_ped = da_ped;
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

	public String getCupom() {
		return cupom;
	}

	public void setCupom(String cupom) {
		this.cupom = cupom;
	}
	
	

}
