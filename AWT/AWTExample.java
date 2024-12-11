package AWT;

import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT Example");

        // Create a Button
        Button button = new Button("Click Me");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to perform when button is clicked
                System.out.println("Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set layout and size for the frame
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);

        // Set the frame to be visible
        frame.setVisible(true);

        // Close the frame when the close button is clicked
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
