package lab20;

public class Circle extends GeometricObject {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return radius * Math.PI * 2;
	}

	public double getRadius() {
		return radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	

	
}