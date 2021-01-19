
public class MyDateTime {
	
	MyDate date;
	MyTime time;

	public MyDateTime(MyDate date, MyTime time) {
		this.date = date;
		this.time = time;
	}
	
	public String toString() {
		return date.toString() + " " + time.toString();
	}

	public void incrementDay() {
		date.incrementDay();
		
	}

	public void incrementHour() {
		date.incrementDay(time.incrementHour());
	}

	public void incrementHour(int i) {
	    date.incrementDay(time.incrementHour(i));
	}

	public void decrementHour(int i) {
		date.decrementDay(time.decrementHour(i));
		
	}

	public void incrementMinute(int i) {
		date.incrementDay(time.incrementMinute(i));
		
	}

	public void decrementMinute(int i) {
		date.decrementDay(time.decrementMinute(i));
		
	}

	public void incrementYear(int i) {
		// TODO Auto-generated method stub
		
	}

	public void decrementDay() {
		// TODO Auto-generated method stub
		
	}

	public void decrementYear() {
		// TODO Auto-generated method stub
		
	}

	public void decrementMonth() {
		// TODO Auto-generated method stub
		
	}

	public void incrementDay(int i) {
		// TODO Auto-generated method stub
		
	}

	public void decrementMonth(int i) {
		// TODO Auto-generated method stub
		
	}

	public void decrementDay(int i) {
		// TODO Auto-generated method stub
		
	}

	public void incrementMonth(int i) {
		// TODO Auto-generated method stub
		
	}

	public void decrementYear(int i) {
		// TODO Auto-generated method stub
		
	}

	public void incrementMonth() {
		// TODO Auto-generated method stub
		
	}

	public void incrementYear() {
		// TODO Auto-generated method stub
		
	}

	public boolean isBefore(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfter(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return false;
	}

	public String dayTimeDifference(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
