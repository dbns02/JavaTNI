import java.util.Scanner;

public class StudentMain {
    static void showInfo(Student st) {
        System.out.println("Name: " + st.getName());
        System.out.println("Year: " + st.getStudyYear());
        System.out.println("Score: " + st.getScore());
        System.out.println("Grade: " + st.getGrade());
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.setName(sc.next());
        /*String name = sc.nextLine();
        student.setName(sc.nextLine());*/
        System.out.print("Enter student year: ");
        student.setStudyYear(sc.nextInt());
        System.out.print("Enter mid-term score: ");
        student.addPoint(sc.nextInt());
        System.out.print("Enter final score: ");
        student.addPoint(sc.nextInt());
        System.out.println("----------------------------------");
        showInfo(student);
    }
}