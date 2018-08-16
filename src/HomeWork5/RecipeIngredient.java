//Fabian Zarama
//109599744
//CSE 114
//Homework #5
package HomeWork5;
public class RecipeIngredient extends Ingredient{
	private float quantity;

	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit,float quantity){
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	
	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString(){
		
		return "PUTAClass Name: RecipeIngredient.java\n" +
				 "Data Fields: \n"+
				 "private float quantity;\n";
		
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(((Ingredient)other).getName() == super.getName() && ((Ingredient)other).getMeasuringUnit() == super.getMeasuringUnit() && ((Ingredient)other).getCaloriesPerUnit() == super.getCaloriesPerUnit()) {
			return true;
		}else 
			return false;
	}
}
