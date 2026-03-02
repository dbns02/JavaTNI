package OnlineCourseFinal;

public abstract class Course {

    protected String courseName;
    protected int duration;
    protected double price;

    public Course(String courseName, int duration, double price) {
        this.courseName = courseName;
        this.duration = duration;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateFee();

    @Override
    public String toString() {
        return courseName + " (" + duration + " hrs) Price: " + calculateFee();
    }
}