//Fabian Zarama
//109599744
//CSE 114
//Homework #3

package HomeWork;
public class MissingLetters {
	public static String GetMissingLetters(String testString) {
		String alphabet = ("abcdefghijklmnopqrstuvwxyz");
		testString = testString.toLowerCase();
		char low = 'z';
		char hi = 'a';
		// Find lowest letter
		for (int i = 0; i < testString.length(); i++) {
			if (low > testString.charAt(i)) {
				low = testString.charAt(i);
			}
		}

		// Find high letter
		for (int i = 0; i < testString.length(); i++) {
			if (hi < testString.charAt(i)) {
				hi = testString.charAt(i);
			}
		}

		// get range
		alphabet = alphabet.substring(alphabet.indexOf(low) + 1, alphabet.indexOf(hi));

		// delete letters
		for (int i = 0; i < testString.length(); i++) {
			for (int j = 0; j < alphabet.length(); j++)
				if (testString.charAt(i) == (alphabet.charAt(j))) {
					alphabet = alphabet.replace(alphabet.charAt(j), '\0');
				}
		}

		return alphabet;

	}
	public static void main(String[] args){
		System.out.print(GetMissingLetters("zzzz"));
	}

}
