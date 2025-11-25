import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number_1 = scan.nextInt();

        System.out.print("Enter number 2: ");
        int number_2 = scan.nextInt();

        int sum = (number_1 + number_2);
        int sub = (number_1 - number_2);
        int mul = (number_1 * number_2);
        double div = (number_1 / Float.parseFloat(number_2+""));
        int mod = (number_1 % number_2);

        System.out.println("Summation = " + sum + "\nSubtraction = " + sub + "\nMultiplication = " + mul + "\nDivision = " + div + "\nModulus = " + mod);
    }
}
