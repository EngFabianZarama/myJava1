//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;
 

public class MyPoint {
	//- Two data fields x and y that represent the coordinates.
	private double x,y;
	
	//- A no-arg constructor that creates a point (0, 0).
	public MyPoint(){
		x=0;
		y=0;
	}
	
	//- A constructor that constructs a point with specified coordinates.
	public MyPoint(double a, double b){
		x=a;
		y=b;
	}
	
	//- Two get methods for data fields x and y, respectively.
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	//- A method named distance that returns the distance from this point to another point of the MyPoint type.
	public double distance(MyPoint a){
		return Math.sqrt(Math.pow((a.getX()-x),2) + Math.pow((a.getY()-y),2));
	}
	
	//- A method named distance that returns the distance from this point to another 
	//point with specified x and y-coordinates.
	public double distance(double x2, double y2){
		return Math.sqrt(Math.pow((x2-x),2) + Math.pow((y2-y),2));
	}
	
	
}
