public class Book {
    private String title;
    private String category;
    private double price;
    private int discount_percent;
    private Author author; // <--- composition

    Book(String title, String category, double price, Author author) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.author = author;
        this.discount_percent = 0;
    }
    Book() {
        this("","",0.0,null);
    }
    Author getAuthor() {
        return author;
    }
    String getTitle() {
        return title;
    }
    void setDiscount_percent(int discount_percent) {
        this.discount_percent = discount_percent;
    }
    int getDiscount_percent() {
        return discount_percent;
    }
    boolean isDiscountedAvailable() {
        return price > 500;
        /* if (price > 500) {
            return true;
        }
        return false; */
    }
    double calculateDiscountPrice() {
        return price - (price * getDiscount_percent()/* discount_percent */ / 100.0);
    }
    public String toString() {
        return "Title: " + title +
                "\nCategory: " + category +
                "\nPrice: " + price + (isDiscountedAvailable() ? " (" + calculateDiscountPrice() + ")" : "") +
                "\nAuthor: " + author.showAuthorInfo();
    }
}
