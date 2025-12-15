import javax.swing.*;
import java.text.DecimalFormat;

public class Lab501 {

    public static double cal_bmi(double weight, double height) {
        return weight / (height * height);
    }

    public static String check_bmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Healthy Weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        }
        return "Obese";
    }

    public static void main(String[] args) {

        int bmi = JOptionPane.showConfirmDialog(null,
                "Do you want to check your BMI?",
                "BMI",
                JOptionPane.YES_NO_OPTION);

        if (bmi == JOptionPane.YES_OPTION) {
            double weight = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter your weight (kg.):"));

            double height = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter your height (cm.):"));

            height = height / 100;

            double result = cal_bmi(weight, height);
            DecimalFormat frm = new DecimalFormat("#,###.00");

            JOptionPane.showMessageDialog(null,"Your BMI = " + frm.format(result) +
                    "\nYour BMI result = " + check_bmi(result));

        } else {
            JOptionPane.showMessageDialog(null, "END PROGRAM!!");
        }
    }
}
