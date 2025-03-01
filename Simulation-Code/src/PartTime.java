
public class PartTime extends Employee {
	
	private double hours;
	private double dollarsPerHour;
	
	public PartTime(String n, String i, int a, String d, double h, double dph){
		super(n, i, a, d);
		hours = h;
		dollarsPerHour = dph;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getDollarsPerHour() {
		return dollarsPerHour;
	}

	public void setDollarsPerHour(double dollarsPerHour) {
		this.dollarsPerHour = dollarsPerHour;
	}
	

}
