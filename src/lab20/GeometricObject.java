package lab20;

import java.util.Date;

public abstract class GeometricObject implements Comparable, Cloneable {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

	public int compareTo(Object o1) {
		double area1 = this.getArea();
		double area2 = ((GeometricObject)o1).getArea();
		
		if(area1<area2)
			return -1;
		else if(area1==area2)
			return 0;
		else
			return 1;
	}
	
	public Object clone() throws CloneNotSupportedException{
		GeometricObject copy = (GeometricObject)(super.clone());
		copy.dateCreated = (Date)(dateCreated.clone());
		return copy;
	}
	
	

	public static GeometricObject max(GeometricObject o, GeometricObject o1) {
		if (o.compareTo(o1)>0) {
			return o;
		} else if (o.compareTo(o1)==0) {
			return o;
		} else {
			return o1;
		}
	}
	
	public static GeometricObject max(GeometricObject[] arr){
		GeometricObject max = arr[0];
		for(GeometricObject temp:arr){
			max = (GeometricObject) max(max,temp);
		}
		return max;
		
	}

}