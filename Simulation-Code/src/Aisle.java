
public class Aisle implements CustomerBehavior,CommonBehaviors {
	private int number;
	private String name;
	private Employee[] workers;
	private Department department;
	private Product[] products;
	
	public Aisle(int num, String n, Employee[] e, Department d, Product[] p) {
		number = num;
		name = n; 
		workers = e;
		department = d;
		products = p;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getWorkers() {
		return workers;
	}

	public void setWorkers(Employee[] workers) {
		this.workers = workers;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public Product findProduct(String x) {
		Product a = null;
		for(int i = 0; i < products.length; i++) {
			if(x == products[i].getName()) {
				a = products[i];
			}else if(x == products[i].getBarcode()){
				a = products[i];
			}else if(x == products[i].getLocation()) {
				a = products[i];
			}else if(x == products[i].getId()) {
				a = products[i];
			}else if( x == products[i].getType()) {
				a = products[i];
			}
		}
		return a;
	}
	
	public double getPrice(String x) {
		Product z = null;
		for(int i = 0; i < products.length; i++) {
			if(x == products[i].getName()) {
				z = products[i];
			}
		}
		return z.getPrice();	
	}
	
	public String toString() {
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
	

}
