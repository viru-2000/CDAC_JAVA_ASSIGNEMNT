package Patterns;

import java.util.Scanner;

//Enter the num: 5
//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
