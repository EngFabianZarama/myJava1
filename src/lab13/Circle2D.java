package lab13;

public class Circle2D {
	// - Two double data fields named x and y that specify the center of the
	// circle with getter methods.
	private double x, y;

	// - A data field radius with a getter method.
	private double radius;

	public double getRadius() {
		return radius;
	}

	// - A no-arg constructor that creates a default circle with (0, 0) for (x,
	// y) and 1 for radius.
	public Circle2D() {
		x = 0;
		y = 0;
		radius = 0;
	}

	// - A constructor that creates a circle with the specified x, y, and
	// radius.
	public Circle2D(double a, double b, double c){
		x=a;
		y=b;
		radius=c;
	}
	
	//- A method getArea() that returns the area of the circle.
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	//- A method getPerimeter() that returns the perimeter of the circle.
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	//- A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle.
	public boolean contains(double x, double y){
		if(x<0){
			x*=-1;
		}
		if(y<0){
			y*=-1;
		}
		
		if (x>radius || y > radius){
			return false;
		}else{
			return true;
		}
	}
	
	//- A method contains(Circle2D circle) that returns true if the specified circle is inside this circle.
	public boolean contains(Circle2D circle){
		if(circle.getRadius()>radius || circle.getArea()>this.getArea()){
			return false;
		}else {
			return true;
		}
	}
	
	//- A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle.
	public boolean overlaps(Circle2D circle){
		if(circle.getRadius()>radius || circle.getArea()>this.getArea()){
			return true;
		}else{
			return false;
		}
	}
	
}
