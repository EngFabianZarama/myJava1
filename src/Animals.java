//Fabian Zarama
//109 599 744
//CSE 114
//Homework #2

public class Animals {
	public static double pricePerCat(double budget, int dogs, int cats){
		//food and medication for each dog costs three times as much as those for a cat.
		double result =(double) (budget/((3*dogs)+cats));
		return result;
	}

}
