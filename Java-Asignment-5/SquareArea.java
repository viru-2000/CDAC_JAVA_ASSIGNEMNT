package javaassignment5;
//2.    Create a class to print the area of a square and a rectangle.
//The class has two methods �printArea� and �printPerimeter� with the same name
//but different number of parameters. The method for printing area of
//Rectangle has two parameters which are length and breadth 
//respectively while the other method for printing area of square has one
//parameter which is side of square.

public class SquareArea {
	protected int length;
	
	public int printArea(int length) {
		this.length=length;
		
		return (length*length);
	}
	public int printPerimeter(int length) {
		this.length=length;
	
		return (4*length);
	}
	
}
