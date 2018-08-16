package lab14;

public class Triangle {
	// - Three double data fields named side1, side2, and side3 with default
	// values 1.0
	// to denote three sides of the triangle.
	private double side1, side2, side3;
	private String color;
	private boolean fill;
	// - A no-arg constructor that creates a default triangle.
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
		color = "White";
	}

	// - A constructor that creates a triangle with the specified side1, side2,
	// and side3.
	public Triangle(double a, double b, double c) {
		side1 = a;
		side2 = b;
		side3 = c;
	}

	// - The accessor methods for all three data fields.
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// - A method named getArea() that returns the area of this triangle.
	public double getArea() {

		double s = 0;

		s = (side1 + side2 + side3) / 2;

		return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
	}

	// - A method named getPerimeter() that returns the perimeter of this
	// triangle.
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// - A method named toString() that returns a string description for the
	// triangle.
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	public void setColor(String  a) {
		this.color = a;
		}
	public String getColor(){
		return color;
	}
	public void setFill(boolean a){
		fill = a;
	}
	public boolean getFill(){
		return fill;
	}
	public static void main(String[] args) {
		/*
		 * Write a test program that creates a Triangle object with sides 1,
		 * 1.5, 1, sets color yellow and filled true, and displays the area,
		 * perimeter, color, and whether filled or not.
		 */
		Triangle tri = new Triangle(5,12, 13);
		tri.setColor("Yellow");
		tri.setFill(true);
		
		System.out.println(tri.getArea());
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getColor());
		System.out.println(tri.getFill());
	}
}


