package javaassignment5;

public class BankA {
	protected double amount;
	protected  double balance;
	protected static double Interestrate=0.05;
	public BankA() {
		amount=0.0;
		balance=0.0;
	}
	
	public BankA(double amount) {
		
		this.amount = amount;
		
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double  applayInterest() {
		balance=amount*Interestrate;
		balance=balance+amount;
		return balance;
	}
	
	
}
