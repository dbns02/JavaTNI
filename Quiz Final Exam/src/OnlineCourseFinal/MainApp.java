package OnlineCourseFinal;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    static ArrayList<Customer> customers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String filename = "courses.txt";

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Add Course");
            System.out.println("2. Show All Courses");
            System.out.println("3. Search Name");
            System.out.println("4. Save to File");
            System.out.println("5. Load From File");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addCourse();
                case 2 -> showAll();
                case 3 -> searchName();
                case 4 -> saveToFile();
                case 5 -> loadFromFile();
                case 6 -> {
                    System.out.println("Bye!");
                    return;
                }
            }
        }
    }

    static void addCourse() {

        try {
            String[] options = {"Java Online", "Python Online", "Web Onsite"};
            int select = JOptionPane.showOptionDialog(
                    null,
                    "Select Course",
                    "Course Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            Course course = null;

            if (select == 0)
                course = new OnlineCourse("Java Online", 30, 1500);
            else if (select == 1)
                course = new OnlineCourse("Python Online", 25, 1400);
            else if (select == 2)
                course = new OnsiteCourse("Web Onsite", 40, 2000);

            System.out.print("Enter Customer Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            Customer customer = new Customer(name, age, course);
            customers.add(customer);

            System.out.println("Added Successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

    static void showAll() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    static void searchName() {

        while (true) {
            System.out.print("Enter name to search: ");
            String search = sc.next();

            boolean found = false;

            for (Customer c : customers) {
                if (c.getName().equalsIgnoreCase(search)) {
                    System.out.println(c);
                    found = true;
                    break;
                }
            }

            if (found) break;
            else System.out.println("Not found. Try again.");
        }
    }

    static void saveToFile() {

        try {
            FileWriter fw = new FileWriter(filename ,true);
            PrintWriter pw = new PrintWriter(fw);

            for (Customer c : customers) {
                pw.println(c.getName() + "," +
                        c.getAge() + "," +
                        c.getCourse().getCourseName() + "," +
                        c.getCourse().getDuration() + "," +
                        c.getCourse().getPrice());
            }

            pw.close();
            System.out.println("Saved!");

        } catch (IOException e) {
            System.out.println("File error!");
        }
    }

    static void loadFromFile() {

        try {
            File file = new File(filename);
            Scanner fileScan = new Scanner(file);

            customers.clear();

            while (fileScan.hasNextLine()) {

                String[] data = fileScan.nextLine().split(",");

                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String courseName = data[1];
                int duration = Integer.parseInt(data[2]);
                double price = Double.parseDouble(data[3]);

                Course course;

                if (courseName.contains("Online"))
                    course = new OnlineCourse(courseName, duration, price);
                else
                    course = new OnsiteCourse(courseName, duration, price);

                Customer customer = new Customer(name, age, course);
                customers.add(customer);
            }

            fileScan.close();
            System.out.println("Loaded from file!");

        } catch (Exception e) {
            System.out.println("Load error!");
        }
    }
}