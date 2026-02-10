//Subclass
public class EggTart extends Bakery {
    //Attribute
    private int egg_tart;


    //===============================================
    //Method
    public EggTart(int egg_tart, double unitPrice) {
        super("",unitPrice);
        this.egg_tart = egg_tart;
    }
    public int getLargeBox() {
        return egg_tart / 8;
    }
    public int getMediumBox() {
        return (egg_tart % 8) / 4;
    }
    public int getSmallBag() {
        return egg_tart % 4;
    }
    //===============================================

    //===============================================
    //@Override
    @Override
    public int getPackingCost() {
        return (getLargeBox() + getMediumBox() + getSmallBag()) * super.getPackingCost();
    }
    @Override
    public double calculateTotalPrice() {
        return (egg_tart * getUnitPrice()) + getPackingCost();
    }
    //===============================================

    public String toString() {
        return super.toString() +
                "\nEgg Tart (" +
                (getLargeBox() > 0 ? getLargeBox() + " Large Box " : "") +
                (getMediumBox() > 0 ? getMediumBox() + " Medium Box " : "") +
                (getSmallBag() > 0 ? getSmallBag() + " Bag" : "") +
                ")" +
                "\nTotal price of Egg Tart = " + calculateTotalPrice();
    }
}
