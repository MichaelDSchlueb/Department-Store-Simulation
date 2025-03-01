import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProjectApp {
	// Method for find total number of Employees in store
	public static int employeeNum(Employee[] employees) {
		int numEmployee = 0;
		for(int i = 0; i < employees.length; i++){
			numEmployee += 1;
		}
		return numEmployee;
	}
	
	// Method for finding total number of Aisles
	public static int aisleNum(Aisle[] a) {
		int aisleNum = 0;
		for(int i = 0; i < a.length; i++) {
			aisleNum += 1;
		}
		return aisleNum;
	}
	
	// Method for avg Employee pay
	public static double getAvgPay(Employee[] employees) {
		double total = 0;
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] instanceof PartTime) {
				PartTime p = (PartTime) employees[i];
				double weeklyPay = (p.getDollarsPerHour() * p.getHours());
				total += weeklyPay;
			} else if(employees[i] instanceof FullTime) {
				FullTime f = (FullTime) employees[i];
				total += f.getSalary();
			} else if(employees[i] instanceof Manager) {
				Manager m = (Manager) employees[i];
				total += m.getSalary();
			}
		}
		double avgPay = (total/employees.length);
		return avgPay;
	}
	
	// Method for returning average total price @ checkout
	public static double getTotalPrice(Product[] items) {
		double total = 0;
		for(int i = 0; i < items.length; i ++) {
			total += items[i].getPrice();
		}
		return total;
	}
	
	// Method for avg age of employees
	public static int getAvgAge(Employee[] employees) {
		int total = 0;
		for(int i = 0; i < employees.length; i++) {
			total += employees[i].getAge();
		}
		int avg = (total/employees.length);
		return avg;
	}
	
	// Method for avg hours worked part time
	public static int getPTAvgHours(PartTime[] partTime) {
		int total = 0;
		for(int i = 0; i < partTime.length; i++) {
			total += partTime[i].getHours();
		}
		int avg = (total/partTime.length);
		return avg;
	}
	
	// Main
	public static void main(String[] args) {
		try {
			Product p1 = new Product("123", "Tech", "Aisle1", "Watch", 20.99, "111");
			Product p2 = new Product("231", "Tech", "Aisle1", "Phone", 50.00, "222");
			Product p3 = new Product("321", "Office", "Aisle2", "Notebook", 12.99, "333");
			Product p4 = new Product("112", "Office", "Aisle2", "Pens", 10.00, "444");
			Product p5 = new Product("113", "Apparel", "Aisle3", "Shoes", 30.00, "555");
			Product p6 = new Product("121", "Apparel", "Aisle3", "Jacket", 25.99, "666");

			Manager m1 = new Manager("Claire", "0801", 60, "Tech", 600.00);
			Manager m2 = new Manager("Cindy", "0314", 30, "Apparel", 500.00);
			Manager m3 = new Manager("Ted", "0523", 40, "Office", 550.00);
			
			Department d1 = new Department(123, "Tech", m1);
			Department d2 = new Department(213, "Office", m3);
			Department d3 = new Department(321, "Apparel", m2);
			

			FullTime f1 = new FullTime("Liz", "1231", 50, "Office", 300.00);
			FullTime f2 = new FullTime("Kevin", "0410", 52, "Tech", 350.00);

			PartTime pt1 = new PartTime("Peter", "0425", 20, "Apparel", 30, 15.00);

			Seasonal s1 = new Seasonal("Anna", "1109", 25, "Apparel", 25, 13.50, "3 months");

			Employee[] a1Emps = {m1, f2};
			Employee[] a2Emps = {m3, f1};
			Employee[] a3Emps = {m2, pt1, s1};
			
			Product[] a1Prod = {p1, p2};
			Product[] a2Prod = {p3, p4};
			Product[] a3Prod = {p5, p6};
			
			Aisle a1 = new Aisle(1, "Tech", a1Emps, d1, a1Prod);
			Aisle a2 = new Aisle(2, "Office", a2Emps, d2, a2Prod);
			Aisle a3 = new Aisle(3, "Apparel", a3Emps, d3, a3Prod);
			
			Product[] items = {p1, p4, p6};
			Checkout x = new Checkout(items);
			
			Employee[] employees = {m1, m2, m3, f1, f2, pt1, s1};
			Manager[] managers = {m1, m2, m3};
			FullTime[] ftEmps = {f1, f2};
			PartTime[] ptEmps = {pt1, s1};
			Aisle[] aisles = {a1, a2, a3};
			Department[] depts = {d1, d2, d3};
			Product[] prods = {p1, p2, p3, p4, p5, p6};
			
			Scanner input = new Scanner(System.in);
			
			do {
				System.out.println("Welcome to Console");
				System.out.println("How can we help today?");
				char userRequest = input.next().charAt(0);
				if(userRequest == 'n') {
					// employeeNum()
					int num = employeeNum(employees);
					System.out.println("There are " + num + " employees in the store");
					break;
					
				}else if(userRequest == 'q') {
					// aisleNum()
					int aNum = aisleNum(aisles);
					System.out.println("Number of aisles in store: " + aNum);
					break;
					
				}else if(userRequest == 'g') {
					// getAvgPay()
					double ap = getAvgPay(ptEmps);
					System.out.println("Average employee pay: " + ap);
					break;
					
				}else if(userRequest == 't') {
					//getTotalPrice()
					double price = getTotalPrice(x.getItems());
					System.out.println("Total price of items is " + price);
					break;
					
				}else if(userRequest == 'y') {
					// getAvgAge()
					int age = getAvgAge(employees);
					System.out.println("The average age of employees: " + age);
					break;
					
				}else if(userRequest == 'w') {
					// getPTAvgHours()
					int hours = getPTAvgHours(ptEmps);
					System.out.println("Average hours of part time employees: " + hours);
					break;
					
				}else {
					System.out.println("Error: Invalid Command");
				}
			}while(true);
			input.close();
		} catch (Exception e) {
		    System.out.println("An error occurred");
		}

	}

}
