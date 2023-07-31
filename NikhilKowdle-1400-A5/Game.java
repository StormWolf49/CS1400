+import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Deck deck = new Deck();
        String round = "yes";
        Double rounds = 0.0;
        Double wins = 0.0;
        Double winloss = 0.0;

        System.out.println("***********************************\n* Welcome to the Black Jack Table *\n***********************************");

        while(round.equalsIgnoreCase("yes"))
        {
            Hand playerHand = new Hand();
            Hand compHand = new Hand();
            Integer playerValue = 0;
            Integer compValue = 0;
            String player = "hit";
            String comp = "hit";

            deck.shuffle();
            Integer top = 0;
            playerHand.addCard(deck.drawCard(top));
            top++;
            Integer blackjack = top;

            while(player.equalsIgnoreCase("hit"))
            {
                playerHand.addCard(deck.drawCard(top));
                playerValue = playerHand.calculateHandValue();
                if(playerValue > 21 && playerHand.hasAce())
                {
                    playerHand.softAce();
                    playerValue = playerHand.calculateHandValue();
                }
                System.out.println("\nYour hand is:");
                System.out.print(playerHand.handInfo());
                System.out.println("<" + playerValue + " points>");
                if(playerValue == 21 && blackjack == top)
                {
                    System.out.println("\nBlackjack!");
                    player = "win";
                    top++;
                }
                else if(playerValue == 21)
                {
                    player = "stand";
                    top++;
                }
                else if(playerValue > 21)
                {
                    player = "bust";
                    System.out.println("Bust!");
                }
                else if(playerValue < 21)
                {
                    System.out.println("\nDo you want to stand or hit?");
                    player = keyboard.nextLine();
                    while(!(player.equalsIgnoreCase("stand") || player.equalsIgnoreCase("hit")))
                    {
                        System.out.println("\nInvalid input, do you want to stand or hit?");
                        player = keyboard.nextLine();
                    }
                    top++;
                }
            }
            
            compHand.addCard(deck.drawCard(top));
            top++;
            blackjack = top;

            while(comp.equalsIgnoreCase("hit") && !(player.equalsIgnoreCase("bust")))
            {
                compHand.addCard(deck.drawCard(top));
                compValue = compHand.calculateHandValue();
                if(compValue > 21 && compHand.hasAce())
                {
                    compHand.softAce();
                    compValue = compHand.calculateHandValue();
                }
                System.out.println("\nThe dealer's hand is:");
                System.out.print(compHand.handInfo());
                System.out.println("<" + compValue + " points>");
                if((compValue == 21 && blackjack == top))
                {
                    System.out.println("\nBlackjack!");
                    comp = "win";
                }
                else if(compValue == 21 || (compValue > playerValue && compValue < 21))
                {
                    comp = "stand";
                    top++;
                }
                else if(compValue < 21 && compValue < playerValue)
                {
                    System.out.println("\nThe dealer draws a card...");
                    comp = "hit";
                    top++;
                }
                else if(compValue > 21)
                {
                    comp = "bust";
                    System.out.println("Bust!");
                }
            }

            if(player.equalsIgnoreCase("bust"))
            {
                rounds++;
                System.out.println("\nThe dealer wins!");
            }
            else if(comp.equalsIgnoreCase("bust"))
            {
                wins++;
                rounds++;
                System.out.println("\nHooray, you win!");
            }
            else if(player.equalsIgnoreCase("win") && !(comp.equalsIgnoreCase("win")))
            {
                wins++;
                rounds++;
                System.out.println("\nHooray, you won with a blackjack!");
            }
            else if(comp.equalsIgnoreCase("win") && !(player.equalsIgnoreCase("win")))
            {
                wins++;
                rounds++;
                System.out.println("\nThe dealer won with a blackjack!");
            }
            else if(playerValue < compValue)
            {
                rounds++;
                System.out.println("\nThe dealer wins!");
            }
            else if(playerValue > compValue)
            {
                wins++;
                rounds++;
                System.out.println("\nHooray, you win!");
            }
            else if(playerValue == compValue)
            {
                rounds++;
                System.out.println("\nThe dealer wins!");
            }
            
            if(wins > 0)
            {
                winloss = 100*(wins/rounds);
            }
            System.out.println("You have a win percentage of " + winloss + "%");
            System.out.println("\nDo you want to play again? (yes/no)");
            round = keyboard.nextLine();
            while(!(round.equalsIgnoreCase("yes") || round.equalsIgnoreCase("no")))
            {
                System.out.println("\nInvalid input, do you want to play again? (yes/no)");
                round = keyboard.nextLine();
            }
        }

        System.out.println("\nBye Bye");
        keyboard.close();
    }
}