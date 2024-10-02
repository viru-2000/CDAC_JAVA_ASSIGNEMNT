package javaassignment5;

public class Area {

	public static void main(String[] args) {
		RectangleArea area=new RectangleArea();
		System.out.println("Area of square is: "+area.printArea(6));
		System.out.println("Perimete of square is: "+area.printPerimeter(7));
		System.out.println("--------------------");
		System.out.println("Area of rectangle is: "+area.printArea(6, 5));
		System.out.println("Perimete of rectangle is: "+area.printPerimeter(7, 9));
		

	}

}
