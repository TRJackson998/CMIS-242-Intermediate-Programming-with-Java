package practice;

public abstract class Media {
    // attributes
    private int id;
    private String title;
    private int yearPublished;

    // parameterized constructor
    public Media(int id, String title, int yearPublished) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    // getters
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // flat 3.50
    public double calculateRentalFee() {
        return 3.5;
    }
}
