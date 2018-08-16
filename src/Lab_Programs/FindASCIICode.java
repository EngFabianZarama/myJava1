//(Finding the character of an ASCII code) Write a program that receives an ASCII code 
//(an integer between 0 and 127) and displays its character. For example, if the user enters 97, 
//the program displays character a.

package Lab_Programs;
import java.util.Scanner;

public class FindASCIICode {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("ASCII code (0 - 127): ");
		char s = (char)input.nextInt();
		
		System.out.print(s);
		
	}
}
