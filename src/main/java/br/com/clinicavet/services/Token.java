package br.com.clinicavet.services;

import org.springframework.stereotype.Service;

import com.mercadopago.client.oauth.OauthClient;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.oauth.CreateOauthCredential;

@Service
public class Token {

	
	
	public String criarToken() {
		OauthClient client = new OauthClient();

		String authorizationCode = "APP_USR-2d985754-d47f-4197-979e-7c212fb38ed8";
		try {
			String jsonEntrada = "{\"client_id\":\"\3737945687428763\",\"client_secret\":\"\\WatAcJk47eJswLHNZJKXBzZDPQHyHT1O\",\"grant_type\":\"authorization_code\"}";
			CreateOauthCredential credential =	client.createCredential(jsonEntrada, null);
			return credential.getAccessToken();    	 	
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
