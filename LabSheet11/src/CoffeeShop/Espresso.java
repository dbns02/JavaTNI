package CoffeeShop;

public class Espresso extends Drink{
    private int shot;

    public Espresso(String size) {
        super("Espresso", 35, size);
    }
    public void addShot(int shot) {
        this.shot += shot;
    }
    public int getShot() {
        return shot;
    }
    public String toString() {
        return super.toString() +
                (shot > 0 ? "\nAdded " + shot + " shot" : " ") +
                "\nTotal price = " + calculateFinalPrice() + " Baht";
    }
    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (getShot() * 15) + getSizeExtra();
    }
}
