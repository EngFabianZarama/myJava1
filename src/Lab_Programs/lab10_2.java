package Lab_Programs;

import java.util.Scanner;

public class lab10_2 {
	public static void printTicTacToe(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
				if (j == 2) {
					System.out.println("");
				}
			}
		}
	}

	public static void findRows(int[][] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2]) {
				if (arr[i][0] == 0) {
					System.out.println("All 0's on row " + i);
				} else {
					System.out.println("All 1's on row " + i);
				}
			}
		}
	}

	public static void findCol(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[0][i] == arr[1][i] && arr[0][i] == arr[2][i]) {
				if (arr[0][i] == 0) {
					System.out.println("All 0's on column " + i);
				} else {
					System.out.println("All 1's on column " + i);
				}
			}
		}
	}
	
	public static void findDiag(int[][] arr){
		if(arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2]){
			if(arr[0][0]==0){
				System.out.println("All 0's on diagonal 1");
			}else{
				System.out.println("All 1's on diagonal 1");
			}
		}
		
		if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0]){
			if(arr[0][2]==0){
				System.out.println("All 0's on diagonal 2");
			}else{
				System.out.println("All 1's on diagonal 2");
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) Math.round(Math.random());

			}
		}

		printTicTacToe(arr);
		findRows(arr);
		findCol(arr);
		findDiag(arr);
	}
}
