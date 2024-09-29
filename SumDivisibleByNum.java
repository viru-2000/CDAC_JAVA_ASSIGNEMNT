//6.    Program to check Harshad number or not using Java
//Hint: - Harshad number is a number or an integer in base 10 which is 
//completely divisible by sum of its digits.
//Example: Suppose a number 24. Calculate the sum of digits of the number   
//(2 + 4) = 6 .Check whether the number entered by user is completely divisible by
//sum of its digits or not.
package Assignment3;
import java.util.Scanner;
public class SumDivisibleByNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number = ");
		int m = sc.nextInt();
		int n =m;
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		if(m%sum==0) {
			System.out.println(m +" is Divisible By its sum ");
		}
		else {
			System.out.println("Number is Not Divisible By its sum");
		}
	}

}
