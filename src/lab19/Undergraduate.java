package lab19;

public class Undergraduate extends College {
	private double SAT;
	private double GPA;
	
	public Undergraduate(double a, double b){
		SAT = a;
		GPA = b;
	}
	public double getSAT() {
		return SAT;
	}
	public void setSAT(double sAT) {
		SAT = sAT;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	
}
