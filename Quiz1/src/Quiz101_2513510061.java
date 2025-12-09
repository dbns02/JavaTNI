import javax.swing.*;

public class Quiz101_2513510061 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer:"));

        if ( number <= 1 ) {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "The number must be greater than 1\nEnter an integer:"));
        }

        int factorial = 1;
        String multiply_text = "";

        for ( int i = number; i >= 1; i-- ) {
            factorial *= i;

            multiply_text += i;
            if (i > 1) {
                multiply_text += " x ";
            }
        }

        JOptionPane.showMessageDialog(null, multiply_text + " = " + factorial);
    }
}
