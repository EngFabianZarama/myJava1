//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork;

public class RunLengthEncoding {
	public static String encode(String message, char delimiter) {
		
		if(message==null || message.length()==0){
			return message;
		}
		String output = "";
		message+=".";
		
		int same = 0, count = 0;
		
		int i =0;
		int j=0;
		do{
			
			do{
				

				if (message.charAt(i)==message.charAt(j)) {
					same++;

					if (same >= 4) {
						count++;// *A6
					}

				} else {
					same = 0;
					if (count >= 1) {
						output = output + Character.toString(delimiter) + message.charAt(i) + (count + 3);
						count = 0;
						i = j - 1;
						break;
					}

					output += message.charAt(i); 

					break;
				}
				j++;
			}while(j<=message.length());
			i++;
			if(message.charAt(i)=='.'){
				return output;
			}
		}while(i<message.length());
		
		
		return output;
		
	}

}
