package Customer;

public class Regular extends Customer {
    public Regular(String name, double billAmount) {
        super(name, billAmount);
    }
    public boolean isDiscount() {
        return super.getBillAmount() >= 500;
    }
    @Override
    public double calculateFinalBill() {
        return isDiscount() ? super.getBillAmount() - (super.getBillAmount() * 0.05) : super.getBillAmount();
    }
    public String toString() {
        return super.toString() +
                (isDiscount() ? "\nYou get discount 5%" : "") +
                "\nTotal Price: " + calculateFinalBill();
    }
}
