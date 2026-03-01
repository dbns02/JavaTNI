package Test2_Student_Score_Management_System;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void saveToFile(String filename, ArrayList<Student> students) {

        try {
            FileWriter fw = new FileWriter(filename);

            for (Student s : students) {
                fw.write(s.getName() + "," +
                        s.getMidterm() + "," +
                        s.getFinalExam() + "," +
                        s.calculateGrade());
                fw.write("\n");
            }

            fw.close();
            System.out.println("Data saved!");

        } catch (IOException e) {
            System.out.println("File error!");
        }
    }
}
