package Test2_Student_Score_Management_System;

public class GraduateStudent extends Student {

    private double researchScore;

    public GraduateStudent(String name, double midterm,
                           double finalExam, double researchScore) {
        super(name, midterm, finalExam);
        this.researchScore = researchScore;
    }

    @Override
    public double calculateGrade() {
        return (getMidterm() * 0.3) +
                (getFinalExam() * 0.4) +
                (researchScore * 0.3);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nResearch: " + researchScore +
                "\nTotal Score: " + calculateGrade();
    }
}
