package Test1_Online_Course_System;

public abstract class Course implements Payable {

    private String title;
    private double basePrice;

    public Course(String title, double basePrice) {
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Test1_Course.Course: " + title +
                "\nBase price: " + basePrice;
    }

    public abstract double calculatePayment();
}