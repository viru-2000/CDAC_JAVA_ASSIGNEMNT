package Patterns;
import java.util.*;
public class Pattern18 {
//	Enter the no: 
//		5
//		* * * * * 
//		*       * 
//		*       * 
//		*       * 
//		* * * * * 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
		
	}

}
