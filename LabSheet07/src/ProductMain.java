import javax.swing.*;

public class ProductMain {
    static void main() {
        JOptionPane.showMessageDialog(null, "Welcome to Product Stock System");

        Product p1 = new Product();
        p1.name = JOptionPane.showInputDialog("Enter Product Name: ");
        p1.price = Double.parseDouble(JOptionPane.showInputDialog("Enter Product Price: "));
        p1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Product Quantity: "));
        p1.showInfo();

        int add_item = JOptionPane.showConfirmDialog(null,"Do you want to add more item?","Confirm",JOptionPane.YES_NO_OPTION);

        if (add_item == JOptionPane.YES_OPTION) {
            p1.addStock(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter  product price per item: ")));
        }

        int change_price = JOptionPane.showConfirmDialog(null,"Do you want to change price: ","Confirm",JOptionPane.YES_NO_OPTION);

        if (change_price == JOptionPane.YES_OPTION) {
            p1.changePrice(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter product price per item: ")));
        }
        p1.showInfo();
    }
}
