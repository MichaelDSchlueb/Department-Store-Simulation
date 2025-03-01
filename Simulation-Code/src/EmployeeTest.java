import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testEmployee() {
		Employee e = new FullTime("Kat", "123", 19, "Tech", 200.00);
		assertTrue(e != null);
	}
	
	@Test
	void testGetName() {
		Employee e = new FullTime("Kat", "123", 19, "Tech", 200.00);
		String n = e.getName();
		assertTrue(n == "Kat");
	}
	
	@Test
	void testSetName() {
		Employee e = new FullTime("Kat", "123", 19, "Tech", 200.00);
		e.setName("Liz");
		assertTrue(e.getName() == "Liz");
	}
	
	@Test
	void testGetID() {
		Employee e = new FullTime("Kat", "123", 19, "Tech", 200.00);
		String i = e.getID();
		assertTrue(i == "123");
	}
	
	@Test
	void testGetAge() {
		Employee e = new FullTime("Kat", "123", 19, "Tech", 200.00);
		int a = e.getAge();
		assertTrue(a == 19);
	}
	
	@Test
	void testSetAge() {
		Employee e = new FullTime("Kat", "123", 19, "Tech", 200.00);
		e.setAge(20);
		assertTrue(e.getAge() == 20);
	}
	
	@Test
	void testGetDept() {
		Employee e = new FullTime("Kat", "123", 19, "Tech", 200.00);
		String d = e.getDepartment();
		assertTrue(d == "Tech");
	}
	
	@Test
	void testSetDept(){
		Employee e = new FullTime("Kat", "123", 19, "Tech", 200.00);
		e.setDepartment("Office");
		assertTrue(e.getDepartment() == "Office");
	}

}
