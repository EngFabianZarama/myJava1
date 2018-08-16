//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;
public class Complex {
	private double a, b;

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// Complex(a) creates a Complex object with 0 for b
	public Complex(double a) {
		this.a = a;
		b = 0;
	}

	// Complex() creates a Complex object for number 0
	public Complex() {
		a = 0;
		b = 0;
	}

	public double getRealPart() {
		return a;
	}

	public double getImaginaryPart() {
		return b;
	}

	// a + bi + c + di = (a + c) + (b + d)i
	public Complex add(Complex a) {
		double real = this.a + a.getRealPart();
		double imaginary = b + a.getImaginaryPart();
		return new Complex(real, imaginary);
	}

	// a + bi - (c + di) = (a - c) + (b - d)i
	public Complex subtract(Complex a) {
		double real = this.a - a.getRealPart();
		double imaginary = b - a.getImaginaryPart();
		return new Complex(real, imaginary);
	}

	// (a + bi)*(c + di) = (ac - bd) + (bc + ad)i
	public Complex multiply(Complex a) {
		double real = (this.a*a.getRealPart()) - (this.b*a.getImaginaryPart());
		double imaginary = (this.b*a.getRealPart()) + (this.a*a.getImaginaryPart());
		return new Complex(real, imaginary);
	}
	
	//(a + bi)/(c + di) = (ac + bd)/(c2 + d2) + (bc - ad)i/(c2 + d2)
	public Complex divide(Complex a) {
		double real = ((this.a*a.getRealPart()) + (this.b*a.getImaginaryPart())) / ((Math.pow(a.getRealPart(), 2)) + (Math.pow(a.getImaginaryPart(), 2)));
		double imaginary = ((this.b*a.getRealPart()) + (this.a*a.getImaginaryPart())) / ((Math.pow(a.getRealPart(), 2)) + (Math.pow(a.getImaginaryPart(), 2)));
		return new Complex(real, imaginary);
	}

	// returning a string representation for a complex number.
	// The toString method returns "(a + bi)" as a string. If b is 0,
	// it simply returns a.
	public String toString() {
		if (b == 0) return a + "";
        if (a == 0) return b + "i";
        if (b <  0) return a + " - " + (-b) + "i";
        return a + " + " + b + "i";
	}
}
