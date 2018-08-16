import java.util.Random;

public class Plate {
	public static void main(String[] args){
		Random rn = new Random();
		
	System.out.print("Pate is: "+(char) (rn.nextInt(90 - 65 + 1) + 65)+(char) (rn.nextInt(90 - 65 + 1) + 65)+(char) (rn.nextInt(90 - 65 + 1) + 65)+" "+(int)(Math.random()*10000));
	}
}
