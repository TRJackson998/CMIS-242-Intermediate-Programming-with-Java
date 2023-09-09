/**
 * Jackson, Terrence
 * CMIS 242 6381
 * 01.21.2023
 *
 * This is an airfryer style cooking device. We are setting the cooking method
 * to Pizza Rolls
 */

package discussion2;

public class Airfryer {
    // Attributes (instance variables)
    private String heat; // Do not want to be empty
    private String level; // Do not want to be empty
    private double time; // Needs to be set by object
    private boolean on;

    public Airfryer(String heat, String level, double time) {

        // validate that heat and level are valid
        if (isInvalidStr(heat)) {
            System.out.println("Heat cannot be null, setting to default");
            heat = "Airfry";
        }

        if (isInvalidStr(level)) {
            System.out.println("Level cannot be null, setting to default");
            level = "High";
        }

        // validate that time is greater than 0
        if (time <= 0) {
            System.out.println("Time cannot be 0, setting to default");
            time = 5.5;
        }

        // set values
        this.heat = heat;
        this.level = level;
        this.time = time;
        this.on = false;

    }

    public Airfryer() {
        // set values to defaults
        this.heat = "Airfry";
        this.level = "High";
        this.time = 5.5;
        this.on = false;
    }

    // getters
    public String getHeat() {
        return this.heat;
    }

    public String getLevel() {
        return this.level;
    }

    public double getTime() {
        return this.time;
    }

    public boolean isOn() {
        return this.on;
    }

    // setters
    public void setHeat(String heat) {

        // validate that heat is valid
        if (isInvalidStr(heat)) {
            System.out.println("Invalid heat value - cannot be null, empty, or blank");
            return;
        }

        this.heat = heat;
    }

    public void setLevel(String level) {
        // validate that heat is valid
        if (isInvalidStr(level)) {
            System.out.println("Invalid level value - cannot be null, empty, or blank");
            return;
        }

        this.level = level;
    }

    public void setTime(double time) {
        // validate that weight is greater than 0
        if (time <= 0) {
            System.out.println("Invalid time value - must be greater than 0");
            return;
        }
        this.time = time;

    }

    public void turnOn() {
        if (this.on) {
            System.out.println("Airfryer is already on!");
        } else {
            this.on = true;
            System.out.println("Airfryer is on!");
        }
    }

    public void turnOff() {
        if (this.on) {
            this.on = false;
            System.out.println("Airfryer is off!");
        } else {
            System.out.println("Airfryer is already off!");
        }
    }

    // method to validate that string is not null, empty, or blank
    private boolean isInvalidStr(String str) {

        if (str.isEmpty() || str == null)
            return true;
        return false;
    }

    public String toString() {
        return "Airfryer Heating Method: " + heat + "\nLevel of heat: " + level + "\nTime to Cook: " + time + " \n";
    }
}