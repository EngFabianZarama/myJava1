package lab13;

public class MyString1 {

	private String str = "";
	private char[] temp;

	public MyString1(char[] chars) {
		temp = chars;
		for (int d = 0; d < chars.length; d++)
			str += Character.toString(chars[d]);
	}

	public char charAt(int index) {
		return str.charAt(index);
	}

	public int length() {
		return str.length();
	}

	public MyString1 substring(int begin, int end) {
		char[] substring = new char[end - begin];

		for (int i = begin; i < end; i++) {
			substring[i - begin] = this.charAt(i);
		}

		return new MyString1(substring);
	}

	public MyString1 toLowerCase() {
		temp.toString().toLowerCase();
		return new MyString1(temp);
	}

	public String getMystring1() {
		return str;
	}

	public boolean equals(MyString1 s) {
		if (str.length() != s.length()) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != s.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	public static MyString1 valueOf(int i) {
		return new MyString1(Integer.toString(i).toCharArray());
	}

	public MyString1[] split(String s) {
		MyString1[] strArr = new MyString1[str.length()];
		
		int j=0;
		for (String i : str.split(s)) {
			 //System.out.println(i);
			strArr[j]= new MyString1(i.toCharArray());
			j++;
		}

		return strArr;
	}

}
