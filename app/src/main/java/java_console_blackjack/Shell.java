package java_console_blackjack;

import java.util.Scanner;

public class Shell {

    private Deck deck;

    Shell() {
        this.deck = null;
    }

    Shell(Deck deck) {
        this.deck = deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return this.deck;
    }

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

    private void allCards() {

        for (int i = 0; i < 13; i++) {
            for (int k = 0; k <= 39; k += 13) {
                Card temp = deck.getCard(i + k);
                System.out.printf("     %2s" + temp.getSuit(), temp.getRank());
            }
            System.out.println();
        }

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

    public double getBet(double bank) {

        double bet = -1;
        boolean pass = false;
        Scanner in = new Scanner(System.in);
        while (!pass) {
            try {
                System.out.println("-------------------------------------");
                System.out.print("Place Your Bet : $");
                in = new Scanner(System.in);
                bet = Double.parseDouble(in.nextLine());
                if (bet <= bank) {
                    pass = true;
                    in.close();
                } else {
                    System.out.println("-------------------------------------");
                    System.out.printf("Bet Too Large Bank = $%.2f%n", bank);
                }
            } catch (Exception e) {
            }
        }
        return bet;
    }

    public double dispBank(double bank) {

        System.out.println("-------------------------------------");
        System.out.printf("---- Your Bank : $%.2f%n", bank);
        if (bank == 0 || bank < 0.004999999999999) {
            System.out.println("-------------------------------------");
            System.out.println("      !!! Your Out of Money !!!");
            System.out.println("-------------------------------------");
            // Bottom banner
            bottomGUI();
        }
        return bank;
    }

}
