package com.company;

public class Author {
  private  String name;
  private int age;
 public Author(){
     this.name=" ";
     this.age=0;
 }

  public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
