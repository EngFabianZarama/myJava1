package midterm_2;

import java.util.Scanner;

class Calculate {//round it to 3 decimal places
    public static double output;
    
	Scanner input = new Scanner(System.in);
    
    Calculate(){}
    
    public int get_int_val(){
        return input.nextInt();
    }
    
    public static void do_calc(){
		output=1;
    }
        
    public static double get_volume(int a){
        return Math.pow(a,3);
    }
        
    public static double get_volume(int l, int b, int h){
        return (l*b*h);
    }
    
    public static double get_volume(double r){
        return (Double)((2.0/3.0)*Math.PI*r);
    }
    
    public static double get_volume(double r, double h){
        return (Double)(Math.PI*(Math.pow(r,2))*h);
    }
    
    public void output(){}
    
    public static void display(double val){
        System.out.println(val);
    }
}

class Circle {
	  private double radius;
	  
	  public Circle(double radius) {
	    this.radius = radius;  
	  }
	}

class Cylinder extends Circle {
	  double length;
	  
	  Cylinder(double radius) {
		  super(radius);
	  }

	
	}


class C1 {};
class C2 extends C1 {};
class C3 extends C2 {};

public class Test{
	
	
	public static void main(String[] args) {
		//Calculate cal = new Calculate();
		//double volume=0.0;
		 //int a = cal.get_int_val();
	     //volume = Calculate.get_volume(a);
	     //Calculate.display(volume);
	     //Calculate.output.display(volume);
	     
		C2 c2 = new C2();
		C3 c3 = new C3();
		//c2 = (C2)((C1)c3);
		
		System.out.println(c2 instanceof C3);
	} 
}