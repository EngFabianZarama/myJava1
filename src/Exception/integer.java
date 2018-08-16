package Exception;


import java.util.Scanner;

public class integer {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean exit=true;
		do{
			try {

				System.out.print("Enter an integer:");
				int a = input.nextInt();
				System.out.print("Enter an integer:");
				int b = input.nextInt();
				System.out.print(a + b);
				exit=false;
			} catch (Exception ex) {
				System.out.println("Please enter an integer.");
				 input.nextLine();
			}
		}while(exit);
		
		
		
	}
}
