import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word;

        while (true) {
            System.out.println("Enter word: ");
            word = scan.nextLine();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }
        }

    }
}
