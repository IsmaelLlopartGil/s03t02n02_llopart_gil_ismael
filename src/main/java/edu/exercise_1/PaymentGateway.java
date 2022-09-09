package edu.exercise_1;

public class PaymentGateway {

	public void pay(Double amount, PaymentMethod paymentMethod, CallableCommerce commerce) {
		paymentMethod.pay(amount);
		System.out.println("Passarel·la verificant el pagament.");
		commerce.call();
	}
}
