package sef.module6.activity;

public class Rectangle extends Shape {

	private double length;
	private double breadth;
	 
	Rectangle() { //implicitly public
		//length = 0;
		//breadth = 0;
	}
	
	public Rectangle (double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double calculateArea() { //
		double area = length * breadth;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		
		return 2*(length + breadth);
	}
	
}
