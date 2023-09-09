package discussion1;

import java.util.Scanner;

public class DiscussionOneReply {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 01.14.2023.\n");

        // init variables
        Scanner scanner = new Scanner(System.in);
        Boolean insured = false;
        boolean screenProtected = false;

        // get first input
        System.out.println(
                "Hello, welcome to the phone store, would you like to customize your phone? " + '\n' + "Yes or No? ");
        String customize = scanner.nextLine();

        if (customize.toLowerCase().equals("yes")) { // user selected to customize
            // prompt for phone details
            System.out.println("What color phone would you like?");
            String color = scanner.nextLine();

            System.out.println("How many gigabytes? ");
            int gigabytes = Integer.valueOf(scanner.nextLine());

            System.out.println("Would you like this phone to be insured? " + '\n' + "Yes or No?");
            String insurance = scanner.nextLine();

            System.out.println("Would you like this phone to be protected? " + '\n' + "Yes or No?");
            String protect = scanner.nextLine();

            // parse selections
            if (insurance.toLowerCase().equals("yes")) {
                insured = true;
            }
            if (protect.toLowerCase().equals("yes")) {
                screenProtected = true;
            }

            // init phone, print it out
            Phone customer = new Phone(color, gigabytes, insured, screenProtected);
            System.out.println(customer);
        } else { // selected not to customize, init and print default phone
            Phone customer = new Phone();
            System.out.println(customer);
        }

        // close Scanner
        scanner.close();

    }
}
