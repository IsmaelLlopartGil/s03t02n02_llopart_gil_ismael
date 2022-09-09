package edu.exercise_1;

public class ShoeStore implements CallableCommerce {

	PaymentGateway paymentGateway;

	public ShoeStore(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public void sellShoes(Client client) {
		Double amount = 50.50;
		PaymentMethod paymentMethod = client.getPaymentMethod();
		paymentGateway.pay(amount, paymentMethod, this);
	}

	@Override
	public void call() {
		System.out.println("Lliurant les sabates.");
	}

}
