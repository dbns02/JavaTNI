import java.util.Scanner;

public class Ex604 {
    public static Scanner scanner = new Scanner(System.in);
    public static int input_length() {
        System.out.println("How many number to input: ");
        int number = scanner.nextInt();
        while (number <= 1) {
            System.out.println("How many number to input: ");
            number = scanner.nextInt();
        }
        return number;
    }
}
