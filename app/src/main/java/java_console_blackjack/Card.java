package java_console_blackjack;

public class Card {
    String rank;
    int cardValue;
    int suitValue;
    char suit;

    Card(){
        this.rank = null;
        this.suitValue = -1;
        this.cardValue = -1;
        char suit = 0;
    }

    public void setRank(String value){
        this.rank = value;
        switch(rank){
            case "A" : cardValue = 1; break;
            case "2" : cardValue = 2; break;
            case "3" : cardValue = 3; break;
            case "4" : cardValue = 4; break;
            case "5" : cardValue = 5; break;
            case "6" : cardValue = 6; break;
            case "7" : cardValue = 7; break;
            case "8" : cardValue = 8; break;
            case "9" : cardValue = 9; break;
            case "10" : cardValue = 10; break;
            case "J" : cardValue = 10; break;
            case "Q" : cardValue = 10; break;
            case "K" : cardValue = 10; break;
        }
    }

    public void setSuit(int suitValue){
        this.suitValue = suitValue;
        this.suit = (char)suitValue;
    }

    public String getRank(){
        return this.rank;
    }

    public char getSuit(){
        return this.suit;
    }

    public int getSuitValue(){
        return this.suitValue;
    }

    public int getValue(){
        return cardValue;
    }

    public void dispCard(){
        System.out.println(rank + getSuit());
    }

}
