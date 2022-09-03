package java_console_blackjack;

import java.util.Scanner;

public class Shell {

    private static void suitsLine() {
        // Line of each card suits starting and ending with a heart
        // Each line is 37 chars long
        for (int i = 0; i < 9; i++)
            System.out.printf("%c%c%c%c", 3, 4, 5, 6);
        System.out.printf("%c", 3);
        System.out.println();
    }

    private static void starsLine() {
        // Line of stars and dashes starting and ending with a star
        // Each line is 37 chars long
        for (int i = 0; i < 9; i++)
            System.out.print("*-*-");
        System.out.print("*");
        System.out.println();
    }

    private static void fancyLine() {
        // A strip of 3 lines of suits, stars and suits
        suitsLine();
        starsLine();
        suitsLine();
    }

    public static void topGUI() {
        // Top GUI Banner JSGarvey's Blackjack
        fancyLine();
        System.out.println("*-*-*                           *-*-*");
        System.out.printf("%c%c%c%c%c   JSGarvey's  Blackjack   %c%c%c%c%c%n", 3, 4, 5, 6, 3, 3, 4, 5, 6, 3);
        System.out.println("*-*-*                           *-*-*");
        fancyLine();
    }

    public static void bottomGUI() {
        // Bottom banner
        suitsLine();
        starsLine();
        suitsLine();
        starsLine();
        suitsLine();
    }

    public static double getBet(double bank) {
        double bet = -1;
        boolean pass = false;
        Scanner in = new Scanner(System.in);
        while (!pass) {
            try {
                System.out.println("\n-------------------------------------");
                System.out.print("Place Your Bet : $");
                in = new Scanner(System.in);
                bet = in.nextDouble();
                if(bet <= bank){
                    pass = true;
                    in.close();
                }else{
                    System.out.println("-------------------------------------");
                    System.out.printf("Bet Too Large Bank = $%.2f",bank);
                }
            } catch (Exception e) {}
        }
        System.out.println("-------------------------------------");
        System.out.printf("------ You Bet : $%.2f%n",bet);
        return bet;
    }

    public static double dispBank(double bank){
        System.out.println("-------------------------------------");
        System.out.printf("---- Your Bank : $%.2f%n",bank);
        System.out.println("-------------------------------------");
        return bank;
    }

}
