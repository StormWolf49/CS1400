import java.util.Collections;
import java.util.Arrays;

public class Deck
{
    private Card[] deckOfCards= new Card[52];

    public Deck()
    {
        Integer number = 0;
        String suit = "";
        for(Integer s = 1; s <= 4; s++)
        {
            for(Integer v = 1; v <= 13; v++)
            {
                if(s == 1)
                {
                    suit = "Spades";
                }
                else if(s == 2)
                {
                    suit = "Hearts";
                }
                else if(s == 3)
                {
                    suit = "Diamonds";
                }
                else if(s == 4)
                {
                    suit = "Clubs";
                }

                if(v == 1)
                {
                    deckOfCards[number] = new Card("Ace", suit, 11);
                }
                else if(v == 2)
                {
                    deckOfCards[number] = new Card("Two", suit, 2);
                }
                else if(v == 3)
                {
                    deckOfCards[number] = new Card("Three", suit, 3);
                }
                else if(v == 4)
                {
                    deckOfCards[number] = new Card("Four", suit, 4);
                }
                else if(v == 5)
                {
                    deckOfCards[number] = new Card("Five", suit, 5);
                }
                else if(v == 6)
                {
                    deckOfCards[number] = new Card("Six", suit, 6);
                }
                else if(v == 7)
                {
                    deckOfCards[number] = new Card("Seven", suit, 7);
                }
                else if(v == 8)
                {
                    deckOfCards[number] = new Card("Eight", suit, 8);
                }
                else if(v == 9)
                {
                    deckOfCards[number] = new Card("Nine", suit, 9);
                }
                else if(v == 10)
                {
                    deckOfCards[number] = new Card("Ten", suit, 10);
                }
                else if(v == 11)
                {
                    deckOfCards[number] = new Card("Jack", suit, 10);
                }
                else if(v == 12)
                {
                    deckOfCards[number] = new Card("Queen", suit, 10);
                }
                else if(v == 13)
                {
                    deckOfCards[number] = new Card("King", suit, 10);
                }
                number++;
            }
        }
    }

    public Card drawCard(Integer top)
    {
        return deckOfCards[top];
    }

    public void shuffle()
    {
        Collections.shuffle(Arrays.asList(deckOfCards));
    }
}