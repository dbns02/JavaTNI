import javax.swing.*;

public class BookInventory {
    static void main() {
        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            String book_title = JOptionPane.showInputDialog("Enter book title: ");
            int total_book = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number: "));
            books[i] = new Book(book_title, total_book);
            showInfo(books[i]);
        }
    }
    static void showInfo(Book books) {
        System.out.println(books.getTitle() + " has " + books.getTotalBook() + " books, can borrow " + books.getAvailableBook() + " books.");
    }
}
