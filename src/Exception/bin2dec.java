package Exception;
import java.util.*;

public class bin2dec {
	public static int bin2Dec(String binaryString){
		int ret=0;
		try{
			ret = Integer.parseInt(binaryString, 2);
		}catch(Exception e){
			System.out.print("Not a binary string.".substring(0,20));	
			System.exit(1);
		}
		return ret;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a binary string:");
		String arg = input.next();
		
		System.out.print(bin2Dec(arg));
			
	}
}
