package Banking;

import java.util.InputMismatchException;
import java.util.Scanner;
import Banking.AccountTransaction;

public class BankSystem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account ID: ");
            String accId = sc.next();

            AccountTransaction account = new AccountTransaction(accId);

            if (account.hasAccountId()) {

                int choice = 0;

                do {
                    System.out.println("Press 1 to deposit");
                    System.out.println("Press 2 to withdraw");
                    System.out.println("Press 3 to check balance");
                    System.out.println("Press 4 to exit");
                    System.out.print("Enter a menu: ");

                    try {
                        choice = sc.nextInt();
                    }
                    catch (InputMismatchException err) {
                        System.out.println("Invalid choice!");
                        sc.next();
                        continue;
                    }
                    if (choice < 1 || choice > 4) {
                        System.out.println("Invalid choice!");
                        continue;
                    }

                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            double dep = sc.nextDouble();
                            account.deposit(dep);

                            System.out.println("Your balance: " + account.checkBalance());
                            break;
                        case 2:
                            System.out.print("Enter withdraw amount: ");
                            double wit = sc.nextDouble();
                            account.withdraw(wit);

                            System.out.println("Your balance: " + account.checkBalance());
                            break;
                        case 3:
                            System.out.println("Your balance: " + account.checkBalance());
                            break;
                        case 4:
                            System.out.println("Exit system...");
                            break;
                    }
                }
                while (choice != 4);
            }
            else {
                System.out.println("Bank account not found…");
            }
        }
        catch (Exception err) {
            System.out.println("System error: " + err.getMessage());
        }
    }
}
