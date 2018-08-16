import java.util.Scanner;
//Write a program that sorts three integers. The integers are entered from the input 
//dialogs and stored in variables num1, num2, and num3, respectively. The program prints the sorted numbers.
public class Sort3 {
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int first=0, second=0, third=0;
	String word;
	
	
	System.out.print("number 1: ");
	int num1 = input.nextInt();
	System.out.print("number 2: ");
	int num2 = input.nextInt();
	System.out.print("number 3: ");
	int num3 = input.nextInt();
	
	//find first number
	if ((num1<=num2)&&(num1<=num3)){
		first = num1;
	}
	if((num2<=num1)&&(num2<=num3)){
		first = num2;
	}
	if((num3<=num1)&&(num3<=num2)){
		first = num3;
	}
	
	//find second number
	if ((num1>=num2)&&(num1<=num3)){
		second = num1;
	}else if((num1>=num3)&&(num1<=num2)){
		second = num1;
	}
	
	if((num2>=num1)&&(num2<=num3)){
		second = num2;
	}else if((num2<=num1)&&(num2>=num3)){
		second = num2;
	}
	
	if((num3>=num1)&&(num3<=num2)){
		second = num3;
	}else if((num3>=num2)&&(num3<=num1)){
		second = num3;
	}
	
	//find third number
	if ((num1>=num2)&&(num1>=num3)){
		third = num1;
	}
	if((num2>=num1)&&(num2>=num3)){
		third = num2;
	}
	if((num3>=num1)&&(num3>=num2)){
		third = num3;
	}
	
	System.out.println("Sort numbers =  " + first + "  " + second + "  " + third);
	
}
}
