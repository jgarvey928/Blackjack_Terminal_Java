package java_console_blackjack;

import java.util.ArrayList;

public class Player {

    String name;
    double bank;
    ArrayList<Card> cards;

    Player(String name, double bank){
        this.name = name;
        this.bank = bank;
        cards = new ArrayList<Card>();
    }

    public String getName(){
        return this.name;
    }

    public double getBank(){
        if(bank < 0.004999999999999)
            return 0.0;
        return this.bank;
    }

    public void addToBank(double money){
        this.bank += money;
    }

    public void subFromBank(double money){
        this.bank -= money;
    }

    public void addCard(Decks decks){
        cards.add(decks.dealCard());
    }

    public void clearCards(){
        cards.clear();
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public int getNumbCards(){
        return this.cards.size();
    }

    public int getCardsValue(){
        int cardsValue = 0;
        for(int i = 0; i < cards.size(); i++){
            Card temp = cards.get(i);
            cardsValue += temp.getValue();
        }
        return cardsValue;
    }

    public String getCardsString(){
        String result = "";
        for(int i = 0; i < cards.size(); i++){
            result += cards.get(i).getCardString();
        }
        return result;
    }

    public void dealTo(Decks decks){
        addCard(decks);
        addCard(decks);
    }

}
