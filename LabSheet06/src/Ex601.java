import java.util.Arrays;

public class Ex601 {
    static void main() {
        int[] numbers = {38, 7, 91, 54, 12, 83, 26};

        System.out.println("Array Length = " + numbers.length);
        System.out.println("First data = " + numbers[0]);
        System.out.println("Last data = " + numbers[numbers.length-1]);

        System.out.println("All data in array = ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
