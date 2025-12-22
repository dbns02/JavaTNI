import javax.swing.*;
import java.io.File;

public class FileChooserExample {
    public static void main(String[] args) {

        // สร้าง JFrame
        JFrame frame = new JFrame("JFileChooser Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // สร้างปุ่ม
        JButton button = new JButton("Select files");

        // กำหนด Action ให้ปุ่ม
        button.addActionListener(e -> {

            // สร้าง JFileChooser
            JFileChooser fileChooser = new JFileChooser();

            // แสดง dialog เลือกไฟล์
            int result = fileChooser.showOpenDialog(frame);

            // ตรวจสอบว่าผู้ใช้กด Open หรือไม่
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                // แสดง path ของไฟล์ที่เลือก
                JOptionPane.showMessageDialog(
                        frame,
                        "Your select files:\n" + selectedFile.getAbsolutePath()
                );
            }
        });

        // เพิ่มปุ่มลงใน JFrame
        frame.add(button);
        frame.setVisible(true);
    }
}
