package inheritance_and_polymorphism;

import java.util.Scanner;

abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean , the get method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

}


/*
 * Test your Triangle class in a Drive program (in the same file) that prompts
 * the user to enter the three sides of the triangle, the color, and whether or
 * not the triangle is filled. The program should create a Triangle object with
 * these sides and set the color and filled properties. Then, it should display
 * the area, perimeter, color, and filled value .
 * 
 * 
 * Enter·side·1·of·triangle:3↵ Enter·side·2·of·triangle:4↵
 * Enter·side·3·of·triangle:5↵ Enter·color·of·triangle:purple↵
 * Enter·whether·triangle·is·filled·(yes/no):no↵ Area:·6.0↵ Perimeter:·12.0↵
 * Color:·purple↵ Filled?:·false↵
 */
