package lab14;

import java.util.Calendar;

public class Person {
	private static String name;
	private static String address;
	private static String phone;
	private static int age;
	private static String email;

	public Person() {
	}

	public Person(String a, String b, String c,int d, String e) {
		name = a;
		address = b;
		phone = c;
		age = d;
		email = e;
	}

	public int getAge(){
		return age;
	}
	public String getName() {
		return name;
	}

	public static void setName(String a) {
		name = a;
	}

	public String getAddress() {
		return address;
	}

	public static void setAddress(String a) {
		address = a;
	}

	public String getPhoneNumber() {
		return phone;
	}

	public static void setPhoneNumber(String a) {
		phone = a;
	}

	public String getEmail() {
		return email;
	}

	public static void setEmail(String a) {
		email = a;
	}



}

class Student extends Person {
	private final String stat;// (freshman, sophomore, junior, or senior)

	public Student(String a) {
		stat = a;
	}

	public String getStatus() {
		return stat;
	}

	// store information about the object (in the format shown in the examples
	// below).
	public String toString() {
		String output = "Student: " + super.getName() + "\n" + "Status: " + getStatus() + "\n" + "Address: "
				+ getAddress() + "\n" + "Phone Number: " + getPhoneNumber() + "\n" + "Email Address: " + getEmail()
				+ "\n";

		return output;
	}
}

class Employee extends Person {
	private static int office_number, salary;
	private static String date_hired;
	
	public static void setOfficeNumber(int a){
		office_number = a;
	}
	
	public int getOfficeNumber(){
		return office_number;
	}
	
	public static void setSalary(int a){
		salary = a;
	}
	
	public int getSalary(){
		return salary;
	}
	
	
	public static void setMyDate(String a){
		date_hired = a;
	}

	public String getMyDate(){
		return date_hired;
	}
	
}

class Faculty extends Employee {
	private static String hours;
	private static String rank;

	public Faculty(){
	}
	
	public Faculty(String a, String b){
		hours = a;
		rank = b;
	}
	
	public int salaryRange(int a){
		//getMyDate(); mm/dd/yy
		
		int years = 17 - Integer.parseInt(getMyDate().substring(5));
		
		if ((a*years)<10){
			return 1;
		}else if((a*years)<20 && (a*years)>=10){
			return 2;
		}else if((a*years)>=20){
			return 3;
		}else
			return 0;
	
	}
	public String getRank(){
		return rank;
	}
	
	public static void setRank(String a){
		rank = a;
	}
	
	public String getHours(){
		return hours;
	}
	
	public static void setHours(String a){
		hours = a;
	}
	
	
	
	// store information about the object (in the format shown in the examples
	// below).
	public String toString() {
		String output = "Faculty: " + super.getName() + "\n" + 
						"Rank: " + getRank() + "\n" + 
						"Salary: " + getSalary() + "\n" + 
						"Date Hired: " + getMyDate() + "\n\n" + 
						
						"Office Hours: " + getHours() + "\n" + 
						"Office: " + getOfficeNumber() + "\n" + 
						"Address: " + getAddress() + "\n" + 
						"Phone Number: " + getPhoneNumber() + "\n" + 
						"Email: " + getEmail() + "\n";

		return output;
	}


}

class Staff extends Employee {
	private static String title;

	public Staff(){
	}
	
	public Staff(String a){
		title = a;
	}
	
	public static void setTitle(String a){
		title = a;
	}
	
	public String getTitle(){
		return title;
	}
	// store information about the object (in the format shown in the examples
	// below).
	public String toString() {
		String output = "Staff: " + super.getName() + "\n" + 
						"Salary: " + getSalary() + "\n" + 
						"Date Hired: " + getMyDate() + "\n\n" + 
				
						"Office: " + getOfficeNumber() + "\n" + 
						"Address: " + getAddress() + "\n" + 
						"Phone Number: " + getPhoneNumber() + "\n" + 
						"Email: " + getEmail() + "\n";
		
		return output;
	}
}

class MyDate {
	private String date; // date in the form mm/dd/yy

	public MyDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}
}

