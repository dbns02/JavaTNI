package OnlineCourseFinal;

public class OnlineCourse extends Course {

    public OnlineCourse(String name, int duration, double price) {
        super(name, duration, price);
    }

    @Override
    public double calculateFee() {
        return price;
    }
}