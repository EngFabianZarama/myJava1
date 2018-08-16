import java.util.Scanner;
//Write a menu where the user selects to make conversions:
//A – convert pounds to kilos
//B – convert kilos to pounds
//C – convert kilometers to miles
//D – convert miles to kilometers
//E - Exit
//The user will input one option and the program will ask the use an amount:
//
//Enter your option: A
//Enter a quantity in pounds: 200
//Kilograms are: 90.7185

public class ConversionMenu {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Select one option with the letter");
	System.out.println("A – convert pounds to kilos");
	System.out.println("B – convert kilos to pounds");
	System.out.println("C – convert kilometers to miles");
	System.out.println("D – convert miles to kilometers");
	System.out.println("E - Exit\n\n");
	System.out.print("Enter your option: ");
	String sel = input.next();
	
	switch(sel){
	case "A":
	case "a":
		System.out.print("Enter a quantity in pounds: ");
		double pnds = input.nextDouble();
		double toKg = pnds*0.453592;
		System.out.println("Kilograms are: " + toKg);
		break;
		
	case "b":
	case "B":
		System.out.print("Enter a quantity in kilos: ");
		double kilos = input.nextDouble();
		double toPnds = kilos/0.453592;
		System.out.println("Pounds are: " + toPnds);
		break;
		
	case "c":
	case "C":
		System.out.print("Enter a quantity in kilometers: ");
		double km = input.nextDouble();
		double toMil = km * 0.621371;
		System.out.println("Miles are: " + toMil);
		break;
		
	case "d":
	case "D":
		System.out.print("Enter a quantity in miles: ");
		double mil = input.nextDouble();
		double toKm = mil/0.621371;
		System.out.println("Kilometers are: " + toKm);
		break;
		
	case "e":
	case "E":
		System.out.println("Bye!");
		break;
	default: 
		System.out.println("Wrong input");
		break;
	}
}
}
