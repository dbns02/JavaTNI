public class BookMain {
    static void main() {
        String author_name = "Malee";
        String nationality = "Thai";
        int birthyear = 2005;
        Author author = new Author(author_name);
        System.out.println(author.showAuthorInfo());
        System.out.println();

        String title = "Java Programming";
        String category = "Programming Language";
        double price = 375.25;
        Book book = new Book(title, category, price, author);
        System.out.println(book); //.showBookInfo()
    }
}
