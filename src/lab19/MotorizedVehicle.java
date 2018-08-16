package lab19;

public class MotorizedVehicle extends vehicle{
	private String owner;
    private int wheels;
    private double engineSize;
    
    
    public MotorizedVehicle() {}

    public MotorizedVehicle(String a, int b, double c) {
            owner = a;
            wheels = b;
            engineSize = c;
    }

    public String getOwner() {
            return owner;
    }

    public int getWheels() {
            return wheels;
    }
    
    public double getEngineSize() {
        return engineSize;
    }

	public double getHorsePower() {
	        return engineSize * wheels;
	}
    
}
