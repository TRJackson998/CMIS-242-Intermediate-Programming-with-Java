/*
 * There will be a Snack class with following attributes: 
 *      id (combination of numbers and letters), 
 *      size (values S, M, or L), and 
 *      price
 * The Snack class hierarchy must provide the following functionality:
 *      On creation, a snack instance must be given all attribute values except its price, which must be calculated
 *      Price is calculated as follows:
 *          There is a flat fee of $19.99 for S snack, $29.99 for M snack, and $39.99 for L snack.
 *          FruitSnack has an additional fee of $5.99 when it has a citrus fruit. 
 *              Please add only a single citrus fruit, 
 *              and no preventing coding is required to limit adding more than one.
 *           SaltySnack has an additional fee of $4.50 when it has a nut snack. 
 *               Please add only a single nut snack 
 *               no preventing coding is required to limit adding more thanone.
 * Each class must have a method to return or display the class’s values to the console
 */

package assignment2;

public class Snack {
    private String id;
    private char size;
    private double price;

    public Snack(String id, char size) {
        // validate size
        switch (size) {
            case 'S':
            case 's':
                this.size = 'S';
                break;
            case 'M':
            case 'm':
                this.size = 'M';
                break;
            case 'L':
            case 'l':
                this.size = 'L';
                break;
            default:
                this.size = 'S';
        }

        // set ID
        this.id = id;
    }

    /*
     * Hard coded price based on size attribute
     * Public so child classes can access
     */
    public double calculatePrice() {
        double price = 0;
        char size = getSize();
        switch (size) {
            case 'S':
                price = 19.99;
                break;
            case 'M':
                price = 29.99;
                break;
            case 'L':
                price = 39.99;
                break;
        }
        return price;
    }

    /* Getters */
    public String getID() {
        return this.id;
    }

    public char getSize() {
        return this.size;
    }

    public double getPrice() {
        return this.price;
    }

    /*
     * One setter for calculating the price
     * Other attributes set by constructor
     */
    public void setPrice() {
        this.price = calculatePrice();
    }

    /*
     * For printing object
     */
    public String toString() {
        // get each attribute value
        String id = getID();
        char size = getSize();
        double price = getPrice();

        // combine attributes into string
        String returnString = String.format("Size = %c, ID = %s, Price = %.2f\n", size, id, price);

        return returnString;
    }

}
