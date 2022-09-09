package edu.exercise_1;

public class App {

	private void runScenario() {

		ShoeStore shoeStore = new ShoeStore(new PaymentGateway());
		Client client = new Client();

		client.setPaymentMethod(new CreditCard());
		shoeStore.sellShoes(client);
		System.out.println();

		client.setPaymentMethod(new PaypalAccount());
		shoeStore.sellShoes(client);
		System.out.println();

		client.setPaymentMethod(new BankAccount());
		shoeStore.sellShoes(client);
	}

	public static void main(String[] args) {
		new App().runScenario();
	}
}
