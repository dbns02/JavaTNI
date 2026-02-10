import java.text.DecimalFormat;
import java.util.Scanner;

public class CakeOrder {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scan.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scan.nextLine();
        System.out.print("How many pound: ");
        double pound = scan.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);

        System.out.println(order1);
        System.out.println();

        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor: ");
        String cup = scan.next();
        System.out.print("How many piece: ");
        int piece = scan.nextInt();

        CupCake order2 = new CupCake( piece, cup, 65);

        System.out.println(order2);
        System.out.println();

        //===============================================
        //Order3
        System.out.println("Egg Tart's Details:");
        System.out.print("How many piece: ");
        int egg_tart = scan.nextInt();

        EggTart order3 = new EggTart(egg_tart, 25);

        System.out.println(order3);
        System.out.println();
        //===============================================

        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("Total price = " + df.format(order1.calculateTotalPrice() + order2.calculateTotalPrice() + order3.calculateTotalPrice()));

    }
}
