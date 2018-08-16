package lab19;

public class Bicycle extends vehicle {
	private String owner;
    private int wheels;

    public Bicycle() {}

    public Bicycle(String a) {
            owner = a;
            wheels = 2;
    }

    public String getOwner() {
            return owner;
    }

    public int getWheels() {
            return wheels;
    }
}
