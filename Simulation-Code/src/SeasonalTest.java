import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeasonalTest {

	@Test
	void testSeasonal() {
		Seasonal s = new Seasonal("Kat", "123", 20, "Toys", 30, 13.50, "3 Months");
		assertTrue(s != null);
	}
	
	@Test
	void testGetTP() {
		Seasonal s = new Seasonal("Kat", "123", 20, "Toys", 30, 13.50, "3 Months");
		String t = s.getTimePeriod();
		assertTrue(t == "3 Months");
	}
	
	@Test
	void testSetTP() {
		Seasonal s = new Seasonal("Kat", "123", 20, "Toys", 30, 13.50, "3 Months");
		s.setTimePeriod("4 Months");
		assertTrue(s.getTimePeriod() == "4 Months");
	}

}
