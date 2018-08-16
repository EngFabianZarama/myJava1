package ObjectsAndClasses;

public class Fan {
	private final int SLOW=1, MEDIUM=2,FAST=3;//final to make it constant
	private int speed=SLOW;
	private boolean on = false;
	private double radius=5;
	private String color = "blue";
	//Def constructor
	public Fan(){
		speed=SLOW;
		radius=5;
		color = "blue";
		on=false;
	}
	//constructor with inputs
	public Fan(int inSpeed, int inRadius, String inColor, boolean inOn){
		speed= inSpeed;
		radius = inRadius;
		color = inColor;
		on = inOn;
	}
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
	
	public void setSpeed(int a){
		speed=a;
	}
	
	public void setOn(boolean a){
		on = a;
	}
	
	public void setRadius(double a){
		radius =a;
	}
	
	public void setColor(String a){
		color =a;
	}
	
	public String  toString(){
		String output;
		if(on==true){
			output= "A "+getRadius()+" inch "+getColor()+" fan at a speed of "+getSpeed();
		}else {
			 output= "A "+getRadius()+" inch "+getColor()+" fan; fan is off";
		}
		
		return output;
	}
	
	public static void main(String[] args){
		
		Fan uno = new Fan(3,10,"yellow",true);
		Fan dos = new Fan(2,5,"blue",false);
		
		System.out.println(uno.toString());
		System.out.println(dos.toString());
		
	}
}
