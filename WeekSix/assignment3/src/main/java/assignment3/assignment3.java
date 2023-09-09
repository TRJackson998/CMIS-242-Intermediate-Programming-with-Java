/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 02.19.2023
 * Implement GUIConverter class using JFrame and JPanel as follows:
 *      GUI will have 3 buttons: “Distance Converter”, “Temperature Converter”, and “Exit”.
 *      When user clicks Exit, the program will terminate
 *      When user clicks on Distance Converter button, an input dialog will pop up to input value and then when clicks OK, 
 *          the message dialog with pop up with converted result
 *      When user clicks on Temperature button, an input dialog will pop up to input value and then when clicks OK, 
 *          the message dialog with pop up with converted result
 */
package assignment3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class assignment3 {
    /*
     * GUI class
     */
    private static class GUIConverter extends JFrame implements ActionListener {
        JPanel buttonPanel = new JPanel();

        // used in button creation and actionListener checking which button
        String dist_str = "Distance Converter";
        String temp_str = "Temperature Converter";
        String exit_str = "Exit";

        /*
         * Default constructor, generates window UI
         */
        public GUIConverter() {
            // init UI
            this.setSize(450, 200);
            this.setLayout(new BorderLayout());
            this.initButtonPanel();
            this.add(buttonPanel, BorderLayout.CENTER);
        }

        /*
         * Generate buttons and add them to window frame
         */
        private void initButtonPanel() {
            // set layout
            BorderLayout panelLayout = new BorderLayout();
            this.buttonPanel.setLayout(panelLayout);

            // create buttons
            JButton distButton = new JButton(dist_str);
            JButton tempButton = new JButton(temp_str);
            JButton exitButton = new JButton(exit_str);

            // add buttons to layout
            buttonPanel.add(distButton, BorderLayout.CENTER);
            buttonPanel.add(tempButton, BorderLayout.LINE_END);
            buttonPanel.add(exitButton, BorderLayout.PAGE_END);

            // add listener for button functionality
            distButton.addActionListener(this);
            tempButton.addActionListener(this);
            exitButton.addActionListener(this);

        }

        /*
         * Button behaviour
         * Determines button clicked based on event, carries out functionality
         */
        public void actionPerformed(ActionEvent e) {
            // init variables
            String strChoice; // user choice as string
            double doubleChoice; // user choice converted to double
            double result; // calculation result as double
            String resultString = ""; // final output message of result
            Converter thisConverter; // converter object to be created based on button selection
            String clicked_button = e.getActionCommand(); // which button was selected

            if (clicked_button.equalsIgnoreCase(dist_str)) {
                // retrieve and parse input
                strChoice = JOptionPane.showInputDialog(this, "Input miles distance to convert");
                doubleChoice = Double.parseDouble(strChoice);

                // get result
                thisConverter = new DistanceConverter(doubleChoice);
                result = thisConverter.convert(); // dynamic binding

                // package result for output
                resultString = String.format("%.2f Miles equals %.2f Kilometers", doubleChoice, result);
            } else if (clicked_button.equalsIgnoreCase(temp_str)) {
                // retrieve and parse input
                strChoice = JOptionPane.showInputDialog(this, "Input fahrenheit temperature to convert");
                doubleChoice = Double.parseDouble(strChoice);

                // get result
                thisConverter = new TemperatureConverter(doubleChoice);
                result = thisConverter.convert(); // dynamic binding

                // package result for output
                resultString = String.format("%.2f F equals %.2f C", doubleChoice, result);
            } else if (clicked_button.equalsIgnoreCase(exit_str)) {
                // quit program
                System.exit(0);
            }

            // display output string
            JOptionPane.showMessageDialog(this, resultString, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 02.19.2023.\n");

        // show window
        GUIConverter window = new GUIConverter();
        window.setVisible(true);
    }
}
