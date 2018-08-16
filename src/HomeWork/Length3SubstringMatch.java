//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork;
public class Length3SubstringMatch {
	public static int stringMatch3(String a, String b) {
		int ret = 0;
		String min = "";
		
		min = (a.length() > b.length())? b:a;
	
		for (int i = 0; i < min.length() - 2; i++) {
			
			if(a.charAt(i) == b.charAt(i)){
				if(a.charAt(i+1) == b.charAt(i+1)){
					if(a.charAt(i+2) == b.charAt(i+2)){
						ret++;
					}
				}
				
			}
		}
		return ret;
	}

}
