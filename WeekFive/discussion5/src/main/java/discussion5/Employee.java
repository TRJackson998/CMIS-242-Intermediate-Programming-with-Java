package discussion5;

public class Employee {

	// Attributes
	private int employeeId;
	private String employeeName;
	private String employeeType;
	private double salary;

	// Constructor
	public Employee(int employeeId, String employeeName, String employeeType, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
		this.salary = salary;
	}

	// Methods for getting and setting employee attributes
	public int getId() {
		return employeeId;
	}

	public String getName() {
		return employeeName;
	}

	public String getType() {
		return employeeType;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.employeeId = id;
	}

	public void setName(String name) {
		this.employeeName = name;
	}

	public void setType(String type) {
		this.employeeType = type;
	}

	public void raiseSalary(double raise) {
		this.salary = salary + raise;
	}

	// Overload method
	public void raiseSalary(int raise) {
		this.salary = salary + raise;
	}

	public void givePromotion() {
		this.raiseSalary(15.75);
	}

	// Method for displaying employee data
	public void displayEmp() {
		System.out.println(
				"\nEmployee data: \nID: " + employeeId + "\nName: " + employeeName + "\nType: " + employeeType +
						"\nSalary: $" + salary);
	}

}
