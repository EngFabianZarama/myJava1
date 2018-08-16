package midterm_2;

public class Triangle extends GeometricObject{
	//Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
	private double side1=1, side2=1, side3=1;
	
	//• A no-arg constructor that creates a default triangle.
	public Triangle(){
		side1=1;
		side2=1;
		side3=1;
	}
	
	//• A constructor that creates a triangle with the specified side1, side2, and side3.
	public Triangle(double a, double b, double c){
		side1=a;
		side2=b;
		side3=c;
	}
	
	//• The accessor methods for all three data fields.
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	//• A method named getArea() that returns the area of this triangle.
	public double getArea(){
		double s = (side1+side2+side3)/2;
		return Math.sqrt(s+(s-side1)+(s-side2)+(s-side3));
	}
	
	//• A method named getPerimeter() that returns the perimeter of this triangle.
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	//• A method named toString() that returns a string description for the triangle.
	public String toString(){
		return "\nside1: "+side1+", side2: "+side2+", side3"+side3+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
	}
}
