package Lab_Programs;

public class LoopKg2Lb {
	public static void main(String[] args) {
		
		//1 kilogram is approximately 2.2 pounds
		System.out.println("Kilograms\tPounds");
		double lbs=0;
		for (int i = 1; i<=199 ; i+=2){
			lbs = i*2.2;
			System.out.println(i+"\t\t"+Math.floor(lbs*10)/10);
		}
		
	}
}
