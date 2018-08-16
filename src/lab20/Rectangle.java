package lab20;

public class Rectangle extends GeometricObject {
	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeigth(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	

	
}
