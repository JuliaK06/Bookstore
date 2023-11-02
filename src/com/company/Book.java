package com.company;

public class Book {

    private String title;
    private Booktype type;
    private Author author;
    private int availables;
    private  double price ;

    public Book(String title, Booktype type, Author author, int availables, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.availables = availables;
        this.price = price;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Booktype getType() {
        return type;
    }

    public void setType(Booktype type) {
        this.type = type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getAvailables() {
        return availables;
    }

    public void setAvailables(int availables) {
        this.availables = availables;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
