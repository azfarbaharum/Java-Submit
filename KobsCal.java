import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KobsCal implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;
    String equation = "";  // Store the full equation for display
    boolean negativePressed = false;

    KobsCal() {

        frame = new JFrame("KobsCal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // Set the frame icon to the pink calculator image
        ImageIcon icon = new ImageIcon("lembu.png");  // Make sure the image file is in the project directory
        frame.setIconImage(icon.getImage());

        // Set frame background to light pink
        frame.getContentPane().setBackground(new Color(0, 0, 0));

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        textfield.setBackground(Color.LIGHT_GRAY);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("×");
        divButton = new JButton("÷");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(new Color(218, 177, 218)); // Dark pink button background
            functionButtons[i].setForeground(Color.WHITE); // White text on buttons
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(0, 0, 128)); // Dark pink button background
            numberButtons[i].setForeground(Color.WHITE); // White text on buttons
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(255, 182, 193)); // Light pink panel background

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        KobsCal calc = new KobsCal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                // If negative button was pressed before, prepend "-" to the number
                if (negativePressed) {
                    textfield.setText(textfield.getText().concat("-" + String.valueOf(i)));
                    equation += "-" + String.valueOf(i); // Add negative number to equation
                    negativePressed = false;  // Reset after number is entered
                } else {
                    textfield.setText(textfield.getText().concat(String.valueOf(i)));
                    equation += String.valueOf(i);  // Add number to equation string
                }
            }
        }
        if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
            equation += "."; // Add decimal to equation string
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");  // Clear for next number input
            equation += " + ";      // Add operator to equation string
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
            equation += " - ";
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
            equation += " * ";
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
            equation += " / ";
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
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
                    result = num1 / num2;
                    break;
            }

            // Round the result and convert to int to make it a whole number
            int roundedResult = (int) Math.round(result);

            textfield.setText(equation + " = " + String.valueOf(roundedResult));  // Show entire operation
            equation = "";  // Reset equation after showing result
            num1 = roundedResult;  // Update num1 for further operations
        }
        if (e.getSource() == clrButton) {
            textfield.setText("");
            equation = "";  // Clear the equation string
        }
        if (e.getSource() == delButton) {
            String string = textfield.getText();
            textfield.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textfield.setText(textfield.getText() + string.charAt(i));
            }
            equation = equation.substring(0, equation.length() - 1);  // Remove last character from equation
        }
        // If the (-) button is pressed, set the negative flag to true
        if (e.getSource() == negButton) {
            negativePressed = true;
 }
}
}