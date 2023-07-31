import java.util.Scanner;

public class TaskB
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number for sum: ");
        Integer number = keyboard.nextInt();
        System.out.println(sum(number));

        keyboard.close();
    }

    public static Integer sum(Integer x)
    {
        if(x > 0)
        {
            Integer s = x + sum(x-1);
            return s;
        }
        else
        {
            return 0;
        }
    }
}