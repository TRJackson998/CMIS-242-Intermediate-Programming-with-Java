/*
 * There will be two child classes FruitSnack and SaltySnack with the following additional attributes:
 * SaltySnack: It includes nut snack indication (value of this variable of is true or false)
 */

package assignment2;

public class SaltySnack extends Snack {
    private boolean nut;

    public SaltySnack(String id, char size, boolean nut) {
        super(id, size);
        this.nut = nut;
    }

    /* Getter for extra attribute */
    public boolean getNut() {
        return this.nut;
    }

    /*
     * Add to price for nut snacks
     */
    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        if (this.nut) {
            price += 4.50;
        }
        return price;
    }

    /*
     * For printing object
     */
    @Override
    public String toString() {
        // get extra attribute
        boolean nut = getNut();
        String returnString;

        // add to string based on attribute
        if (nut) {
            returnString = "You have chosen snack type salty nut snack.\n\t";
        } else {
            returnString = "You have chosen snack type salty snack.\n\t";
        }

        // add parent class string
        returnString += super.toString();

        return returnString;
    }
}
