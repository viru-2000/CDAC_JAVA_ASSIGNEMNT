package assignment6;

class A {

	static public void print() {
		System.out.println("It is the Parent class.");
	}
}

class B extends A {

	static public void print() {
		System.out.println("It is the child class.");
	}
}

public class MyClass1 {

	public static void main(String[] args) {
		A.print();
		System.out.println("==========================");
		B.print();
		System.out.println("==========================");

		A obj = new B();
		obj.print();

	}

}
