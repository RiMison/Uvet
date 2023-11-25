package br.com.clinicavet.services;

import org.springframework.stereotype.Service;

import com.mercadopago.client.paymentmethod.PaymentMethodClient;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;

@Service
public class MeioPagamento {


	public void obterMeioPagamento() {
		
		PaymentMethodClient client = new PaymentMethodClient();
		try {
			client.list();
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
