import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word;
        String sum = "";

        while (true) {
            System.out.print("Enter word: ");
            word = scan.nextLine();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }
            sum = sum + word + " ";
        }
        System.out.println(sum.trim());
    }
}
