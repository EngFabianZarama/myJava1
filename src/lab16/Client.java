package lab16;
import java.util.ArrayList;
public class Client {
	public static void main(String[] args) {
		Store cafeStore = new Store("CafeStore","123 there ave",123123,"abcd");
		WebStore cafe = new WebStore("www.cafesbu.com","java");
		System.out.println(cafeStore);
		System.out.print(cafe);
		
		System.out.println("\n");
		
		Store musicStore = new Store("MusicStore","098 here st",123213,"asdffs");
		MusicStore music = new MusicStore(10,"2nd");
		System.out.println(musicStore);
		System.out.print(music);
		
		System.out.println("\n");
		
		Store bikeStore = new Store("Bike and Skateboard Store","098 a st",123213,"qqqqqq");
		BikeAndSkateboard bike = new BikeAndSkateboard(8,true);
		System.out.println(bikeStore);
		System.out.print(bike);
		
	}
}
