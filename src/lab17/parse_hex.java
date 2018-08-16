package lab17;

public class parse_hex {
	
	public static int parseHex(String input) throws HexFormatException{
		if(input.toLowerCase().matches("[\\da-f]+")){
		return Integer.valueOf(input, 16);
		}else 
			throw new HexFormatException("Not a hex value");
		
	}
	
	public static void main(String[] args){
		try {
			System.out.print(parseHex("aBc"));
		} catch (HexFormatException e) {
			 System.out.println(e.getMessage());
		}
	}
	
}
