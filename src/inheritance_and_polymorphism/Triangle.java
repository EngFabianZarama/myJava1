package inheritance_and_polymorphism;

import java.util.Scanner;

public class Triangle extends GeometricObject {

	private double side1, side2, side3;

	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	public Triangle(double a, double b, double c) {
		side1 = a;
		side2 = b;
		side3 = c;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {

		double s = 0;

		s = (side1 + side2 + side3) / 2;

		return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter side 1 of triangle:");
		double s1 = input.nextDouble();
		System.out.print("Enter side 2 of triangle:");
		double s2 = input.nextDouble();
		System.out.print("Enter side 3 of triangle:");
		double s3 = input.nextDouble();
		System.out.print("Enter color of triangle:");
		String col = input.next();
		System.out.print("Enter whether triangle is filled (yes/no):");
		String yn = input.next();
		boolean fill;
		if (yn.equals("yes"))
			fill = true;
		else
			fill = false;

		Triangle tri = new Triangle(s1, s2, s3);
		GeometricObject a = null;
		tri.setFilled(fill);
		tri.setColor(col);
		

		System.out.println("Area: " + tri.getArea());
		System.out.println("Perimeter: " + tri.getPerimeter());
		System.out.println("Color: " + tri.getColor());
		System.out.println("Filled?: " + tri.isFilled());

	}
}



