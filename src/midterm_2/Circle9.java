package midterm_2;

public class Circle9 extends GeometricObject {
	/** Default constructor */
	public Circle9() {
		this(1.0);
		System.out.print("C");
	}

	/** Construct circle with a specified radius */
	public Circle9(double radius) {
		this(radius, "white", false);
		System.out.print("D");
	}

	/** Construct a circle with specified radius, filled, and color */
	public Circle9(double radius, String color, boolean filled) {
		super(color, filled);
		System.out.print("E");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
