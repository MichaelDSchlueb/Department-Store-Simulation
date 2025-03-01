
public abstract class Employee implements CommonBehaviors {
	private String name;
	private final String id;
	private int age;
	private String department;
	
	public Employee(String n, String i, int a, String d) {
		name = n;
		id = i;
		age = a;
		department = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getID() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
	

}
