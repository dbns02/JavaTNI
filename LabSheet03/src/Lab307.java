import javax.swing.*;
import java.text.DecimalFormat;

public class Lab307 {
    public static void main(String[] args) {
        int sum = 0;

            while (true) {
                int price = Integer.parseInt(JOptionPane.showInputDialog("Input price [press 0 to stop]:"));
                if (price == 0) break;
                if (price > 0) {
                    sum += price;
                } else {
                    price = Integer.parseInt(JOptionPane.showInputDialog("Invalid price!!\nInput price [press 0 to stop]:"));
                }
            }

            DecimalFormat frm = new DecimalFormat("#,###.0");
            JOptionPane.showMessageDialog(null,"Total price is " + frm.format(sum) + " baht.");
        }
    }

