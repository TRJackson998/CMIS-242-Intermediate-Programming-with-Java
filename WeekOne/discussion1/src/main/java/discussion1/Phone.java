package discussion1;

public class Phone {
	private String color;
	private int gigabytes;
	private boolean insurance;
	private boolean screenProtector;

	// Default constructor

	public Phone() {
		color = "Black";
		gigabytes = 128;
		insurance = false;
		screenProtector = false;
	}

	// Constructor
	public Phone(String color, int gigabytes, boolean insurance, boolean screenProtector) {
		this.color = color;
		this.gigabytes = gigabytes;
		this.insurance = insurance;
		this.screenProtector = screenProtector;
	}

	public String getColor() {
		return color;
	}

	public int getGigabytes() {
		return gigabytes;
	}

	public boolean getInsurance() {
		return insurance;
	}

	public void addScreenProtector() {
		this.screenProtector = true;
	}

	public String toString() {
		String returnString = "Phone color: " + color + '\n' + "Capacity: " + gigabytes + " GB" + '\n';
		if (this.insurance == true) {
			returnString += "This phone is insured.\n";
		}
		if (this.screenProtector == true) {
			returnString += "This phone is protected.\n";
		}

		return returnString;

	}
}
