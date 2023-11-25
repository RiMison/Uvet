package br.com.clinicavet.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




	@Entity
	public class CompraModels {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		private String hist_compra;
		
		private int vlr_total;
		
		private LocalDate data_compra;
		
		private int frete;
		
		private String rastreio;
		
		private String Status;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getHist_compra() {
			return hist_compra;
		}

		public void setHist_compra(String hist_compra) {
			this.hist_compra = hist_compra;
		}

		public int getVlr_total() {
			return vlr_total;
		}

		public void setVlr_total(int vlr_total) {
			this.vlr_total = vlr_total;
		}

		public LocalDate getData_compra() {
			return data_compra;
		}

		public void setData_compra(LocalDate data_compra) {
			this.data_compra = data_compra;
		}

		public int getFrete() {
			return frete;
		}

		public void setFrete(int frete) {
			this.frete = frete;
		}

		public String getRastreio() {
			return rastreio;
		}

		public void setRastreio(String rastreio) {
			this.rastreio = rastreio;
		}

		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}
			
	}

