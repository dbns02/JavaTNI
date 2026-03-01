package Banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount implements Transactionable {
    public AccountTransaction(String accId) {
        super(accId);
    }
    public boolean hasAccountId() throws FileNotFoundException {
        File file = new File(getFilename());
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {

            String[] data = sc.nextLine().split(",");
            String fileAccId = data[0];

            if(fileAccId.equals(this.getAccId())) {
                this.setAccBalance(Double.parseDouble(data[1]));
                sc.close();
                return true;
            }
        }
        sc.close();
        return false;
    }
    public void deposit(double amount) {

        setAccBalance(getAccBalance() + amount);
    }
    public void withdraw(double amount) {
        if(getAccBalance() >= amount) {
            setAccBalance(getAccBalance() - amount);
        }
    }
    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}
