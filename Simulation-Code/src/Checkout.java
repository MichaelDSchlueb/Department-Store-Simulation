
public class Checkout implements CustomerBehavior {
	private Product[] items;
	private double total;
	
	public Checkout(Product[] i) {
		items = i;
	}
	
	public Product findProduct(String n) {
		Product x = null;
		for(int i = 0; i < items.length; i++) {
			if(n == items[i].getName()) {
				x = items[i];
			}else if(n == items[i].getBarcode()){
				x = items[i];
			}else if(n == items[i].getLocation()) {
				x = items[i];
			}else if(n == items[i].getId()) {
				x = items[i];
			}else if( n == items[i].getType()) {
				x = items[i];
			}
		}
		return x;
	}
	
	public double getPrice(String x) {
		Product z = null;
		for(int i = 0; i < items.length; i++) {
			if(x == items[i].getName()) {
				z = items[i];
			}
		}
		return z.getPrice();	
	}

	public Product[] getItems() {
		return items;
	}

	public void setItems(Product[] items) {
		this.items = items;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	

}
