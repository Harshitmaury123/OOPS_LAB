package LAB10.Q6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApplication extends JFrame implements ActionListener {
    private JLabel questionLabel;
    private JRadioButton[] options;
    private ButtonGroup optionsGroup;
    private JButton submitButton, nextButton, finishButton;
    private JLabel scoreLabel;

    private String[] questions = {
            "What is the capital of France?",
            "Which language is used for Android development?",
            "Who is known as the father of computers?",
            "What is 2 + 2?",
            "Which planet is known as the Red Planet?"
    };

    private String[][] optionsList = {
            {"Berlin", "Madrid", "Paris", "Rome"},
            {"Python", "Java", "C++", "Swift"},
            {"Charles Babbage", "Alan Turing", "John von Neumann", "Ada Lovelace"},
            {"3", "4", "5", "6"},
            {"Earth", "Mars", "Jupiter", "Venus"}
    };

    private int[] answers = {2, 1, 0, 1, 1}; // Correct options indices
    private int currentQuestion = 0;
    private int score = 0;

    public QuizApplication() {
        // Frame setup
        setTitle("Stylish Quiz Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Question panel with styling
        JPanel questionPanel = new JPanel(new BorderLayout());
        questionPanel.setBackground(new Color(240, 248, 255)); // Alice Blue
        questionLabel = new JLabel(questions[currentQuestion], JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setForeground(new Color(25, 25, 112)); // Midnight Blue
        questionPanel.add(questionLabel, BorderLayout.NORTH);

        // Options panel with styling
        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        optionsPanel.setBackground(new Color(245, 245, 245)); // Light Gray
        options = new JRadioButton[4];
        optionsGroup = new ButtonGroup();

        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton(optionsList[currentQuestion][i]);
            options[i].setFont(new Font("Arial", Font.PLAIN, 14));
            options[i].setBackground(new Color(245, 245, 245)); // Light Gray
            options[i].setForeground(new Color(47, 79, 79)); // Dark Slate Gray
            optionsGroup.add(options[i]);
            optionsPanel.add(options[i]);
        }

        questionPanel.add(optionsPanel, BorderLayout.CENTER);
        add(questionPanel, BorderLayout.CENTER);

        // Buttons panel with styling
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBackground(new Color(230, 230, 250)); // Lavender
        submitButton = createStyledButton("Submit", new Color(60, 179, 113)); // Medium Sea Green
        nextButton = createStyledButton("Next", new Color(30, 144, 255)); // Dodger Blue
        finishButton = createStyledButton("Finish", new Color(255, 69, 0)); // Red-Orange

        submitButton.addActionListener(this);
        nextButton.addActionListener(this);
        finishButton.addActionListener(this);

        nextButton.setEnabled(false);
        finishButton.setEnabled(false);

        buttonsPanel.add(submitButton);
        buttonsPanel.add(nextButton);
        buttonsPanel.add(finishButton);
        add(buttonsPanel, BorderLayout.SOUTH);

        // Score panel with styling
        scoreLabel = new JLabel("Score: 0", JLabel.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 14));
        scoreLabel.setForeground(new Color(25, 25, 112)); // Midnight Blue
        scoreLabel.setOpaque(true);
        scoreLabel.setBackground(new Color(240, 248, 255)); // Alice Blue
        add(scoreLabel, BorderLayout.NORTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Check if an option is selected
            int selectedOption = getSelectedOption();
            if (selectedOption == -1) {
                JOptionPane.showMessageDialog(this, "Please select an option!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Check if the answer is correct
            if (selectedOption == answers[currentQuestion]) {
                score++;
            }

            scoreLabel.setText("Score: " + score);
            submitButton.setEnabled(false);
            nextButton.setEnabled(true);
            if (currentQuestion == questions.length - 1) {
                finishButton.setEnabled(true);
                nextButton.setEnabled(false);
            }
        } else if (e.getSource() == nextButton) {
            // Move to the next question
            currentQuestion++;
            updateQuestion();
        } else if (e.getSource() == finishButton) {
            // Show the final score and end the quiz
            JOptionPane.showMessageDialog(this, "Quiz Finished! Your final score is: " + score, "Quiz Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    private int getSelectedOption() {
        for (int i = 0; i < options.length; i++) {
            if (options[i].isSelected()) {
                return i;
            }
        }
        return -1; // No option selected
    }

    private void updateQuestion() {
        // Update question and options
        questionLabel.setText(questions[currentQuestion]);
        for (int i = 0; i < options.length; i++) {
            options[i].setText(optionsList[currentQuestion][i]);
        }

        // Reset selection
        optionsGroup.clearSelection();
        submitButton.setEnabled(true);
        nextButton.setEnabled(false);
        finishButton.setEnabled(false);
    }

    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(bgColor);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(25, 25, 112))); // Midnight Blue border
        return button;
    }
}
