package Patterns;

import java.util.*;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n = sc.nextInt();
//		Enter the no: 
//		5
//		 * * * * *
//		 * * * *
//		 * * *
//		 * *
//		 *
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		sc.close();

	}

}
