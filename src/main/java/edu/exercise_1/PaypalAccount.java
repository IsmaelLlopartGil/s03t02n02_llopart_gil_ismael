package edu.exercise_1;

public class PaypalAccount implements PaymentMethod {

	@Override
	public void pay(Double amount) {
		System.out.println("Pagant " + amount + "€ amb Paypal.");
	}
}
