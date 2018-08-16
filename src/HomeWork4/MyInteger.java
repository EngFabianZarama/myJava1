//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;

public class MyInteger {

	// An int data field named value that stores the int value represented by
	// this object .
	private int value;

	// A constructor that creates a MyInteger object for the specified int
	// value.
	public MyInteger(int a) {
		value = a;
	}

	// A get method that returns the int value .
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
		if (value == 1 || value == 0)
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

	// A static method parseInt(String ) that converts a string into an int
	// value .
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}

}
