//Fabian Zarama
//109 599 744
//CSE 114
//Celsius to Fahrenheit lab#1

import java.util.Scanner;

public class C_to_F {
	public static void main(String[] args) {

		System.out.println("Celsius: ");
		Scanner input = new Scanner(System.in);
		double C = input.nextDouble();
		double F = (9.0 / 5) * C + 32;
		System.out.println("To Fahrenheit: " + F);
		// public static final int hi; Constant variable
		//command+shift+f = fixes the letters
		double price= 501;
		System.out.println(price/100+" dollars and "+price%100+" cents");
		int s = 20; 
		int t = s++ + --s;
		System.out.println(t);
		
	}
}
