package lab16;
/**the number of bicycle and skateboard brands that it carries and 
 * whether it sponsors a bike or skateboard club (just boolean field). 
 * 
 * Code the constructor and the toString method of the new class. You also need to include a client class to test your code.
 */
public class BikeAndSkateboard {
	private int brands;
	private boolean club;
	
	public BikeAndSkateboard(int a, boolean b){
		brands = a;
		club = b;
	}
	
	public String toString(){
		return "Brands: "+brands+
				"\nClub: "+club;
	}
}
