package discussion5;

public class CustomerService extends Employee {

	// Attributes
	private int callsTaken;

	// Constructor
	public CustomerService(int employeeId, String employeeName, String employeeType, double salary, int callsTaken) {
		super(employeeId, employeeName, employeeType, salary);
		this.callsTaken = callsTaken;
	}

	// Methods for getting and setting customer service employee attributes
	public int getCalls() {
		return callsTaken;
	}

	public void setCalls(int calls) {
		this.callsTaken = calls;
	}

	@Override
	public void givePromotion() {
		this.raiseSalary(2000.50);
		this.setType("Warehouse");
	}

	@Override
	// Override parent method to add calls taken
	public void displayEmp() {
		super.displayEmp();
		System.out.println("\nCalls taken: " + callsTaken);
	}

}
