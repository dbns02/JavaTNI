import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value for X coordinate: ");
        int x = scan.nextInt();

        System.out.print("Enter the value for Y coordinate: ");
        int y = scan.nextInt();

        String quadrant;

        if (x == 0 && y == 0) {
            quadrant = "Origin";
        } else if (x == 0) {
            quadrant = "on the Y-axis";
        } else if (y == 0) {
            quadrant = "on the X-axis";
        } else if (x > 0 && y > 0) {
            quadrant = "First Quadrant";
        } else if (x < 0 && y > 0) {
            quadrant = "Second Quadrant";
        } else if (x < 0 && y < 0) {
            quadrant = "Third Quadrant";
        } else {
            quadrant = "Fourth Quadrant";
        }
        System.out.println("The coordinate point (" + x + "," + y + ") lies in the " + quadrant + ".");
    }
}
