/*
 * TemperatureConverter class which is a child of Converter and includes:
 *      Constructors which call parent constructors
 *      Overridden convert() method to convert input (Fahrenheit temperature) to Celsius and returns the value. If the instance has no input value, it should return Double.NaN
 *      Use the following formula for conversion: C = ((F-32)*5)/9
 */
package assignment3;

/*
 * Child class of converter
 */
public class TemperatureConverter extends Converter {
    /*
     * Default constructor, uses parent
     */
    public TemperatureConverter() {
        super();
    }

    /*
     * Overloaded constructor, uses parent
     */
    public TemperatureConverter(double input) {
        super(input);
    }

    /*
     * Override parent convert, use C = ((F-32)*5)/9 formula
     */
    @Override
    public double convert() {
        double input = this.getInput();
        if (input == Double.NaN) {
            return input;
        } else {
            return (((input - 32) * 5) / 9.0);
        }
    }
}
