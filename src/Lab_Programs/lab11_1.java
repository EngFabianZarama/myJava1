package Lab_Programs;

import java.io.IOException;
import java.util.Scanner;

public class lab11_1 {

	public static void printTicTacToe(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
				if (j == 2) {
					System.out.println("");
				}
			}
		}
	}

	public static void emptyBoard(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = '*';
			}
		}
	}

	public static void assignX(char[][] arr, int row, int col) {
		arr[row][col] = 'X';
	}

	public static void assignO(char[][] arr, int row, int col) {
		arr[row][col] = 'O';
	}

	public static char findRows(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2]) {
				if (arr[i][0] == 'x' || arr[i][0] == 'X') {
					return 'x';
				} else if (arr[i][0] == 'o' || arr[i][0] == 'O') {
					return 'o';
				}
			}
		}
		return 'z';
	}

	public static char findCol(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[0][i] == arr[1][i] && arr[0][i] == arr[2][i]) {
				if (arr[0][i] == 'x' || arr[0][i] == 'X') {
					return 'x';
				} else if (arr[0][i] == 'o' || arr[0][i] == 'O') {
					return 'o';
				}
			}
		}
		return 'z';
	}

	public static char findDiag(char[][] arr) {
		if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]) {
			if (arr[0][0] == 'x' || arr[0][0] == 'X') {
				return 'x';
			} else if (arr[0][0] == 'o' || arr[0][0] == 'O') {
				return 'o';
			}
		}

		if (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0]) {
			if (arr[0][2] == 'x' || arr[0][2] == 'X') {
				return 'x';
			} else if (arr[0][2] == 'x' || arr[0][2] == 'X') {
				return 'o';
			}
		}
		return 'z';
	}

	public static boolean findWinner(char[][] arr) {
		// Winner by row
		if (findRows(arr) == 'x') {
			System.out.print("The winnwer is player one!");
			System.exit(0);
			return true;
		} else if (findRows(arr) == 'o') {
			System.out.print("The winnwer is player two!");
			System.exit(0);
			return true;
		}
		// Winner by column
		if (findCol(arr) == 'x') {
			System.out.print("The winnwer is player one!");
			System.exit(0);
			return true;
		} else if (findCol(arr) == 'o') {
			System.out.print("The winnwer is player two!");
			System.exit(0);
			return true;
		}
		// Winner by diagonal
		if (findDiag(arr) == 'x') {
			System.out.print("The winnwer is player one!");
			System.exit(0);
			return true;
		} else if (findDiag(arr) == 'o') {
			System.out.print("The winnwer is player two!");
			System.exit(0);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[][] board = new char[3][3];
		emptyBoard(board);
		printTicTacToe(board);
		boolean end = false;

		while (end == false) {
			System.out.println("First player (X)");
			System.out.print("Row: ");
			int rowX = input.nextInt();
			System.out.print("Column: ");
			int colX = input.nextInt();

			assignX(board, rowX, colX);
			printTicTacToe(board);
			end = findWinner(board);
			System.out.print("\n");
			System.out.println("Second player (O)");
			System.out.print("Row: ");
			int rowO = input.nextInt();
			System.out.print("Column: ");
			int colO = input.nextInt();

			assignO(board, rowO, colO);
			printTicTacToe(board);
			end = findWinner(board);
		}
	}

}
