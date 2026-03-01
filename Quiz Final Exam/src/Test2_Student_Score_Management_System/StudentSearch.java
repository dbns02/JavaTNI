package Test2_Student_Score_Management_System;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentSearch {

    public static boolean searchByName(String filename, String searchName) {

        try {
            File file = new File(filename);
            Scanner fileScan = new Scanner(file);

            while (fileScan.hasNextLine()) {

                String line = fileScan.nextLine();
                String[] parts = line.split(",");

                // เช็คว่าบรรทัดมีข้อมูลพอไหมก่อนใช้ index
                if (parts.length >= 3 &&
                        parts[0].equalsIgnoreCase(searchName)) {

                    System.out.println("\n--- Student Found ---");
                    System.out.println("Name: " + parts[0]);
                    System.out.println("Midterm: " + parts[1]);
                    System.out.println("Final: " + parts[2]);

                    // ถ้ามี Total Score ในไฟล์
                    if (parts.length >= 4) {
                        System.out.println("Total Score: " + parts[3]);
                    } else {
                        // กรณีไม่มี total ในไฟล์ (Undergraduate แบบเก่า)
                        double mid = Double.parseDouble(parts[1]);
                        double fin = Double.parseDouble(parts[2]);
                        double total = (mid * 0.4) + (fin * 0.6);
                        System.out.println("Total Score: " + total);
                    }

                    fileScan.close();
                    return true;
                }
            }

            fileScan.close();

        } catch (IOException e) {
            System.out.println("File error!");
        }

        return false; // ไม่เจอ
    }
}