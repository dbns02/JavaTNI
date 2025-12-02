import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {
            String product_id = "PB-001";
            String product_name = "Pencil Box";
            int item = 560;
            double price_per_item = 30.20;

            //จัดรูปราคาจาก 3382.4 ==> 3,382.40
            DecimalFormat frm = new DecimalFormat("#,###.00");

            System.out.println("Product name: " + product_name + " (" + product_id + ")");
            System.out.println("Product item: " + item + " (" + price_per_item + " bath/piece)");

            double total_price = item * price_per_item;
            System.out.println("Total price: " + frm.format(total_price) + " bath");
    }
}
