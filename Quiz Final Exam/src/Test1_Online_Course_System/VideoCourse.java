package Test1_Online_Course_System;

public class VideoCourse extends Course {

    private int duration; // ชั่วโมง

    public VideoCourse(String title, double basePrice, int duration) {
        super(title, basePrice);
        this.duration = duration;
    }

    @Override
    public double calculatePayment() {
        return getBasePrice() + (duration * 10);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDuration: " + duration + " hours" +
                "\nTotal: " + calculatePayment();
    }
}