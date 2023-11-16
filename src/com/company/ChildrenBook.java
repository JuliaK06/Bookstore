package com.company;

public class ChildrenBook extends Book {
    private int age;
    public ChildrenBook() {
        super();
        this.age=0;
    }
    public ChildrenBook(String title, Booktype type, Author author, int availables, double price, int age){
 super( title,  type,  author,  availables,  price);
 this.age=age;
    }
    @Override
    public double getPrice(){
        double newPrice = super.getOriginalPrice() * 0.3;
        System.out.println("Цената на книгата " + this.toString() + " с отстъпка 70% е " + newPrice);
        return newPrice;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
