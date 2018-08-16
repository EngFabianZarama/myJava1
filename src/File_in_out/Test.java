package File_in_out;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Test {

	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		
		String file = stdin.next();
		String word = stdin.next();
		
		try {
			PrintWriter output = new PrintWriter(file);
			output.print(word);
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
