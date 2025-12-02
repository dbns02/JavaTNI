import javax.swing.*;
import java.text.DecimalFormat;

public class Ex203 {
    public static void main(String[] args) {
        final int lecture_price = 1900;
        final int lab_price = 3500;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        int lecture_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit: "));
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lab credit: "));

        int lecture_total_price = lecture_credit * lecture_price;
        int lab_total_price = lab_credit * lab_price;
        int total_price = lecture_total_price + lab_total_price;

        JOptionPane.showMessageDialog(null,"Lecture: " + lecture_credit + "x" + lab_price + " = " + frm.format(lecture_total_price) + "\nLaboratory: " + lab_credit + "x" + lab_price + " = " + frm.format(lab_total_price) + "\nTotal price: " + frm.format(total_price));
    }
}
