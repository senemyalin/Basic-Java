
public class MyTime {

	private int hour;
	private int minute;
	
	public MyTime(int h, int m) {
		hour = h;
		minute = m;
	}

	public String toString() {
		return (hour < 10 ? "0" : "") + hour + ":" + 
			    (minute < 10 ? "0" : "") + minute;
	}

	public int incrementHour() {
		hour++;
	    if (hour == 24) {
	    	hour = 0;
	    	return 1;
	    }
	    return 0;
	}
	
	public int incrementHour(int i) {
		int dayInc = (hour + i) / 24;
		hour = (hour + i) % 24;
		return dayInc;
	}

	public int decrementHour(int i) {
		int dayDec = (hour - i) / 24;
		if (0 > (hour - i)) {
			dayDec--;
		}
		hour = (((hour - i) %24) +24) % 24;
		return 0 - dayDec;
		
	}

	public int incrementMinute(int i) {
		int hourInc = (minute + i) / 60;
		minute = (minute + i) % 60;
		return incrementHour(hourInc);
	}

	public int decrementMinute(int i) {
		int hourDec = (minute - i) / 60;
		if ((minute - i) < 0) {
			hourDec--;
		}
		minute = ((( minute - i) % 60) + 60) % 60;
		return decrementHour(0 - hourDec);
	}
}
