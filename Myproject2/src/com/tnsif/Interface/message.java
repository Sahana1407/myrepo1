package com.tnsif.Interface;

public class message {
	public static void main(String[] args) {
		  Payment creditcard = new CreditCard("123456");
			creditcard.process(2000);
			
			Payment upi = new UPI("123456@ybl");
			upi.process(1000);
			
			Payment debitcard = new DebitCard("234561762");
			debitcard.process(3000);

		}	 

	

}
