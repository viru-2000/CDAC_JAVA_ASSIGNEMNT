package Patterns;
import java.util.*;
public class Pattern8 {
//	Enter the num: 4
//	    * 
//    * * 
//  * * * 
//* * * * 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star;j++) {
				System.out.print("* ");
			}
			space--;
			star++;
			System.out.println();
		}
		sc.close();

	}

}
