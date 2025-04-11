package com.tnsif.Interface;

public class DebitCard  implements Payment {
	private String cardNo;

	public DebitCard(String cardNo) {
		
		this.cardNo = cardNo;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing debit card payment of Rs. "+amt+" using Debit Card No.: "+cardNo);
		
	}
	

	

}
