package Lab_Programs;
import java.util.Scanner;
public class lab7_2 {
	
		public static double poundsToKilos(double pounds) {
			return pounds*0.453592;
		}
		public static double kilosToPounds(double pounds) {
			return pounds/0.453592;
		}
		public static double kmToM(double pounds) {
			return pounds*0.621371;
		}
		public static double mToKm(double pounds) {
			return pounds/0.621371;
			
		}
		
		public static void main(String[] args){
			Scanner input= new Scanner(System.in);
			boolean e =true;
			while (e==true){
				System.out.println("A pounds to kilos: ");
				System.out.println("B kilos to pounds:");
				System.out.println("C kilometers to miles:");
				System.out.println("D and miles to kilometers:");
				System.out.println("E Exit");
				System.out.println("Option: ");
				char value = input.next().charAt(0);
				
				switch(value){
				
				case 'a':
				case 'A':
					System.out.print("value: ");
					double a = input.nextDouble();
					System.out.println(poundsToKilos(a));
					break;
				
				case 'b':
				case 'B':
					System.out.print("value: ");
					double b = input.nextDouble();
					System.out.println(kilosToPounds(b));
					break;
				
				case 'c':
				case 'C':
					System.out.print("value: ");
					double c = input.nextDouble();
					System.out.println(kmToM(c));
					break;
				
				case 'D':
				case 'd':
					System.out.print("value: ");
					double d = input.nextDouble();
					System.out.println(mToKm(d));
					break;
				
				case 'e':
				case 'E':
					e=false;
					System.exit(0);
					break;
				}
			}
		}
}
