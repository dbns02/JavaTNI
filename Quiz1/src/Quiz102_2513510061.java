import java.util.Scanner;

public class Quiz102_2513510061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Factor list of " + num1 + " = ");
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Factor list of " + num2 + " = ");
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Common Factors of " + num1 + " and " + num2 + " = ");
        int min = Math.min(num1, num2);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("Greatest Common Divisor = " + a);
    }
}
