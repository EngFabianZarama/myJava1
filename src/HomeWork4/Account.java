//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;
import java.util.Date;

public class Account {
	//- A private int data field named id for the account (default 0).
	private int id;
	
	//- A private double data field named balance for the account (default 1000).
	private double balance;
	
	//- A private double data field named annualInterestRate that stores the current interest rate (default 4.50).
	private double annualInterestRate;
	
	//- A private java.util.Date data field named dateCreated that stores the date when the account was created.
	private java.util.Date dateCrated;
	
	//- A no-arg constructor that creates a default account.
	public Account() {
		id = 0;
		balance = 1000;
		annualInterestRate = 4.50;
	}

	//- A constructor that creates an account with a specified id and initial balance.
	public Account(int a, double b){
		id = a;
		balance = b;
	}
	
	//- The accessor and mutator methods for id, balance, and annualInterestRate.
	public int getId(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setId(int a){
		id = a;
	}
	
	public void setBalance(double a){
		balance = a;
	}
	
	public void setAnnualInterestRate(double a){
		annualInterestRate = a;
	}
	
	//- The accessor method for dateCreated.
	public Date getDateCrated(){
		return dateCrated;
	}
	
	//- A method named getMonthlyInterestRate() that returns the monthly interest rate (annualInterestRate/12).
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	}
	
	//- A method named withDraw(double amount) that withdraws a specified amount from the account. 
	//If there are not enough funds to withdraw an amount of money, print a statement saying that 
	//there are not enough money and leave the same balance in the account.
	public void withDraw(double amount){
		if((balance - amount) < 0 ){
			System.out.print("Not enough money" );
		}else{
			balance -= amount;
		}
	}
	
	//- A method named deposit that deposits a specified amount to the account.
	public void deposit(double a){
		balance += a;
	}
}
