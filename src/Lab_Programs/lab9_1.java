package Lab_Programs;
//(Printing distinct numbers) Write a program that reads in ten numbers 
//and displays distinct numbers (i.e., if a number appears multiple times, it is displayed only once). 
//Hint: Read a number and store it to an array if it is new. If the number is already in the array, discard it. 
//After the input, the array contains the distinct numbers.
import java.util.Scanner;
public class lab9_1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

			double[] arr = new double[20];

			System.out.print("Enter 20 ints: ");

			for (int i = 0; i < arr.length; i++) {
				arr[i] = input.nextDouble();
			}

			for (int i = 0; i < arr.length; i++) {
				int j;
				for (j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						break;
					}
				}
				if (i == j) {
					System.out.println(arr[i]);
				}
			}
		
	}

}
