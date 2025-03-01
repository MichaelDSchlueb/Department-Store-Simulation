import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartTimeTest {

	@Test
	void testPartTime() {
		PartTime p = new PartTime("Kat", "123", 20, "Toys", 30, 15.00);
		assertTrue(p != null);
	}
	
	@Test
	void testGetHours() {
		PartTime p = new PartTime("Kat", "123", 20, "Toys", 30, 15.00);
		double h = p.getHours();
		assertTrue(h == 30);
	}
	
	@Test
	void testSetHours() {
		PartTime p = new PartTime("Kat", "123", 20, "Toys", 30, 15.00);
		p.setHours(15);
		assertTrue(p.getHours() == 15);
	}

}
