package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    List<Book> books=new ArrayList<>();
    public Bookstore(List<Book> books) {
        this.books = books;
    }


    public void sell(Book book){
        int a=book.getAvailables();
        if(a==0)
            System.out.println("Няма наличност от книгата със следните характеристики:  "+book.toString());
        else {
            book.setAvailables(--a);
            System.out.println("Продаваме книгата на цена: " + book.getPrice());

        }
    }
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
