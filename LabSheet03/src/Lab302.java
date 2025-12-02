import javax.swing.*;
import java.text.DecimalFormat;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height(cm.): "));
        DecimalFormat frm = new DecimalFormat("#,###.0");

        int gender = JOptionPane.showConfirmDialog(null,"Are your biological gender is Male?","Gender",
                JOptionPane.YES_NO_OPTION);

        if ( gender == JOptionPane.YES_OPTION ) {//(coupon == 0)
            double weight = height - 100;
            JOptionPane.showMessageDialog(null,"Hello Mr. " + name + "\nIf your height is " +
                    frm.format(height) + " cm." + "\nYour weight should be " + weight + " kg.");
        } else {
            if (gender == JOptionPane.NO_OPTION) {
                JOptionPane.showConfirmDialog(null,"Are your biological gender is Female?","Gender",
                        JOptionPane.YES_NO_OPTION);

                double weight = height - 110;
                JOptionPane.showMessageDialog(null,"Hello Mr. " + name + "\nIf your height is " +
                        frm.format(height) + " cm." + "\nYour weight should be " + weight + " kg.");
            }
        }
    }
}
