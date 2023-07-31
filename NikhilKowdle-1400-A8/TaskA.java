import java.util.Scanner;

public class TaskA
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Integer[] test = {0, 2, 6, 4, 3, 3, 2, 0, 3, 6, 0, 7, 3};
        System.out.println("0, 2, 6, 4, 3, 3, 2, 0, 3, 6, 0, 7, 3");
        System.out.println("Number of 3s: " + numberCount(3, test));
        keyboard.close();
    }

    public static Integer numberCount(Integer x, Integer[] y)
    {
        Integer times = 0;
        if(y[y.length-1] == x)
        {
            times++;
        }
        if(y.length-1 != 0)
        {
            Integer[] z = new Integer[y.length-1];
            for(int i = 0; i < z.length; i++)
            {
                z[i] = y[i];
            }
            times = times + numberCount(x, z);
        }
        return times;
    }
}