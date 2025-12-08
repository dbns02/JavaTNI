import javax.swing.*;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.showConfirmDialog;

public class Q1 {
    static void main() {
        int people = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));

        int people_buffet = 300;
        double net = 0.07;

        int sum = 0;
        int amount = 0;

        double price_buffet = people * people_buffet - (people * people_buffet * net);
        DecimalFormat frm = new DecimalFormat("#,###.00");

        int price = 0;

        int buffet = JOptionPane.showConfirmDialog(
                null, "Would you like to buffet?",
                "Buffet", JOptionPane.YES_NO_OPTION);

        if (buffet == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Total price buffet is " + frm.format(price_buffet) + " baht.");
            return;
        }

        int menu = JOptionPane.showConfirmDialog(
                null, "Would you like to menu?",
                "Menu", JOptionPane.YES_NO_OPTION);

        if (menu == JOptionPane.YES_OPTION) {

            int total = 0;
            while (true) {
                int number = Integer.parseInt(JOptionPane.showInputDialog("""
                        [1] Bacon 40 B.
                        [2] Streaky pork 40 B.
                        [3] Egg 15 B.
                        [4] Vegetable set 25 B.
                        [0] Exit and Calculate
                        Enter menu number:"""));

                if (number == 0) break;

                if (number == 1) {
                    price = 40;
                } else if (number == 2) {
                    price = 40;
                } else if (number == 3) {
                    price = 15;
                } else if (number == 4) {
                    price = 25;
                } else {
                    JOptionPane.showInputDialog(null, """
                            [1] Bacon 40 B.
                            [2] Streaky pork 40 B.
                            [3] Egg 15 B.
                            [4] Vegetable set 25 B.
                            [0] Exit and Calculate
                            Enter menu number:""");
                    continue;
                }
                amount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many do you want?"));
                sum += price * amount;
            }
            JOptionPane.showMessageDialog(null, "Total price " + frm.format(sum) + " baht.");
        }
    }
}

