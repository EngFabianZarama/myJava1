package lab20;


public class Square extends GeometricObject implements Colorable {
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	public Square(){}
	
	public Square(double a,double b,double c,double d){
			side1 = a;
			side2 = b;
			side3 = c;
			side4 = d;
	}
	
	@Override
	public void howToColor() {
		if(side1==side2 && side1==side3 && side1==side4)
			System.out.print("color upto the 4 lines");	
		else
			System.out.println("Not an square. sides ("+side1 +", "+side2+", "+side3+", "+side4+")");
	}

	@Override
	public double getArea() {
		return side1*side1;
	}

	@Override
	public double getPerimeter() {
		return side1*4;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
