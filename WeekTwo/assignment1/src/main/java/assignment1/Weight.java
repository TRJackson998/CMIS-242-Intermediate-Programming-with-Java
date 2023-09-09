package assignment1;

/**
 * Weight class should have three private variables, two private methods and
 * four public methods.
 * 
 * Variables
 * 1. A private constant variable called OUNCES_IN_A_POUND that defines the
 * number of ounces in a pound (16).
 * 2. A private variable called pounds with a data type of integer.
 * 3. A private variable called ounces with a data type of double.
 * 
 * Methods
 * 1. A public parameterized constructor, which initializes the private
 * variables.
 * 
 * 2. A private instance method called toOunces with a return type of double.
 * This method has no parameters and should return the total number of ounces.
 * For full credit, reuse this method across other methods when possible.
 * 
 * 3. A private instance method called normalize with a return type of void.
 * This method has no parameters and should ensure that the number of ounces is
 * less than the number of ounces in a pound.
 * For full credit, reuse this method across other methods when possible.
 * 
 * 4. A public instance method called lessThan with a return type of boolean.
 * This method should accept a Weight object as a parameter and determine if the
 * object is greater or less than the initialized values.
 * 
 * 5. A public instance method called addTo with a return type of void.
 * This method should accept a Weight object as a parameter and add the object’s
 * weight values to the initialized values.
 * 
 * 6. A public instance method called toString with a return type of String.
 * This method has no parameters and should have the following format:
 * x pounds and y ounces where x is the number of pounds and y the number of
 * ounces. Ounces should be displayed with two decimal places.
 *
 */
public class Weight {

    private static int OUNCES_IN_A_POUND = 16;
    private int pounds;
    private double ounces;

    public Weight(int pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;

        this.normalize(); // in case of user error
    }

    /*
     * This method has no parameters and should return the total number of ounces.
     * Changed to public at prof's suggestion in order to implement average function
     * in Project1.java
     */
    public double toOunces() {
        double totalOunces = this.ounces;

        totalOunces += (this.pounds * OUNCES_IN_A_POUND);

        return totalOunces;
    }

    /*
     * This method has no parameters and should ensure that the number of ounces is
     * less than the number of ounces in a pound.
     */
    private void normalize() {
        while (this.ounces > 16.0) {
            this.ounces -= 16.0;
            this.pounds += 1;
        }
    }

    /*
     * This method should accept a Weight object as a parameter and determine if the
     * object is greater or less than the initialized values.
     */
    public boolean lessThan(Weight weight) {
        double thisOunces = this.toOunces();
        double inputOunces = weight.toOunces();
        return thisOunces < inputOunces;
    }

    /*
     * This method accepts a Weight object as a parameter and add the object’s
     * weight values to the initialized values.
     */
    public void addTo(Weight weight) {
        this.ounces += weight.toOunces();
        this.normalize();
    }

    /*
     * x pounds and y ounces
     * where x is the number of pounds and y the number of ounces.
     * Ounces should be displayed with two decimal places.
     */
    public String toString() {
        return String.format("%d pounds and %.2f ounces", this.pounds, this.ounces);
    }
}
