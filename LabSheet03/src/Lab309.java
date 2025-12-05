import javax.swing.*;

public class Lab309 {
    public static void main(String[] args) {
        int sum = 0;
        int menu = JOptionPane.showConfirmDialog(null, "Do you want to order from the menu?", "Menu",
                JOptionPane.YES_NO_OPTION);

        if (menu == JOptionPane.YES_OPTION) {
            while (true) {
                int number = Integer.parseInt(JOptionPane.showInputDialog("""
                        Yakitori Menu
                        [1] Chicken Wing 99 B.
                        [2] Pork with Leek 89 B.
                        [3] Beef Tongue 109 B.
                        [0] Exit and Calculate
                        Enter menu number:"""));

                if (number == 0) break;

                int price = 0;
                switch (number) {
                    case 1:
                        price = 99;
                        break;
                    case 2:
                        price = 89;
                        break;
                    case 3:
                        price = 109;
                        break;
                    default:
                        JOptionPane.showInputDialog(null, """
                                Yakitori Menu
                                [1] Chicken Wing 99 B.
                                [2] Pork with Leek 89 B.
                                [3] Beef Tongue 109 B.
                                [0] Exit and Calculate
                                Enter menu number:""");
                }
                sum += price;
            }
            JOptionPane.showConfirmDialog(null, "Do you want to order from the menu?", "Menu", JOptionPane.YES_NO_OPTION);

            JOptionPane.showMessageDialog(null, "Total price is " + sum + " Baht.");
        }
    }
}

