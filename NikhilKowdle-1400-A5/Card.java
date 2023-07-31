public class Card
{
    private String face;
    private String suit;
    private Integer value;

    public Card(String faceIn, String suitIn, Integer valueIn)
    {
        face = faceIn;
        suit = suitIn;
        value = valueIn;
    }

    public String getFace()
    {
        return face;
    }

    public String getSuit()
    {
        return suit;
    }

    public Integer getValue()
    {
        return value;
    }
}