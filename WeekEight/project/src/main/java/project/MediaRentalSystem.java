/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 03.05.2023
 * Design and implement MediaRentalSystem which has the following functionality:
 *      user interface which is either menu driven through console commands or GUI buttons or menus.
 *      selection to load Media files from a given directory
 *          (user supplies directory)
 *      selection to find a media object for a specific title value
 *          (user supplies title and should display to user the media information once it finds it - should find all media with that title)
 *      selection to rent a media object based on its id value 
 *          (user supplies id and should display rental fee value to the user)
 *      selection to exit program
 */

package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaRentalSystem {
    /*
     * Function to print out menu
     */
    public static void printMenu() {
        System.out.println("Welcome to Media Rental System");
        System.out.println("1: Load Media from Files");
        System.out.println("2: Find Media by Title");
        System.out.println("3: Rent Media by ID");
        System.out.println("9: Quit");

        System.out.println();
        System.out.print("Enter your selection: ");
    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 03.04.2023.\n");

        // init variables
        int userMenuChoice = 0;
        Scanner menuChoiceScanner;
        Scanner stringScanner;
        Manager mediaManager = new Manager();
        String directory;
        String title;
        String id;
        double rentalFee;
        ArrayList<Media> foundMedia = new ArrayList<Media>();

        menuChoiceScanner = new Scanner(System.in);
        stringScanner = new Scanner(System.in);

        while (userMenuChoice != 9) {
            printMenu();
            userMenuChoice = Integer.parseInt(menuChoiceScanner.nextLine());

            // parse choice
            if (userMenuChoice == 1) { // Load Media from Files
                // read in directory from user
                System.out.print("Enter the directory to read files from: ");
                directory = stringScanner.nextLine();

                // create Manager object that reads in media from directory
                mediaManager = new Manager(directory);

            } else if (userMenuChoice == 2) { // Find Media by Title
                // read in title from user
                System.out.print("Enter the title to find: ");
                title = stringScanner.nextLine();

                // try to find media, catch error if media isn't there
                try {
                    foundMedia = mediaManager.findMedia(title);

                    // print out all found media
                    for (Media media : foundMedia) {
                        System.out.println(media);
                    }

                } catch (MediaNotFoundException e) {
                    System.out.println(e);
                }

            } else if (userMenuChoice == 3) { // Rent Media by ID
                // read in ID from user
                System.out.print("Enter the id to rent: ");
                id = stringScanner.nextLine();

                // try to rent media, catch error if media isn't there
                try {
                    rentalFee = mediaManager.rentMedia(Integer.parseInt(id));
                    System.out.println("Rental fee for this media is " + rentalFee);
                } catch (MediaNotFoundException e) {
                    System.out.println(e);
                }

            } else if (userMenuChoice == 9) { // Quit
                System.out.println("Thank you for using this program, goodbye!");

            } else { // invalid choice
                System.out.println("Invalid choice!");
            }

            System.out.println();
        }
        // close Scanners
        menuChoiceScanner.close();
        stringScanner.close();

    }
}
