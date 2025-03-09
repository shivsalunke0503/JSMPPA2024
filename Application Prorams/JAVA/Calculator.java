import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Calculator window = new Calculator();
                window.frame.setVisible(true);
                window.frame.setTitle("JSM Calculator");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Calculator() {
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Adds space between components

        // Label and Text field for the first number (no1)
        JLabel label1 = new JLabel("No1:");
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.getContentPane().add(label1, gbc);

        num1Field = new JTextField();
        num1Field.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // Make it span across two columns
        frame.getContentPane().add(num1Field, gbc);
        num1Field.setColumns(10);

        // Label and Text field for the second number (no2)
        JLabel label2 = new JLabel("No2:");
        label2.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // Reset gridwidth
        frame.getContentPane().add(label2, gbc);

        num2Field = new JTextField();
        num2Field.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Make it span across two columns
        frame.getContentPane().add(num2Field, gbc);
        num2Field.setColumns(10);

        // Label and Text field for the result
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // Reset gridwidth
        frame.getContentPane().add(resultLabel, gbc);

        resultField = new JTextField();
        resultField.setFont(new Font("Arial", Font.PLAIN, 20));
        resultField.setEditable(false);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Make it span across two columns
        frame.getContentPane().add(resultField, gbc);
        resultField.setColumns(10);

        // Create buttons for the operations
        String[] buttons = { "+", "-", "*", "/", "C" };  // Removed "=" button
        Color[] buttonColors = {
            Color.GREEN, Color.RED, Color.YELLOW, Color.CYAN, Color.PINK
        };

        // Button Layout
        gbc.gridwidth = 1; // Reset gridwidth for the buttons
        int x = 0, y = 3;
        for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(buttons[i]);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.setBackground(buttonColors[i]);
            button.setForeground(Color.WHITE);

            // Add button to the layout
            gbc.gridx = x;
            gbc.gridy = y;
            frame.getContentPane().add(button, gbc);

            // Set image to the "Clear" button and label it as "Clear"
            if (buttons[i].equals("C")) {
                button.setText("Clear");  // Set the text to "Clear"
                // ImageIcon clearIcon = new ImageIcon("clear_icon.png");  // Provide path to your image
                // button.setIcon(clearIcon); // Set the image as icon for the "Clear" button
            }

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleButtonPress(button.getText());
                }
            });

            x++;
            if (x > 2) { // After 3 buttons, go to next row
                x = 0;
                y++;
            }
        }
    }

    private void handleButtonPress(String buttonText) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            switch (buttonText) {
                case "+":
                    resultField.setText(String.valueOf(num1 + num2));
                    break;
                case "-":
                    resultField.setText(String.valueOf(num1 - num2));
                    break;
                case "*":
                    resultField.setText(String.valueOf(num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        resultField.setText("Error (Divide by 0)");
                    } else {
                        resultField.setText(String.valueOf(num1 / num2));
                    }
                    break;
                case "Clear":
                    num1Field.setText("");
                    num2Field.setText("");
                    resultField.setText("");
                    break;
            }
        } catch (NumberFormatException e) {
            resultField.setText("Invalid Input");
        }
    }
}
