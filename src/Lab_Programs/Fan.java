package Lab_Programs;


public class Fan {
	// Three constants named SLOW, MEDIUM, and FAST with values 1, 2, and 3 to denote the fan speed.
	public int SLOW=1, MEDIUM = 2, FAST = 3;
	//An int data field named speed that specifies the speed of the fan (default SLOW).
	public int speed;
	//A boolean data field named on that specifies whether the fan is on (default false).
	public boolean on;
	//A double data field named radius that specifies the radius of the fan (default 5).
	public double radius;
	//A string data field named color that specifies the color of the fan (default blue).
	public String color;
	//A no-arg constructor that creates a default fan.
	Fan(){
		speed=SLOW;
		on=false;
		radius=5;
		color="blue";
	}
	
		
	//The accessor and mutator methods for all four data fields.
	public int getSpeed(){
		return speed;
	}
	
	public boolean getOn(){
		return on;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setSpeed(int inSpeed){
		speed = inSpeed;
	}
	
	public void setOn(boolean inOn){
		on = inOn;
	}
	
	public void setRadius(double inRadius){
		radius = inRadius;
	}
	
	public void setColor(String inColor){
		color = inColor;
	}
	
	// A method named toString() that returns a string description for the fan. 
	//If the fan is on, the method returns the fan speed, color, and radius in one combined string. 
	//If the fan is not on, the method returns fan color and radius along with the string "fan is off" 
	//in one combined string.
	
	public String toString(){
		String value="";
		
		if(on==true){
			value = getRadius()+" "+getColor()+" "+getSpeed();
		}else {
			 value = getRadius()+" "+getColor()+" fan is off";
		
		}
		return value;
	}
	
	public static void main(String[] args){
		
		Fan one = new Fan();
		Fan two = new Fan();
		
		one.setSpeed(3);
		one.setRadius(10);
		one.setColor("yellow");
		one.setOn(true);
		
		two.setSpeed(2);
		two.setRadius(5);
		two.setColor("blue");
		two.setOn(false);
		
		System.out.println(one.toString());
		System.out.println(two.toString());
	}
}
