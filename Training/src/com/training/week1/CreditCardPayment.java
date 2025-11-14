package com.training.week1;

public class CreditCardPayment extends OnlinePayment {
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment of "+amount);
	}

	@Override
	void authenticate() {
		// TODO Auto-generated method stub
		System.out.println("Credit card authentication is done");
		
	}

}
