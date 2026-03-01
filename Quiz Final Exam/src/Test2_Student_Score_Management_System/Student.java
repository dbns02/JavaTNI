package Test2_Student_Score_Management_System;

public abstract class Student implements Gradable {

    private String name;
    private double midterm;
    private double finalExam;

    public Student(String name, double midterm, double finalExam) {
        this.name = name;
        this.midterm = midterm;
        this.finalExam = finalExam;
    }

    public String getName() {
        return name;
    }

    public double getMidterm() {
        return midterm;
    }

    public double getFinalExam() {
        return finalExam;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nMidterm: " + midterm +
                "\nFinal: " + finalExam;
    }

    public abstract double calculateGrade();
}
