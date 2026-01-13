public class Product {
    String name;
    double price = 0;
    int quantity = 0;

    void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Added " + amount + " items to stock");
        }
    }
    void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold " + amount + " items");
        } else {
            System.out.println("Not enough items in stock...");
        }
    }
    void changePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
            System.out.println("Changed price to " + newPrice + " Baht");
        }
    }
    double stockValue() {
        return quantity * price;
    }
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price + " Baht/Item");
        System.out.println("Quantity: " + quantity + " Items");
        System.out.println("Stock Value: " + stockValue() + " Baht");
    }
}
