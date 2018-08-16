package recursion;
import java.util.Scanner;

public class Project1 {
	
	public static double SumSeries(int a){
		double val=a;
		double temp = 0;
		if(a==1){
			return val;
		}
		
		temp = 1/val; 
		
		return temp + SumSeries(a-1);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the last positive integer you want m(i) to be calculated for:");
		int val = input.nextInt();
		for(int i=1;i<=val; i++){
			System.out.printf("m("+i+") = %.2f\n", SumSeries(i));
		}
		
	}
}
