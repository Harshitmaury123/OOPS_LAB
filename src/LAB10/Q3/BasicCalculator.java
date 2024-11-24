package LAB10.Q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicCalculator extends JFrame implements ActionListener, FocusListener, KeyListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subButton, mulButton, divButton;

    public BasicCalculator() {
        // Frame settings
        setTitle("Basic Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField();
        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        // Add FocusListener to input fields
        num1Field.addFocusListener(this);
        num2Field.addFocusListener(this);

        // Add KeyListener to input fields
        num1Field.addKeyListener(this);
        num2Field.addKeyListener(this);

        // Add ActionListener to buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Add components to the frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        // Set visibility
        setVisible(true);
    }

    // Method to perform arithmetic operations
    private void calculate(char operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ActionListener for button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            calculate('+');
        } else if (e.getSource() == subButton) {
            calculate('-');
        } else if (e.getSource() == mulButton) {
            calculate('*');
        } else if (e.getSource() == divButton) {
            calculate('/');
        }
    }

    // FocusListener methods
    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == num1Field) {
            num1Field.setBackground(Color.YELLOW);
        } else if (e.getSource() == num2Field) {
            num2Field.setBackground(Color.YELLOW);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == num1Field) {
            num1Field.setBackground(Color.WHITE);
        } else if (e.getSource() == num2Field) {
            num2Field.setBackground(Color.WHITE);
        }
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
            e.consume();
            JOptionPane.showMessageDialog(this, "Only numeric input is allowed!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // No specific action on key press
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No specific action on key release
    }
}
