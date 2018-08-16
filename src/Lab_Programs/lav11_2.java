package Lab_Programs;

import java.util.Scanner;

public class lav11_2 {
	public static void printBoard(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
				if (j == 7) {
					System.out.println("");
				}
			}
		}
	}

	public static void findRows(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2] && arr[i][0] == arr[i][3] && arr[i][0] == arr[i][4] && arr[i][0] == arr[i][5] && arr[i][0] == arr[i][6] && arr[i][0] == arr[i][7]) {
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
			if (arr[0][i] == arr[1][i] && arr[0][i] == arr[2][i] && arr[0][i] == arr[3][i] && arr[0][i] == arr[4][i] && arr[0][i] == arr[5][i] && arr[0][i] == arr[6][i] && arr[0][i] == arr[7][i]){
				if (arr[0][i] == 0) {
					System.out.println("All 0's on column " + i);
				} else {
					System.out.println("All 1's on column " + i);
				}
			}
		}
	}

	public static void findDiag(int[][] arr) {
		if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2] && arr[0][0] == arr[3][3] && arr[0][0] == arr[4][4] && arr[0][0] == arr[5][5] && arr[0][0] == arr[6][6] && arr[0][0] == arr[7][7]) {
			if (arr[0][0] == 0) {
				System.out.println("All 0's on diagonal 1");
			} else {
				System.out.println("All 1's on diagonal 1");
			}
		}

		if (arr[0][7] == arr[1][6] && arr[0][7] == arr[2][5] && arr[0][7] == arr[3][4] && arr[0][7] == arr[4][3] && arr[0][7] == arr[5][2] && arr[0][7] == arr[6][1] && arr[0][7] == arr[7][0]) {
			if (arr[0][2] == 0) {
				System.out.println("All 0's on diagonal 2");
			} else {
				System.out.println("All 1's on diagonal 2");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] board = new int[8][8];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = (int) Math.round(Math.random());
			}
		}

		printBoard(board);
		findRows(board);
		findCol(board);
	}
}
