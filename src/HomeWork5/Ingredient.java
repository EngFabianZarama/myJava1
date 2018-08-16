
//Fabian Zarama
//109599744
//CSE 114
//Homework #5
package HomeWork5;
public class Ingredient {
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;

	public Ingredient(String name, String measuringUnit, int caloriesPerUnit){
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeasuringUnit() {
		return measuringUnit;
	}

	public void setMeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit;
	}

	public int getCaloriesPerUnit() {
		return caloriesPerUnit;
	}

	public void setCaloriesPerUnit(int caloriesPerUnit) {
		this.caloriesPerUnit = caloriesPerUnit;
	}
	
	
	public String toString(){
		String s = "";
		s += "\n"+"Ingredient\n"+ "name = " + name + "\n" + "measuringUnit = " + measuringUnit + "\n" + "caloriesPerUnit = " + caloriesPerUnit+"\n";
 		return s;
	}
	
	
	public boolean equals(Object other)
	{
		
		if(((Ingredient)other).getName() == name && ((Ingredient)other).getMeasuringUnit() == measuringUnit && ((Ingredient)other).getCaloriesPerUnit() == caloriesPerUnit) {
			return true;
		}else 
			return false;
	}
	//The Ingredient.java toString() method should return
	//‘‘Ingredient\n’’+ ‘‘name=’’ + name + ‘‘\n’’ + ‘‘measuringUnit=’’ + measuringUnit + ‘‘\n’’ + ‘‘caloriesPerUnit=’’
	//+ caloriesPerUnit;
}
