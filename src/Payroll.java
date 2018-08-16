import java.util.Scanner;

public class Payroll {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Employee’s name: ");
	String name = input.next();
	System.out.print("Number of hours worked in a week: ");
	double hours = input.nextDouble();
	System.out.print("Hourly pay rate: ");
	double hourly = input.nextDouble();
	
	double gross = hours * hourly;
	double fed = (hours * hourly)*0.2;
	double stat = (hours * hourly)*0.09;
	double netSal = gross-fed-stat;
	//OUTPUT
	System.out.println("Gross salary = " + gross);
    System.out.println("Federal tax withholding (20%) = " + fed );
    System.out.println("State tax withholding (9%) = " + stat);
    System.out.println("Net salary: " + netSal);
		
	}
}
