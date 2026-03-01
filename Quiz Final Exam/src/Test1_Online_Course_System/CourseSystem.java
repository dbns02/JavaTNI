package Test1_Online_Course_System;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CourseSystem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        boolean more = true;

        while (more) {
            try {
                System.out.println("1. Video Test1_Course.Course");
                System.out.println("2. Live Test1_Course.Course");
                System.out.print("Choose: ");
                int choice = scan.nextInt();
                scan.nextLine();

                System.out.print("Title: ");
                String title = scan.nextLine();

                System.out.print("Base price: ");
                double price = scan.nextDouble();

                if (choice == 1) {
                    System.out.print("Duration: ");
                    int duration = scan.nextInt();
                    courses.add(new VideoCourse(title, price, duration));
                } else if (choice == 2) {
                    System.out.print("Certificate (true/false): ");
                    boolean cert = scan.nextBoolean();
                    courses.add(new LiveCourse(title, price, cert));
                }

                System.out.print("Add more? (y/n): ");
                more = scan.next().equalsIgnoreCase("y");

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scan.next();
            }
        }

        double total = 0;

        for (Course c : courses) {
            System.out.println(c);
            total += c.calculatePayment();
        }

        System.out.println("Total payment: " + total);

        // Write to file
        try {
            FileWriter fw = new FileWriter("summary.txt");
            for (Course c : courses) {
                fw.write(c.toString() + "\n\n");
            }
            fw.write("Total payment: " + total);
            fw.close();
        } catch (IOException e) {
            System.out.println("File error!");
        }
    }
}