
package Lab_Programs;
//Write a method to display a pattern as follows:
//1
//2 1
//3 2 1
//...
//n n-1 ... 3 2 1
//Note: Define a method to print the pattern above for any number n. 
import java.util.Scanner;
public class lab8_1 {
	public static void makeTriangle(int a){
		
		for (int i = a; i >= 1; i--) {
			for (int j = a; j >= i; j--) {
				System.out.print(j - i + 1 + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter n: ");
		int value = input.nextInt();
		
		makeTriangle(value);
	}
}
