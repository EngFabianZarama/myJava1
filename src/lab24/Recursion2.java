package lab24;

public class Recursion2 {
	public static int count(char[] chars, char ch){
		int oc=0;
		for(int i=0;i<chars.length;i++){
			if(ch==chars[i]){
				oc++;
			}
		}
		return oc;
	}
	
	public static int uppercase(String s){
		int cnt=0;
		for(int i =0; i<s.length(); i++)
			if(Character.isUpperCase(s.charAt(i)))
				cnt++;
		return cnt;
	}
	
	public static boolean palindrome(String s){
		if(s.isEmpty() || s.length()==1){
			return true;
		}else{
			if(s.charAt(0)==s.charAt(s.length()-1)){
				return palindrome(s.substring(1,s.length()-1));
			}else{
				return false;
			}
		}
		
	}
	
	public static int sum(int a){
		if(a==1){
			return 1;
		}
		return a+sum(a-1);
	}
	
	public static String reverse(String s){
		String ret="";
		if(s.isEmpty() || s.length()<1){
			return ret;
		}
		 ret += s.substring(s.length()-1);
		 return ret + reverse(s.substring(0, s.length()-1));
	}
	
	public static void main(String[] args){
		char[] c = {'a','b','a','a'};
		
		System.out.println("Count: "+count(c,'a'));
		System.out.println("Uppercase: "+uppercase("ASFdscVsdeWsdsaQSdfsdfEvbdsfvfRT"));
		System.out.println("Palindrome: "+palindrome("chooc"));
		System.out.println("Sum: "+sum(8));
		System.out.println("Reverse: "+reverse("17898"));
	}

}
