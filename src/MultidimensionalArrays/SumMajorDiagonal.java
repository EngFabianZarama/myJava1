
package MultidimensionalArrays;

import java.util.Scanner;

public class SumMajorDiagonal {
	public static  double  sumMajorDiagonal(double [][] m){
		double result=0;
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length;j++){
				if(i==j){
				result+=m[i][j];
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter dimension n of nxn matrix:");
		int dim = input.nextInt();

		double[][] arr = new double[dim][dim];

		for (int i = 0; i < dim; i++) {
			System.out.printf("Enter row %d:", i);

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=input.nextDouble();
			}
		}
		
		System.out.println(sumMajorDiagonal(arr));
		
	}
}
