//(Using the &&, || and ^ operators) Write a program that prompts the user 
//to enter an integer and determines whether it is divisible by 5 and 6, 
//whether it is divisible by 5 or 6, and whether it is divisible by 5 and 6, but not both. 
//For example, if your input is 10, the output should be
//Is 10 divisible by 5 and 6? false
//Is 10 divisible by 5 or 6? true

package Lab_Programs;

import java.util.Scanner;

public class DivisibleBy5or6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean and5_6, or5_6;

		System.out.print("Enter an integer: ");
		int value = input.nextInt();

		if (((value % 5) == 0) && ((value % 6) == 0)) {
			and5_6 = true;
		} else {
			and5_6 = false;
		}
		
		if (((value % 5) == 0) ^ ((value % 6) == 0)) {
			or5_6 = true;
		} else {
			or5_6 = false;
		}
		
		System.out.println("Is " + value + " divisible by 5 and 6? " + and5_6);
		System.out.print("Is " + value + " divisible by 5 or 6? " + or5_6);
	}
}
