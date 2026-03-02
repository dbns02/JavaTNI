package OnlineCourseFinal;

public class OnsiteCourse extends Course {

    public OnsiteCourse(String name, int duration, double price) {
        super(name, duration, price);
    }

    @Override
    public double calculateFee() {
        return price + 500; // ค่าห้องเพิ่ม
    }
}