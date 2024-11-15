import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleRabbitQnA extends JFrame {
    private JLabel imageLabel, questionLabel;
    private JRadioButton option1, option2;
    private ButtonGroup answerGroup;
    private JButton submitButton;
    private JCheckBox additionalInfoCheckBox; // Checkbox for additional info
    private JTextField textField; // TextField for user input

    public SimpleRabbitQnA() {
        super("SimpleRabbitQnA");

        // Layout
        setLayout(new FlowLayout());

        // JLabel for displaying the rabbit image
        imageLabel = new JLabel();
        ImageIcon rabbitIcon = new ImageIcon("C:/Users/rajaa/Pictures/images (1).jpeg"); // Load an image directly
        if (rabbitIcon.getIconWidth() > 0) {
            imageLabel.setIcon(rabbitIcon); // Set the image to JLabel if loaded successfully
        } else {
            imageLabel.setText("Image not found.");
        }
        add(imageLabel);

        // JLabel for the question
        questionLabel = new JLabel("WHAT IS THE RABBIT COLOUR?");
        add(questionLabel);

        // JRadioButtons for the answer
        option1 = new JRadioButton("White");
        option2 = new JRadioButton("Brown");

        // Group the radio buttons
        answerGroup = new ButtonGroup();
        answerGroup.add(option1);
        answerGroup.add(option2);

        add(option1);
        add(option2);

        // Additional Info Checkbox
        additionalInfoCheckBox = new JCheckBox("Show additional info");
        additionalInfoCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (additionalInfoCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Here is some additional information about the rabbit.");
                }
            }
        });
        add(additionalInfoCheckBox); // Add the checkbox to the layout

        // TextField for user input
        textField = new JTextField(15); // 15 columns wide
        textField.setToolTipText("Enter your name or comment here."); // Tooltip for user guidance
        add(textField); // Add the text field to the layout

        // Submit button
        submitButton = new JButton("Submit Answer");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // Show the selected answer and input from the text field
                String selectedAnswer = option1.isSelected() ? option1.getText() : option2.isSelected() ? option2.getText() : null;
                String userInput = textField.getText(); // Get text from the text field
                if (selectedAnswer != null) {
                    JOptionPane.showMessageDialog(null, "You selected: " + selectedAnswer + "\nYour input: " + userInput);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select an answer.");
                }
            }
        });
        add(submitButton);

        // Frame settings
        setSize(500, 400); // Size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleRabbitQnA();
    }
}
