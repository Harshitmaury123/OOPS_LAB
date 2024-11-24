package LAB10.Q5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JLabel statusBar;

    public TextEditor() {
        // Set up the frame
        setTitle("Stylish Text Editor");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the text area with styling
        textArea = new JTextArea();
        textArea.setFont(new Font("Consolas", Font.PLAIN, 16));
        textArea.setBackground(new Color(245, 245, 245));
        textArea.setForeground(new Color(25, 25, 112));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setCaretColor(new Color(255, 69, 0)); // Orange caret
        textArea.addCaretListener(e -> updateStatusBar());
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create the menu bar with stylized menu
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(30, 144, 255));
        menuBar.setForeground(Color.WHITE);

        JMenu fileMenu = createStyledMenu("File");
        JMenuItem openItem = createStyledMenuItem("Open");
        JMenuItem saveItem = createStyledMenuItem("Save");
        JMenuItem exitItem = createStyledMenuItem("Exit");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Create a toolbar with styled buttons
        JToolBar toolBar = new JToolBar();
        toolBar.setBackground(new Color(230, 230, 250)); // Light lavender
        JButton clearButton = createStyledButton("Clear", new Color(0, 191, 255)); // Deep Sky Blue
        clearButton.addActionListener(this);
        toolBar.add(clearButton);
        add(toolBar, BorderLayout.NORTH);

        // Create the status bar with styling
        statusBar = new JLabel("Characters: 0 | Lines: 0");
        statusBar.setFont(new Font("Arial", Font.BOLD, 14));
        statusBar.setForeground(new Color(47, 79, 79)); // Dark Slate Gray
        statusBar.setBackground(new Color(240, 248, 255)); // Alice Blue
        statusBar.setOpaque(true);
        add(statusBar, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Update the status bar with the number of characters and lines
    private void updateStatusBar() {
        String text = textArea.getText();
        int charCount = text.length();
        int lineCount = text.isEmpty() ? 0 : text.split("\n").length;
        statusBar.setText("Characters: " + charCount + " | Lines: " + lineCount);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Open":
                openFile();
                break;
            case "Save":
                saveFile();
                break;
            case "Clear":
                textArea.setText("");
                updateStatusBar();
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }

    // Open a file using JFileChooser
    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                textArea.read(reader, null);
                updateStatusBar();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error opening file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Save the current text to a file using JFileChooser
    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                textArea.write(writer);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Create a styled menu
    private JMenu createStyledMenu(String name) {
        JMenu menu = new JMenu(name);
        menu.setFont(new Font("Arial", Font.BOLD, 14));
        menu.setForeground(Color.WHITE);
        return menu;
    }

    // Create a styled menu item
    private JMenuItem createStyledMenuItem(String name) {
        JMenuItem menuItem = new JMenuItem(name);
        menuItem.setFont(new Font("Arial", Font.PLAIN, 14));
        menuItem.setBackground(new Color(240, 248, 255)); // Alice Blue
        menuItem.setForeground(new Color(25, 25, 112)); // Midnight Blue
        return menuItem;
    }

    // Create a styled button
    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(bgColor);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 128))); // Midnight Blue border
        return button;
    }
}
