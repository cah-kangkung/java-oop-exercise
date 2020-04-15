package exercise17_date;

public class Date {
	private int day, month, year;
	
	public Date(int day, int month, int year) {
		setAddDate(day, month, year);
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setAddDay(int d1) {
		day += d1;
		month += (day / 30);
		day = day % 30;
		year += (month / 12);
		month = month % 12;
	}
	
	public void setAddMonth(int m1) {
		month += m1;
		year += month / 12;
		month = month % 12;
	}
	
	public void setAddYear(int y1) {
		year += y1;
	}
	
	public void setAddDate(int d, int m, int y) {
		day += d;
		month += (m + day / 30);
		day = day % 30;
		year += (y + month / 12);
		month = month % 12;
	}
	
	public String toString() {
		//Return the time in MM/DD/YY 00:00:00 format
		String result = "";
		
		//if the input is one digit, it returns an additional "0" infront
		if (day >= 10) result += day + "/";
		else result += "0" + day + "/";
		
		if (month >= 10) result += month + "/";
		else result += "0" + month + "/";
		
		if (year >= 10) result += year + "/";
		else result += "0" + year + " ";	
		
		return result;
	}
}
