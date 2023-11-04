package com.company;

public class ChildrenBook extends Book {
    private int age;

    ChildrenBook(String title, Booktype type, Author author, int availables, double price, int age){
 super( title,  type,  author,  availables,  price);
 this.age=age;
    }
    @Override
    public double getPrice(){
        double v = super.getPrice() * 0.7;
        System.out.print(v);
        return v;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
