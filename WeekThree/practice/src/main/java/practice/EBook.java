package practice;

import java.util.Calendar;

public class EBook extends Media {
    int numChapters;

    public EBook(int id, String title, int yearPublished, int numChapters) {
        super(id, title, yearPublished);
        this.numChapters = numChapters;
    }

    // getter
    public int getNumChapters() {
        return this.numChapters;
    }

    // setter
    public void setNumChapters(int numChapters) {
        this.numChapters = numChapters;
    }

    // changes whether published this year
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

    // to print out
    public String toString() {
        return "";
    }
}
