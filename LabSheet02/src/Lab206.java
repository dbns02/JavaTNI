import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        int food_price = 299;
        double net = 0.07;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        int people = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));

        double price = people * food_price * net + food_price * people;

        int conpon = Integer.parseInt(JOptionPane.showInputDialog("Price with NET is " + frm.format(price) + " bath." + "\nHow much of discount (%) on your coupon?"));

        double total_price = price - price * conpon/100;

        int amount = Integer.parseInt(JOptionPane.showInputDialog("Total price is " + frm.format(total_price) + " baht." + "\nEnter the amount the customer paid:"));

        double get_change = amount - total_price;

        JOptionPane.showMessageDialog(null,"Total price is " + frm.format(total_price) + " baht." + "\nCustomer paid " + amount + " baht." + "\nGet change " + frm.format(get_change) + " baht.");
    }
}