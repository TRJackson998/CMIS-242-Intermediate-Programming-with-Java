/*
 * Member variables (attributes): 
 *      inherits from parent plus 
 *      attribute for number of chapters (integer) 
 * Functionality: 
 *      inherited functionality plus 
 *      constructor with all the attribute values, 
 *      get and set methods for local attribute,
 *      display values to the console 
 * The rental fee for EBook is the number of chapters * 0.10 + $1 if EBook was published this year
 */

package project;

import java.util.Calendar;

public class EBook extends Media {
    int numChapters; // child specific attribute for number of chapters

    /*
     * Constructor w/all attribute values
     */
    public EBook(int id, String title, int yearPublished, boolean available, int numChapters) {
        super(id, title, yearPublished, available); // inherit from parent
        this.numChapters = numChapters; // set child specific attribute
    }

    /*
     * Constructor to build object from a line in a file
     */
    public EBook(String dataLine) {
        // inherit from parent
        super(dataLine);

        // init variable to store each part of the dataLine
        String parts[];

        // split dataLine into parts based on commas
        parts = dataLine.split(",");

        // set child specific attribute by parsing the final part of parts
        this.numChapters = Integer.parseInt(parts[4]);

    }

    /*
     * Getter
     */
    public int getNumChapters() {
        return this.numChapters;
    }

    /*
     * Setter
     */
    public void setNumChapters(int numChapters) {
        this.numChapters = numChapters;
    }

    /*
     * Override parent fee
     * Change fee based on whether book was published this year
     */
    @Override
    public double calculateRentalFee() {
        double fee;
        if (this.getYearPublished() == Calendar.getInstance().get(Calendar.YEAR)) {
            fee = this.numChapters * 0.1 + 1;
        } else {
            fee = super.calculateRentalFee();
        }
        return fee;
    }

    /*
     * For printing out object to console
     */
    public String toString() {
        return String.format("EBook %d: \'%s\' published %d with %d chapters. Available: %s", this.getId(),
                this.getTitle(),
                this.getYearPublished(), this.getNumChapters(), this.isAvailable());
    }
}
