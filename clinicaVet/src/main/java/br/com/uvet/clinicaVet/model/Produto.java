package br.com.uvet.clinicaVet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome_prod;
	
	private String desc_prod;
	
	private String marca_prod;
	
	private String infoTec_prod;
	
	private int vlr_unit;
	
	private String img_prod;
	
	private int estoque_prod;
	
	private String avl_cliente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_prod() {
		return nome_prod;
	}

	public void setNome_prod(String nome_prod) {
		this.nome_prod = nome_prod;
	}

	public String getDesc_prod() {
		return desc_prod;
	}

	public void setDesc_prod(String desc_prod) {
		this.desc_prod = desc_prod;
	}

	public String getMarca_prod() {
		return marca_prod;
	}

	public void setMarca_prod(String marca_prod) {
		this.marca_prod = marca_prod;
	}

	public String getInfoTec_prod() {
		return infoTec_prod;
	}

	public void setInfoTec_prod(String infoTec_prod) {
		this.infoTec_prod = infoTec_prod;
	}

	public int getVlr_unit() {
		return vlr_unit;
	}

	public void setVlr_unit(int vlr_unit) {
		this.vlr_unit = vlr_unit;
	}

	public String getImg_prod() {
		return img_prod;
	}

	public void setImg_prod(String img_prod) {
		this.img_prod = img_prod;
	}

	public int getEstoque_prod() {
		return estoque_prod;
	}

	public void setEstoque_prod(int estoque_prod) {
		this.estoque_prod = estoque_prod;
	}

	public String getAvl_cliente() {
		return avl_cliente;
	}

	public void setAvl_cliente(String avl_cliente) {
		this.avl_cliente = avl_cliente;
	}
	
	
	

}
