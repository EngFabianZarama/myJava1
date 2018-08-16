package lab20;

public class Test3 {
	public static void main(String[] arrgs){
		
		Vehicle[] v = new Vehicle[6];
		
		v[0] = new Boat(true,false,10);
		v[1] = new Boat(true,false,100);
		v[2] = new Boat(false,true,1000);
		
		v[3] = new Car(true,false,4);
		v[4] = new Car(true,false,6);
		v[5] = new Car(false,true,6);
		
		System.out.println(Vehicle.equals(v[0], v[2]));
		System.out.println(Vehicle.equals(v[4], v[5]));
		
		((Boat) v[0]).floatOnWater();
		((Car) v[3]).honk();
	}
}
