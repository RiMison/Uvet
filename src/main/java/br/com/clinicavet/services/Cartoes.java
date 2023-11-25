package br.com.clinicavet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mercadopago.client.customer.CustomerCardClient;
import com.mercadopago.client.customer.CustomerCardCreateRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
@Service
public class Cartoes {
	
	
	public void salvarCartao() {
		CustomerCardClient client = new CustomerCardClient();

		String customerId = "448870796-7ZjwhKGxILixxN";

		CustomerCardCreateRequest request = CustomerCardCreateRequest.builder()
		   .token("9b2d63e00d66a8c721607214ceda233a")
		   .build();

		try {
			client.create(customerId, request);
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void obterCartaoCliente() {
		CustomerCardClient client = new CustomerCardClient();

		String customerId = "448870796-7ZjwhKGxILixxN";
		try {
			client.listAll(customerId);
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void ObterCartao() {
		CustomerCardClient client = new CustomerCardClient();

		String customerId = "448870796-7ZjwhKGxILixxN";
		String cardId = "8987269652";
		try {
			client.get(customerId, cardId);
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void excluirCartao() {
		CustomerCardClient client = new CustomerCardClient();

		String customerId = "448870796-7ZjwhKGxILixxN";
		String cardId = "8987269652";
		try {
			client.delete(customerId, cardId);
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
