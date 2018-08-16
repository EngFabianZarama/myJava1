package lab19;

public class Client {
	public static void main(String[] args) {
		 
		Bicycle racer = new Bicycle("me");
        
        System.out.println("Owner = "+racer.getOwner());
        System.out.println("Wheels = "+racer.getWheels());

        System.out.println("\n\n");
        
        MotorizedVehicle car = new MotorizedVehicle("also me", 4, 3.0);         
        System.out.println("Vehicle owner = "+car.getOwner());
        System.out.println("Wheels = "+car.getWheels());
        System.out.println("Engine size (litres) = "+car.getEngineSize());
        System.out.println("Horse Power = "+car.getHorsePower());
        
        //=================================//
        System.out.println("\n\n");
        
        Food apple = new Fruit_Food("apple");
        apple.setCal(10);
        apple.setDescription("sweet");
        
        System.out.println(apple.getDescription());
        System.out.println(apple.calories(2));
        
        //=================================//
        System.out.println("\n\n");
        
        Graduate student1 = new Graduate("SBU");
        student1.setCollegeToApply("SBU");
        System.out.println("Student 1: "+student1.from());
        
        Undergraduate student2 = new Undergraduate(500,5);
        student2.setCollegeToApply("SBU");
        System.out.println("Student 2: " + student2.getCollegeToApply());
        System.out.println("GPA: "+student2.getGPA());
        System.out.println("SAT: "+student2.getSAT());
        
	}
}
