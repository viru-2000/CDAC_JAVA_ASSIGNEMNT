//Assignment 2: Exam Grading System
//Write a program that determines whether a student passes an exam based on three subjects. 
//A student passes if the average score is at least 60, and none of the individual scores is below 40.
//Requirements:
//•    Use logical operators && and || to combine conditions.



package JAVAAssignament26;
import java.util.*;

public class ExamGuardingSystem {

		private int sub1,sub2,sub3;
		private double avg;
		
		Scanner sc = new Scanner(System.in);
		void set() {
			System.out.println("Enter the sub1, sub2 and sub3");
			sub1=sc.nextInt();
			sub2=sc.nextInt();
			sub3=sc.nextInt();
			avg=(sub1+sub2+sub3)/3;
		
		}
		void check() {
			if(avg>=60 && sub1 >=40&&sub2>=40&&sub3>=40) {
				System.out.println("student is passed");
			}else {
				System.out.println("student failed");
			}
		}

		public static void main(String[] args) {
			ExamGuardingSystem e = new ExamGuardingSystem();
			e.set();
			e.check();
			
		
		}

	}
