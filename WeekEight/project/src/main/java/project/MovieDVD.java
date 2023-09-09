/*
 * Member variables (attributes): 
 *      inherits from parent plus 
 *      attribute for size in megabytes (double) 
 * Functionality: 
 *      inherited functionality plus 
 *      constructor with all the attribute values; 
 *      get and set methods for local attribute,
 *      display values to the console 
 * The rental fee for MovieDVD is the flat fee $3.50
 */

package project;

public class MovieDVD extends Media {
    double megabytes; // child specific attribute for number of chapters

    /*
     * Constructor w/all attribute values
     */
    public MovieDVD(int id, String title, int yearPublished, boolean available, double megabytes) {
        super(id, title, yearPublished, available); // inherit from parent
        this.megabytes = megabytes; // set child specific attribute
    }

    /*
     * Constructor to build object from a line in a file
     */
    public MovieDVD(String dataLine) {
        // inherit from parent
        super(dataLine);

        // init variable to store each part of the dataLine
        String parts[];

        // split dataLine into parts based on commas
        parts = dataLine.split(",");

        // set child specific attribute by parsing the final part of parts
        this.megabytes = Double.parseDouble(parts[4]);
    }

    /*
     * Getter
     */
    public double getMegabytes() {
        return this.megabytes;
    }

    /*
     * Setter
     */
    public void setMegabytes(double megabytes) {
        this.megabytes = megabytes;
    }

    /*
     * Flat fee, use parent functionality
     */
    @Override
    public double calculateRentalFee() {
        return super.calculateRentalFee();
    }

    /*
     * For printing out object to console
     */
    public String toString() {
        return String.format("Movie DVD %d: \'%s\' published %d and %.02f megabytes. Available: %s", this.getId(),
                this.getTitle(),
                this.getYearPublished(), this.getMegabytes(), this.isAvailable());
    }
}
