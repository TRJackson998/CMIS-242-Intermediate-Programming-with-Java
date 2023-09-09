/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 03.04.2023
 * Reply to another student's post. 
 * Modify the student's program to change/process the data in some way and then write it to a file.
 */

package discussion8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DiscussionEightReply {

	public static void main(String[] args) {
		// header
		System.out.println("Jackson, Terrence. CMIS 242 6381. 03.04.2023.\n");

		// declare variables
		int calculationResult; // store result of data change
		PrintWriter outputStreamWriter; // output stream for writing file
		int[][] Even = {
				{ 2, 4, 6, 8, 10, 12 },
				{ 4, 6, 8, 10, 12, 14 },
				{ 6, 8, 10, 12, 14, 16 },
				{ 8, 10, 12, 14, 16, 18 },
				{ 10, 12, 14, 16, 18, 20 }

		};
		int row, col;

		// create output stream
		try {
			outputStreamWriter = new PrintWriter(new File(".\\Odds.txt"));
		} catch (IOException e) {
			System.out.println("Error opening result file!");
			System.out.println(e);
			return; // quit program
		}

		for (row = 0; row < 5; row++) {
			for (col = 0; col < 6; col++) {
				// change to an odd number
				calculationResult = Even[row][col] - 1;

				// print to output file
				outputStreamWriter.print(calculationResult + " ");
			}

			// print newline at end of row
			outputStreamWriter.println();
		}

		// check if there were any errors
		if (outputStreamWriter.checkError())
			System.out.println("Some error occurred while writing the file.");
		else
			System.out.println("Done!");

		// flush the stream and close it
		outputStreamWriter.flush();
		outputStreamWriter.close();
	}

}
