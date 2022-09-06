package java_console_blackjack;

import java.util.ArrayList;

public class Dealer {
    ArrayList<Card> hand;
    double HIT_ON = 16;
    double BUST_ON = 22;

    public void setHand(ArrayList<Card> hand){
        this.hand = hand;
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

    public boolean dealersTurn(){
        boolean bust = false;
        hand.get(0).dispCard();
        hand.get(1).dispCard();

        int cardValue01 = hand.get(0).getValue();
        int cardValue02= hand.get(1).getValue();
        int handValue = cardValue01 + cardValue02;
        System.out.println(cardValue01 + " + " + cardValue02 + " = " + handValue);


        return bust;
    }

}
