package Test1_Online_Course_System;

public class LiveCourse extends Course {

    private boolean certificate;

    public LiveCourse(String title, double basePrice, boolean certificate) {
        super(title, basePrice);
        this.certificate = certificate;
    }

    @Override
    public double calculatePayment() {
        return getBasePrice() + (certificate ? 500 : 0);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCertificate: " + certificate +
                "\nTotal: " + calculatePayment();
    }
}