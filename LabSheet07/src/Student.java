public class Student {
    String name;
    String id;
    int score = 0;

    void doHomework(int point) {
        score += point;
        System.out.println(name + " did homework " + point + " points");
    }
    void takeExam(int point) {
        score += point;
        System.out.println(name + " took exam " + point + " points");
    }
    String getResult() {
        if (score >= 50)
            return "PASS";
        else
            return "FAIL";
    }
    void showStatus() {
        System.out.println("Name: " + name + "\nStudent ID: " + id + "\nScore: " + score + "\nResult: " + getResult());
        System.out.println("---------------------------------------------");
    }
}
