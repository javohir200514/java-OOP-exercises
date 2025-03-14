package exercises_2.exercises_2_3;
public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String isbn, String name,Author author, double price) {
        this.name=name;
        this.author = author;
        this.price=price;
        this.isbn=isbn;
    }

    public Book(String isbn,String name, Author author,double price, int qty) {
        this.name=name;
        this.author = author;
        this.isbn=isbn;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {

        return isbn;
    }

    public Author getAuthor() {

        return author;
    }

    public double getPrice() {

        return price;
    }

    public int getQty() {

        return qty;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void setQty(int qty) {

        this.qty = qty;
    }
    public String getAuthorName(){

        return author.getName();
    }

    @Override
    public String toString() {
        return "Book[ isbn=" +isbn+
                ",name=" + getName() +
                author.toString()+", price="+price+", qty="+qty;
    }
}
