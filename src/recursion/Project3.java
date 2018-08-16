package recursion;

import java.util.Scanner;

public class Project3 {
	private static String dec2Hex(int number) {
		if(number==0){
			return "";
		}
		if (number < 16)
			return getHexFormat(number);
		else
			return dec2Hex(number / 16) + getHexFormat(number % 16);
	}

	private static String getHexFormat(int n) {

		if (n > 9 && n < 16)
			return (char) (n - 10 + 'A') + "";
		if (n >= 0)
			return n + "";
		else
			return "INVALID";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
		System.out.print("Enter an integer to be converted to hex or hit enter to end program:");

		String val = input.nextLine();
			if (!(val.equals(""))) {
				System.out.print("The hex equivalent of " + val + " is " + dec2Hex(Integer.parseInt(val)));

				System.out.print("\n");
			} else {
				System.exit(0);
			}
		}

	}
}
