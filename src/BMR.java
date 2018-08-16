//Fabian Zarama
//109 599 744
//CSE 114
//Homework #2

public class BMR {
	public static double bmr(double pounds, double inches, int age, char gender){
		double result = 0;
		
		double pounds2Kgr = pounds *  0.453592;
		double inches2Cm = inches *  2.54;
		
		if (gender=='F'||gender=='f'){
		result = (10 * pounds2Kgr) + (6.25 * inches2Cm) - (5 * age) - 161;
		}else if (gender=='M'||gender=='m'){
		result = (10 * pounds2Kgr) + (6.25 * inches2Cm) - (5 * age) + 5;
		}else{
			System.out.print("Invalid gender");
		}
		return result;
	}
}
