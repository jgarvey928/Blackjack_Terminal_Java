/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_console_blackjack;


public class App {

    public static void main(String[] args) {

        // Top Banner JSGarvey's Blackjack
        double bank = 500;
        Shell.topGUI();
        double bet = Shell.getBet(bank);
        bank -= bet;
        Shell.dispBank(bank);

        // Bottom banner
        Shell.bottomGUI();
        
    }

}

