package com.training.week1;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardPayment p=new CreditCardPayment();
		p.authenticate();
		p.pay(1000);
		
		UPIPayment p1=new UPIPayment();
		p1.authenticate();
		p1.pay(1000);

	}

}
