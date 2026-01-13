import java.util.Scanner;

public class ProductMain04 {
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};
        for (int i=0; i<products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    static void main() {
        Product[] products = new Product[4];
        setting_product(products);

        System.out.println("welcome to MINI SHOP!!");
        System.out.println("--------------------------------");
        System.out.println("Press [1] to buy Pens (items = " + products[0].quantity + ")");
        System.out.println("Press [2] to buy Pencils (items = " + products[1].quantity + ")");
        System.out.println("Press [3] to buy Markers (items = " + products[2].quantity + ")");
        System.out.println("Press [4] to buy Highlighters (items = " + products[3].quantity + ")");
        System.out.println("--------------------------------");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int amount = sc.nextInt();

            if (amount == 1) {
                System.out.println("Name : Pens");
                System.out.println("Price : " + products[0].price + " Baht/Item");
                System.out.println("Stock : " + products[0].quantity + " Baht/Item");
                System.out.println("Stock Value : " + products[0].stockValue() + " Baht/Item");
                System.out.println("-------------------------------------");

                System.out.println("How many Pens do you want to buy?");
                int buy = sc.nextInt();

                System.out.println("Sold " + buy + " items");
                System.out.println("-------------------------------------");
                products[0].showInfo();
            } else if (amount == 2) {
                System.out.println("Name : Notebooks");
                System.out.println("Price : " + products[1].price + " Baht/Item");
                System.out.println("Stock : " + products[1].quantity + " Baht/Item");
                System.out.println("Stock Value : " + products[1].stockValue() + " Baht/Item");

                System.out.println("How many Pens do you want to buy?");
                int buy = sc.nextInt();

                System.out.println("Sold " + buy + " items");
                System.out.println("-------------------------------------");
                products[1].showInfo();
            } else if (amount == 3) {
                System.out.println("Name : Notebooks");
                System.out.println("Price : " + products[2].price + " Baht/Item");
                System.out.println("Stock : " + products[2].quantity + " Baht/Item");
                System.out.println("Stock Value : " + products[2].stockValue() + " Baht/Item");

                System.out.println("How many Pens do you want to buy?");
                int buy = sc.nextInt();

                System.out.println("Sold " + buy + " items");
                System.out.println("-------------------------------------");
                products[2].showInfo();
            } else if (amount == 4) {
                System.out.println("Name : Notebooks");
                System.out.println("Price : " + products[3].price + " Baht/Item");
                System.out.println("Stock : " + products[3].quantity + " Baht/Item");
                System.out.println("Stock Value : " + products[3].stockValue() + " Baht/Item");

                System.out.println("How many Pens do you want to buy?");
                int buy = sc.nextInt();

                System.out.println("Sold " + buy + " items");
                System.out.println("-------------------------------------");
                products[3].showInfo();
            } else {
                System.out.print("Invalid number! Enter a number, again: ");
                System.out.println("---------------------------------------");
            }
        }
    }
}
