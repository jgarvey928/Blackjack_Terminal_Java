package java_console_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Shell {

    Scanner in = new Scanner(System.in);

    private void suitsLine() {
        // Line of each card suits starting and ending with a heart
        // Each line is 37 chars long
        for (int i = 0; i < 9; i++)
            System.out.printf("%c%c%c%c", 3, 4, 5, 6);
        System.out.printf("%c", 3);
        System.out.println();
    }

    private void starsLine() {
        // Line of stars and dashes starting and ending with a star
        // Each line is 37 chars long
        for (int i = 0; i < 9; i++)
            System.out.print("*-*-");
        System.out.print("*");
        System.out.println();
    }

    private void fancyLine() {
        // A strip of 3 lines of suits, stars and suits
        suitsLine();
        starsLine();
        suitsLine();
    }

    public void topGUI() {
        // Top GUI Banner JSGarvey's Blackjack
        fancyLine();
        System.out.println("*-*-*                           *-*-*");
        System.out.printf("%c%c%c%c%c   JSGarvey's  Blackjack   %c%c%c%c%c%n", 3, 4, 5, 6, 3, 3, 4, 5, 6, 3);
        System.out.println("*-*-*                           *-*-*");
        fancyLine();
        allCards();
    }

    public void bottomGUI() {
        // Bottom banner
        suitsLine();
        starsLine();
        suitsLine();
        starsLine();
        suitsLine();
        System.exit(0);
    }

    public void allCards() {
        Deck deck = new Deck();
        System.out.println("-------------------------------------");
        for (int i = 0; i < 13; i++) {
            for (int k = 0; k <= 39; k += 13) {
                Card temp = deck.getCard(i + k);
                System.out.printf("     %2s" + temp.getSuit(), temp.getRank());
            }
            System.out.println();
        }

    }

    public void allCards(Decks allCards){
        System.out.println("-------------------------------------");
        for (int i = 0; i < allCards.size(); i++) {
            System.out.print(allCards.getCard(i).getCardString());
        }
    }

    public double getBet(double bank) {

        double bet = -1;
        boolean pass = false;
        while (!pass) {
            try {
                System.out.println("-------------------------------------");
                System.out.print("Place Your Bet : $");
                bet = Double.parseDouble(in.nextLine());
                if (bet <= bank) {
                    pass = true;
                } else {
                    System.out.println("-------------------------------------");
                    System.out.printf("Bet Too Large Bank = $%.2f%n", bank);
                }
            } catch (Exception e) {
            }
        }
        return bet;
    }

    public void dispBank(double bank) {

        System.out.println("-------------------------------------");
        System.out.printf("---- Your Bank : $%.2f%n", bank);

    }

    public void dispPlayersHand(ArrayList<Card> playersCards){
        System.out.println("-------------------------------------");
        System.out.print("---- Your Hand : ");
        int cardsValue = 0;
        for(Card card : playersCards){
            cardsValue += card.getValue();
            System.out.print(card.getCardString() + " ");
        }
        System.out.println("\n-------- Value : " + cardsValue);
    }

    public void dispDealerHand(ArrayList<Card> dealersCards, boolean show){
        System.out.println("-------------------------------------");
        System.out.print(" Dealer's Hand : ");
        if(show){
            int cardsValue = 0;
            for(Card card : dealersCards){
                cardsValue += card.getValue();
                System.out.print(card.getCardString() + " ");
            }
            System.out.print("\n-------- Value : " + cardsValue);
        }else{
            System.out.print(dealersCards.get(0).getCardString() + " [?]");
        }
        System.out.println();
    }

    public boolean getHit(){
        System.out.println("-------------------------------------");
        System.out.println("------------ ??? HIT ??? ------------");
        System.out.print("---------- Yes [Y] / No [N] = ");
        String input = in.next();
        boolean cont = true;
        while(cont){
            if(input.length() == 1){
                if(input.equals("N") || input.equals("Y") ){
                    cont = false;
                }else{
                    System.out.print("---------- Yes [Y] / No [N] = ");
                    input = in.next();
                }
            }else{
                System.out.print("---------- Yes [Y] / No [N] = ");
                input = in.next();
            }
        }
        
        if(input.equals("Y"))
            return true;
        return false;
    }

    public void bust(){
        System.out.println("-------------------------------------");
        System.out.println("------------ !!! BUST !!! -----------");
    }
}
