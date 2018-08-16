import java.util.Scanner;

public class CalculatingTips {
	public static void main(String[] ags){
		Scanner input = new Scanner(System.in);
		double price,tip,total;
		
		System.out.print("Enter the subtotal: $");
		price = input.nextDouble();
		
		if (price<30.0){
			tip = 5;
		}else{
			tip = price*0.15;
		}
		total = price + tip;
		
		System.out.println("The gratuity is: $" + Math.floor(tip*100)/100 + " and the total is $" + Math.floor(total*100)/100);
	}
}
