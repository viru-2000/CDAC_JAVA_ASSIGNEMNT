package assignment6;

public class Person {
	private final String name = "Bhooolaaa";
	private final int age = 24;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person person = new Person();
//		person.set
		System.out.println(person);
		System.out.println("===============================");
		Person person2 = new Person();
//		person2.set
		System.out.println(person2);
	}

}