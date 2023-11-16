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
        double v = super.getPrice() * 0.3;
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
