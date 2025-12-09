import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String studentID = JOptionPane.showInputDialog("Enter student-id:");
        String majorCode = studentID.substring(2, 5);

        String major = switch (majorCode) {
            case "131" -> "Information Technology (IT)";
            case "132" -> "Multimedia Technology (MT)";
            case "133" -> "Digital Business Information Technology (BI)";
            case "134" -> "Digital Technology in Mass Communication (DC)";
            case "135" -> "Data Science and Data Analytics (DS)";
            default -> "Cannot found major";
        };

        JOptionPane.showMessageDialog(null,
                "Student ID: " + studentID + "\nMajor: " + major);
    }
}