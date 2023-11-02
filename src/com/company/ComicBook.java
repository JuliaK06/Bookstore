package com.company;

public class ComicBook extends Book{
    private String characterName;



    public ComicBook(String characterName, String title, Booktype type, Author author, int availables, double price) {
        super(title, type, author, availables, price)   ;
        this.characterName=characterName;
    }

    @Override
    public double getPrice() {
    }

}

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
