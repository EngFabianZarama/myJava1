package lab19;

public class Liquid_Food extends Food {
	private int viscosty;
	
	public Liquid_Food(){}
	
	public Liquid_Food(int a){
		viscosty = a;
	}
	
	
	@Override
	public int calories(int servings) {
		return super.getCal() * servings;
	}

}
