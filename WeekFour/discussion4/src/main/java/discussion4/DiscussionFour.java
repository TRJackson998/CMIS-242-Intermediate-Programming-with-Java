/*
 * Jackson, Terrence
 * CMIS 242 6381
 * 01.28.2023
 * Research different widgets that are included in this Java swing package.
 * Post a short description of one widget that you selected to write a program for. 
 * Some widgets include JCheckBox, JRadioButton, JLabel, JMenu, JComboBox, JList, JPasswordField, JTable, JTextField, JColorChooser, etc.
 * Select a widget that another student has not chosen yet or one that has enough functionality where you can add to the description and have a different program. 
 * For example, many widgets can have an event handler and your program can do different actions for an event.
 * Create a Java program that creates a GUI using JFrame and JPanel and adds your selected widget. 
 * Make sure you check out the example programs in this week's materials first. 
 * Create a small code example to demonstrate the execution of the recursion feature.
 */

package discussion4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DiscussionFour {

    private static class MyFrame extends JFrame implements ActionListener {
        // panels for content
        JPanel radioPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        // radio buttons to be accessed for factorial calculation
        JRadioButton fiveFactorialButton = new JRadioButton("5!");
        JRadioButton fourFactorialButton = new JRadioButton("4!");
        JRadioButton threeFactorialButton = new JRadioButton("3!");

        int result = 0; // store result of factorial

        MyFrame() {
            setSize(200, 200);
            setLayout(new BorderLayout());

            this.initRadioPanel();
            this.add(radioPanel, BorderLayout.WEST);

            this.initButtonPanel();
            this.add(buttonPanel, BorderLayout.PAGE_END);
        }

        /*
         * Initialize content of radio panel
         * Add buttons to button group and panel layout
         */
        private void initRadioPanel() {
            BorderLayout panelLayout = new BorderLayout();
            radioPanel.setLayout(panelLayout);

            ButtonGroup radioButtonGroup = new ButtonGroup();
            radioButtonGroup.add(fiveFactorialButton);
            radioButtonGroup.add(fourFactorialButton);
            radioButtonGroup.add(threeFactorialButton);

            // default select first button
            fiveFactorialButton.setSelected(true);

            radioPanel.add(fiveFactorialButton, BorderLayout.NORTH);
            radioPanel.add(fourFactorialButton, BorderLayout.CENTER);
            radioPanel.add(threeFactorialButton, BorderLayout.SOUTH);

        }

        /*
         * Initialize content of button panel
         * Add button to panel layout
         * Room for future buttons here
         */
        private void initButtonPanel() {
            BorderLayout panelLayout = new BorderLayout();
            buttonPanel.setLayout(panelLayout);

            JButton runButton = new JButton("Run");
            runButton.addActionListener(this);

            buttonPanel.add(runButton);
        }

        /*
         * Behaviour of run button
         */
        public void actionPerformed(ActionEvent e) {
            // determine which radio button is selected
            if (this.fiveFactorialButton.isSelected()) {
                this.result = calculateFactorial(5);
            } else if (this.fourFactorialButton.isSelected()) {
                this.result = calculateFactorial(4);
            } else if (this.threeFactorialButton.isSelected()) {
                this.result = calculateFactorial(3);
            } else {
                // future buttons
            }

            // Show what the result is
            String message = String.format("Calculated factorial = %d", result);
            JOptionPane.showMessageDialog(this, message);
        }

        /*
         * Recursively calculate the factorial of a given number
         */
        private int calculateFactorial(int num) {
            if (num < 3) {
                // 1! = 1; 2! = 2
                return num;
            } else {
                num *= calculateFactorial(num - 1);
                return num;
            }
        }
    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 01.28.2023.\n");

        // show window
        MyFrame window = new MyFrame();
        window.setVisible(true);

    }
}
