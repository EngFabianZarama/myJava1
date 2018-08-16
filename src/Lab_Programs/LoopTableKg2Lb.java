package Lab_Programs;

public class LoopTableKg2Lb {
	public static void main(String[] args){
		
		System.out.println("Kilograms\tPounds\t\tPounds\t\tKilograms");
		double lbs=0,kg=0;
		int j=20;
		for (int i = 1; i<=199 ; i+=2){
			lbs = i*2.2;
			System.out.print(i+"\t\t"+Math.floor(lbs*10)/10);
			
			kg = j/2.2;
			System.out.println("\t\t"+j+"\t\t"+Math.floor(kg*100)/100);		
			j+=5;
		}
		
	}
}
