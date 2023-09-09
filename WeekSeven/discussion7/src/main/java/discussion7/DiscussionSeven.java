/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 02.25.2023
 * Use the Java hierarchy you posted in week 5 (corrected based on any feedback you may have received). 
 * Add a user-defined exception that can be thrown by one of the methods as part of the validation or error checking. 
 * The main method should then create an instance of the class and call the method in such a way that the exception is thrown 
 *      (e.g. invalid input or state of the system). 
 * Submit your program as an attached .java file and post a screenshot to show that you have been able to successfully run that program. 
 * Make sure your submission adheres to the Submission Requirements document.
 */
package discussion7;

public class DiscussionSeven {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 02.25.2023.\n");

        // init first room, catch error
        try {
            BedRoom jeffsBedroom = new BedRoom(-5, 2, 2, 2, "Marble");
        } catch (IllegalWallNumArgumentException e) {
            System.out.println("Oops! I tried to make a room with negative walls, let's try again.");
        }

        // init second room, don't catch error
        LivingRoom worstLivingRoom = new LivingRoom(0, 0, 0, 0, null);

    }
}
