package midterm_2;

import java.util.Scanner;

public class MultidimensionalArrays {
	public static double sumColumn(double[][] m, int c) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][c];
		}
		return sum;
	}

	public static void main1(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("dimension n: ");
		int dim = input.nextInt();

		double[][] arr = new double[dim][dim];

		for (int i = 0; i < dim; i++) {
			System.out.print("enter row #" + i + ": ");
			for (int j = 0; j < dim; j++) {
				arr[i][j] = input.nextDouble();
			}
		}

		System.out.println(sumColumn(arr, 1));
	}

	public static int[][] madeBoard() {
		int[][] arr = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = (int) (Math.random() * 2);
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2]);
		}
		return arr;
	}

	public static void tictac() {
		int[][] arr = madeBoard();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[0][0] == 0 && arr[0][1] == 0 && arr[0][2] == 0) {
					System.out.println("Row 0, all 0s");
					i=10;
					break;
				}else if(arr[1][0] == 0 && arr[1][1] == 0 && arr[1][2] == 0){
					System.out.println("Row 1, all 0s");
					i=10;
					break;
				}else if(arr[2][0] == 0 && arr[2][1] == 0 && arr[2][2] == 0){
					System.out.println("Row 2, all 0s");
					i=10;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		tictac();
	}
}
