import javax.swing.*;
import java.util.Scanner;

public class StudentMain03 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Student[] st = new Student[3];

        for (int i = 0; i < st.length; i++) {
            st[i] = new Student();

            st[i].name = JOptionPane.showInputDialog("Enter student name: ");
            st[i].id = JOptionPane.showInputDialog("Enter student ID: ");

            st[i].doHomework(Integer.parseInt(
                    JOptionPane.showInputDialog("Enter homework score: ")
            ));
            st[i].takeExam(Integer.parseInt(
                    JOptionPane.showInputDialog("Enter exam score: ")
            ));
        }
        for (Student s : st) {
            System.out.println();
            s.showStatus();
        }
    }
}
