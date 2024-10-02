package javaassignment5;

public class BankB extends BankA {

	public double  applayInterest() {
		
		balance=amount*(0.03+Interestrate);
		balance=balance+amount;
		return balance;
		
	}
	
	
}
