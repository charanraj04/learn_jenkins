import javax.swing.*;
import java.awt.event.*;

public class SimpleUI {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("My First UI");

        // Create Label
        JLabel label = new JLabel("Hello Ashok!");
        label.setBounds(120, 50, 200, 30);

        // Create Button
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 40);

        // Button Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(button);

        // Frame settings
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
