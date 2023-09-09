package discussion5;

/*
 * Jackson, Terrence. CMIS 242 6381. 02.12.2023
 * This program will demonstrate the use of a class and  
 * subclasses. The Parent class is Employee. Each subclass
 * adds an attribute and three methods each. This program will also
 * utilize overriding of parent class methods
 */

public class Discussion5Reply {

	public static void main(String[] args) {
		// header
		System.out.println("Jackson, Terrence. CMIS 242 6381. 02.12.2023.\n");

		// Initialize two new objects (Each of a different subclass)
		CustomerService emp1 = new CustomerService(001, "James", "Customer Service", 48500, 0);
		Warehouse emp2 = new Warehouse(002, "Gordon", "Warehouse", 37600, 0);

		System.out.println("\nEmployee Information");
		System.out.println("=====================");

		// Call displayEmp method for both employees
		emp1.displayEmp();
		emp2.displayEmp();

		// Call one set method from each subclass to set new variables
		emp1.setCalls(12);
		emp2.setOrders(23);

		// Call raise salary method for each employee
		emp1.raiseSalary(500); // int raise
		emp2.raiseSalary(650.50); // double raise

		// Call override givePromotion
		emp1.givePromotion();
		emp2.givePromotion();

		System.out.println("\n=====================");
		System.out.println("Employee data updated");
		System.out.println("=====================");

		System.out.println("\nEmployee Information");
		System.out.println("=====================");

		// Call displayEmp method for both employees' new data
		emp1.displayEmp();
		emp2.displayEmp();

	}

}
