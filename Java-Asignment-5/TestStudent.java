package javaassignment5;
import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		int age;
		String name;
		String add;
		
		Student arr[]=new Student[2];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the student info: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Student();
			
			System.out.print("Enter the name: ");
			name=sc.next();
			System.out.print("Enter age: ");
			age=sc.nextInt();
			System.out.print("Enter the address: ");
			add=sc.next();
			
			arr[i].setInfo(name, age, add);
		}
		
		System.out.println("\nName \tAge \tAddress");
		for(int i=0;i<arr.length;i++) {
			arr[i].display();
		}
		
		sc.close();
	}

}
