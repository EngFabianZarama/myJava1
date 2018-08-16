package lab20;

import java.util.Date;

public abstract class Vehicle implements Cloneable,Comparable {
	
	private boolean start;
	private boolean stop;
	private int capacity;
	
	public Vehicle(){}
	
	public Vehicle(boolean a, boolean b, int c){
		start = a;
		stop = b;
		capacity = c;
	}
	public void start(boolean a){
		start = a;
	}
	
	public void stop(boolean a){
		stop = a;
	}
	public void setCapacity(int a){
		 capacity = a;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public int compareTo(Object o){
		if(getCapacity() == ((Vehicle)o).getCapacity()){
			return 0;
		}else if(getCapacity() > ((Vehicle)o).getCapacity()){
			return 1;
		}else 
			return -1;
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		Vehicle copy = (Vehicle)(super.clone());
		return copy;
	}
	
	public static boolean equals(Vehicle o1, Vehicle o2){
		if(o1.getCapacity()==o2.getCapacity()){
			return true;
		}else
		return false;
	}
}
