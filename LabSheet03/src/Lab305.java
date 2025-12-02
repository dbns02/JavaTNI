import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scan.nextInt();

        System.out.print("Enter the second number: ");
        int second = scan.nextInt();

        if ( first % 2 != 0 ) {
            ++first;
        }

        for (int i = first; i <= second; i+=2) {
            System.out.print(i + " ");
        }
    }
}
