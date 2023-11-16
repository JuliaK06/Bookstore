package com.company;

public class Book {

    private String title;
    private Booktype type;
    private Author author;
    private int availables;
    private  double originalPrice;
 public Book(){
     this.title=null;
     this.type=Booktype.BOOK;
     this.author=null;
     this.availables=0;
     this.originalPrice =0;
 }
    public Book(String title, Booktype type, Author author, int availables, double originalPrice) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.availables = availables;
        this.originalPrice = originalPrice;
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

    public double getOriginalPrice() {
        return originalPrice;
    }
    public double getPrice() {
        System.out.println("Цената на книгата " + this.toString() + " е " + originalPrice);
        return originalPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }



    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
}
