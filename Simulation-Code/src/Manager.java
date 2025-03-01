
public class Manager extends Employee{
	
	private double salary;
	
	public Manager(String n, String i, int a, String d, double s) {
		super(n, i, a, d);
		salary = s;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
