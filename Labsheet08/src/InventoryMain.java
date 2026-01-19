import java.util.Scanner;

public class InventoryMain {
    static void showInfo(Inventory product) {
        System.out.println("Product Name: " + product.getName());
        System.out.println("Current Stock: " + product.getStock());
        System.out.println("------------------------------------");
    }
    static void main() {
        Inventory product1 = new Inventory("Pen",100);
        Scanner sc = new Scanner(System.in);

        while (true) {
            showInfo(product1);

            System.out.println("Press 1 add item in stock");
            System.out.println("Press 2 remove item from stock");
            System.out.print("Enter a menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("How many item to add in stock: ");
                product1.addStock(sc.nextInt());
            } else if (menu == 2) {
                System.out.print("How many item to remove from stock: ");
                product1.removeStock(sc.nextInt());
            } else {
                break;
            }
        }
        System.out.println("END PROGRAM");
    }
}
