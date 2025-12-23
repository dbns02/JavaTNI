import javax.swing.*;

public class Quiz2_2513510061 {
    public static boolean has_no_letters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password == null) {
                return true;
            } else {
                return false;
            }
        }
    return false;
    }
}


    public static boolean has_no_digits(String password) {
        if (password == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean has_whitespace(String password) {
        if (password == null) {
            return true;
        } else {
            return false;
        }
    }

    public static String create_cheaked_message(String password) {
        if (password == null) {
            return "[\u2714]";
        } else {
            return "[\u2715]";
        }
    }

    static void main() {
        String password = JOptionPane.showInputDialog(null, "To creat a Password must ..." +
                "\n1.contain at least one letter" +
                "\n2.contain at least one digit" +
                "\n3.NOT contain any whitespace" +
                "\n4.be longer then 8 characters" +
                "\nEnter your password");

        String massage = password;
        for (int i = 0; i <= massage.length(); i++) {
            if (Character.isLetterOrDigit(massage.charAt(i))) {
                System.out.println(massage.charAt(i) + " is a letter");
            } else {
                System.out.println(massage.charAt(i) + " is a digit");
            }
        }
    }

