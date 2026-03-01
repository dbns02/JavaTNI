package Test2_Student_Score_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.print("Search student name (or exit): ");
            String name = scan.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            boolean found =
                    StudentSearch.searchByName("students.txt", name);

            if (!found) {
                System.out.println("Student not found.");
            }
        }
    }
}