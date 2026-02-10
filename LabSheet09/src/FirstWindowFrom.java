import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindowFrom {
    private JPanel winfrom;
    private JLabel Label_firstname;
    private JLabel Label_lastname;
    private JTextField txt_firstname;
    private JTextField txt_lastname;
    private JButton btn_submit;
    private JButton btn_reset;
    private JFrame jframe;
    private String firstname;
    private String lastname;

    public FirstWindowFrom() {
        jframe = new JFrame();
        jframe.setContentPane(winfrom);
        jframe.setTitle("My First Window From");
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(600, 400);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (true) {
                    if (txt_firstname.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please fill in your First Name or Last Name", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if (txt_lastname.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please fill in your First Name or Last Name", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Hello, " + txt_firstname.getText() + " " + txt_lastname.getText());
                        break;
                    }
                }
            }
        });
        btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_firstname.setText("");
                txt_lastname.setText("");
            }
        });
    }
    static void main() {
        FirstWindowFrom windowFrom = new FirstWindowFrom();
    }
}
