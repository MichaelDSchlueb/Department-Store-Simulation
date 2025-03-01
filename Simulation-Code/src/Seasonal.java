
public class Seasonal extends PartTime{
	private String timePeriod;
	
	public Seasonal(String n, String i, int a, String d, double h, double dph, String tP) {
		super(n, i, a, d, h, dph);
		timePeriod = tP;
	}

	public String getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}
	
}
