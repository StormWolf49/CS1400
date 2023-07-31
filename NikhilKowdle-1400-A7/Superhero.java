public class Superhero extends Person
{
    static Integer totalNumberVillainsCaught = 0;
    String superHeroName = "";
    String superPower = "";
    String catchPhrase = "";
    
    public Superhero(String n, Integer a, String fF, String sHN, String sP, String cP)
    {
        setName(n);
        setAge(a);
        setFavoriteFood(fF);
        setSuperHeroName(sHN);
        setSuperPower(sP);
        setCatchPhrase(cP);
    }

    public void speak()
    {
        System.out.println(catchPhrase);
    }

    public String toString()
    {
        String info = name + " is " + age + " years old, and likes " + favoriteFood + ". " + name + " is the superhero " + superHeroName + " who uses " + superPower + "to fight crime while saying their catchphrase: " + catchPhrase;
        return info;
    }

    public void catchVillain()
    {
        totalNumberVillainsCaught++;
    }

    public void villainsCaught()
    {
        System.out.println(totalNumberVillainsCaught + " Villains Caught");
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String sHN) {
        superHeroName = sHN;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String sP) {
        superPower = sP;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String cP) {
        catchPhrase = cP;
    }
}
