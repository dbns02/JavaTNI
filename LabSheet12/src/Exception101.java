import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception101 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        boolean isLoop = true;

        while (isLoop) {
            try {
                System.out.print("Enter an integer number: ");
                num = sc.nextInt();
                isLoop = false;
            } catch (InputMismatchException err) { // เวลาทำงานจริงเน้นใช้ Exception
                sc.next();
                System.out.println("Input wrong data type!!");
            }
            System.out.println("You inputted number: " + num);
            System.out.println();
        }
    }
}
