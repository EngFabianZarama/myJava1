package recursion;

import java.util.Scanner;

public class Project2 {
	public static void reverseDisplay(int value) {
		if (value <= 0)
			return;
		System.out.print(value % 10);
		reverseDisplay(value / 10);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter an integer to be reversed or hit enter to end program:");
			String val = input.nextLine();
			if (!(val.equals(""))) {
				System.out.print("The reverse of " + val + " is ");
				reverseDisplay(Integer.parseInt(val));
				System.out.print("\n");
			} else {
				System.exit(0);
			}
		}

	}
}
