public class Product {
    protected int id;
    protected String name;
    protected int price;
    protected String title;

    public Product(int id, String name, int price, String title) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.title = title;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
