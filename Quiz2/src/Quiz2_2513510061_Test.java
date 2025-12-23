import javax.swing.*;

public class Quiz2_2513510061_Test {

    public static boolean hasLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasWhitespace(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isWhitespace(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static String check(boolean condition) {
        return condition ? "\u2714" : "\u2715";
    }

    public static void main(String[] args) {

        String message =
                "To create a password must...\n"
                        + "1. Contain at least one letter\n"
                        + "2. Contain at least one digit\n"
                        + "3. NOT contain whitespace\n"
                        + "4. Be longer than 8 characters\n\n"
                        + "Enter your password:";

        while (true) {

            String password = JOptionPane.showInputDialog(
                    null,
                    message,
                    "Password Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (password == null) return;

            boolean c1 = hasLetter(password);
            boolean c2 = hasDigit(password);
            boolean c3 = !hasWhitespace(password);
            boolean c4 = password.length() > 8;

            if (!(c1 && c2 && c3 && c4)) {
                message =
                        "[" + check(c1) + "] 1.Contain at least one letter\n" +
                                "[" + check(c2) + "] 2.Contain at least one digit\n" +
                                "[" + check(c3) + "] 3.NOT contain whitespace\n" +
                                "[" + check(c4) + "] 4.Be longer than 8 characters\n" +
                                "Enter your password again";
                continue;
            }
            
            JOptionPane.showMessageDialog(
                    null,
                    "Thank you\nYour password is " + password,
                    "Password Accepted",
                    JOptionPane.INFORMATION_MESSAGE
            );
            break;
        }
    }
}
