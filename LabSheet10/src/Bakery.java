public class Bakery {
    private String flavor;
    private double unitPrice;
    private int packingCost = 5; //Override ที่เพิ่มเข้ามา

    public Bakery(String flavor, double unitPrice) {
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }
    public Bakery(double flavor) {
        this("",0.0);
    }
    public String getFlavor() {
        return flavor;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    //Override ที่เพิ่มเข้ามา--------------------
    public int getPackingCost() {
        return packingCost;
    }
    public double calculateTotalPrice() {
        return unitPrice + packingCost;
    }
    //-------------------------------------
    public String toString() {
        return "Thank you for your order!";
    }
}
