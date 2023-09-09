/*
 * DistanceConverter class which is a child of Converter and includes:
 *   Constructors which call parent constructors
 *   Overridden convert() method to convert input (distance in miles) to distance in kilometers and returns the value. 
 *       If the instance has no input value, it should return Double.NaN
 *   Use the following formula for conversion: KM = M * 1.609
 */
package assignment3;

/*
 * Child class of converter
 */
public class DistanceConverter extends Converter {
    /*
     * Default constructor, uses parent
     */
    public DistanceConverter() {
        super();
    }

    /*
     * Overloaded constructor, uses parent
     */
    public DistanceConverter(double input) {
        super(input);
    }

    /*
     * Override parent convert, use KM = M * 1.609 formula
     */
    @Override
    public double convert() {
        double input = this.getInput();
        if (input == Double.NaN) {
            return input;
        } else {
            return (input * 1.609);
        }
    }

}
