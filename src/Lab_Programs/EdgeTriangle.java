//(Computing the perimeter of a triangle) Write a program that reads 
//three edges for a triangle and computes the perimeter if the input is valid. 
//Otherwise, display that the input is invalid. The input is valid if the sum 
//of any two edges is greater than the third edge.

package Lab_Programs;

import java.util.Scanner;

public class EdgeTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Edge 1: ");
		double edg1 = input.nextDouble();
		System.out.print("Edge 2: ");
		double edg2 = input.nextDouble();
		System.out.print("Edge 3: ");
		double edg3 = input.nextDouble();

		if (((edg1 + edg2) >= edg3) || ((edg1 + edg3) >= edg2) || ((edg2 + edg3) >= edg1)) {
			System.out.print("The input is invalid.");
		} else {
			System.out.print("The perimeter of the triangle is: " + (edg1 + edg2 + edg3));
		}

	}
}
