package midterm_1;

/*
1 = A
2 = 4
3 = C,D
4 = 65
5 = A
6 = 1,4,6
7 = 9
8 = int rand = (int) (15 + (int)(Math.random() * ((25 - 15) + 1)));//15-25 Random number
9 = double quotient = (float) sum/count;
10 = String[] letters = new String[200];
11 = a,b,e (ojo con esta)
12 = a
13 = e
14 = a
15 = 10
16 = for(int count=0;count<=9;count++){}
17 = public static double series(int i){
		double value;
		for(int j=1;j<=i;j++){
		value +=  (double)j/((2*j)+1);	
		}
		return value;
		}
18 = public static void print(int n){
		for(int i=1;i<=n;i++){
			if(i%7==0){
			System.out.println(i);
			}else{
			System.out.print(i+" ");
		}
		}
19 = public static void priramid(int n) {//una piramide inversa
		int s = 1;
		do {
			for (int i = s; i <= n; i++) {
				System.out.print(i);
			}
			for (int i = n - 1; i >= s; i--) {
				System.out.print(i);
			}
			System.out.print("\n");
			for (int i = 0; i < s; i++) {
				System.out.print(" ");
			}
			s++;

		} while (s != n + 1);
	}
	
20 = public static int[] buildHistogram(int[] arr){
		int[] value = new int[10];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0 && arr[i]<=9){
				value[0]+=1;
			}
			if(arr[i]>=10 && arr[i]<=19){
				value[1]+=1;
			}
			if(arr[i]>=20 && arr[i]<=29){
				value[2]+=1;
			}
			if(arr[i]>=30 && arr[i]<=39){
				value[3]+=1;
			}
			if(arr[i]>=40 && arr[i]<=49){
				value[4]+=1;
			}
			if(arr[i]>=50 && arr[i]<=59){
				value[5]+=1;
			}
			if(arr[i]>=60 && arr[i]<=69){
				value[6]+=1;
			}
			if(arr[i]>=70 && arr[i]<=79){
				value[7]+=1;
			}
			if(arr[i]>=80 && arr[i]<=89){
				value[8]+=1;
			}
			if(arr[i]>=90 && arr[i]<=100){
				value[9]+=1;
			}
		}
		
		return value;
	}
	=============BETER FORM==============
	public static int[] buildHistogram(int[] nums) {
	     final int NUM_BINS = 10;
	     int[] result = new int[NUM_BINS];
	     for (int num: nums) {
	          int bin = num / 10;
	          if (num == 100)
	               bin = 9;
	          result[bin]++;
	     }
	     return result;
	}

21 = 
public static String stripDigits(String a) {
		String resutl = "";

		for (int i = 0; i < a.length(); i++) {
			if (!Character.isDigit(a.charAt(i)))//Character.isAlphanumeric
				resutl += a.charAt(i);
		}
		return resutl;
	}
 */
public class practice {
	public static String stripDigits(String a) {
		String resutl = "";

		for (int i = 0; i < a.length(); i++) {
			if (!Character.isDigit(a.charAt(i)))// Character.isAlphanumeric
				resutl += a.charAt(i);
		}
		return resutl;
	}

	public static void printPiramid(int n) {
		int value = n;
		for (int number = n; number >= 1; number--) {
			// print spaces
			for (int space = 1; space <= number; space++)
				System.out.print(" ");
			// print increasing numbers
			for (int i = number; i <= 3; i++)
				System.out.print(i);
			// print decreasing numbers
			for (int i = number; i > value; i--)
				System.out.print(i);
			System.out.println();
			value--;

		}
	}

	public static void printSquare(int n) {

		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}

		for (int j = 1; j <= n - 2; j++) {
			System.out.println();
			System.out.print("*");
			for (int i = 1; i <= n - 2; i++) {
				System.out.print(" ");
			}
			System.out.print("*");

		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}

	public static void printSpaceShip(int n) {
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("\\");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			System.out.print(">");
			System.out.print(">");
		}
		System.out.println();
		for (int j = n; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}

	public static void printNumSquare(int n) {
		int[] arr = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

		for (int k = 1; k <= n - 1; k++) {
			// shift left
			int temp = 0;
			temp = arr[1];
			for (int i = 1; i <= n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;

			for (int i = 1; i <= n; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

	public static String encrypt(String a) {
		String result = "";
		char chResult = '\0';
		char temp = '\0';

		for (int i = 0; i < a.length() - 2; i++) {
			result += a.charAt(i);
		}
		return result;
	}

	public static void reverse(String a) {
		String reverse ="";
		for(int i = a.length()-1;i>=0;i--){
			reverse+=a.charAt(i);
		}
		System.out.print(reverse);
	}

	public static void main(String[] args) {
		reverse("The quick brown fox jumps over the lazy dog.");
		// int a=1;
		// System.out.println(25%7);
		// System.out.println("M" + "D");//13-4

		// int sum=1,count=2;

		// double quotient = (float) sum/count;
		// System.out.println(quotient);

	}

}

class Typetester {
	void printType(byte x) {
		System.out.println(x + " is an byte");
	}

	void printType(int x) {
		System.out.println(x + " is an int");
	}

	void printType(float x) {
		System.out.println(x + " is an float");
	}

	void printType(double x) {
		System.out.println(x + " is an double");
	}

	void printType(char x) {
		System.out.println(x + " is an char");
	}
}
