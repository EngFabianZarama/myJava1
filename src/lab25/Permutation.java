package lab25;

public class Permutation {
	public static void displayPermutation(String s){
		displayPermutation("",s);
	}
	
	public static void displayPermutation(String s1, String s2){
		if(s2.isEmpty()){
			System.out.println(s1);
		}
		
		for (int i = 0; i < s2.length(); i++) {
			displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1));
	    }
	}

	public static void main(String[] args){
		displayPermutation("abc");
	}
}
