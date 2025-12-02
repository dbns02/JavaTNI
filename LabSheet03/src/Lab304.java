import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab304 {
    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.): "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.): "));

        double chage_height = height / 100;
        double total_BMI = weight / (chage_height * chage_height);

        DecimalFormat frm = new DecimalFormat("#,###.00");

        if ( total_BMI < 18.5 ) {
            JOptionPane.showMessageDialog(null,"Your BMI is " + frm.format(total_BMI) +
                    "\nBMI result is Underweight");
        } else if ( total_BMI <= 24.9 ) {
            JOptionPane.showMessageDialog(null, "Your BMI is " + frm.format(total_BMI) +
                    "\nBMI result is Healhty weight");
        } else if ( total_BMI <= 29.9 ) {
            JOptionPane.showMessageDialog(null, "Your BMI is " + frm.format(total_BMI) +
                    "\nBMI result is Overweight");
        } else {
            JOptionPane.showMessageDialog(null, "Your BMI is " + frm.format(total_BMI) +
                    "\nBMI result is Obese");
        }
    }
}
