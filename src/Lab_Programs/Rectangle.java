package Lab_Programs;

public class Rectangle {
	//Two double data fields named width and height that specify the width and height of the rectangle. 
	//The default values are 1 for both width and height.
	
	//A string data field named color that specifies the color of a rectangle. 
	//Hypothetically, assume that all rectangles have the same color. The default color is white.
	
	
	private double width;
	private double height;
	private String color;
	
	//A no-arg constructor that creates a default rectangle.
	Rectangle(){
		width=1;
		height=1;
		color="white";
	}
	
	//A constructor that creates a rectangle with the specified width and height.
	Rectangle(double inWidth, double inHeight){
		width = inWidth;
		height = inHeight;
	}
	
	//The accessor and mutator methods for all three data fields.
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
	public String getColor(){
		return color;
	}
	
	public void setWidth(int inWidth){
		width=inWidth;
	}
	
	public void setHeight(int inHeight){
		height = inHeight;
	}
	
	public void setColor(String inColor){
		color = inColor;
	}

	//A method named getArea() that returns the area of this rectangle.
	public double getArea(){
		return width * height;
	}
	
	//A method named getPerimeter() that returns the perimeter.
	public double getPerimeter(){
		return 2*(width+height);
	}
}
