package edu.exercise_1;

public class CreditCard implements PaymentMethod {

	@Override
	public void pay(Double amount) {
		System.out.println("Pagant " + amount + "€ amb targeta de crèdit.");
	}
}
