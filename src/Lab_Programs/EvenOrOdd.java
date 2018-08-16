//(Checking whether a number is even or odd) Write a program that reads an 
//integer and checks whether it is even or odd. For example, if your input is 25, the output should be:
//Is 25 an even number? false

package Lab_Programs;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean TorF;

		System.out.print("Interger: ");
		int value = input.nextInt();

		if ((value % 2 == 0)) {
			TorF = true;
		}else{
			TorF = false;
		}

		System.out.print("Is " + value + " an even number? " + TorF);

	}

}
