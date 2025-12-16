import java.util.Scanner;

public class Lab503 {

    public static int count_vowel(String message, char letter) {
        int count = 0;

        message = message.toLowerCase();
        letter = Character.toLowerCase(letter);

        if ("a e i o u".indexOf(letter) == -1) {
            return 0;
        }

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String msg = sc.nextLine();

        System.out.println("List of vowel in \"" + msg + "\"");

        System.out.println("The letter 'A' appears " + count_vowel(msg, 'A') + " time(s).");
        System.out.println("The letter 'E' appears " + count_vowel(msg, 'E') + " time(s).");
        System.out.println("The letter 'I' appears " + count_vowel(msg, 'I') + " time(s).");
        System.out.println("The letter 'O' appears " + count_vowel(msg, 'O') + " time(s).");
        System.out.println("The letter 'U' appears " + count_vowel(msg, 'U') + " time(s).");
    }
}
