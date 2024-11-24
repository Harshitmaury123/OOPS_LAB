package LAB10.Q2;

import javax.swing.*;
import java.awt.*;

public class Q2 extends JFrame {
    private JPanel p1;
    private JLabel username;
    private JLabel password;
    private JButton submit;
    private JTextField username_input;
    private JPasswordField password_input;

    public Q2() {
        // Frame settings
        setTitle("Login Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        // Components
        username = new JLabel("Username:");
        username.setFont(new Font("Arial", Font.BOLD, 20));
        password = new JLabel("Password:");
        password.setFont(new Font("Arial", Font.BOLD, 20));
        username_input = new JTextField();
        password_input = new JPasswordField();
        submit = new JButton("Submit");

        // Panel and layout
        p1 = new JPanel(new GridLayout(3, 2));
        p1.add(username);
        p1.add(username_input);
        p1.add(password);
        p1.add(password_input);
        p1.add(new JLabel());
        p1.add(submit);

        // Add panel to frame
        add(p1);

        // Make frame visible
        setVisible(true);
    }
}
