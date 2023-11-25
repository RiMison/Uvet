
package br.com.clinicavet.models;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProdutoModels {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nomeProduto;

	private String descProduto;

	private String MarcaProduto;

	private int vlrProduto;

	private int estoque;

	private Blob ImgProduto;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public String getMarcaProduto() {
		return MarcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		MarcaProduto = marcaProduto;
	}

	public int getVlrProduto() {
		return vlrProduto;
	}

	public void setVlrProduto(int vlrProduto) {
		this.vlrProduto = vlrProduto;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Blob getImgProduto() {
		return ImgProduto;
	}

	public void setImgProduto(Blob imgProduto) {
		ImgProduto = imgProduto;
	}

	

	

	
	
}
