/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 02.18.2023
 * Write a small program that uses the dynamic binding. 
 * In your comments explain which statement(s) is doing the dynamic binding.
 */
package discussion6;

import java.util.Scanner;

public class discussion6 {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 02.18.2023.\n");

        // init vars
        String choice;
        Temperature currentTemperature;
        Scanner strScanner = new Scanner(System.in);

        // prompt for, read in user input
        System.out.print("Are you hot or cold? ");
        choice = strScanner.nextLine();

        // parse choice, create object
        if (choice.toLowerCase().equals("hot")) {
            currentTemperature = new TooHot();
        } else if (choice.toLowerCase().equals("cold")) {
            currentTemperature = new TooCold();
        } else {
            currentTemperature = new Temperature();
        }

        // dynamic binding: function overriden w/diff behaviour
        currentTemperature.adjustTemperature();

        // close Scanner
        strScanner.close();
    }
}
