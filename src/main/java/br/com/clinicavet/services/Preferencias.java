package br.com.clinicavet.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadopago.client.preference.PreferenceClient;
import com.mercadopago.client.preference.PreferenceItemRequest;
import com.mercadopago.client.preference.PreferenceRequest;
import com.mercadopago.client.preference.PreferenceTrackRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.net.MPSearchRequest;

@Service
public class Preferencias {

	
	public void criarPreferencia() {
		

	PreferenceClient client = new PreferenceClient();
	
	List<PreferenceItemRequest> items = new ArrayList<>();
	PreferenceItemRequest item =
	   PreferenceItemRequest.builder()
	       .title("Dummy Title")
	       .description("Dummy description")
	       .pictureUrl("http://www.myapp.com/myimage.jpg")
	       .quantity(1)
	       .currencyId("US")
	       .unitPrice(new BigDecimal("10"))
	       .build();
	items.add(item);
	
	List<PreferenceTrackRequest> tracks = new ArrayList<>();
	PreferenceTrackRequest googleTrack = PreferenceTrackRequest.builder().type("google_ad").build();
	
	tracks.add(googleTrack);
	
	PreferenceRequest request = PreferenceRequest.builder().items(items).tracks(tracks).build();
	
	try {
		client.create(request);
	} catch (MPException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MPApiException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}
	
	
	public void pesquisarPreferencias() {
		PreferenceClient client = new PreferenceClient();

		Map<String, Object> filters = new HashMap<>();
		filters.put("sponsor_id", "undefined");
		filters.put("external_reference", "undefined");
		filters.put("site_id", "undefined");
		filters.put("marketplace", "undefined");

		MPSearchRequest searchRequest =
		   MPSearchRequest.builder().limit(0).offset(0).filters(filters).build();

		try {
			client.search(searchRequest);
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void obterPrefernecia () {
		PreferenceClient client = new PreferenceClient();

		String preferenceId = "202809963-a2201f8d-11cb-443f-adf6-de5a42eed67d";
		try {
			client.get(preferenceId);
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void atualizarPreferencia() {
		PreferenceClient client = new PreferenceClient();

		String preferenceId = "202809963-a2201f8d-11cb-443f-adf6-de5a42eed67d";

		List<PreferenceItemRequest> items = new ArrayList<>();
		PreferenceItemRequest item =
		   PreferenceItemRequest.builder()
		       .id("202809963-a2201f8d-11cb-443f-adf6-de5a42eed67d")
		       .title("Dummy Title")
		       .description("Dummy description")
		       .pictureUrl("http://www.myapp.com/myimage.jpg")
		       .quantity(1)
		       .currencyId("US")
		       .unitPrice(new BigDecimal("10"))
		       .build();
		items.add(item);

		PreferenceRequest request = PreferenceRequest.builder().items(items).build();

		try {
			client.update(preferenceId, request);
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
