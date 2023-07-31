import java.util.ArrayList;

public class Hand
{
    private ArrayList<Card> handOfCards = new ArrayList<>();

    public Hand()
    {}

    public void addCard(Card inputCard)
    {
        handOfCards.add(inputCard);
    }

    public Integer calculateHandValue()
    {
        Integer total = 0;
        
        for(Integer x = 0; x < handOfCards.size(); x++)
        {
            total += (handOfCards.get(x)).getValue();
        }
        return total;
    }

    public String handInfo()
    {
        String info = "";

        for(Integer x = 0; x < handOfCards.size(); x++)
        {
            info = info + (handOfCards.get(x)).getFace() + " of " + (handOfCards.get(x)).getSuit() + "\n";
        }
        return info;
    }

    public boolean hasAce()
    {
        for(Integer x = 0; x < handOfCards.size(); x++)
        {
            if(((handOfCards.get(x)).getFace()).equalsIgnoreCase("Ace"))
            {
                return true;
            }
        }
        return false;
    }

    public void softAce()
    {
        for(Integer x = 0; x < handOfCards.size(); x++)
        {
            if(((handOfCards.get(x)).getFace()).equalsIgnoreCase("Ace") && ((handOfCards.get(x)).getValue()) == 11)
            {
                handOfCards.set(x, new Card("Ace", (handOfCards.get(x)).getSuit(), 1));
                x = handOfCards.size();
            }
        }
    }
}