//Fabian Zarama
//109 599 744
//CSE 114
//Homework #2

public class Temperatures {
	
	public static double fahrenheit2Celsius(double fahrenheit){
	double cel = ((fahrenheit - 32)*5.0)/9;
	return cel;
	}
	
	public static double fahrenheit2Kelvin(double fahrenheit){
		double kel = (fahrenheit + 459.67) * (5.0/9);// ([°F] + 459.67) ×  5⁄9
		return kel;
	}
	
	public static double fahrenheit2Rankine(double fahrenheit){
		
		double ran = fahrenheit2Kelvin(fahrenheit);
		ran = ran * (9.0/5);
		return ran;
	}
	
	public static double celsius2Fahrenheit(double celsius){
		double fah = celsius2Kelvin(celsius);
		fah = fah * (9.0/5) - 459.67;
		return fah;
	}
	
	public static double celsius2Kelvin(double celsius){
		double kel = celsius + 273.15;//[K] = [°C] + 273.15
		return kel;
	}

	public static double celsius2Rankine(double celsius){
		double ran = celsius2Kelvin(celsius);
		ran = ran * (9.0/5);
		return ran;
	}
	
	public static double kelvin2Fahrenheit(double kelvin){
		double fah = kelvin*(9.0/5)-459.67;//[°F] = [K] ×  9⁄5 − 459.67	
		return fah;
	}
	
	public static double kelvin2Celsius(double kelvin){
		double cel = kelvin - 273.15;//[°C] = [K] − 273.15
		return cel;
	}
	
	public static double kelvin2Rankine(double kelvin){
		double ran = kelvin * (9.0/5);//[°R] = [K] ×  9⁄5
		return ran;
	}
	
}		
