package Test2_Student_Score_Management_System;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name, double midterm, double finalExam) {
        super(name, midterm, finalExam);
    }

    @Override
    public double calculateGrade() {
        return (getMidterm() * 0.4) + (getFinalExam() * 0.6);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTotal Score: " + calculateGrade();
    }
}
