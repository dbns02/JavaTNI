import javax.swing.*;
public class TicketUsed {
    public static String show_movie_list(Ticket... tickets) {
        String result = "";

        for (Ticket t : tickets) {
            result += t.getTicketId() + ": " + t.getMovie() + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket("T001", new Movie("Titanic",120,"PG-13"),"12:00","B7",280),
                new Ticket("T002", new Movie("A Walk to Remember",102,"PG"),"11:00","G11",240),
                new Ticket("T003", new Movie("Silent Hill",125,"R-13"),"14:30","H2",240)
        };

        int start = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book or use a ticket?",
                "Ticket",
                JOptionPane.YES_NO_OPTION
        );

        if (start != JOptionPane.YES_OPTION) return;
        boolean loop = true;
        while (loop) {
            String ticketId = JOptionPane.showInputDialog(
                    null,
                    show_movie_list(tickets) + "\nEnter a ticket id for booking:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            Ticket selected = null;

            for (Ticket t : tickets) {
                if (t.getTicketId().equals(ticketId)) {
                    selected = t;
                    break;
                }
            }
            if (selected != null) {
                String menu = JOptionPane.showInputDialog(
                        null,
                        selected.getTicketId() + ": " + selected.getMovie() + "\n\n" +
                                "Press 1 to book a ticket\n" +
                                "Press 2 to use a ticket\n" +
                                "Press 3 to see a ticket status\n\n" +
                                "Enter a menu:",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE
                );

                int choice = Integer.parseInt(menu);
                String msg = "";
                if (choice == 1) msg = selected.bookTicket();
                else if (choice == 2) msg = selected.useTicket();
                JOptionPane.showMessageDialog(
                        null,
                        msg + "\n-------------------------\n" + selected,
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
            int again = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to book or use other tickets?",
                    "Ticket",
                    JOptionPane.YES_NO_OPTION
            );
            if (again != JOptionPane.YES_OPTION)
                loop = false;
        }
    }
}
