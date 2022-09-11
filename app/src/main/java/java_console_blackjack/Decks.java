package java_console_blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Decks {
    ArrayList<Card> allCards = new ArrayList<Card>();
    ArrayList<Card> discards = new ArrayList<Card>();

    Decks(int numberOfDecks){
        for(int i = 0; i < numberOfDecks; i++){
            Deck newDeck = new Deck();
            allCards.addAll(newDeck.getCards());
        }
    }

    public void shuffle(){

        if(!discards.isEmpty()){
            allCards.addAll(discards);
            discards.clear();
        }
        Collections.shuffle(allCards);
    }
    
    public Card getCard(int index) {
        return this.allCards.get(index);
    }
    
    public Card dealCard(){
        Card topCard = this.allCards.remove(0);
        discards.add(topCard);
        return topCard;
    }

    public int size(){
        return allCards.size();
    }
}
