import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static String hide_password(String password) {
        String hide_password = "";
        for (int i = 0; i < password.length(); i++) {
            if (i == 0) {
                hide_password += password.charAt(i);
            } else if ( i == password.length() - 1) {
                hide_password += password.charAt(i);
            } else {
                hide_password += "*";
            }
        }
        return hide_password;
    }

    static void main() throws IOException {
        File Fillname = new File("src/users.txt");
        Scanner sc = new Scanner(Fillname);

        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(",");
            String username = data[0];
            String password = data[1];
            String gender = data[2];
            int birthyear = Integer.parseInt(data[3]);
            System.out.println("Username: " + username);
            System.out.println("Password: " + hide_password(password));
            System.out.println("Gender: " + gender);
            System.out.println("Birthday: " + birthyear);
            System.out.println();
        }
        sc.close();
    }
}
