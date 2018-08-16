package Object_oriented_Thinking;

import java.util.Scanner;

public class MyInteger {
	// An int data field named value that stores the int value represented by
	// this object .
	private int value;

	// A constructor that creates a MyInteger object for the specified int value
	// .
	MyInteger(int a) {
		value = a;
	}

	// A getter method that returns the int value .
	public int getValue() {
		return value;
	}

	// The methods isEven(), isOdd(), and isPrime() that return true
	// if the value in this object is even, odd, or prime, respectively.
	public boolean isEven() {
		return (value % 2 == 0) ? true : false;
	}

	public boolean isOdd() {
		return (value % 2 != 0) ? true : false;
	}

	public boolean isPrime() {
		if (value == 1)
			return false;
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	// The static methods isEven(int ), isOdd(int ), and isPrime(int )
	// that return true if the specified value is even, odd, or prime,
	// respectively.
	public static boolean isEven(int a) {
		return (a % 2 == 0) ? true : false;
	}

	public static boolean isOdd(int a) {
		return (a % 2 != 0) ? true : false;
	}

	public static boolean isPrime(int a) {
		if (a == 1)
			return false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

	// The static methods isEven(MyInteger), isOdd(MyInteger), and
	// isPrime(MyInteger)
	// that return true if the specified value is even, odd,or prime,
	// respectively.
	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}

	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}

	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}

	// The methods equals (int ) and equals (MyInteger) that return true
	// if the value in this object is equal to the specified value .
	public boolean equals(int a) {
		return (a == value) ? true : false;
	}

	public boolean equals(MyInteger a) {
		return (a.value == value) ? true : false;
	}

	// A static method parseInt(char []) that converts
	// an array of numeric characters to an int value.
	public static int parseInt(char[] a) {
		int value = 0;
		for (int i = 0; i < a.length; i++) {
			value = (a[i] % 10);
			if (a[i] != 0) {

			}
			value += Character.getNumericValue(i);
		}
		return value;
	}

	// A static method parseInt(String ) that converts a string into an int
	// value .
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String val = "0";
		while (true) {

			System.out.print(
					"Enter a positive integer to create a MyInteger object or <enter> to move on to next part of program:");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.printf("MyInteger obj0 = new MyInteger(%d);\n", parseInt(val));
			MyInteger obj0 = new MyInteger(parseInt(val));
			System.out.println("obj0.getValue() = " + obj0.getValue());
			System.out.println("obj0.isEven() = " + obj0.isEven());
			System.out.println("obj0.isOdd() = " + obj0.isOdd());
			System.out.println("obj0.isPrime() = " + obj0.isPrime());
		}

		while (true) {

			System.out.print(
					"Enter a positive integer to test static isXXX(int) methods or <enter> to move on to next part of program:");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.println("MyInteger.isEven(" + val + ") = " + MyInteger.isEven(parseInt(val)));
			System.out.println("MyInteger.isOdd(" + val + ") = " + MyInteger.isOdd(parseInt(val)));
			System.out.println("MyInteger.isPrime(" + val + ") = " + MyInteger.isPrime(parseInt(val)));

		}

		while (true) {
			System.out.print(
					"Enter a positive integer to test static isXXX(MyInteger) methods or <enter> to move on to next part of program:");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.printf("MyInteger obj1 = new MyInteger(%d);\n", parseInt(val));
			MyInteger obj1 = new MyInteger(parseInt(val));
			System.out.println("obj1.getValue() = " + obj1.getValue());
			System.out.println("MyInteger.isEven(obj1) = " + MyInteger.isEven(obj1));
			System.out.println("MyInteger.isOdd(obj1) = " + MyInteger.isOdd(obj1));
			System.out.println("MyInteger.isPrime(obj1) = " + MyInteger.isPrime(obj1));
		}

		while (true) {
			System.out.print(
					"Enter a the first of two positive integers to create obj2 and test obj2.equals(int) or <enter> to move on to next part of program:");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.printf("MyInteger obj2 = new MyInteger(%d);\n", parseInt(val));
			MyInteger obj2 = new MyInteger(parseInt(val));
			System.out.println("obj2.getValue() = " + obj2.getValue());

			String val2 = "";
			System.out.print("Enter a the second of two positive integers to test obj2.equals(int):");
			val2 = input.next();

			System.out.println("Obj2.equals(" + val2 + ") = " + obj2.equals(parseInt(val2)));
		}

		while (true) {
			System.out.print(
					"Enter a the first of two positive integers to create obj2 and test obj2.equals (MyInteger obj3) or <enter> to move on to next part of program:");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.printf("MyInteger obj2 = new MyInteger(%d);\n", parseInt(val));
			MyInteger obj2 = new MyInteger(parseInt(val));
			System.out.println("obj2.getValue() = " + obj2.getValue());

			String val3 = "";
			System.out.print(
					"Enter a the second of two positive integers to create obj3 and test obj2.equals(MyInteger obj3):");
			val3 = input.next();

			System.out.printf("MyInteger obj3 = new MyInteger(%d);\n", parseInt(val3));
			MyInteger obj3 = new MyInteger(parseInt(val3));
			System.out.println("obj3.getValue() = " + obj3.getValue());
			System.out.println("obj2.equals (obj3) = " + obj2.equals(obj3));

		}

		while (true) {

			System.out.print(
					"Enter a positive integer  that will be placed into a char [] array  to demonstrate the MyInteger.parseInt(char []):");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.println("MyInteger obj4 = new MyInteger(MyInteger.parseInt(char  []);");

			MyInteger obj4 = new MyInteger(MyInteger.parseInt(val));
			System.out.println("obj4.getValue() = " + obj4.getValue());
			System.out.println("obj4.isEven() = " + obj4.isEven());
			System.out.println("obj4.isOdd() = " + obj4.isOdd());
			System.out.println("obj4.isPrime() = " + obj4.isPrime());

		}

		while (true) {
			System.out.print(
					"Enter a positive integer that will be placed into a String to demonstrate the MyInteger.parseInt(String):");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.println("MyInteger obj5 = new MyInteger(MyInteger.parseInt(String);");
			MyInteger obj5 = new MyInteger(MyInteger.parseInt(val));
			System.out.println("obj5.getValue() = " + obj5.getValue());
			System.out.println("obj5.isEven() = " + obj5.isEven());
			System.out.println("obj5.isOdd() = " + obj5.isOdd());
			System.out.println("obj5.isPrime() = " + obj5.isPrime());

		}
	}
}