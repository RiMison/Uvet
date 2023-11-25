package br.com.clinicavet.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadopago.client.common.PhoneRequest;
import com.mercadopago.client.payment.PaymentAdditionalInfoPayerRequest;
import com.mercadopago.client.payment.PaymentAdditionalInfoRequest;
import com.mercadopago.client.payment.PaymentClient;
import com.mercadopago.client.payment.PaymentCreateRequest;
import com.mercadopago.client.payment.PaymentItemRequest;
import com.mercadopago.client.payment.PaymentOrderRequest;
import com.mercadopago.client.payment.PaymentPayerRequest;
import com.mercadopago.client.payment.PaymentReceiverAddressRequest;
import com.mercadopago.client.payment.PaymentShipmentsRequest;

import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;

@Service
public class Pagamento {
	
	
	
	public void efetuar() {
	
		PaymentClient client = new PaymentClient();
		
		List<PaymentItemRequest> items = new ArrayList<>();
		
		PaymentItemRequest item =
				   PaymentItemRequest.builder()
				       .id("PR0001")
				       .title("Point Mini")
				       .description("Producto Point para cobros con tarjetas mediante bluetooth")
				       .pictureUrl(
				           "https://http2.mlstatic.com/resources/frontend/statics/growth-sellers-landings/device-mlb-point-i_medium@2x.png")
				       .categoryId("electronics")
				       .quantity(1)
				       .unitPrice(new BigDecimal("58.8"))
				       .build();
		items.add(item);
		
		PaymentCreateRequest createRequest =
				   PaymentCreateRequest.builder()
				       .additionalInfo(
				           PaymentAdditionalInfoRequest.builder()
				               .items(items)
				               .payer(
				                   PaymentAdditionalInfoPayerRequest.builder()
				                       .firstName("Test")
				                       .lastName("Test")
				                       .phone(
				                           PhoneRequest.builder().areaCode("11").number("987654321").build())
				                       .build())
				               .shipments(
				                   PaymentShipmentsRequest.builder()
				                       .receiverAddress(
				                           PaymentReceiverAddressRequest.builder()
				                               .zipCode("12312-123")
				                               .stateName("Rio de Janeiro")
				                               .cityName("Buzios")
				                               .streetName("Av das Nacoes Unidas")
				                               .streetNumber("3003")
				                               .build())
				                       .build())
				               .build())
				       .description("Payment for product")
				       .externalReference("MP0001")
				       .installments(1)
				       .order(PaymentOrderRequest.builder().type("mercadolibre").build())
				       .payer(PaymentPayerRequest.builder().entityType("individual").type("customer").build())
				       .paymentMethodId("visa")
				       .transactionAmount(new BigDecimal("58.8"))
				       .build();
		try {
			client.create(createRequest);
		} catch (MPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MPApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


	

	

	



	
}
