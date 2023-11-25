package br.com.uvet.clinicaVet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Projetos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String titulo;
	
	private String capa;
	
	private String texto;
	
	private String img_proj;
	
	private String com_proj;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImg_proj() {
		return img_proj;
	}

	public void setImg_proj(String img_proj) {
		this.img_proj = img_proj;
	}

	public String getCom_proj() {
		return com_proj;
	}

	public void setCom_proj(String com_proj) {
		this.com_proj = com_proj;
	}
	
	
}
