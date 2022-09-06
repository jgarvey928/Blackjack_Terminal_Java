package java_console_blackjack;

import java.util.ArrayList;

public class Deck {

    ArrayList<Card> deck = new ArrayList<Card>();

    Deck() {
        createDeck();
    }

    private void createDeck() {
        String rank = "A";
        int suitValue = 3;
        int j = 1;
        for (int i = 0; i < 52; i++) {

            Card newCard = new Card();

            newCard.setRank(rank);
            switch (rank) {
                case "A" : rank = "2"; break;
                case "2" : rank = "3"; break;
                case "3" : rank = "4"; break;
                case "4" : rank = "5"; break;
                case "5" : rank = "6"; break;
                case "6" : rank = "7"; break;
                case "7" : rank = "8"; break;
                case "8" : rank = "9"; break;
                case "9" : rank = "10"; break;
                case "10" : rank = "J"; break;
                case "J" : rank = "Q"; break;
                case "Q" : rank = "K"; break;
                case "K" : rank = "A"; break;
            }

            newCard.setSuit(suitValue);
            if(j % 13 == 0){
                suitValue++;
            }
            j++;
            this.deck.add(newCard);
        }

    }

    Card getCard(int index) {
        return (Card) this.deck.get(index);
    }

}
