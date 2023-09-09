package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {

    private static class MessageHandler implements ActionListener {
        private JFrame window;

        public MessageHandler(JFrame window) {
            this.window = window;
        }

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(window, "Hello, World!");
        }
    }

    private static class ExitHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private static class CounterHandler implements ActionListener {
        int count = 0;
        JFrame window;

        public CounterHandler(JFrame window) {
            this.window = window;
        }

        public void actionPerformed(ActionEvent e) {
            this.count += 1;
            String message = String.format("Counter clicked = %d", count);
            JOptionPane.showMessageDialog(window, message);
        }
    }

    private static class MyFrame extends JFrame {
        JPanel myPanel = new JPanel();

        MyFrame() {
            setSize(500, 200);
            setLayout(new BorderLayout());

            this.initPanel();
            this.add(myPanel, BorderLayout.CENTER);
        }

        private void initPanel() {
            BorderLayout panelLayout = new BorderLayout();
            myPanel.setLayout(panelLayout);

            JButton messageButton = new JButton("MESSAGE");
            JButton exitButton = new JButton("EXIT");
            JButton counterButton = new JButton("COUNTER");

            messageButton.addActionListener(new MessageHandler(this));
            exitButton.addActionListener(new ExitHandler());
            counterButton.addActionListener(new CounterHandler(this));

            myPanel.add(messageButton, BorderLayout.WEST);
            myPanel.add(exitButton, BorderLayout.CENTER);
            myPanel.add(counterButton, BorderLayout.EAST);

        }
    }

    public static void main(String[] args) {
        MyFrame window = new MyFrame();
        window.setVisible(true);

    }
}
