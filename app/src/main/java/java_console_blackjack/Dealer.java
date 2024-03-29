package java_console_blackjack;

import java.util.ArrayList;

public class Dealer {
    ArrayList<Card> cards = new ArrayList<Card>();
    double HIT_ON = 16;
    double BUST_ON = 22;

    public void addCard(Card card){
        cards.add(card);
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
        addCard(decks.dealCard());
        addCard(decks.dealCard());
    }
}
