package edu.exercise_1;

public class BankAccount implements PaymentMethod {

	@Override
	public void pay(Double amount) {
		System.out.println("Pagant " + amount + "€ amb deute en compte bancari.");
	}
}
