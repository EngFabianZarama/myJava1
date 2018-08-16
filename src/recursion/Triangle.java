package recursion;

public class Triangle {
	public static void printTriangle(int n, int k) {
		if (n < 0) {
			return;
		}

		if (n % 2 == 0) {
			n++;
		}

		System.out.println(makeLine(k, ' ') + makeLine(n, 'O'));
		printTriangle(n - 2, k + 1);

	}

	public static void printStars(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("* ");
		}
		System.out.print("\n");
	}

	public static String makeLine(int n, char c) {
		String s = "";
		for (int i = 0; i < n; i++) {
			s += c;
		}
		return s;
	}

	public static String makeStarBucks(int n) {
		if (n > 0) {
			return "*" + makeStarBucks(n - 1) + "$";
		}
		return "";
	}

	public static void printPowerOfTwoStars(int n) {
		if (n == 0) {
			System.out.print("*");
		} else if (n > 0) {

			printPowerOfTwoStars(n - 1);
			printPowerOfTwoStars(n - 1);
		}
	}

	public static int len(String line) {
		int charOccurences = 0; // = 0;

		for (int x = 0; x < line.length(); x++) {
			charOccurences++;
			line = line.substring(x + 1);
			return charOccurences + len(line);
		}
		return charOccurences;

	}

	public static boolean containsVowel(String s){
		if (s.length() == 0){
			return false;
		}


		if (s.toLowerCase().charAt(0) == 'a' || s.toLowerCase().charAt(0) == 'e' || s.toLowerCase().charAt(0) == 'i' || s.toLowerCase().charAt(0) == 'o' || s.toLowerCase().charAt(0) == 'u'){
			return true;
		}else{
			return containsVowel(s.substring(1, s.length()));
		}

	}

	public static String replace(String s){
		String ret="";
		
		if(s.isEmpty()){
			return ret;
		}
		
		if(s.charAt(0)== ' '){
			ret+= '*' ;//+ replace(s.substring(1));
		}else{
		ret += s.charAt(0);
		}
		return ret + replace(s.substring(1,s.length()));
	}

	public static String reverse(String s){
		String ret="";
		
		if(s.isEmpty() || s.length()<1){
		return ret;
		}
		ret += s.substring(s.length()-1);
		return ret + reverse(s.substring(0, s.length()-1));
	}
	
	public static boolean isPalindrome(String s){
		
		if(s.isEmpty() || s.length()==1){
		return true;
		}
			if(s.charAt(0) == s.charAt(s.length()-1)){
				return isPalindrome(s.substring(1, s.length()-1));
			}else
				return false;
	}
	
	public static String makeStars(int a){
		String ret="";
		
		if(a==0){
			return ret;
		}
		
		ret += "*" + makeStars(a-1);
		return ret;
	}
	
	public static void clear(int[] ar, int num){
		if(num==0)
			return;
		else
		ar[num-1]=0;
		clear(ar, num-1);
	}
	
	public static int sum(int[] arr, int num){
		int sums=0;
		if(num==0){
			return sums;
		}
		
		sums += arr[num-1]+sum(arr,num-1);
		return sums;
	}
	
	public static boolean isPalindrome(int[] arr, int start, int end){
		
		if((start==end) || (start == end +1) ){
			return true;
		}
		
		if(arr[start]==arr[end]){
			return isPalindrome(arr,start+1,end-1);
		}else
			return false;
	}
	
	public static int max(int[] a, int index) {
	    if (index > 0) {
	        return Math.max(a[index-1], max(a, index-1));
	    } else {
	        return a[0];
	    }
	}
	
	public static void init(int[] arr, int num){
		if(num == 0){
			return;	
		}else{
			arr[num-1] = num-1;
			init(arr,num-1);
		}	
	}
	
	public static int productOfOdds(int[] arr, int num){
		int ret=1;
		
		if(num==0){
			return ret;
		}
		
		if(arr[num-1]%2 == 1){
		ret *= arr[num-1]*productOfOdds(arr,num-1);
		return ret;
		}else{
		ret *= productOfOdds(arr,num-1);
		}
		return ret;
	}
	
	public static boolean search(int[] arr, int num, int a){
		
		if(num==0){
			return false;
		}
		
		if(arr[num-1]==a){
			return true;	
		}else{
			return search(arr,num-1,a);
		}
	}
	
	public static void reverse(int[] arr, int start, int end){
		int temp = 0;
		
		if(((start <= end +1)) || ((start == end))){
			return;
		}
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			reverse(arr,start+1,end-1);
	}
	
	public static boolean isSorted(int[] arr, int num){
		
		if(num<=1){
			return true;	
		}
		
		if(arr[arr.length-num] <= arr[arr.length-num+1]){
			return isSorted(arr,num-1);
		}else
			return false;
	}
	
	public static void main(String[] args) {
		//System.out.println(containsVowel("BCDIFT"));
		//System.out.println(replace(" hola care bola"));
		//System.out.println(reverse("hola care bola"));
		//System.out.println(isPalindrome("deded"));
		//System.out.println(makeStars(8));
		int[] arr = {2, 1, 2, 3, 4, 5};
		int[] arr2 = new int[3];
		//clear(arr,5);
		//System.out.print(sum(arr,5));
		//System.out.print(isPalindrome(arr,0,2));
		//init(arr2,3);
		//System.out.print(productOfOdds(arr,6));
		//System.out.print(search(arr,6,9));
		//reverse(arr,0,1);
		System.out.println(isSorted(arr,6));
		
	}
}
