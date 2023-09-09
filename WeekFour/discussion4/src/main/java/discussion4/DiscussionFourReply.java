package discussion4;

import java.awt.*;
import javax.swing.*;

public class DiscussionFourReply {

	JFrame helloNeo;
	JFrame trinity;
	JFrame matrix;

	// init icons for each window
	Icon morpheus = new ImageIcon(".\\morpheus.jpg");
	Icon redOrBlue = new ImageIcon(".\\redOrBlue.jpg");
	Icon whiteRabbit = new ImageIcon(".\\whiteRabbit.jpg");

	DiscussionFourReply() {
		helloNeo = new JFrame();
		Object[] options = { "Morpheous" };
		int winOne = JOptionPane.showOptionDialog(helloNeo, "Do you know Who I am?", "Hello Neo...",
				JOptionPane.INFORMATION_MESSAGE,
				0, morpheus, options, options[0]);

		trinity = new JFrame();
		Object[] options2 = { "Red Pill", "Blue Pill" };
		int winTwo = JOptionPane.showOptionDialog(trinity,
				"Would you like to follow Alice? See how deep the rabbit hole goes?", "Good Answer...",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, redOrBlue, options2, options2[0]);

		if (winTwo == 0) {
			matrix = new JFrame("Open Your Mind");
			matrix.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JLabel filler = new JLabel(whiteRabbit);
			filler.setPreferredSize(new Dimension(700, 700));

			matrix.getContentPane().add(filler, BorderLayout.CENTER);

			matrix.pack();
			matrix.setVisible(true);

		}

	}

	public static void main(String[] args) {
		// header
		System.out.println("Jackson, Terrence. CMIS 242 6381. 01.21.2023.\n");
		new DiscussionFourReply();

	}

}