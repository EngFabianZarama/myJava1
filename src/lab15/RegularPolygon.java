package lab15;

public class RegularPolygon extends GeometricObject{

	//- A private int data field named n that defines the number of sides in the polygon with default value 3.
	private int n;
	//- A private double data field named side that stores the length of the side with default value 1.
	private double side;
	//- A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
	private double x;
	//- A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
	private double y;
	//- A no-arg constructor that creates a regular polygon with default values.
	public RegularPolygon(){
		n=3;
		side=1;
		x=0;
		y=0;
	}
	//- A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
	public RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
	}
	//- A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
	public RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	//- The accessor and mutator methods for all data fields.
	public int getN(){
		return n;
	}
	
	public double getSide(){
		return side;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setN(int n){
		this.n = n;
	}
	
	public void setSide(double side){
		this.side = side;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	//- The method getPerimeter() that returns the perimeter of the polygon.
	@Override
	public double getPerimeter() {
		return getSide()*getN();
	}
	
	//- The method getArea() that returns the area of the polygon as a double. 
	//See this page for a simple formula: http://www.wikihow.com/Find-the-Area-of-Regular-Polygons
	@Override
	public double getArea() {
		double a = getSide()/(2*Math.tan(180/n));
		return (a*getPerimeter())/2;
	}

	

}
