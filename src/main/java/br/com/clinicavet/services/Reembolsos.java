/*
 * package br.com.clinicavet.services;
 * 
 * import java.math.BigDecimal;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.mercadopago.client.payment.PaymentRefundClient; import
 * com.mercadopago.exceptions.MPApiException; import
 * com.mercadopago.exceptions.MPException;
 * 
 * @Service public class Reembolsos {
 * 
 * @Autowired public void criarReembolso() { PaymentRefundClient client = new
 * PaymentRefundClient();
 * 
 * Long paymentId = 123456789L; BigDecimal amount = new BigDecimal("5"); try {
 * client.refund(paymentId, amount); } catch (MPException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } catch (MPApiException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); } }
 * 
 * @Autowired public void criarReembolsoParcial() {
 * 
 * MercadoPago.SDK.configure("YOUR_ACCESS_TOKEN");
 * 
 * Refund refund = new Refund(); refund.setPaymentId("payment_id");
 * refund.save(); }
 * 
 * @Autowired public void obtrReembolsoEspecifico() { PaymentRefundClient client
 * = new PaymentRefundClient();
 * 
 * Long paymentId = 123456789L; Long refundId = 1234L; try {
 * client.get(paymentId, refundId); } catch (MPException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } catch (MPApiException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); } }
 * 
 * @Autowired void obterListaReembolso(){ PaymentRefundClient client = new
 * PaymentRefundClient();
 * 
 * Long paymentId = 123456789L; try { client.list(paymentId); } catch
 * (MPException e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * catch (MPApiException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } }
 * 
 * }
 */