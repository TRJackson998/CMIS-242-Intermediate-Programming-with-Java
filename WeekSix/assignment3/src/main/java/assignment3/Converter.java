/*
 * Converter class which includes:
 *      Private attribute for input of data type double
 *      Default constructor with no parameter which sets input to Double.NaN
 *      Overloaded constructor with input for parameter
 *      Get and set methods for input attribute
 *      Method convert() which returns input value
 */
package assignment3;

/*
 * Parent Converter class
 */
public class Converter {
    private double input;

    /*
     * Default constructor
     */
    public Converter() {
        this.input = Double.NaN;
    }

    /*
     * Overloaded constructor, sets input value
     */
    public Converter(double input) {
        this.input = input;
    }

    /*
     * Getter for input val
     */
    public double getInput() {
        return this.input;
    }

    /*
     * Setter for input val
     */
    public void setInput(double input) {
        this.input = input;
    }

    /*
     * Conversion function to be overridden by child classes
     */
    public double convert() {
        return this.input;
    }
}
