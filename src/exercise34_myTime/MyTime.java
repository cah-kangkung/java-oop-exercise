package exercise34_myTime;

public class MyTime {
	//this is a much more strict version of Time Class in exercise 1.8
	//because you can't set hour, minute and second above their limits
	//e.g (hour [1, 23])
	private int hour, minute, second;
	
	public MyTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public MyTime(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	public void setTime(int h, int m, int s) {
		second += s;
		minute += (m + second / 60);
		second = second % 60;
		hour += (h + minute / 60);
		minute = minute % 60;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) 
			System.out.println(hour + " Not valid hour's value");
		else
			this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) 
			System.out.println(minute + " Not valid minute's value");
		else
			this.minute = minute;	
	}
	
	public void setSecond(int second) {
		if (second < 0 || second > 59) 
            System.out.println(second + " Not valid second's value");
		else    
			this.second = second;
	}
	
	public String toString() {
		//Return the time in hh:mm:ss format
		String result = "";
				
		//if the input is one digit, it returns an additional "0" infront
		if (hour >= 10) result += hour + ":";
		else result += "0" + hour + " ";
		
		if (minute >= 10) result += minute + ":";
		else result += "0" + minute + ":";
		
		if (second >= 10) result += second + "";
		else result += "0" + second + "";	
				
		return result;
	}
	
	public MyTime nextSecond() {
		second += 1;
		minute += second / 60;
		second = second % 60;
		hour += minute / 60;
		minute = minute % 60;
		
		return this;
	}
	
	public MyTime nextMinute() {
		minute += 1;
		hour += minute / 60;
		minute = minute % 60;
		
		return this;
	}
	
	public MyTime nextHour() {
		hour += 1;
		if(hour < 0 || hour > 23) {
			System.out.println(hour + " Not valid hour's value");
			hour -= 1;
			return this;
		}
		else	
			return this;
	}
	
	public MyTime previousSecond(){
        try {
            setTime(hour, minute, --second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        second = 59;
        return previousMinute();
    }
	
	public MyTime previousMinute() {
		try {
			setTime(hour, --minute, second);
			return this;
		}
		catch(IllegalArgumentException e) {}
		
		minute = 59;
		return previousHour();
	}
	
	public MyTime previousHour() {
		try {
            setTime(--hour, minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 23;
        return this;
	}
}
