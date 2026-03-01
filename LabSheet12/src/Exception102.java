import javax.swing.*;

public class Exception102 {
    static void main() {

        int number = 0;
        boolean isLoop = true;

        while (isLoop) {
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog("Input an integer number: "));
                isLoop = false;
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, "Error: " + err.getMessage(), "Error Message", JOptionPane.WARNING_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "You inputted number = " + number);
        }
    }
}
