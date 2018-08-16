//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;
//Write a test program TestMyPoint.java that creates two points (0, 0) and (10, 30.5) and displays the distance between them.
import java.util.Scanner;
public class TestMyPoint {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	MyPoint uno = new MyPoint(0,0);
	MyPoint dos = new MyPoint(10,30.5);
	
		System.out.println("uno.distance(dos): "+uno.distance(dos));
		System.out.println("uno.distance(10,30.5): "+uno.distance(10,30.5));
	}
}
