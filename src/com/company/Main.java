package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
 List <Book> books1=new ArrayList<>();
 Bookstore bookstore=new Bookstore(books1);
        System.out.println("Въведете брой книги");
  int numberOfBooks;
  numberOfBooks=sc.nextInt();
        System.out.println("Въведете следните данни за книгата <Тип/COMIC_BOOK/CHILDREN_BOOK/BOOK><Заглавие><Име и възраст на автор><Брой налични книги><<Цена>"+"\n"+" Забележка: Заглавието на книгата и името на авторът трябва да са по една дума, т.е да са написани без интервали.");
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
       book.setAuthor(a);
       book.setAvailables(sc.nextInt());
       book.setOriginalPrice(sc.nextDouble());
       switch(type){
           case COMIC_BOOK :
               System.out.println("Моля въведете име на героя.");

               ((ComicBook)book).setCharacterName(sc.next());
               break;
           case CHILDREN_BOOK:
               System.out.println("Моля въведете възрастта, за която е преднзначена книгата.");

               ((ChildrenBook)book).setAge(sc.nextInt());
               break;
       }

        books1.add(book);

   }
        sc.close();
   for(int i=0;i< numberOfBooks;i+=2){
       Book  book=books1.get(i);
       bookstore.sell(book);

   }

    }
}
