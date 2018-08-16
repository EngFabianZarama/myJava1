//Fabian Zarama
//109599744
//CSE 114
//Homework #5
package HomeWork5;

import java.util.ArrayList;

//should contain a main method that tests all the methods in the problem.
public class TestRecipeBook {
	public static void main(String[] args) {
		
		//Test public RecipeBook(String bookName)
		RecipeBook cakes = new RecipeBook("cakes");
			
		//Test public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
		RecipeIngredient[] nullIngre = new RecipeIngredient[3]; 
		nullIngre[0] = new RecipeIngredient("Empty","oz",10,30);
		
		
		
		RecipeIngredient[] fresaIngre = new RecipeIngredient[3]; 
		fresaIngre[0] = new RecipeIngredient("papa","oz",10,30);
		fresaIngre[1] = new RecipeIngredient("aroz","oz",100,30);
		fresaIngre[2] = new RecipeIngredient("leche","oz",5,300);
		
		RecipeIngredient[] fresaYPinaIngre = new RecipeIngredient[3]; 
		fresaYPinaIngre[0] = new RecipeIngredient("papa","oz",10,30);
		fresaYPinaIngre[1] = new RecipeIngredient("aroz","oz",100,30);
		fresaYPinaIngre[2] = new RecipeIngredient("leche","oz",5,300);
		
		RecipeIngredient[] moraIngre = new RecipeIngredient[6]; 
		moraIngre[0] = new RecipeIngredient("egg","oz",10,3);
		moraIngre[1] = new RecipeIngredient("fluor","oz",100,30);
		moraIngre[2] = new RecipeIngredient("butter","oz",5,300);
		moraIngre[3] = new RecipeIngredient("color","oz",10,3);
		moraIngre[4] = new RecipeIngredient("flavor","oz",100,30);
		moraIngre[5] = new RecipeIngredient("levadura","oz",5,300);
		
		RecipeIngredient[] otroIngre = new RecipeIngredient[6]; 
		otroIngre[0] = new RecipeIngredient("egg","oz",10,3);
		otroIngre[1] = new RecipeIngredient("fluor","oz",100,30);
		otroIngre[2] = new RecipeIngredient("butter","oz",5,300);
		otroIngre[3] = new RecipeIngredient("color","oz",10,3);
		otroIngre[4] = new RecipeIngredient("flavor","oz",100,30);
		otroIngre[5] = new RecipeIngredient("levadura","oz",5,300);
		
		RecipeIngredient[] masIngre = new RecipeIngredient[6]; 
		masIngre[0] = new RecipeIngredient("egg","oz",10,3);
		masIngre[1] = new RecipeIngredient("fluor","oz",100,30);
		masIngre[2] = new RecipeIngredient("butter","oz",5,300);
		masIngre[3] = new RecipeIngredient("color","oz",10,3);
		masIngre[4] = new RecipeIngredient("flavor","oz",100,30);
		masIngre[5] = new RecipeIngredient("levadura","oz",5,300);
		
	
		//System.out.println("Ingredients to addRecipe into "+ cakes.getBookName() + " RecipeBook");
		//System.out.println(cakes.addRecipe("otro", otroIngre).getName());
		//System.out.println(cakes.addRecipe("mas",  masIngre).getName());
		//System.out.println(cakes.addRecipe("fresaYPina", fresaYPinaIngre).getName());
		//System.out.println(cakes.addRecipe("fresa", fresaIngre).getName());
		//System.out.println(cakes.addRecipe("mora", moraIngre).getName());
	
		//System.out.print("\n\n");
		
		ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
		ingredientList.add(new Ingredient("egg","oz",10));
		ingredientList.add(new Ingredient("fluor","oz",100));
		ingredientList.add(new Ingredient("color","oz",10));
		
		System.out.println(ingredientList.toString());
		//cakes.getIngredients();
		
		//Test public String toString(){ from java.Ingredient
				//System.out.println(masIngre[0].toString());
				//System.out.println(cakes.toString());	
		
	//Test public CookingRecipe removeRecipe(String name){
		//cakes.removeRecipe("fresa");
		//System.out.print(cakes.toString());
		
	//Test public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
		/*
		int exit=0;
		int i=0;
		while(exit==0){
			try{
				System.out.println(cakes.findRecipes(moraIngre)[i].getName()+"\n");
				i++;
			}catch (Exception ex){
				exit=1;
			}
		}
		*/
	//Test public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
		/*
		int exit=0;
		int i=0;
		while(exit==0){
			try{
				System.out.println(cakes.findRecipesWithFewIngredients(4)[i].getName()+"\n");
				i++;
			}catch (Exception ex){
				exit=1;
			}
		}
		*/
		
		
	//Test public CookingRecipe[] findRecipesLowCalories(){
		/*
		int exit=0;
		int i=0;
		while(exit==0){
			try{
			System.out.println(cakes.findRecipesLowCalories()[i]+"\n");
			i++;
			}catch (Exception ex){
				exit=1;
			}
		}
		*/
		
		
	//Test public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
		
		CookingRecipe moraPastel = new CookingRecipe("moraPastel");
		
		moraPastel.addOrUpdateRecipeIngredient(new RecipeIngredient("leche","oz",50,3), (float)2);
		moraPastel.addOrUpdateRecipeIngredient(new RecipeIngredient("arina","oz",60,2), (float)3);
		
	//Test public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
		//System.out.println(moraPastel.getRecipeIngredient(new RecipeIngredient("arina","oz",10,30)).getName());
		
	//Test public RecipeIngredient getRecipeIngredient(String ingredientName){
		//System.out.println(moraPastel.getRecipeIngredient("arina").getName());
		
	//Test public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
		//System.out.println(moraPastel.removeRecipeIngredient(new RecipeIngredient("arina","oz",10,30)).getName());
	
	//Test public RecipeIngredient removeRecipeIngredient(String ingredientName){
		//System.out.println(moraPastel.getRecipeIngredient("arina").getName());
		
	//Test public float calculateCalories(){
		//System.out.println(moraPastel.calculateCalories());
		
	//Test public int getNumberOfIngredients(){
		//System.out.println(moraPastel.getNumberOfIngredients());
		
	//Test toString()
		//System.out.println(moraPastel.toString());
		
		/**
		 * The equals(Object)should check all the data fileds for each class.Forexample, two ingredients, 
		 * Ingredient1 and Ingredient2 are equal if they both have the same name AND measuringUnit AND caloriesPerUnit.
		 */
		
		Ingredient ingre1 = new RecipeIngredient("papa","oz",11,2.2f);
		Ingredient ingre2 = new RecipeIngredient("papa","oz",111,3.3f);
		
		CookingRecipe cr1 = new CookingRecipe("yaya");
		CookingRecipe cr2 = new CookingRecipe("yaya");
		
		RecipeBook rb1 = new RecipeBook("tutu");
		RecipeBook rb2 = new RecipeBook("tutu");
		
		//System.out.println(rb1.equals(rb2));
		//System.out.println(rb1.equals(rb2));
		//System.out.println(rb1.equals(rb2));
		
		//System.out.println(ingre1.toString());
		
	}
}
