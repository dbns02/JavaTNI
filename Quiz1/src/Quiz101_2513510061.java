import javax.swing.*;

public class Quiz101_2513510061 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer:"));

        if ( number <= 1 ) {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "The number must be greater than 1\nEnter an integer:"));
        }

        int factorial = 1;
        String multiplyText = "";

        for ( int i = number; i >= 1; i-- ) {
            factorial *= i;

            multiplyText += i;
            if (i > 1) {
                multiplyText += " * ";
            }
        }

        JOptionPane.showMessageDialog(null, multiplyText + " = " + factorial);
    }
}
