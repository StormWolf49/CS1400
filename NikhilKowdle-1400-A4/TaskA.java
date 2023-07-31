import java.util.Scanner;

public class TaskA
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Integer score1,
                score2,
                score3,
                score4,
                score5;
                
        System.out.print("Enter user 1 highscore: ");
        score1 = keyboard.nextInt();
        System.out.print("Enter user 2 highscore: ");
        score2 = keyboard.nextInt();
        System.out.print("Enter user 3 highscore: ");
        score3 = keyboard.nextInt();
        System.out.print("Enter user 4 highscore: ");
        score4 = keyboard.nextInt();
        System.out.print("Enter user 5 highscore: ");
        score5 = keyboard.nextInt();

        System.out.print("\n");

        System.out.print("User 1: ");
        System.out.println(bar(score1/1000));
        System.out.print("User 2: ");
        System.out.println(bar(score2/1000));
        System.out.print("User 3: ");
        System.out.println(bar(score3/1000));
        System.out.print("User 4: ");
        System.out.println(bar(score4/1000));
        System.out.print("User 5: ");
        System.out.println(bar(score5/1000));

        keyboard.close();
    }

    public static String bar(Integer score)
    {
        String scoreBar = "";
        for(Integer i = 1; i <= score; i++)
        {
            scoreBar = scoreBar + "*";
        }
        return scoreBar;
    }
}