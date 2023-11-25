/*
 * package br.com.clinicavet.services;
 * 
 * import java.time.OffsetDateTime; import java.time.ZoneOffset; import
 * java.util.HashMap; import java.util.Map;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.mercadopago.client.common.IdentificationRequest; import
 * com.mercadopago.client.common.PhoneRequest; import
 * com.mercadopago.client.customer.CustomerAddressRequest; import
 * com.mercadopago.client.customer.CustomerClient; import
 * com.mercadopago.client.customer.CustomerRequest; import
 * com.mercadopago.exceptions.MPApiException; import
 * com.mercadopago.exceptions.MPException; import
 * com.mercadopago.net.MPSearchRequest;
 * 
 * @Service public class Cliente {
 * 
 * @Autowired public void criarCliente() {
 * 
 * CustomerClient client = new CustomerClient();
 * 
 * CustomerRequest customerRequest = CustomerRequest.builder()
 * .email("jhon@doe.com") .firstName("Jhon") .lastName("Doe")
 * .phone(PhoneRequest.builder().areaCode("55").number("991234567").build())
 * .identification(
 * IdentificationRequest.builder().type("CPF").number("12345678900").build())
 * .defaultAddress("Home") .address( CustomerAddressRequest.builder()
 * .id("123123") .zipCode("01234567") .streetName("Rua Exemplo")
 * .streetNumber(123) .build()) .dateRegistred(OffsetDateTime.of(2000, 1, 18, 0,
 * 0, 0, 0, ZoneOffset.UTC)) .description("Description del user")
 * .defaultCard("None") .build();
 * 
 * try { client.create(customerRequest); } catch (MPException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } catch (MPApiException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * 
 * }
 * 
 * @Autowired public void pesquisarCliente() {
 * 
 * CustomerClient client = new CustomerClient();
 * 
 * Map<String, Object> filters = new HashMap<>(); filters.put("email",
 * "test_payer_12345@testuser.com");
 * 
 * MPSearchRequest searchRequest =
 * MPSearchRequest.builder().offset(0).limit(0).filters(filters).build();
 * 
 * try { client.search(searchRequest); } catch (MPException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } catch (MPApiException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * }
 * 
 * @Autowired public void atualizarCliente() {
 * 
 * CustomerClient client = new CustomerClient();
 * 
 * String customerId = "247711297-jxOV430go9fx2e";
 * 
 * CustomerRequest customerRequest = CustomerRequest.builder()
 * .email("jhon@doe.com") .firstName("Jhon") .lastName("Doe")
 * .phone(PhoneRequest.builder().areaCode("55").number("991234567").build())
 * .identification(
 * IdentificationRequest.builder().type("CPF").number("12345678900").build())
 * .defaultAddress("Home") .address( CustomerAddressRequest.builder()
 * .id("123123") .zipCode("01234567") .streetName("Rua Exemplo")
 * .streetNumber(123) .build()) .dateRegistred(OffsetDateTime.of(2000, 1, 18, 0,
 * 0, 0, 0)
 * 
 * }
 * 
 * @Autowired public void obterCliente() {
 * 
 * CustomerClient customerClient = new CustomerClient();
 * 
 * 
 * String customerId = "247711297-jxOV430go9fx2e"; try {
 * customerClient.get(customerId); } catch (MPException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } catch (MPApiException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); } } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */