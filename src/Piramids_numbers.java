import java.util.Scanner;

public class Piramids_numbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer to be a limit of the pattern:");
		int value = input.nextInt();

		System.out.println("Pattern A:");
		
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	
		System.out.print("\n");
		System.out.println("Pattern B:");
		for (int i = value; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		System.out.println("Pattern C:");

		for (int i = value; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = value; j >= i; j--) {
				System.out.print(j - i + 1 + " ");
			}
			System.out.println();
		}

		System.out.print("\n");
		System.out.println("Pattern D:");

		for (int i = 1; i <= value; i++){
			for (int j = 1; j < i; j++){
				System.out.print("  "); 
			}
			for (int j = i; j <= value; j++){
				System.out.print(j - i + 1 + " "); 
			}
			System.out.println();
		}

	}
}