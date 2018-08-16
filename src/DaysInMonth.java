import java.util.Scanner;
//Finding the number of days in a month) Write a program that prompts the user to enter the month and year, 
//and displays the number of days in the month. For example, if the user entered month 2 and year 2000, 
//the program should display that February 2000 has 29 days. If the user entered month 3 and year 2005, 
//the program should display that March 2005 has 31 days.
public class DaysInMonth {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int days=0;
	
	System.out.print("Month (1-12) : ");
	int month = input.nextInt();
	
	System.out.print("Year: ");
	int year = input.nextInt();
	
	switch(month){
	case 1: 
		System.out.print("January " + year + " has 31 days.");	
		break;
	
	case 2: 
		System.out.print("February " + year + " has 28 days.");	
		break;
		
	case 3: 
		System.out.print("March  " + year + " has 31 days.");	
		break;
		
	case 4: 
		System.out.print("April " + year + " has 30 days.");	
		break;
		
	case 5: 
		System.out.print("May " + year + " has 31 days.");	
		break;
		
	case 6: 
		System.out.print("June  " + year + " has 30 days.");	
		break;
		
	case 7: 
		System.out.print("July " + year + " has 31 days.");	
		break;
		
	case 8: 
		System.out.print("August " + year + " has 31 days.");	
		break;
		
	case 9: 
		System.out.print("September " + year + " has 30 days.");	
		break;
		
	case 10: 
		System.out.print("October " + year + " has 31 days.");	
		break;
		
	case 11: 
		System.out.print("November " + year + " has 30 days.");	
		break;
		
	case 12: 
		System.out.print("December " + year + " has 31 days.");	
		break;
	}
}
}
