import java.util.Scanner;
public class ChangeMaker {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		double price, from,change; 
		int rem, qs, ds, ns, twts, ten, fiv, one;
		
		System.out.print("Price: ");
		price = input.nextDouble();
		
		System.out.print("From: ");
		from = input.nextDouble();
	
		change=from-price;
		
		change = Math.floor(change * 100) / 100;
		
		twts = (int)(change/20);
		rem = (int)(change%20);
		ten = rem/10;
		rem = rem%10;
		fiv = rem/5;
		rem = rem%5;
		one = rem;
		rem = (int)(100*(change-((20*twts)+(10*ten)+(5*fiv)+(one))));
		qs = rem/25;
		rem = rem%25;
		ds = rem/10;
		rem = rem%10;
		ns = rem/5;
		
		System.out.print("change: $" + change +"\t"+ twts +" x $20 bills\t" + ten + " x $10 bill\t");
		System.out.print(fiv + " x $5 bill\t" + one + " x $1 bill\t" +qs+" x 25c coins\t"+ds+" x 10c coin\t"+ns+" x 5c coin");
		
		}
}
