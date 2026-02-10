package CoffeeShop;

public abstract class Drink implements Priceable {
    private String DrinkName;
    private double basePrice;
    private String size;

    public Drink(String drinkName, double basePrice, String size) {
        this.DrinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size;
    }
    public String getDrinkName() {
        return DrinkName;
    }
    public abstract double calculateFinalPrice();

    public String toString() {
        return "Your order: " + getDrinkName() + " (Size: " + size.toUpperCase() + ")";
    }
    @Override
    public double getBasePrice() {
        return this.basePrice;
    }

    @Override
    public double getSizeExtra() {
        if (this.size.equalsIgnoreCase("s")) {
            return 0;
        } else if (this.size.equalsIgnoreCase("m")) {
            return 10;
        } else if (this.size.equalsIgnoreCase("l")) {
            return 15;
        }
        return -1;
    }
}
