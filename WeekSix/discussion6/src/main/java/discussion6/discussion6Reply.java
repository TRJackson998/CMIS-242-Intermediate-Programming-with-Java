/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 02.18.2023
 */

package discussion6;

import java.util.Scanner;

public class discussion6Reply {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 02.18.2023.\n");

        // init vars
        int choice;
        Animal myAnimal;
        Scanner intScanner = new Scanner(System.in);

        // prompt for, read in user input
        System.out.println("What are you feeding my animal?");
        System.out.println("\t1. Vegetables");
        System.out.println("\t2. Meat");
        System.out.println("\t3. Fruit");
        System.out.print("Choice: ");
        choice = intScanner.nextInt();

        // parse choice, create object
        if (choice == 1) {
            myAnimal = new Animal();
        } else if (choice == 2) {
            myAnimal = new Lion();
        } else if (choice == 3) {
            myAnimal = new Animal();
        } else {
            System.out.println("Not a valid choice.");
            myAnimal = new Animal();
        }

        myAnimal.eat();
    }
}
