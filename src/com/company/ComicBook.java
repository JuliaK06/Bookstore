package com.company;

public class ComicBook extends Book{
    private String characterName;


    public ComicBook() {
        super();
        this.characterName=null;
    }

    public ComicBook(String title, Booktype type, Author author, int availables, double price, String characterName) {
        super(title, type, author, availables, price)   ;
        this.characterName=characterName;
    }

    @Override
    public double getPrice(){
        double newPrice = super.getOriginalPrice() * 0.4;
        System.out.println("Цената на книгата " + this.toString() + " с отстъпка 60% е " + newPrice);
        return newPrice;
    }

    public double getPrice(double priceReduction){
return (super.getOriginalPrice())*priceReduction;
    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
