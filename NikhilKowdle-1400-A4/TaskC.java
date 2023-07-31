public class TaskC
{
    public static void main(String[] args)
    {
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";

        for(Integer z = 0; z < 1; z++)
        {
            one += "*";
            three += "*";
            five += "*";
            for(Integer y = 0; y < 2; y++)
            {
                three += "*";
                four += "*";
                for(Integer x = 0; x < 2; x++)
                {
                    one += "*";
                    two += "*";
                }
            }
        }

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
    }
}