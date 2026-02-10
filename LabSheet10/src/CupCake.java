public class CupCake extends Bakery{
    int piece;

    public CupCake(int piece, String flavor, double unitPrice) {
        super(flavor,unitPrice);
        this.piece = piece;
    }
    public boolean isPackingBox() {
        return piece >= 6;
    }
    public int getBoxNumber() {
        if (isPackingBox()) {
            return piece / 6;
        }
        return 0;
    }
    public int getBagNumber() {
        return piece % 6;
    }
    @Override
    public int getPackingCost() {
        if (isPackingBox()) {
            return getBoxNumber() * super.getPackingCost();
        }
        return 0;
    }
    @Override
    public double calculateTotalPrice() {
        return (piece * getUnitPrice() + super.getPackingCost() + (getBagNumber() * 0.5));

    }
    public String toString() {
        return super.toString() +
                "\nCup cake (" + getFlavor() + ") with " +
                (isPackingBox() ? getBoxNumber() + " Box " : " ") + getBagNumber() + " bag" +
                "\nTotal price of Cup Cake = " + calculateTotalPrice();

    }
}
