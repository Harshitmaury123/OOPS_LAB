package LAB10.Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

public class StudentManagement extends JFrame {
    private final HashMap<String, Student> students = new HashMap<>();
    private final JTextField idField, nameField, ageField, gradeField;
    private final JTextArea displayArea;

    public StudentManagement() {
        // Set up the frame
        setTitle("Student Management System");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(240, 248, 255)); // Background color

        // Input panel for student details
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(30, 144, 255), 2),
                "Student Details",
                0,
                0,
                new Font("Arial", Font.BOLD, 14),
                new Color(30, 144, 255)));
        inputPanel.setBackground(new Color(224, 255, 255));

        inputPanel.add(createStyledLabel("Student ID:"));
        idField = createStyledTextField();
        inputPanel.add(idField);

        inputPanel.add(createStyledLabel("Name:"));
        nameField = createStyledTextField();
        inputPanel.add(nameField);

        inputPanel.add(createStyledLabel("Age:"));
        ageField = createStyledTextField();
        inputPanel.add(ageField);

        inputPanel.add(createStyledLabel("Grade:"));
        gradeField = createStyledTextField();
        inputPanel.add(gradeField);

        // Buttons with styles
        JButton addButton = createStyledButton("Add Student", new Color(100, 100, 0));
        JButton updateButton = createStyledButton("Update Student", new Color(255, 215, 0));
        JButton deleteButton = createStyledButton("Delete Student", new Color(255, 99, 71));
        JButton viewButton = createStyledButton("View Students", new Color(65, 105, 225));

        inputPanel.add(addButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);
        inputPanel.add(viewButton);

        add(inputPanel, BorderLayout.NORTH);

        // Text area to display student records
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        displayArea.setBackground(new Color(245, 245, 245));
        displayArea.setForeground(new Color(0, 0, 128));
        displayArea.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(30, 144, 255), 2),
                "Student Records",
                0,
                0,
                new Font("Arial", Font.BOLD, 14),
                new Color(30, 144, 255)));
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Button actions
        addButton.addActionListener(e -> addStudent());
        updateButton.addActionListener(e -> updateStudent());
        deleteButton.addActionListener(e -> deleteStudent());
        viewButton.addActionListener(e -> viewStudents());
    }

    private JLabel createStyledLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(new Color(30, 144, 255));
        return label;
    }

    private JTextField createStyledTextField() {
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setBorder(BorderFactory.createLineBorder(new Color(173, 216, 230), 1));
        return textField;
    }

    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(bgColor);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 128), 1));
        return button;
    }

    private void addStudent() {
        String id = idField.getText().trim();
        String name = nameField.getText().trim();
        String grade = gradeField.getText().trim();

        if (id.isEmpty() || name.isEmpty() || grade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int age = Integer.parseInt(ageField.getText().trim());

            if (students.containsKey(id)) {
                JOptionPane.showMessageDialog(this, "Student ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            students.put(id, new Student(name, age, grade));
            JOptionPane.showMessageDialog(this, "Student added successfully.");
            clearFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Age must be a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateStudent() {
        String id = idField.getText().trim();
        if (!students.containsKey(id)) {
            JOptionPane.showMessageDialog(this, "Student ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = nameField.getText().trim();
        String grade = gradeField.getText().trim();

        if (name.isEmpty() || grade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int age = Integer.parseInt(ageField.getText().trim());
            students.put(id, new Student(name, age, grade));
            JOptionPane.showMessageDialog(this, "Student updated successfully.");
            clearFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Age must be a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteStudent() {
        String id = idField.getText().trim();
        if (students.containsKey(id)) {
            students.remove(id);
            JOptionPane.showMessageDialog(this, "Student deleted successfully.");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Student ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void viewStudents() {
        displayArea.setText(""); // Clear the display area
        if (students.isEmpty()) {
            displayArea.setText("No student records found.");
        } else {
            for (String id : students.keySet()) {
                displayArea.append("ID: " + id + ", " + students.get(id) + "\n");
            }
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        ageField.setText("");
        gradeField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentManagement sms = new StudentManagement();
            sms.setVisible(true);
        });
    }
}
