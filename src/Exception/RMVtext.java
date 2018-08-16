package Exception;
import java.util.*;
public class RMVtext{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		
		String java = stdin.next();
		String fileName = stdin.next();
		stdin.nextLine();
		java.io.File file = new java.io.File(fileName);
		try{
		Scanner input = new Scanner(file);
		while(input.hasNext()){
			System.out.print(input.nextLine());	
		}
		input.close();
		}
		catch(Exception ex){
			System.out.print("File not found");	
		}
		
	}
}