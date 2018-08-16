//Fabian Zarama
//109599744
//CSE 114
//Homework #3
package HomeWork4;
import java.util.Calendar;



public class Time {
	//- Data fields int hour, minute, and second that represents a time.
	private long hour, minute, second;
	
	//- A no-arg constructor that creates a Time object for the current local time.
	public Time(){
		  Calendar cal = Calendar.getInstance();
		  hour = cal.get(Calendar.HOUR_OF_DAY);
		  minute = cal.get(Calendar.MINUTE);
		  second = cal.get(Calendar.SECOND);
	}
	
	//- A constructor that constructs a Time object with a specified elapse time since midnight, 
	//January 1, 1970 in milliseconds. (The data fields value will represent this time.)
	public Time(long elapseTime){
		
		long totalSeconds = elapseTime / 1000;
		this.second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minute = totalMinutes % 60;
		long totalhours = totalMinutes / 60;
		this.hour = totalhours / 24;
	}
	
	//- A constructor that creates a Time object with the specified hour, minute and second.
	public Time(int a, int b, int c){
		hour = a;
		minute = b;
		second = c;
	}
	
	//- Three get methods for the data fields hour, minute, and second, respectively.
	public long getHour(){
		return hour;
	}
	
	public long getMinute(){
		return minute;
	}
	
	public long getSecond(){
		return second;
	}
	
	//- A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time.
	public void setTime(long elapseTime){
		long totalSeconds = elapseTime / 1000;
		this.second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minute = totalMinutes % 60;
		long totalhours = totalMinutes / 60;
		this.hour = totalhours / 24;
	}
}
