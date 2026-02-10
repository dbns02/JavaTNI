import javax.swing.*;

public class BookMain02 {
    static void main() {
        String author_name = JOptionPane.showInputDialog("Enter author's name: ");
        int consent = JOptionPane.showConfirmDialog(null,"Do you prefer to publish your nationality and birth year?");

        Author author;

        if (consent == JOptionPane.YES_OPTION) {
            String nationality = JOptionPane.showInputDialog("Input author's nationality: ");
            String birth_year = JOptionPane.showInputDialog("Input author's birthyear: ");
            author = new Author(author_name, nationality, Integer.parseInt(birth_year));
        } else {
            author = new Author(author_name);
        }
        JOptionPane.showMessageDialog(null, author.showAuthorInfo());

        String title = JOptionPane.showInputDialog("Enter book title: ");
        String category = JOptionPane.showInputDialog("Enter book category: ");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter book price: "));

        Book book = new Book(title, category, price, author);

        if (book.isDiscountedAvailable()) {
            int discount_percent = Integer.parseInt(JOptionPane.showInputDialog("Input discount %: "));
            book.setDiscount_percent(discount_percent);
        }
        JOptionPane.showMessageDialog(null,book);
    }
}
