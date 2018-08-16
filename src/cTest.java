import java.util.Scanner;

public class cTest {
	
    public static void main(String[] args) {
   
    		Scanner input = new Scanner(System.in);
    		String first=null,second=null,third=null;
    		System.out.print("Enter the first city:");
    		String c1 = input.nextLine();
    		
    		System.out.print("Enter the second city:");
    		String c2 = input.nextLine();
    		
    		System.out.print("Enter the third city:");
    		String c3 = input.nextLine();
    		
    		
    		//1,2,3 1,3,2
    		if (c1.compareTo(c2)<0 && c1.compareTo(c3)<0){
    			first = c1;
    			if(c2.compareTo(c3)<0){
    				second = c2;
    				third = c3;
    			}else{
    				second = c3;
    				third = c2;
    			}
    		}
    		//2,1,3 2,3,1
    		if (c2.compareTo(c1)<0 && c2.compareTo(c3)<0){
    			first = c2;
    			if(c1.compareTo(c3)<0){
    				second = c1;
    				third = c3;
    			}else{
    				second = c3;
    				third = c1;
    			}
    		}
    		//3,1,2 y 3,2,1
    		if (c3.compareTo(c1)<0 && c3.compareTo(c2)<0){
    			first = c3;
    			if(c1.compareTo(c2)<0){
    				second = c1;
    				third = c2;
    			}else{
    				second = c2;
    				third = c1;
    			}
    		}
    		
    				System.out.print("The three cities in alphabetical order are " +first+" "+second+" "+third);
    		
    		
    		
    		
    		
    	}
    }



