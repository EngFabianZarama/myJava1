package lab19;

public class Fruit_Food extends Food {
	private String season;
	
	public Fruit_Food(){}
	
	public Fruit_Food(String a){
		season = a;
	}
	
	@Override
	public int calories(int servings) {
		return super.getCal() * servings;
	}

}
