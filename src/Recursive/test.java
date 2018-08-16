package Recursive;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;
public class test {

	public static int sum(int n){
		if(n==1){
			return 1;
		}else
		return n+sum(n-1);	
	}
	
	public long power(int x, int n){
		if(x==0 && n==1){
			return 1;
		}else
			return (long) (x * Math.pow(x,(n-1)));
	}
	
	public static int count(Scanner input){
		
		
		if(input.hasNextLine()){
			String xx = input.nextLine();
			String[] words = xx.split(" ");
			int c=0;
			c += words.length;
			return c;
		}
	return 0;
	}
	
	//print a scanner recursibly
	
	public void copy(Scanner input){
		
		if(input.hasNext()){
			
		System.out.println(input.next());
		copy(input);
		}
	}
	
	public void copyBack(Scanner input) { 

		if (input.hasNext()) { 

			String line = input.next(); 

			copy(input); 

			System.out.println(line); 

		} 
	}
	
	public static void main(String[] args){
		
		System.out.print(count(new Scanner(System.in)));
		
	}
}
