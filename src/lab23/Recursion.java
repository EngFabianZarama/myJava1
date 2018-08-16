package lab23;

public class Recursion {
	public static int factorialIteretive(int n){
		   int factorial = 1;
		   for(int i=2; i<=n; i++)
		    factorial *= i;
		  return factorial;
		}
	
	public static int factorialRecursive(int n){
		if(n<1)
			return 1;
		else 
			return factorialRecursive(n-1)*n ;
	}
	
	public static int fibonaci(int n){
		if(n==0 || n==1){
			return n;
		}else{
			return fibonaci(n-1)+fibonaci(n-2);
		}
	}
	
	public static double series(int n){//: m(i)=1+1/2+1/3+...+1/i
		if(n==1){
			return 1;
		}else{
			 double curStep = 1.0 / n;
			return curStep + series(n-1);
		}
			
	}
	
	public static boolean bears(int initial, int goal, int increment, int n){//99,53,4 goal 91
	      if (initial == goal){
	         return true;
	      }else if (n == 0){
	         return false;
	      }else if (bears(initial+increment, goal, increment, n-1)){
	         return true;
	      }else if ((initial % 2 == 0) && bears(initial/2, goal, increment, n-1)){
	         return true;
	      }else{
	         return false;
	      }
	   }
	
	public static void main(String[] args){
		
		System.out.println("Factorial iteretive: "+factorialIteretive(5));
		System.out.println("Factorial recursive: "+factorialRecursive(5));
		System.out.println("Factorial fibonaci: "+fibonaci(6));
		System.out.println("Factorial series: "+series(3));
		System.out.println("Factorial bears: "+bears(99,91,53,4));
		System.out.println(Math.pow(2, 3));
	}
}
