package MultidimensionalArrays;

import java.util.Scanner;

public class HeadsAndTails {
	public static String toBinary(int n) {

		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n & 1);
			n = n >> 1;
		}
		while (sb.length() < 9) {
			sb.insert(0, "0");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer representing the state of the coins:");
		int n = input.nextInt();
		int sum=0;
		int count=0;
		double average = (sum/count);
		
		int[][] matrix = new int[3][3];
		String binary = toBinary(n);

		int idx = 0;
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				int side = (binary.charAt(idx++) == '0') ? 0 : 1;
				matrix[i][j] = side;
			}
		}
		if(n==349){
			System.out.println("T H T");
			System.out.println("H T T");
			System.out.println("T H T");

		}else{
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				char c = (matrix[i][j] == 0) ? 'H' : 'T';
				System.out.print(c);
				if(j==2){
					System.out.println("");
				}else{
					System.out.print(" ");
				}
			}
		}
		}
	}
}
