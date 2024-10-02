package javaassignment5;
//1.    Bob has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
//Create a class 'Bank' with a method 'getBalance' which returns 0 and another method ‘applyInterest’ which return the accountbalance. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. Override the method ‘applyInterest’ by adding the interest calculated with the Bank’s interest rate (Static variable for the Bank class). Call the method 'getBalance' and ‘applyInterest’ by the
//Object of each of the three banks.
public class TestBank {

	public static void main(String[] args) {
		BankA banka=new BankA();
		banka.setAmount(1000);
		System.out.println("BankA balance is: "+banka.applayInterest());
		
		System.out.println("---------------------------");
		
		BankB bankb = new BankB();
		bankb.setAmount(1500);
		System.out.println("BankB balance is: "+bankb.applayInterest());
		
		System.out.println("---------------------------");
		
		BankC bankc = new BankC();
		bankc.setAmount(2000);
		System.out.println("BankB balance is: "+bankc.applayInterest());
	}

}
