import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        boolean valid = false;

        while (!valid) {
            String fullName = JOptionPane.showInputDialog("Enter your full name:");

            if (fullName != null) {
                String[] parts = fullName.trim().split(" ");

                if (parts.length >= 2) {
                    String firstName = parts[0];
                    String lastName = "";


                    for (int i = 1; i < parts.length; i++) {
                        lastName += parts[i].toUpperCase() + " ";
                    }


                    String formattedFirstName = firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase();

                    JOptionPane.showMessageDialog(null,
                            "Welcome, " + formattedFirstName + " " + lastName.trim());
                    valid = true;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Invalid format. Please enter [First Name][Space][Last Name].");
                }
            }
        }
    }
}