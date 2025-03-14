package exercises_2.exercises_2_2;

import java.util.Arrays;

public class Book {
    String name;
    private Author[] authors;
    private int qty;
    private double price;

    public Book(String name, Author[] authors, double price) {
        this.name=name;
        this.price = price;
        this.authors = authors;
    }

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuther() {
        return authors;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames(){
        return authors.toString();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
