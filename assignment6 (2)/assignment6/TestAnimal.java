
package assignment6;

abstract class Animal {
	abstract public void sound();

	abstract public void move();
}

class Dog extends Animal {
	final int legs=4;
	
	@Override
	public void sound() {
		System.out.println("The dog barks...");
	}

	@Override
	public void move() {
		System.out.println("The dog moves with "+legs+" legs.");
	}
	
	public void classInfo() {
		System.out.println("The class has "+legs+" legs.");
	}

}

class Cat extends Animal {
	final int legs=4;
	
	@Override
	public void sound() {
		System.out.println("The cat meowssss...");
	}

	@Override
	public void move() {
		System.out.println("The cat moves with "+legs+" legs.");
	}
	
	public void classInfo() {
		System.out.println("The class has "+legs+" legs.");
	}

}

class Bird extends Animal {
	final int legs=2;
	final String name="sparrow";
	
	@Override
	public void sound() {
		System.out.println("The "+name+" chew...chew...chew...");
	}

	@Override
	public void move() {
		System.out.println("The "+name+ "moves with "+legs+" legs.");
	}
	
	public void classInfo() {
		System.out.println("The class has "+legs+" legs.");
	}

}


public class TestAnimal {

	public static void main(String[] args) {
		Dog dog= new Dog();
		dog.sound();
		dog.move();
		dog.classInfo();
		System.out.println("===============================");
		Cat cat= new Cat();
		cat.sound();
		cat.move();
		cat.classInfo();
		System.out.println("===============================");
		Bird bird= new Bird();
		bird.sound();
		bird.move();
		bird.classInfo();
	}

}
