import java.util.Scanner;

public class CharCounter {
	 public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	
	    	System.out.print("Enter a string:");
	    	String enter = input.nextLine();
	    	System.out.print("Enter a chatacter: ");
	    	char a = input.next().charAt(0);
	    	
	    	
	    	
	    	
	    	 int letterCheck = CharCounter.count(enter, a);
	    	
	    	System.out.print(a + " occurs " + letterCheck+ " times in the string");
	    		
	    	}
	    
	 

	public static int count(String str, char a){
		
		int occurs = 0;
		for (int i = 0; i<str.length() ;i++){

			if (a == str.charAt(i)){
				occurs++;
			}
			}
		return occurs;
	}
	}

