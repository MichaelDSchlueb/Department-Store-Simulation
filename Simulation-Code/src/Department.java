
public class Department {
	private int id;
	private String name;
	private Manager manager;
	
	public Department(int d, String n, Manager m) {
		id = d;
		name = n;
		manager = m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	

}
