package lab16;

import java.util.ArrayList;
import java.util.Scanner;
public class UnionArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();

		System.out.print("5 digits for first array: ");
		first.add(input.nextInt());
		first.add(input.nextInt());
		first.add(input.nextInt());
		first.add(input.nextInt());
		first.add(input.nextInt());
		
		System.out.print("5 digits for second array: ");
		second.add(input.nextInt());
		second.add(input.nextInt());
		second.add(input.nextInt());
		second.add(input.nextInt());
		second.add(input.nextInt());
		
		System.out.print(union(first, second));
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list1.addAll(list2);
		return list1;

	}
}
