/*
 * Member variables (attributes): 
 *      inherits from parent plus 
 *      attribute for length in minutes (integer) 
 * Functionality: 
 *      inherited functionality plus 
 *      constructor with all the attribute values, 
 *      get and set methods for local attribute, 
 *      display values to the console 
 * The rental fee for MusicCD is the length * 0.02 + $1 if MusicCD was published this year
 */

package project;

import java.util.Calendar;

public class MusicCD extends Media {
    int minuteLength; // child specific attribute for number of chapters

    /*
     * Constructor w/all attribute values
     */
    public MusicCD(int id, String title, int yearPublished, boolean available, int minuteLength) {
        super(id, title, yearPublished, available); // inherit from parent
        this.minuteLength = minuteLength; // set child specific attribute
    }

    /*
     * Constructor to build object from a line in a file
     */
    public MusicCD(String dataLine) {
        // inherit from parent
        super(dataLine);

        // init variable to store each part of the dataLine
        String parts[];

        // split dataLine into parts based on commas
        parts = dataLine.split(",");

        // set child specific attribute by parsing the final part of parts
        this.minuteLength = Integer.parseInt(parts[4]);
    }

    /*
     * Getter
     */
    public int getMinuteLength() {
        return this.minuteLength;
    }

    /*
     * Setter
     */
    public void setMinuteLength(int minuteLength) {
        this.minuteLength = minuteLength;
    }

    /*
     * Override parent fee
     * Change fee based on whether book was published this year
     */
    @Override
    public double calculateRentalFee() {
        double fee;
        if (this.getYearPublished() == Calendar.getInstance().get(Calendar.YEAR)) {
            fee = this.minuteLength * 0.02 + 1;
        } else {
            fee = super.calculateRentalFee();
        }
        return fee;
    }

    /*
     * For printing out object to console
     */
    public String toString() {
        return String.format("Music CD %d: \'%s\' published %d and %d minutes long. Available: %s", this.getId(),
                this.getTitle(),
                this.getYearPublished(), this.getMinuteLength(), this.isAvailable());
    }
}
