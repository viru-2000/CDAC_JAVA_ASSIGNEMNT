package assignment6;

abstract public class GeometricShape {

	abstract public void area();

	abstract public void perimeter();

}

class Circle extends GeometricShape {
	private double radius;
	private final double PI = 3.14;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("The area of circle is " + (PI * radius * radius));

	}

	@Override
	public void perimeter() {
		System.out.println("The perimeter of circle is " + (2 * PI * radius));

	}

}

class Rectangle extends GeometricShape {
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("The area of rectangle is " + (length * breadth));

	}

	@Override
	public void perimeter() {
		System.out.println("The perimeter of rectangle is " + (length + breadth));

	}

}

class Triangle extends GeometricShape {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void area() {
		System.out.println("The area of rectangle is " + (0.5 * a * b));

	}

	@Override
	public void perimeter() {
		System.out.println("The perimeter of rectangle is " + (a + b + c));

	}

}