import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence;

        System.out.print("Input some sentence: ");
        sentence = scan.nextLine();

        while (true) {
            if (sentence.endsWith(".")) {
                break;
            }

            System.out.print("The sentence must end with stop point: ");
            sentence = scan.nextLine();
        }
        sentence = sentence.substring(0, sentence.length() - 1);

        String[] words = sentence.split(" ");

        for (String w : words) {
            System.out.println(w);
        }
    }
}
