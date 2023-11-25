package br.com.uvet.clinicaVet.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notificacoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String cupom;
	
	private String vlr_cupom;
	
	private LocalDate vld_cupom;
	
	private String Status;
	
	private String msg_not;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCupom() {
		return cupom;
	}

	public void setCupom(String cupom) {
		this.cupom = cupom;
	}

	public String getVlr_cupom() {
		return vlr_cupom;
	}

	public void setVlr_cupom(String vlr_cupom) {
		this.vlr_cupom = vlr_cupom;
	}

	public LocalDate getVld_cupom() {
		return vld_cupom;
	}

	public void setVld_cupom(LocalDate vld_cupom) {
		this.vld_cupom = vld_cupom;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getMsg_not() {
		return msg_not;
	}

	public void setMsg_not(String msg_not) {
		this.msg_not = msg_not;
	}
	
	
}
