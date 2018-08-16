package lab17;

public class Calculator {
	public static void main(String[] args) {
		try {
			
			switch (args[1]) {
			case "+":
				System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
				break;
			case "-":
				System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
				break;
			case "x":
				
				System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
				break;
			case "/":
				if(Integer.parseInt(args[2])==0){
					 throw new IllegalArgumentException();
				}
				System.out.println((double)(Integer.parseInt(args[0])) / Integer.parseInt(args[2]));
				
				break;
			default:
				System.out.println("Wrong operand");
			}
		}  catch(NumberFormatException e)
	       {
	           System.out.println("Invalid Input");
	       }catch (IllegalArgumentException e) {
			System.out.println("Division by zero is illegal");
		}


	}

}
