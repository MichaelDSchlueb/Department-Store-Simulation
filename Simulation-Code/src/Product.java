
public class Product {
	private String id;
	private String type;
	private String location;
	private String name;
	private double price;
	private String barcode;
	
	public Product(String i, String t, String l, String n, double p, String b) {
		id = i;
		type = t;
		location = l;
		name = n;
		price = p;
		barcode = b;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	

}
