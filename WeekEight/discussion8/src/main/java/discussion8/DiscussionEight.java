/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 03.04.2023
 * Write a small program that reads data from a file and stores it in a two-dimensional array
 *      and then uses nested for-loop to print the values in a table format. 
 * Submit your program as an attached .java file and post a screenshot to show that you have been able to successfully run that program. 
 * Make sure your submission adheres to the Submission Requirements document.
 */

package discussion8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiscussionEight {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 03.04.2023.\n");

        // declare variables
        int[][] multiplicationTable = new int[7][7]; // 2d array to store values from file
        Scanner inStreamScanner; // file reader

        // create input stream
        try {
            inStreamScanner = new Scanner(new File(".\\MultiplicationTable.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
            return; // quit program
        }

        // read from file into array
        for (int i = 0; inStreamScanner.hasNextInt() & i < multiplicationTable.length; i++) {
            for (int j = 0; inStreamScanner.hasNextInt() & j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = inStreamScanner.nextInt();
            }
        }

        // print values w/nested for loop
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                // determine how many padding spaces to add to output
                String spaces;
                if (multiplicationTable[i][j] < 10) {
                    // number has one digit, more space needed
                    spaces = "   ";
                } else {
                    // number has two digits, less space needed
                    spaces = "  ";
                }

                // print this column's number
                System.out.print(multiplicationTable[i][j] + spaces);
            }

            // print the newline at the end of the row
            System.out.println();
        }

        // close file/Scanner etc
        inStreamScanner.close();
    }
}
