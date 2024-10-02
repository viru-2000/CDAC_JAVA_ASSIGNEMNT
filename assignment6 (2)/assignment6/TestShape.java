package assignment6;

public class TestShape {

	public static void main(String[] args) {
		Circle circle = new Circle(22.5);
		circle.area();
		circle.perimeter();
		System.out.println("========================================");
		
		Rectangle rectangle= new Rectangle(10, 20);
		rectangle.area();
		rectangle.perimeter();
		System.out.println("========================================");
		
		Triangle triangle=new Triangle(50, 60, 70);
		triangle.area();
		triangle.perimeter();

	}

}