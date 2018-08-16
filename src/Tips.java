
import java.util.Scanner;

public class Tips {

	
	public static void main(String[] args){
		
		
		
	// public static final int hi; Constant variable
	//command+shift+f = fixes the letters
	//to truncate = Math.floor(value * 100) / 100
	//else if (age<=21 && choice.equals("T")){
	//System.out.print("cranberry juice");
		
	//sample to do write another form of if
		//recalled = ((modelYear <= 1998 && modelYear >= 1995) || (modelYear <= 2006 && modelYear >= 2004));
    	//ticketPrice = (age >= 16) ? 20 : 10;
    	//is the same as 
		//if (age >= 16){
    	//	  ticketPrice = 20;
    	//}else{
    	//	  ticketPrice = 10;
    	//}
//("%.2f in celsius is. %.3f", calius,celsiustofarenheith)
// %d for int variables
//System.out.printf("The highest score was %.2f and " +highName+" got it",high);
	
		//STRINGS
		
		//word.substring(0,3) === shows the first 3 leters of the variable string word
		//word.comareTo(hola)>0 === compares if word is bigger than hola
		//word.equals(hola) === is the same as word == hola
		//word.length()
		//name.charAt(0) === What is the diffrence between this one (20877 chapter 4.4)
		//name.substring(0,1) ===  and this one... (substracs de la letra 0 a la 1)
		//text.substring(0, text.indexOf("@")); 
		//int end = sentence.indexOf(" ", 0); para encontrar la palabra q comiensa desde el 0
		//firstWord = sentence.substring(0,end);hasta el primer espacio
		//int start = word.indexOf("dr");
		//drWord = word.substring(start,4);
		
		//public static void correctPassword(String a){
			//A password must have at least eight characters .
			//A password consists of only letters and digits.
			//A password must contain at least two digits.
			//String pattern = "^(?=.*?\\d.*\\d)[a-zA-Z0-9]{8,}$";
			
			//if (a.matches(pattern)){
				//System.out.println("Valid Password");
			//}else{
				//System.out.println("Nhaa");
			//}
		
		//}
		
		
		
		
		
		//2D ARRAYs
		//isRectangular = true;
		//for (int i = 1; i < a2d.length; i++)
		//if (a2d[0].length != a2d[i].length)
		//isRectangular = false;
			
		//isSquare = true ;
		//for (int i = 0 ; i < a2d.length; i++ ){
		//   if (a2d.length != a2d[i].length )
		//	   isSquare = false ;
		//}
		
		//int[][][] x = {{{5,5,5,5},{5,5,5,5}},
        //               {{7,7,7,7},{7,7,7,7}},
        //               {{8,8,8,8},{30,31,32,33}}};
	 
	 //System.out.println(x.length);// 3 rows
		
		
		
		///Objects and classes
		/*
		import java.util.Arrays;
		import java.util.Scanner;

		class myprogrammin {
			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				Value value = new Value(5);
				int i = value.getVal();
				value.setVal(10);
				boolean b = value.wasModified();
			}
		}

		class Value{
			private int theNum;
			private boolean wasCalled=false;
			
			public Value(int a){
			theNum=a;
			System.out.println("Aqui 1");
			}
			
			public Value(){
			theNum=0;
			System.out.println("Aqui 2");
			}
			
			public void setVal(int a){
			theNum=a;
			wasCalled=true;
			System.out.println("Aqui 3");
			}
			
			public boolean wasModified(){
				System.out.println("Aqui 4");
				return wasCalled;
				
			}
			
			public int getVal(){
				System.out.println("Aqui 5");
				if(wasCalled==true){
					return theNum;
				}else{
					return theNum;	
				}
			}
		}
	*/

		
	}
}
