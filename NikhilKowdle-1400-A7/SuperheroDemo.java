import java.util.Random;

public class SuperheroDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        Person bob = new Person("Bob", 45, "Pizza");
        Person frank = new Person(bob);
        Superhero joe = new Superhero("Joe", 23, "Candy", "Power Guy", "Super Strength", "POWAAAAAAA");
        for(Integer x = 1; x < (rand.nextInt(50) + 1); x++)
        {
            joe.catchVillain();
        }
        Superhero steve = new Superhero("Steve", 56, "Lasagna", "Man Man", "Superness", "Hello There.");
        for(Integer x = 1; x < (rand.nextInt(50) + 1); x++)
        {
            steve.catchVillain();
        }

        System.out.println(bob.toString());
        System.out.println(frank.toString());
        System.out.println(joe.toString());
        System.out.println(steve.toString());

        joe.villainsCaught();

        System.out.println("The Person objects are the same: " + bob.equals(frank));
        System.out.println("The Superhero objects are the same: " + joe.equals(steve));
        
        joe.speak();
        steve.speak();
    }
}
