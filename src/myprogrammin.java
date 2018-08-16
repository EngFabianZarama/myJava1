
//import java.util.Arrays;
import java.util.Scanner;
class myprogrammin {
public static class Rectangle {

	private static double width = 1;
	private static double height = 1;

	public Rectangle() {
		width = 1;
		height = 1;
	}

	public Rectangle(double a, double b) {
		width = a;
		height = b;
	}

	// A method named getArea() that returns the area of this rectangle.
	public double getArea() {
		return width * height;
	}

	// A method named getPerimeter() that returns the perimeter.
	public double getPerimeter() {
		return (width + height) * 2;
	}
	public String print() {
		// Prints output to two decimals.
        String output = "The area of a "+ width +" x "+height+" Rectangle is " + getArea() +"\n"+
        				"The perimeter of a "+ width +" x "+height+" Rectangle is " + getPerimeter();
		
        return output;
    }
}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle(4,40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		
		System.out.print(rec1.print());
		System.out.print(rec2.print());

		
	}

}



