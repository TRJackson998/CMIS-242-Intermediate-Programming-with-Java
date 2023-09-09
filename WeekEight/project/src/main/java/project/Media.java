/*
 * Member variables (attributes): id (integer), title (string), year published (integer)
 * Functionality: 
 *      constructor with all the attribute values
 *      calculate rental fee ($3.50 flat fee), 
 *      change title, 
 *      change year published, 
 *      and get each attribute value.
 * The class should be declared abstract as it represents a generic media
 *      and we do not want to allow a creation of this class directly
 * Note that id value cannot be changed after creation.
 */

package project;

public abstract class Media {
    // attributes
    private int id;
    private String title;
    private int yearPublished;
    private boolean available;

    /*
     * Parameterized constructor sets all attributes
     */
    public Media(int id, String title, int yearPublished, boolean available) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
        this.available = available;
    }

    /*
     * Parameterized constructor to build object from a line in a file
     */
    public Media(String dataLine) {
        // init variable to store each part of the dataLine
        String parts[];

        // split dataLine into parts based on commas
        parts = dataLine.split(",");

        // set attributes by parsing each part of parts
        this.id = Integer.parseInt(parts[0]);
        this.title = parts[1];
        this.yearPublished = Integer.parseInt(parts[2]);
        this.available = Boolean.parseBoolean(parts[3]);

    }

    /*
     * Getters
     */
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public boolean isAvailable() {
        return this.available;
    }

    /*
     * Setters
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void rentMedia() throws MediaNotAvailableException {
        if (this.available) {
            this.available = false;
        } else {
            throw new MediaNotAvailableException(id);
        }
    }

    public void returnMedia() {
        this.available = true;
    }

    /*
     * Flat rental fee
     */
    public double calculateRentalFee() {
        return 3.5;
    }

    /*
     * method declarations for child classes to overload
     * Required here for Manager.java lines 272, 276, 280 to not throw errors
     */
    public int getNumChapters() {
        return -1;
    }

    public int getMinuteLength() {
        return -1;
    }

    public double getMegabytes() {
        return -1;
    }

}
