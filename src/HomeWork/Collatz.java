//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork;
public class Collatz {
	public static int howManyCollatzIterations(int n) {
		int iterations=0;
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (n * 3) + 1;
			}
			iterations++;
		}
		return iterations;
	}
	
	public static void main(String[] args){
		System.out.print(howManyCollatzIterations(10));
	}
}
