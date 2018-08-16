//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;
import java.util.Scanner;

public class TestMyInteger {
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

			System.out.printf("MyInteger obj0 = new MyInteger(%d);\n", MyInteger.parseInt(val));
			MyInteger obj0 = new MyInteger(MyInteger.parseInt(val));
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

			System.out.println("MyInteger.isEven(" + val + ") = " + MyInteger.isEven(MyInteger.parseInt(val)));
			System.out.println("MyInteger.isOdd(" + val + ") = " + MyInteger.isOdd(MyInteger.parseInt(val)));
			System.out.println("MyInteger.isPrime(" + val + ") = " + MyInteger.isPrime(MyInteger.parseInt(val)));

		}

		while (true) {
			System.out.print(
					"Enter a positive integer to test static isXXX(MyInteger) methods or <enter> to move on to next part of program:");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.printf("MyInteger obj1 = new MyInteger(%d);\n", MyInteger.parseInt(val));
			MyInteger obj1 = new MyInteger(MyInteger.parseInt(val));
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

			System.out.printf("MyInteger obj2 = new MyInteger(%d);\n", MyInteger.parseInt(val));
			MyInteger obj2 = new MyInteger(MyInteger.parseInt(val));
			System.out.println("obj2.getValue() = " + obj2.getValue());

			String val2 = "";
			System.out.print("Enter a the second of two positive integers to test obj2.equals(int):");
			val2 = input.next();

			System.out.println("Obj2.equals(" + val2 + ") = " + obj2.equals(MyInteger.parseInt(val2)));
		}

		while (true) {
			System.out.print(
					"Enter a the first of two positive integers to create obj2 and test obj2.equals (MyInteger obj3) or <enter> to move on to next part of program:");
			val = input.nextLine();

			if (val.equals("")) {
				break;
			}

			System.out.printf("MyInteger obj2 = new MyInteger(%d);\n", MyInteger.parseInt(val));
			MyInteger obj2 = new MyInteger(MyInteger.parseInt(val));
			System.out.println("obj2.getValue() = " + obj2.getValue());

			String val3 = "";
			System.out.print(
					"Enter a the second of two positive integers to create obj3 and test obj2.equals(MyInteger obj3):");
			val3 = input.next();

			System.out.printf("MyInteger obj3 = new MyInteger(%d);\n", MyInteger.parseInt(val3));
			MyInteger obj3 = new MyInteger(MyInteger.parseInt(val3));
			System.out.println("obj3.getValue() = " + obj3.getValue());
			System.out.println("obj2.equals (obj3) = " + obj2.equals(obj3));

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
