package Lab_Programs;

public class LoopTableMil2Km {
	
	public static void main(String[] args) {
		System.out.println("Miles\tKilometers");
		double km = 0;
		
		for (int i = 1; i <= 10; i++) {
			km = i * 1.609;
			System.out.println(i + "\t" + Math.floor(km * 1000) / 1000);
		}
	}
}
