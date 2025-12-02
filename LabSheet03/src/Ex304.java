import java.util.Scanner;

public class Ex304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a massage to display on loop: ");
        String massage = scan.nextLine();

        System.out.print("Enter a number of loop: ");
        int loop = scan.nextInt();

        for ( int i = 1; i <= loop; i++) {
            System.out.println(massage);
        }
    }
}
