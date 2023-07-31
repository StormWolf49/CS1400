public class Person
{
    String name = "";
    Integer age = 0;
    String favoriteFood = "";
    
    public Person()
    {

    }
    
    public Person(String n, Integer a, String fF)
    {
        setName(n);
        setAge(a);
        setFavoriteFood(fF);
    }

    public Person(Person person)
    {
        name = person.getName();
        age = person.getAge();
        favoriteFood = person.getFavoriteFood();
    }

    public boolean equals(Person person)
    {
        if(!(name.equals(person.getName())))
        {
            return false;
        }
        else if(age != person.getAge())
        {
            return false;
        }
        else if(!(name.equals(person.getFavoriteFood())))
        {
            return false;
        }
        return true;
    }

    public String toString()
    {
        String info = name + " is " + age + " years old, and likes " + favoriteFood;
        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer a) {
        age = a;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String fF) {
        favoriteFood = fF;
    }
}
