//Fabian Zarama
//109 599 744
//CSE 114
//Homework #2

public class GreekMoney {
	
	public static int howManyOboloi(int talents, int minae, int drachmae, int oboloi){
				//• 1 talent = 60 minae (plural of mina)
				//• 1 mina = 70 drachmae (plural of drachma)
				//• 1 drachma = 6 oboloi (plural of obolus)
		int tal2Obo = talents*60*70*6;
		int min2Obo = minae *70*6;
		int dra2Obo = drachmae*6;
		int result = tal2Obo + min2Obo + dra2Obo + oboloi;

		return result;
	}
}
