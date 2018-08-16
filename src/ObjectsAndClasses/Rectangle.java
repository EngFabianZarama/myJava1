package ObjectsAndClasses;

public class Rectangle {

	private double height;
    private double width;
    
    Rectangle(){
     height=1;
      width=1;
    }
    Rectangle(double a, double b) {
        width=a;
         height=b;
    }
    
    double getArea() {
        return  width* height;
    }
    double getPerimeter() {        
        return  2 *( width+ height);
    }
        
    public String toString() {
       String output = "The area of a "+ width +" x "+height+" Rectangle is " + getArea() +"\n"+
        				"The perimeter of a "+ width +" x "+height+" Rectangle is " + getPerimeter();
        return output;
    }
    public static void main(String[] args) {
        Rectangle objRectangle1 = new Rectangle(4,40);
        Rectangle objRectangle2 = new Rectangle(3.5,35.9);
        
        System.out.println(objRectangle1.toString());
        System.out.println(objRectangle2.toString());
        
        
    }            
}
