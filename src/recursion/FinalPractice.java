package recursion;

import java.util.Scanner;

public class FinalPractice {

	public static float factorial(int a) {
		if (a == 1) {
			return 1;
		}
		return a * factorial(a - 1);
	}

	public static long oddevenfact(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		if (n % 2 == 0) {
			return n * oddevenfact(n - 2);
		} else
			return n * oddevenfact(n - 2);
	}

	public static int Fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * pow(x, n - 1);
	}

	public static int count7(int n) {

		if (n % 10 == 7) {
			return 1 + count7(n / 10);
		} else
			return count7(n / 10);
	}

	public static int count8(int n) {
		if (n % 10 == n) {

			if (n == 8) {
				return 1;
			} else
				return 0;
		}

		if (n % 10 == 8) {
			if (n % 100 == 8) {
				return 2 + count8(n / 10);
			} else
				return 1 + count8(n / 10);
		}
		return count8(n / 10);

	}

	public static int countHi(String str) {
		if (str.equals("")) {
			return 0;
		}

		if (str.length() <= 2) {
			if (str.equals("hi")) {
				return 1;
			} else {
				return 0;
			}
		}

		if (str.charAt(str.length() - 1) == 'i' && str.charAt(str.length() - 2) == 'h') {
			return 1 + countHi(str.substring(0, str.length() - 2));
		} else {
			return countHi(str.substring(0, str.length() - 1));
		}
	}

	public String changeXY(String str) {
		if (str.equals("")) {
			return "";
		} else if (str.length() == 1) {
			if (str.charAt(0) == 'x') {
				return "y";
			} else {
				return str.substring(0, 1);

			}
		}

		if (str.charAt(str.length() - 1) == 'x') {
			return "x" + changeXY(str.substring(0, str.length() - 1));
		} else {
			return str.charAt(str.length() - 1) + changeXY(str.substring(0, str.length() - 1));
		}

	}

	public static String changePi(String str) {
		if (str.equals("")) {
			return "";
		} else if (str.length() == 2) {
			if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
				return "3.14";
			}
		} else if (str.length() == 1) {
			return str.substring(0, str.length());
		}

		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			return "3.14" + changePi(str.substring(2, str.length()));
		} else {
			return str.charAt(0) + changePi(str.substring(1, str.length()));
		}
	}

	public String noX(String str) {
		if (str.equals("")) {
			return "";
		}

		if (str.length() == 1) {
			if (str.charAt(0) == 'x') {
				return "";
			} else
				return str;
		}

		if (str.charAt(0) == 'x') {
			return str.replace('x', '\0') + noX(str.substring(1, str.length()));
		} else {
			return str.charAt(0) + noX(str.substring(1, str.length()));
		}
	}

	public static String noXs(String str) {
		StringBuilder sb = new StringBuilder(str);
		if (str.equals("")) {
			return "";
		}

		if (str.length() == 1) {
			if (str.charAt(0) == 'x') {
				return "";
			} else
				return str;
		}

		if (str.charAt(0) == 'x') {
			sb.deleteCharAt(0);
			return noXs(sb.toString());
		} else {
			return str.charAt(0) + noXs(str.substring(1, str.length()));
		}
	}

	public static String makeStars(int n) {
		if (n == 0) {
			return "";
		}
		return "*" + makeStars(n - 1);
	}

	/**
	 * 
	 * *** * * * * ***
	 * 
	 */

	public static boolean array6(int[] arr) {
		return array6(arr, 0);
	}

	public static boolean array6(int[] arr, int i) {
		if (arr.length == i) {
			return false;
		}

		if (arr[i] == 6) {
			return true;
		} else
			return array6(arr, i + 1);
	}

	public static boolean array220(int[] nums, int index) {
		if (nums.length <= 1) {
			return false;
		}

		if (nums.length - 1 == index) {
			if (nums[nums.length - 2] * 10 != nums[nums.length - 1]) {
				return false;
			} else {
				return false;
			}
		}

		if (nums[index] * 10 == nums[index + 1]) {
			return true;
		} else {
			return array220(nums, index + 1);
		}
	}

	public static String pairStar(String str) {
		if (str.equals("")) {
			return "";
		} else if (str.length() == 1) {
			return str;
		} else if (str.length() == 2) {
			if (str.charAt(0) == str.charAt(1)) {
				return str.charAt(0) + "*" + str.charAt(1);
			} else {
				return str;
			}
		}

		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		} else {
			return str.charAt(0) + pairStar(str.substring(1));
		}
	}

	public static String endX(String str) {

		if (str.equals("")) {
			return "";
		} else if (str.length() == 1) {
			return str;
		}

		if (str.charAt(0) == 'x') {
			return endX(str.substring(1)) + "x";
		} else {
			return str.charAt(0) + endX(str.substring(1));
		}

	}

	public static int countPairs(String str) {
		StringBuilder sb = new StringBuilder(str);

		if (str.equals("")) {
			return 0;
		} else if (str.length() == 1) {
			return 0;
		} else if (str.length() == 2) {
			if (str.charAt(0) == str.charAt(1)) {
				return 1;
			} else {
				return 0;
			}
		}

		if (sb.charAt(0) == sb.charAt(2)) {
			sb.deleteCharAt(0).toString();
			sb.deleteCharAt(1).toString();
			return 1 + countPairs(sb.toString());
		} else {
			return countPairs(sb.deleteCharAt(0).toString());
		}
	}

	public static int count11(String str) {
		if (str.equals("")) {
			return 0;
		} else if (str.length() == 3) {
			if (str.substring(0, 1).equals("11") || str.substring(1, 3).equals("11")) {
				return 1;
			} else {
				return 0;
			}
		} else if (str.length() == 2) {
			if (str.equals("11")) {
				return 1;
			} else {
				return 0;
			}
		} else if (str.length() == 1) {
			return 0;
		}

		if (str.substring(0, 2).equals("11")) {
			return 1 + count11(str.substring(2));
		} else {
			return count11(str.substring(1));
		}
	}

	public static String parenBit(String str) {
		if (str.equals("")) {
			return "";
		} else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
			return str;
		}

		if (str.charAt(0) == '(') {

			return parenBit(str.substring(0, str.indexOf(")") + 1));
		} else {
			return parenBit(str.substring(1));
		}
	}

	public static boolean nestParen(String str) {
		if (str.equals("")) {
			return true;
		} else if (str.length() == 1) {
			return false;
		}

		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
			return nestParen(str.substring(1, str.length() - 1));
		}
		return nestParen(str.substring(1));
	}

	public static boolean strCopies(String str, String sub, int n) {

		if (n == 0 && sub.length() == 1) {
			return false;
		} else if (n == 0) {
			return true;
		} else if (str.length() == sub.length() && (str.equals(sub) != true)) {
			return false;
		}

		if (str.substring(0, sub.length()).equals(sub)) {
			return strCopies(str.substring(sub.length() - 1), sub, n - 1);
		} else {
			return strCopies(str.substring(1), sub, n);
		}

	}

	public static void displayPermutation(String s) {
		displayPermutation("", s);
	}

	public static void displayPermutation(String s1, String s2) {
		if (s2.length() <= 1) {
			System.out.println(s1 + s2);
		} else {
			for (int i = 0; i < s2.length(); i++) {
				String temp = s2.substring(0, i) + s2.substring(i + 1);
				displayPermutation(s1 + s2.charAt(i), temp);
			}
		}
	}

	public static void m(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + j);
			}
			System.out.println(i);
		}
	}

	public static void mr(int n) {
		mr(1, n);
	}

	public static void mr(int i, int n) {
		if (i <= n) {
			mr(1, i, n);
			System.out.println(i);
			mr(i + 1, n);
		}
	}

	public static void mr(int j, int i, int n) {
		if (j <= n) {
			System.out.print(i + j);
			mr(j + 1, i, n);
		}
	}

	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) // Stopping condition
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
		else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}

	public static boolean isPalindrome(String s) {
		if (s.length() == 1 || s.isEmpty()) {
			return true;
		}

		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPalindrome(s.substring(1, s.length() - 1));
		} else {
			return false;
		}
	}

	/**
	 * VOID RECURSIVE METHODS
	 */
	public static void xMethod(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			xMethod(n - 1);

		}
	}

	public static void clear(int[] arr) {
		clear(arr, arr.length);
	}

	public static void clear(int[] arr, int num) {
		if (num == 0) {
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i]);
			return;
		}
		arr[num - 1] = 0;
		clear(arr, num - 1);
	}

	public static void reverse(int[] arr) {
		reverse(arr, 0, arr.length - 1);
	}

	public static void reverse(int[] arr, int start, int end) {
		if (start >= end) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			return;
		}

		int temp;
		temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;

		reverse(arr, start + 1, end - 1);
	}

	public static void forTartan(int n) {

		for (int j = 0; j < n; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < n; i++) {
					if (i % 2 == 0) {
						System.out.print(n + " ");
					} else {
						System.out.print(n - 1 + " ");
					}
				}
				System.out.println();
			} else {
				for (int i = 0; i < n; i++) {
					if (i % 2 == 0) {
						System.out.print(n - 1 + " ");
					} else {
						System.out.print(n + " ");
					}
				}
				System.out.println();
			}

		}
	}

	private static void recursiveTartan(int n) {
		recursiveTartan(n, 0);
	}

	private static void recursiveTartan(int n, int i) {
		if (n == i) {
			System.out.println();
		}

		if (i % 2 == 0) {
			System.out.print(n + " ");
			recursiveTartan(n, i + 1);
		} else {
			System.out.print(n - 1 + " ");
			recursiveTartan(n, i + 1);
		}
		return;
	}

	public static void main(String[] args) {
		// System.out.println(factorial(9));
		// System.out.println(oddevenfact(6));
		// System.out.println(Fibonacci(3));
		// System.out.println(sum(3));
		// System.out.println(pow(2,3));
		// System.out.print(noXs("xaxb"));
		// System.out.println(makeStars(5));
		// System.out.println(array6(new int[] {}));
		// System.out.println(array220(new int[]{2,19,4},0));
		// System.out.println(pairStar("xxre"));
		// displayPermutation("abc");
		// mr(2);
		// System.out.println(isPalindrome("osso"));
		// VOID RECURSIVE METH

		// xMethod(5);
		// int[] arr = {1,2,3,4,5,6};
		// clear(arr);
		// reverse(arr);
		// forTartan(5);
		// recursiveTartan(3); COULNT DO IT
		// IPAddress ip = new IPAddress(839391568);
		// byte[] bs = ip.extractIp();

		//printSquare(0);
		printTriangle(8);
	}
	public static void printTriangle(int a){
		if(a==1){
			printStar(a);
			return;
		}
		printStar(a);
		System.out.println();
		printTriangle(a-1);
	}

	public static void printSquare(int a) {
		if (a == 1) {
			printStar(a);
			return;
		}

		printStar(a);
		System.out.println();
		printRow(a);
		printStar(a);
	}

	public static void printRow(int r) {
		for (int j = 0; j < r-2; j++) {
			System.out.print("*");
			for (int i = 0; i < r - 2; i++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}

	public static void printStar(int a) {
		if (a >= 1) {
			System.out.print("*");
			printStar(a - 1);
		} else {
			return;
		}
	}
}

class IPAddress {
	private int ip;

	public IPAddress() {
	}

	public IPAddress(int a) {
		ip = a;
	}

	public int getIntIP() {
		return ip;
	}

	public void setIntIP(int a) {
		ip = a;
	}

	public byte[] extractIp() {
		byte[] by = new byte[4];

		by[0] = (byte) (ip % 256);
		int newIp = ip / 256;
		by[1] = (byte) (newIp % 256);
		newIp = newIp / 256;
		by[2] = (byte) (newIp % 256);
		newIp = newIp / 256;
		by[3] = (byte) (newIp % 256);
		System.out.println("IP Address: " + by[0] + "." + by[1] + "." + by[2] + "." + by[3]);
		return by;

	}
}
