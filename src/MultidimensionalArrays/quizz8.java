package MultidimensionalArrays;

import java.util.Scanner;

public class quizz8 {
	public static void main(String[] args) {
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
