//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;
import java.util.Scanner;
public class TestComplex {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Complex uno = new Complex(0,10);
		Complex dos = new Complex(0,20);
		;
		
		System.out.println("a + b = " + uno.add(dos));
		System.out.println("a - b = " + uno.subtract(dos));
		System.out.println("a * b = " + uno.multiply(dos));
		System.out.println("a / b = " + uno.divide(dos));
	}
}
