package Lab_Programs;
import java.util.Scanner;
public class lab10_1 {
	public static void sumColumn(double [][] m, int c){
		double[] add= new double[m.length];
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				add[i]+=m[j][i];
			}
		}
		
			System.out.println(add[c]);
			
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter n: ");
		int n = input.nextInt();
		System.out.print("enter column: ");
		int col = input.nextInt();
		double[][] arr = new double[n][n];
		
		for(int i=0;i<arr.length;i++){ 
		System.out.print("Enter elements of row "+i+":");
			for (int j=0;j<arr[n-1].length;j++){
				arr[i][j]= input.nextInt();
			}
		}
		
		sumColumn(arr,col);
		
		
	}
}
