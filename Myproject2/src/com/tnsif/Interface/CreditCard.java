package com.tnsif.Interface;

public class CreditCard implements Payment {
	private String cardNo;

	public CreditCard(String cardNo) {
		
		this.cardNo = cardNo;
	}

	
	public void process(double amt) {
		System.out.println("Processing credit card payment of Rs. "+amt+" using Credit Card No.: "+cardNo);
		
	}
}


	