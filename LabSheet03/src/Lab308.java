import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab308 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int number = scan.nextInt();

        int i = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int even = 0;
        int odd = 0;

        while (i < number) {
            System.out.print("Enter number " + (++i) + ": ");
            int num = scan.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + even);
        System.out.println("Odd number = " + odd);
    }
}
