public class BirthdayCake extends Bakery {
    private String massage;
    private double pound;

    public BirthdayCake(String massage, double pound, String flavor, double unitPrice) {
        super(flavor,unitPrice);
        this.massage = massage;
        this.pound = pound;
    }
    public String getMassage() {
        return massage;
    }
    public void changeMessage(String new_message) {
        this.massage = new_message;
    }
    @Override
    public int getPackingCost() {
        if (this.pound >= 3)
            return 10;
        return super.getPackingCost();
    }
    @Override
    public double calculateTotalPrice() {
        return getUnitPrice() * pound + getPackingCost();
    }
    public String toString() {
        return super.toString() +
                "\n" + getFlavor() + " birthday cake (message = " + massage + " )" +
                "\nTotal price of Birthday Cake = " + calculateTotalPrice();
    }
}
