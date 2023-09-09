package discussion2;

/**
 * Washing machine object class
 *
 */
class WashingMachine {
    private boolean on;
    private double time;
    private String cycle;
    private String brand;

    // default constructor
    public WashingMachine() {
        this.on = false;
        this.time = 0.0;
        this.cycle = "Normal";
        this.brand = "Samsung";
    }

    // constructor
    public WashingMachine(double time, String cycle, String brand) {
        this.on = false;
        this.time = time;
        this.cycle = cycle;
        this.brand = brand;
    }

    // Setters
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void addTime(double time) {
        this.time += time;
    }

    public void turnOn() {
        if (this.on) {
            System.out.println("Machine is already on!");
        } else {
            this.on = true;
        }
    }

    public void turnOff() {
        if (this.on) {
            this.on = false;
        } else {
            System.out.println("Machine is already off!");
        }
    }

    // getters
    public String getCycle() {
        return this.cycle;
    }

    public double getTime() {
        return this.time;
    }

    public String getBrand() {
        return this.brand;
    }

    public void checkIfOn() {
        if (this.on) {
            System.out.println("Machine is on!");
        } else {
            System.out.println("Machine is off!");
        }
    }

    // helper function to print out Washing Machine
    public void printSettings() {
        if (this.on) {
            System.out.printf("%s brand washing machine is on!\n", this.brand);
        } else {
            System.out.printf("%s brand washing machine is off!\n", this.brand);
        }

        System.out.printf("Cycle: %s\n", this.cycle);
        System.out.printf("Time: %1.1f\n", this.time);
        System.out.println();

    }

}
