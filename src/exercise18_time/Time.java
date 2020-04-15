package exercise18_time;

public class Time {
	//a quick note, this.hour didn't return a valid result if it's above '23'
	//for a more strict setter and result, it's in the exercise 3.4 MyTime Class
	private int hour, minute, second;
	
	public Time(int second, int minute, int hour) {
		setTime(second, minute, hour);
	}
	
	public int getSecond() {
		return second;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setSecond(int s) {
		second += s;
		minute += second / 60;
		second = second % 60;
		hour += minute / 60;
		minute = minute % 60;
	}
	
	public void setMinute(int m) {
		minute += m;
		hour += minute / 60;
		minute = minute % 60;
	}
	
	public void setHour(int h) {
		hour += h;
	}
	
	public void setTime(int s, int m, int h) {
		second += s;
		minute += (m + second / 60);
		second = second % 60;
		hour += (h + minute / 60);
		minute = minute % 60;
	}
	
	public String toString() {
		//Return the time in 00:00:00 format
		String result = "";
		
		//if the input is one digit, it returns an additional "0" infront
		if (second >= 10) result += second + ":";
		else result += "0" + second + ":";
		
		if (minute >= 10) result += minute + ":";
		else result += "0" + minute + ":";
		
		if (hour >= 10) result += hour + ":";
		else result += "0" + hour + " ";	
		
		return result;
	}

}
