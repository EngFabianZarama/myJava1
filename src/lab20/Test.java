package lab20;


public class Test {
	public static void main(String[] args){
		
		Square[] obj = new Square[5];
		obj[0] = new Square(1,2,3,4);
		obj[1] = new Square(1,1,2,2);
		obj[2] = new Square(1,1,1,2);
		obj[3] = new Square(2,1,1,1);
		obj[4] = new Square(1,1,1,1);
		
		obj[0].howToColor();
		
		obj[4].howToColor();
	}
}
