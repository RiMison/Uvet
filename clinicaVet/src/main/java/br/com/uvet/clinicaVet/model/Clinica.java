package br.com.uvet.clinicaVet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cnpj;
	
	private String nome;
	
	private String razao_social;
	
	private int ddd;
	
	private int tel;
	
	private int cep;
	
	private String log_end;
	
	private int num_end;
	
	private String compl_end;
	
	private String email;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLog_end() {
		return log_end;
	}

	public void setLog_end(String log_end) {
		this.log_end = log_end;
	}

	public int getNum_end() {
		return num_end;
	}

	public void setNum_end(int num_end) {
		this.num_end = num_end;
	}

	public String getCompl_end() {
		return compl_end;
	}

	public void setCompl_end(String compl_end) {
		this.compl_end = compl_end;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
