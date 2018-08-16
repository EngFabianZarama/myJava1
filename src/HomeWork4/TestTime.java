//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;
public class TestTime {
	public static void main(String[] args) {
		Time uno = new Time();
		Time dos = new Time(555550000);
		
		System.out.println(uno.getHour()+" "+uno.getMinute()+" "+uno.getSecond());
		System.out.println(dos.getHour()+" "+dos.getMinute()+" "+dos.getSecond());
	}
}
