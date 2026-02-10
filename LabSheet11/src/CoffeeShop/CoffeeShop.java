package CoffeeShop;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {
    static Espresso orderEspresso(Scanner scan) {
        System.out.print("Enter a size: ");
        String size = scan.next();

        Espresso espresso = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String addShot = scan.next();

        if (addShot.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int shot = scan.nextInt();
            espresso.addShot(shot);
        }
        return espresso;
    }

    static Frappuccino orderFrappuccino(Scanner scan) {
        System.out.print("Enter a size: ");
        String size = scan.next();

        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String whip = scan.next();

        boolean whipped = whip.equalsIgnoreCase("y");
        return new Frappuccino(size, whipped);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Drink> orders = new ArrayList<>();

        boolean more = true;

        int espressoCount = 0;
        int frappuccinoCount = 0;
        
        while (more) {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int choice = scan.nextInt();

            Drink drink = null;

            if (choice == 1) {
                drink = orderEspresso(scan);
                espressoCount++;
            } else if (choice == 2) {
                drink = orderFrappuccino(scan);
                frappuccinoCount++;
            } else {
                break;
            }
            orders.add(drink);
            System.out.println(drink);

            System.out.println();
            System.out.print("Do you want to order more [y/Y]? ");
            more = scan.next().equalsIgnoreCase("y");
        }

        double total = 0;

        for (Drink d : orders) {
            total += d.calculateFinalPrice();
        }

        System.out.println("You ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount + " Frappuccino");
        System.out.println("Total Price = " + total);
    }
}
