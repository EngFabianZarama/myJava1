package Lab_Programs;
//Write the following method to display an integer in reverse order with the following method signature: 
//public static void reverse(int number)
import java.util.Scanner;
public class lab8_2 {
	public static void reverseInt(int a){
		while(a!=0){
		System.out.print(a%10);
		a/=10;
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter integer: ");
		int value = input.nextInt();
		
		reverseInt(value);
	}
}
