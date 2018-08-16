package lab14;

import java.util.Scanner;
public class Drive{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useDelimiter("\n");

		System.out.println("Enter");
		System.out.println("1)To create a student");
		System.out.print("2)To create an employee:");
		int option = input.nextInt();

		switch (option) {
		case 1:
			System.out.print("Enter name:");
			String names = input.next();
			Person.setName(names);
			System.out.print("Enter address:");
			String addr = input.next();
			Person.setAddress(addr);
			System.out.print("Enter phone number:");
			String phone = input.next();
			Person.setPhoneNumber(phone);
			System.out.print("Enter email:");
			String email = input.next();
			Person.setEmail(email);
			System.out.print("Enter student's status:");
			String status = input.next();

			Person stu = new Student(status);

			System.out.print(stu.toString());

			break;
		case 2:

			System.out.print("Enter name:");
			String names2 = input.next();
			Person.setName(names2);
			System.out.print("Enter address:");
			String addr2 = input.next();
			Person.setAddress(addr2);
			System.out.print("Enter phone number:");
			String phone2 = input.next();
			Person.setPhoneNumber(phone2);
			System.out.print("Enter email:");
			String email2 = input.next();
			Person.setEmail(email2);

			System.out.println("Enter");
			System.out.println("1)To create a faculty member");
			System.out.print("2)To create a staff member:");
			int option2 = input.nextInt();

			if (option2 == 1) {//faculty member
				System.out.print("Enter office number:");
				int officeNumber = input.nextInt();
				Employee.setOfficeNumber(officeNumber);
				
				System.out.print("Enter salary:");
				int salary = input.nextInt();
				Employee.setSalary(salary);
				
				System.out.print("Enter date hired (mm/dd/yy):");
				String dateHired = input.next();
				MyDate MyDate_dateHired = new MyDate(dateHired);
				Employee.setMyDate(MyDate_dateHired.getDate());
				
				System.out.print("Enter office hours:");
				String officehours = input.next();
				Faculty.setHours(officehours);
				
				System.out.print("Enter rank:");
				String rank = input.next();
				Faculty.setRank(rank);
				
				Faculty uno = new Faculty();
				System.out.print(uno.toString());
			} else {
				System.out.print("Enter office number:");
				int officeNumber = input.nextInt();
				Employee.setOfficeNumber(officeNumber);
				
				System.out.print("Enter salary:");
				int salary = input.nextInt();
				Employee.setSalary(salary);
				
				System.out.print("Enter date hired (mm/dd/yy):");
				String dateHired = input.next();
				MyDate MyDate_dateHired = new MyDate(dateHired);
				Employee.setMyDate(MyDate_dateHired.getDate());
				
				System.out.print("Enter title:");
				String title = input.next();
				Staff.setTitle(title);
				
				Staff dos = new Staff();
				System.out.print(dos.toString());
				
			}

			break;
		default:
			break;

		}

	}	
}
