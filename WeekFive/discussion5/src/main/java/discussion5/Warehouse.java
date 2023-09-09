package discussion5;

public class Warehouse extends Employee {

	// Attributes
	private int ordersLoaded;

	// Constructor
	public Warehouse(int employeeId, String employeeName, String employeeType, double salary, int ordersLoaded) {
		super(employeeId, employeeName, employeeType, salary);
		this.ordersLoaded = ordersLoaded;
	}

	// Methods for getting and setting warehouse employee attributes
	public int getOrders() {
		return ordersLoaded;
	}

	public void setOrders(int orders) {
		this.ordersLoaded = orders;
	}

	@Override
	public void givePromotion() {
		this.raiseSalary(2200.75);
		this.setType("Customer Service");
	}

	@Override
	// Override parent method to add orders loaded
	public void displayEmp() {
		super.displayEmp();
		System.out.println("\nOrders loaded: " + ordersLoaded);
	}

}
