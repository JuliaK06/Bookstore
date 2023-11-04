package com.company;

public class ComicBook extends Book{
    private String characterName;



    public ComicBook(String title, Booktype type, Author author, int availables, double price, String characterName) {
        super(title, type, author, availables, price)   ;
        this.characterName=characterName;
    }

    @Override
    public double getPrice() {
        double v = super.getPrice() * 0.6;
        System.out.print(v);
        return v;

    }
public double getPrice(double priceReduction){
        //питай госпожата какво има предвид под аргумент процент за отстъпк - double ili int
return super.getPrice()*priceReduction;
    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
