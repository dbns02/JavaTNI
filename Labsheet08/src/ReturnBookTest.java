import javax.swing.*;

public class ReturnBookTest {
    static void main() {
        Book book = new Book("java Programming",5);

        int borrow = JOptionPane.showConfirmDialog(null,"Do you want to borrow books","Borrow",JOptionPane.YES_NO_OPTION);
        while (true) {
            if (borrow == JOptionPane.YES_OPTION) {
                int number = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to borrow books \n Press 2 to return book"));
                if (number < 1 || number > 2) {
                    JOptionPane.showMessageDialog(null,"END PROGRAM");
                    break;
                }
                if (number == 1) {
                    book.borrowBook();
                    System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
                }
                if (number == 2) {
                    book.returnBook();
                    System.out.println("Returned 1 book, available " + book.getAvailableBook() + " books.");
                }
                if (book.getAvailableBook() == 0) {
                    JOptionPane.showMessageDialog(null, "No books available to borrow...", null, JOptionPane.WARNING_MESSAGE);
                }
                if (book.getAvailableBook() == 5) {
                    JOptionPane.showMessageDialog(null, "Cannot return All books are already here.", null, JOptionPane.WARNING_MESSAGE);
                }
            } else if (borrow == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,"END PROGRAM");
                break;
            }
        }
    }
}
