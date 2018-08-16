package midterm_2;

public class A {
	private int x;
	
	public A(){}
	
	public A(int a) {
		x = a;
		System.out.println("The default constructor of A is invoked");
	}

	

	public int getX() {
		return x;
	}

	public String toString() {
		return "A's x is " + x;
	}
	
	public void setX(int x){
		this.x = x;
	}
}
