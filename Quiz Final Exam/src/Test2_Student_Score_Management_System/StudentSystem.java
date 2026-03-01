package Test2_Student_Score_Management_System;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        boolean more = true;

        while (more) {
            try {
                System.out.println("1. Undergraduate");
                System.out.println("2. Graduate");
                System.out.print("Choose: ");
                int choice = scan.nextInt();
                scan.nextLine();

                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Midterm: ");
                double mid = scan.nextDouble();

                System.out.print("Final: ");
                double fin = scan.nextDouble();

                if (choice == 1) {
                    students.add(new UndergraduateStudent(name, mid, fin));
                } else if (choice == 2) {
                    System.out.print("Research: ");
                    double research = scan.nextDouble();
                    students.add(new GraduateStudent(name, mid, fin, research));
                }

                System.out.print("Add more? (y/n): ");
                more = scan.next().equalsIgnoreCase("y");

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scan.next();
            }
        }

        // 🔥 เขียนไฟล์
        try {
            FileWriter fw = new FileWriter("students.txt",true);

            for (Student s : students) {
                fw.write(s.getName() + "," +
                        s.getMidterm() + "," +
                        s.getFinalExam());

                if (s instanceof GraduateStudent) {
                    GraduateStudent gs = (GraduateStudent) s;
                    fw.write("," + gs.calculateGrade());
                }

                fw.write("\n");
            }

            fw.close();
            System.out.println("Data saved!");

        } catch (IOException e) {
            System.out.println("File error!");
        }

        // 🔥 อ่านไฟล์กลับมา
        try {
            File file = new File("students.txt");
            Scanner fileScan = new Scanner(file);

            System.out.println("\n--- Reading from file ---");

            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] parts = line.split(",");

                System.out.println("Name: " + parts[0]);
                System.out.println("Midterm: " + parts[1]);
                System.out.println("Final: " + parts[2]);

                if (parts.length > 3) {
                    System.out.println("Extra: " + parts[3]);
                }

                System.out.println();
            }

            fileScan.close();

        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
