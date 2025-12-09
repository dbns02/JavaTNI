import javax.swing.*;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.showConfirmDialog;

public class Q1 {
    static void main() {
        int people = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));

        //เก็บการตั้งค่าไว้ค่าไว้ด้านนอก
        int people_buffet = 300;
        double net = 0.07;

        int sum = 0;
        int price = 0;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        int buffet = JOptionPane.showConfirmDialog(
                null, "Would you like to buffet?",
                "Buffet", JOptionPane.YES_NO_OPTION);

        if (buffet == JOptionPane.YES_OPTION) {
            double price_buffet = people * people_buffet - (people * people_buffet * net);
            JOptionPane.showMessageDialog(null,
                    "Total price buffet is " + frm.format(price_buffet) + " baht.");
            return;
        }

        int menu = JOptionPane.showConfirmDialog(
                null, "Would you like to menu?",
                "Menu", JOptionPane.YES_NO_OPTION);

        if (menu == JOptionPane.YES_OPTION) {

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
                            Invalid menu number!!!
                            [1] Bacon 40 B.
                            [2] Streaky pork 40 B.
                            [3] Egg 15 B.
                            [4] Vegetable set 25 B.
                            [0] Exit and Calculate
                            Enter menu number:""");
                    continue;
                }
                int amount = Integer.parseInt(JOptionPane.showInputDialog("How many do you want?"));
                sum += price * amount;

            }
            double total = sum + (sum * net);
            JOptionPane.showMessageDialog(null, "Total price " + frm.format(total) + " baht.");
        }
    }
}

