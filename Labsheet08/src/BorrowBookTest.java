import javax.swing.*;

public class BorrowBookTest {
    static void main() {
        Book books = new Book("C# Programming", 5);

        int borrow = JOptionPane.showConfirmDialog(null, "Do you want to borrow books", "Borrow", JOptionPane.YES_NO_OPTION);

        while (borrow == JOptionPane.YES_OPTION) {
            if (books.getAvailableBook() == 0) {
                JOptionPane.showMessageDialog(null, "No books available to borrow...", null, JOptionPane.WARNING_MESSAGE);
                break;
            }
            if (books.getAvailableBook() != 0) {
                borrow = JOptionPane.showConfirmDialog(null, "Do you want to borrow books", "Borrow", JOptionPane.YES_NO_OPTION);
                books.borrowBook();
                System.out.println("Borrowed 1 book, available " + books.getAvailableBook() + " books.");
            }
            if (borrow == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,"END PROGRAM");
                break;
            }
        }
    }
}