//Fabian Zarama
//109599744
//CSE 114
//Homework #3

package HomeWork;
public class BaseToBase {
	public static String base2base(String n, int b1, int b2) {
		
		if (n.matches("[0-9]+")) {
			int hi = Integer.valueOf(n, b1);
			int num = Integer.parseInt(n);
			String output = Integer.toString(hi, b2);
			return output.toUpperCase();
		}else{
			int hi = Integer.valueOf(n, b1);
			String output2 = Integer.toString(hi, b2);
			return output2.toUpperCase();
		}

	}
	
	public static void main(String[] args){
		System.out.print(base2base("246",7,36));
	}
}
