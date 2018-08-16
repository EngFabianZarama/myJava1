//Fabian Zarama
//109599744
//CSE 114
//Homework #5
package HomeWork5;
import java.util.ArrayList;

public class CookingRecipe{
	private ArrayList<String> CookingRecipeName = new ArrayList<String>() ;
	private ArrayList<RecipeIngredient> CookingRecipeIngredients = new ArrayList<RecipeIngredient>();

	public CookingRecipe(String name){
		CookingRecipeName.add(name);
	}
	
	public String getName(){
		return CookingRecipeName.get(0);
	}

	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
		
		if(CookingRecipeIngredients.isEmpty()){
			CookingRecipeIngredients.add(new RecipeIngredient(ingredient.getName(),ingredient.getMeasuringUnit(),ingredient.getCaloriesPerUnit(),quantity));
		}
		
		for(int i=0; i<CookingRecipeIngredients.size();i++){
			if(CookingRecipeIngredients.get(i).getName() == ingredient.getName() && CookingRecipeIngredients.get(i).getMeasuringUnit() == ingredient.getMeasuringUnit() && CookingRecipeIngredients.get(i).getCaloriesPerUnit() == ingredient.getCaloriesPerUnit() ){
				CookingRecipeIngredients.get(i).setQuantity(quantity);
			}else
			CookingRecipeIngredients.add(new RecipeIngredient(ingredient.getName(),ingredient.getMeasuringUnit(),ingredient.getCaloriesPerUnit(),quantity));
		}
	}
	
	//if the recipe already includes the ingredient specified by the parameter, 
	//then just update the quantity, otherwise add a new recipe ingredient.
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
		for(int i=0; i<CookingRecipeIngredients.size();i++){
			if(CookingRecipeIngredients.get(i).getName() == ingredient.getName() && CookingRecipeIngredients.get(i).getMeasuringUnit() == ingredient.getMeasuringUnit() && CookingRecipeIngredients.get(i).getCaloriesPerUnit() == ingredient.getCaloriesPerUnit() ){
				return CookingRecipeIngredients.get(i);
			}
		}
		
		return null;
	}
	
	public RecipeIngredient getRecipeIngredient(String ingredientName){
		for(int i=0; i<CookingRecipeIngredients.size();i++){
			if(CookingRecipeIngredients.get(i).getName() == ingredientName){
					return CookingRecipeIngredients.get(i);
			}
		}
		return null;
		
	}
	
	//return the RecipeIngredient object corresponding to the 
	//ingredient object paramater, or return null if the ingredient is not part of the recipe.
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
		RecipeIngredient toReturn;
		
		for(int i=0; i<CookingRecipeIngredients.size();i++){
			if(CookingRecipeIngredients.get(i).getName() == ingredient.getName() && CookingRecipeIngredients.get(i).getMeasuringUnit() == ingredient.getMeasuringUnit() && CookingRecipeIngredients.get(i).getCaloriesPerUnit() == ingredient.getCaloriesPerUnit() ){
				toReturn = CookingRecipeIngredients.get(i);
				CookingRecipeIngredients.remove(i);
				return toReturn;
			}
		}
		
		return null;
		
	}
	
	public RecipeIngredient removeRecipeIngredient(String ingredientName){
		RecipeIngredient toReturn;
		
		for(int i=0; i<CookingRecipeIngredients.size();i++){
			if(CookingRecipeIngredients.get(i).getName() == ingredientName){
				toReturn = CookingRecipeIngredients.get(i);
				CookingRecipeIngredients.remove(i);
				return toReturn;
			}
		}
		
		return null;
		
	}
	
	//remove the given ingredient from the recipe. If the ingredient is part 
	//of the recipe return it, else return null.
	
	public float calculateCalories(){
		float returnFloat = 0;
		for(int i=0;i<CookingRecipeIngredients.size();i++){
			returnFloat += (CookingRecipeIngredients.get(i).getCaloriesPerUnit())*(CookingRecipeIngredients.get(i).getQuantity());
		}
		return returnFloat;
	}
	
	//calculates the sum of the calories for all the ingredients in 
	//the recipes and their respective quantities.
	
	public int getNumberOfIngredients(){
		return CookingRecipeIngredients.size();
	}
	
	//returns the number of ingredients in the recipe.
	
	/*
	public String toString(){
		String s="";
		
		for(int i=0;i<CookingRecipeName.size();i++){
			s += "Recipe name: " + CookingRecipeName.get(i);
			for(int j=0;j<CookingRecipeIngredients.size();j++){
				s += "\nIngredient["+j+"]:" + CookingRecipeIngredients.get(j).getName() + " in " + CookingRecipeIngredients.get(j).getMeasuringUnit() + ", contains "+ CookingRecipeIngredients.get(j).getCaloriesPerUnit()+" calories per unit." + " Quantity: " + CookingRecipeIngredients.get(j).getQuantity() ;
			}
		}
		
		return s;
		
	}
	*/
	@Override
	public String toString(){
		
		return   "Class Name: CookingRecipe.java\n" +
				 "Data Fields: \n"+
				 "public ArrayList<String> CookingRecipeName = new ArrayList<String>() ;\n"+
				 "public ArrayList<RecipeIngredient> CookingRecipeIngredients = new ArrayList<RecipeIngredient>();\n";
		
		
		
	}
	
	@Override
	public boolean equals(Object other)
	{
		if( ((CookingRecipe)other).CookingRecipeName.get(0) == this.CookingRecipeName.get(0)){
			return true;
		}else 
			return false;

	}
	
	//returns the recipe name and ingredients as a String.
	
	//The specification of this class intentionally does not specify the internal 
	//structure of the class (name, ingredients), so you can design it in any way you want, 
	//as long as you provide the functionalities required above.
}
