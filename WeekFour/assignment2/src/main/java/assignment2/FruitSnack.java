/*
 * There will be two child classes FruitSnack and SaltySnack with the following additional attributes:
 * FruitSnack: It includes citrus fruit indication (value of this variable of is true or false)
 */
package assignment2;

public class FruitSnack extends Snack {
    private boolean citrus;

    public FruitSnack(String id, char size, boolean citrus) {
        super(id, size);
        this.citrus = citrus;
    }

    /* Getter for extra attribute */
    public boolean getCitrus() {
        return this.citrus;
    }

    /*
     * Add to price for citrus snacks
     */
    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        if (this.citrus) {
            price += 5.99;
        }
        return price;
    }

    /*
     * For printing object
     */
    @Override
    public String toString() {
        // get extra attribute
        boolean citrus = getCitrus();
        String returnString;

        // add to string based on attribute
        if (citrus) {
            returnString = "You have chosen snack type citrus fruit snack.\n\t";
        } else {
            returnString = "You have chosen snack type fruit snack.\n\t";
        }

        // add parent class string
        returnString += super.toString();

        return returnString;
    }
}
