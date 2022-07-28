public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author, String title) {
        super(id, name, price, title);
        this.author = author;
    }
}
