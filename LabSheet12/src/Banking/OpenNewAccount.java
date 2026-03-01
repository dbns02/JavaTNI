package Banking;

import java.io.*;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    private boolean isExistingAccount(String account_name) throws IOException {
        File file = new File(super.getFilename());
        Scanner scan = new Scanner(file);

        if (!file.exists()) {
            return false;
        }
        while (scan.hasNextLine()) {
            String[] data = scan.nextLine().split(",");
            if (data[0].equalsIgnoreCase(account_name)) {
                scan.close();
                return true;
            }
        }
        scan.close();
        return false;
    }

    public String recordAccount() throws IOException {
        FileWriter fileWriter = new FileWriter(super.getFilename(), true);
        PrintWriter writer = new PrintWriter(fileWriter);

        String return_message = "";

        if (!isExistingAccount(super.getAccId())) {
            writer.println(super.getAccId() + "," + super.getAccBalance());
            return_message = "Created account success!!";
        } else {
            return_message = "This account has been created!!";
        }
        writer.close();
        return return_message;
    }
}