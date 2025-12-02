import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int integer = scan.nextInt();

        if ( integer == 0) {
            System.out.println("This is Zero number");
        } else {
            if ( integer % 2 == 0 && integer > 0 ) {
                System.out.println("This number is Even and Positive number");
            }
            else if ( integer % 2 != 0 && integer > 0 ) {
                System.out.println("This number is Odd and Positive number");
            }
            else if ( integer % 2 == 0 && integer < 0 ) {
                System.out.println("This number is Even and Negative number");
            }
            else if ( integer % 2 != 0 && integer < 0 ) {
                System.out.println("This number is Odd and Negative number");
            }
        }
    }
}
