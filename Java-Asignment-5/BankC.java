package javaassignment5;

public class BankC extends BankA {
	
	public double applayInterest() {

		balance = amount * (0.04 + Interestrate);
		balance = balance + amount;
		return balance;

	}
}
