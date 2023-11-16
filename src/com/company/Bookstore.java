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
            System.out.print("There are no books available");
        else {
            book.setAvailables(--a);
            System.out.println(book.getAuthor()+ " "+ book.getPrice());

        }
    }
//tuka ima[ o]e ne]a za slagane
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
