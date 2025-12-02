import javax.swing.*;
import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input hour: ");
        int hour = scan.nextInt();

        System.out.print("Input minute: ");
        int minute = scan.nextInt();

        int total_time = hour * 60 + minute;
        System.out.println("Total time is " + total_time + " minutes");
    }
}