package Banking;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSystem1 {
    public static Scanner scanner = new Scanner(System.in);

    public static String input_account_id() {

        System.out.print("Enter account ID: ");
        String accId = scanner.nextLine();

        while (accId.length() != 10) {
            System.out.print("Enter account ID: ");
            accId = scanner.next();
            }
        return accId;
        }

    public static double input_initial_balance() {
        System.out.print("Enter initial balance: ");
        try {
            double balance = BankSystem1.scanner.nextDouble();
            return balance;

        } catch (InputMismatchException e) {
            System.out.print("Invalid input!");
            BankSystem1.scanner.next();
            return input_initial_balance();
        }
    }
    public void main(String[] args) throws IOException {
        String account_id = BankSystem1.input_account_id();
        double initial_balance = input_initial_balance();

        OpenNewAccount account = new OpenNewAccount(account_id, initial_balance);
        System.out.println(account.recordAccount());
    }
}