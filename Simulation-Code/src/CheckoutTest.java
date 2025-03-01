import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckoutTest {

	@Test
	void testCheckOut() {
		Product p = new Product("123", "Tech", "Aisle 13", "Phone", 12.99, "555");
		Product[] i = {p};
		Checkout c = new Checkout(i);
		assertTrue(c != null);
	}
	
	@Test
	void testGetItems() {
		Product p = new Product("123", "Tech", "Aisle 13", "Phone", 12.99, "555");
		Product[] i = {p};
		Checkout c = new Checkout(i);
		Product[] p2 = c.getItems();
		assertTrue(p2 == i);
	}
	
	@Test
	void testSetItems() {
		Product p = new Product("123", "Tech", "Aisle 13", "Phone", 12.99, "555");
		Product[] i = {p};
		Checkout c = new Checkout(i);
		Product p2 = new Product("1234", "Tech", "Aisle 13", "Tablet", 15.00, "7777");
		Product[] i2 = {p2, p};
		c.setItems(i2);
		assertTrue(c.getItems() == i2);
	}
	
	@Test
	void testGetTotal() {
		Product p = new Product("123", "Tech", "Aisle 13", "Phone", 12.99, "555");
		Product[] i = {p};
		Checkout c = new Checkout(i);
		
	}
	
	@Test
	void testSetTotal() {
		Product p = new Product("123", "Tech", "Aisle 13", "Phone", 12.99, "555");
		Product[] i = {p};
		Checkout c = new Checkout(i);
	}
	
	@Test
	void testGetPrice() {
		Product p = new Product("123", "Tech", "Aisle 13", "Phone", 12.99, "555");
		Product[] i = {p};
		Checkout c = new Checkout(i);
	}
	
	@Test
	void testGetProduct() {
		Product p = new Product("123", "Tech", "Aisle 13", "Phone", 12.99, "555");
		Product[] i = {p};
		Checkout c = new Checkout(i);
	}

}
