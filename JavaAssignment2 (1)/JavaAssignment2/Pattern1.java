package Patterns;

import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=sc.nextInt();
//		for(int i=0;i<=5;i++) {
//			int n=5;
//			for(int j=1;j<=5-i;j++) {
//				System.out.print(" "+n);
//				n--;
//			}
//			
//			System.out.println();
//			
//		}
		
//		� 1 2 3 4
//		� 1 2 3 4
//		� 1 2 3 4
//		� 1 2 3 4
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
