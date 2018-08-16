package lab16;
/**the number of titles it offers and 
 * its address. 
 * Code the constructor and the 
 * toString method of the new class. 
 * 
 * You also need to include a client class to test your code. 
 */
public class MusicStore extends Store {
	private int titles;
	private String address;
	
	public MusicStore(int a, String b){
		titles = a;
		address = b;
	}
	
	public String toString(){
		return "The number of titles is " + titles + ", the address is " + address;
	}
}
