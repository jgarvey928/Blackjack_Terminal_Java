package java_console_blackjack;

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

    public static void bet(){
        System.out.println("\n-------------------------------------");
        System.out.println("-----      Place Your Bets      -----");
        System.out.println("-------------------------------------");
    }

    public static void dealing() {
        System.out.println("\n*-*-*          Dealing          *-*-*");
    }
}
