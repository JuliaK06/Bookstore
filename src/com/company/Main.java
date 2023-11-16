package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
 List <Book> books1=new ArrayList<>();
  int numberOfBooks;
  numberOfBooks=sc.nextInt();
   for(int i=0;i<numberOfBooks;i++){
       Book book;
       Booktype type = Booktype.valueOf(sc.next().toUpperCase());
       switch(type){
           case COMIC_BOOK: book=new ComicBook();  break;
           case CHILDREN_BOOK: book=new ChildrenBook(); break;
           default: book=new Book(); break;
       }
       book.setTitle(sc.next());
       book.setType(type);
       Author a=new Author();
       a.setName(sc.next());
       a.setAge(sc.nextInt());
       book.setAvailables(sc.nextInt());
       book.setPrice(sc.nextDouble());
       //питай за charactermame i age kak




   }




    }
}
