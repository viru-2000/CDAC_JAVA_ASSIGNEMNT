package javaassignment5;

public class RectangleArea extends SquareArea {
	private int breadth;
	
	public int printArea(int length, int breadth) {
		super.printArea(length);
		this.length=length;
		this.breadth=breadth;
		
		return (length*breadth);
	}
	public int printPerimeter(int length, int breadth) {
		super.printPerimeter(length);
		this.length=length;
		this.breadth=breadth;
		
		return (2*(length+breadth));
	}
}
