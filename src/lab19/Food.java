package lab19;

public abstract class Food {
	private String description;
	private int cal;
	
	public Food(){}
	
	public Food(String a, int b){
		description = a;
		cal =b ;
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public abstract int calories(int servings);
}
