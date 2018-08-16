package Lab_Programs;

public class Stock {
	//A string data field named symbol for the stock's symbol.
	public String symbol;
	//A string data field named name for the stock's name.
	public String name;
	//A double data field named previousClosingPrice that stores the stock price for the previous day.
	public double previousClosingPrice;
	//A double data field named currentPrice that stores the stock price for the current time.
	public double currentPrice;
	// A constructor that creates a stock with specified symbol and name.
	
	Stock(String inSymbol, String inName){
		symbol = inSymbol;
		name = inName;
	}
	//The accessor methods for all data fields.
	public String getSymbol(){
		return symbol;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	
	public double getCurrentPrice(){
		return currentPrice;
	}
	
	//The mutator methods for previousClosingPrice and currentPrice.
	public void setPreviousClosingPrice(double a){
		previousClosingPrice = a;
	}
	
	public void setCurrentPrice(double a){
		currentPrice = a;
	}
	
	//A method named changePercent() that returns the percentage 
	//changed from previousClosingPrice to currentPrice.
	public double changePercent(){
		double value = getCurrentPrice();
		return value;
	}
	
	//Write a test program that creates a Stock object with the stock symbol GOOG, 
	//the name Google Inc., and the previous closing price of 100. Set a new current 
	//price to 90 and display the price-change percentage.
	public static void main(String[] args){
		Stock a =  new Stock("GOOG","Google Inc.");
		a.setPreviousClosingPrice(100);
		a.setCurrentPrice(90);
		
		System.out.println(a.changePercent());
		
	}
}
