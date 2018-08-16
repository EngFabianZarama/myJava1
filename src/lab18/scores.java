package lab18;

import java.util.Scanner;
import java.io.*;

public class scores {
	public static void main(String[] args) {

		File filename = new File(args[0]);

		// Reading input file
		int[] arr = new int[1000];
		int i=0;
		try {
			Scanner input = new Scanner(filename);
			while (input.hasNextInt()) {
				arr[i] = input.nextInt();
				i++;
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problem with input file");
		}
		
		int sum = 0;
		for (int d : arr) sum += d;
		
		System.out.println((double)(sum)/i);
		
	}
}
