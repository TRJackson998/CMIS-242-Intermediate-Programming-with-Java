/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 02.04.2023
 * 
 *  Implement OrderSystem class with main method with following functionality:
 *      Order a snack and after ordering it will display the snack type, its size, id and price
 *      Exit program
 */
package assignment2;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Project2 {
    public class OrderSystem {

        public static void printMenu() {
            System.out.println("MENU");
            System.out.println("1: Order a Snack");
            System.out.println("2: Exit Program");
            System.out.print("Enter your selection: ");
        }

        public static void parseInput() {
            Scanner inputScanner = new Scanner(System.in);
            int choice;
            if (inputScanner.hasNextInt()) {
                choice = inputScanner.nextInt();
                inputScanner.nextLine(); // swallow eol
            } else {
                choice = 0;
            }

            if (choice == 1) {
                orderSnack();
            } else if (choice == 2) {
                System.out.println("Thank you for using the program. Goodbye!");
            } else {
                System.out.println("Invalid choice!");
            }

            inputScanner.close();
        }

        private static void orderSnack() {
            Scanner intScanner = new Scanner(System.in);
            Scanner strScanner = new Scanner(System.in);
            Scanner boolScanner = new Scanner(System.in);

            System.out.print("Do you want Fruit Snack (1) or Salty Snack (2): ");
            int choice = intScanner.nextInt();

            System.out.print("What size do you want: S, M, or L: ");
            char size = strScanner.next().charAt(0);

            LocalDate todayDate = LocalDate.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMdd");
            String todayString = todayDate.format(dateFormatter);

            if (choice == 1) {
                System.out.print("Do you want citrus fruit? true/false: ");
                boolean citrus = boolScanner.nextBoolean();

                String id = "FR" + todayString + size;
                FruitSnack chosenFruitSnack = new assignment2.FruitSnack(id, size, citrus);
                chosenFruitSnack.setPrice();

                System.out.print(chosenFruitSnack);
            } else if (choice == 2) {
                System.out.print("Do you want nut snack? true/false: ");
                boolean nut = boolScanner.nextBoolean();

                String id = "SA" + todayString + size;
                SaltySnack chosenSaltySnack = new SaltySnack(id, size, nut);
                chosenSaltySnack.setPrice();

                System.out.print(chosenSaltySnack);
            } else {
                System.out.println("Not a valid choice!");
            }

            intScanner.close();
            strScanner.close();
            boolScanner.close();
        }

    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 02.04.2023.\n");
        OrderSystem.printMenu();
        OrderSystem.parseInput();

    }
}
