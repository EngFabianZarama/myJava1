package lab16;

/**
 * an Internet address and the programming language in which the website was
 * written. Code the constructor and the toString method of the new class.
 * 
 * You also need to include a client class to test your code.
 */
public class WebStore extends Store {
	private String intAddress;
	private String language;

	public WebStore(String a, String b) {
		intAddress = a;
		language = b;
		
	}

		
	public String toString() {
		return "The internet address is " + intAddress + ", and the language used is " + language;
	}
}
