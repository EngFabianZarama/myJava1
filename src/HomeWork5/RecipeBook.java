//Fabian Zarama
//109599744
//CSE 114
//Homework #5
package HomeWork5;
import java.util.ArrayList;

public class RecipeBook {
	private ArrayList<String> bookName = new ArrayList<String>();
	private ArrayList<String> name = new ArrayList<String>();
	private ArrayList<RecipeIngredient[]> ingredients = new ArrayList<RecipeIngredient[]>();
	
	public RecipeBook(String bookName){
		this.bookName.add(bookName);
	}
	
	public String getBookName(){
		return bookName.get(0);
	}
	
	
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
		
		for(int i=0; i<this.name.size(); i++){
			if(this.name.get(i)==name){
				return null;
			}
		}
		
			this.name.add(name);
			this.ingredients.add(ingredients);
			return new CookingRecipe(name);
		
	}

	//adds to the book and returns a new cooking recipe with the given parameters. 
	//If recipe book already contains a recipe with the same name, do not create a new one and return null.

	public CookingRecipe removeRecipe(String name){
		
		if(this.name.contains(name)){
			ingredients.remove(this.name.indexOf(name));
			this.name.remove(name);
			return new CookingRecipe(name);
		}else
		return null;
		
	}
	
	//removes the cooking recipe from the coocking book and returns it. 
	//If recipe book does not contain a recipe with the specified name, then return null.
	
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
		
		ArrayList<CookingRecipe> CookingRecipeArrayList = new ArrayList<CookingRecipe>();
		
		
		//int d=0;
		for(int i=0; i<this.name.size(); i++){
			for(int j=0;j<ingredients.length;j++){
				
				if(this.ingredients.get(i)[j].getName().equals(ingredients[j].getName())){
					if(ingredients.length-1 == j){
						CookingRecipeArrayList.add(new CookingRecipe(name.get(i)));
						//CookingRecipeArray[d] = new CookingRecipe(name.get(i));
						//d++;
					}
				}else
					break;
			}
		}
		
		CookingRecipe[] CookingRecipeArray = new CookingRecipe[CookingRecipeArrayList.size()];
		for(int i =0; i<CookingRecipeArrayList.size();i++){
			CookingRecipeArray[i]=CookingRecipeArrayList.get(i);
		}
		
		if(CookingRecipeArray[0] == null){
			return null;
		}else
		return CookingRecipeArray;
	
	}

	//returns all cooking recipes from the cooking book that contain all 
	//the ingredients passed as parameters. If recipe book does not contain 
	//any recipe with the specified ingredients, then return null.
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
		
		ArrayList<CookingRecipe> CookingRecipeArrayList = new ArrayList<CookingRecipe>();
		
		for (int i=0; i<ingredients.size() ;i++){
			if(ingredients.get(i).length < numberOfIngredients){
				CookingRecipeArrayList.add(new CookingRecipe(name.get(i)));
			}
		}
		CookingRecipe[] CookingRecipeArray = new CookingRecipe[CookingRecipeArrayList.size()];
		for(int i =0; i<CookingRecipeArrayList.size();i++){
		CookingRecipeArray[i]=CookingRecipeArrayList.get(i);
		}
		
		if(CookingRecipeArray[0] == null){
			return null;
		}else
		return CookingRecipeArray;
	}
	
	//returns all cooking recipes from the cooking book that contain less then the number 
	//of ingredients passed as parameter. If recipe book does not contain any recipe with 
	//the specified number of ingredients, then return null.
	
	public CookingRecipe[] findRecipesLowCalories(){
		
		ArrayList<Integer> val = new ArrayList<Integer>();
		ArrayList<CookingRecipe> CookingRecipeArrayList = new ArrayList<CookingRecipe>();
		
		int var =0;
		for(int i=0;i<ingredients.size();i++){
			for(int j=0;j<ingredients.get(i).length;j++){
				var += ingredients.get(i)[j].getCaloriesPerUnit();
			}
			val.add(var);
			var = 0;
		}
		
		//Smallest
		
		int small = val.get(0);
		int index = 0;
		
		for (int i = 0; i < val.size(); i++){
		    if (val.get(i) < small){
		        small = val.get(i);
		        index = i;
		    }
		}
		//===========================
		//another of the same small?
		for(int i=0;i< val.size();i++){	
			if(val.get(index)==val.get(i)){
				CookingRecipeArrayList.add(new CookingRecipe(name.get(i)));
			}
		}
		
		CookingRecipe[] CookingRecipeArray = new CookingRecipe[CookingRecipeArrayList.size()];
		for(int i =0; i<CookingRecipeArrayList.size();i++){
			CookingRecipeArray[i]=CookingRecipeArrayList.get(i);
		}
		
		return CookingRecipeArray;
		
	}
	/*
	public void getIngredients(){
		for(int i=0;i<ingredients.size();i++){
			for(int j=0;j<ingredients.get(i).length;j++){
				System.out.println("Ingredient: " + ingredients.get(i)[j].getName()) ;//+ "\n" + "measuringUnit = " + ingredients.get(i)[j].getMeasuringUnit() + "\n" + "caloriesPerUnit = " + ingredients.get(i)[j].getCaloriesPerUnit()+"\n");
			}		
		}
	}
	*/
	//returns all cooking recipes from the cooking book that have the lowest number of calories. 
	//Note: this can be multiple recipies.
	@Override
	public String toString(){
		
		return   "Class Name: RecipeBook.java\n" +
				 "Data Fields: \n"+
				 "private ArrayList<String> bookName = new ArrayList<String>();\n"+
				 "private ArrayList<String> name = new ArrayList<String>();\n"+
				 "private ArrayList<RecipeIngredient[]> ingredients = new ArrayList<RecipeIngredient[]>();\n";
		
		
	}	
	
	@Override
	public boolean equals(Object other)
	{
		if( ((RecipeBook)other).bookName.get(0) == this.bookName.get(0)){
			return true;
		}else 
			return false;
	}
	
	
	//All your above classes should implement the toString() and equals(Object) methods. 
	//The toString() method should return a string with the class name and then all the 
	//data fields one per each line. 
	
	
	//The equals(Object)should check all the data fileds for each class.Forexample, two ingredients, 
	//Ingredient1 and Ingredient2 are equal if they both have the same name AND measuringUnit AND caloriesPerUnit.
	
	//You should also submit an image file UML.jpg with your UML diagram for the homework. 
	//You can create it with Violet or any other UML diagram tool.
}
