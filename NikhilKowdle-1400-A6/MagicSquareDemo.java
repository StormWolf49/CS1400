public class MagicSquareDemo
{
    public static void main(String[] args)
    {
        MagicSquare demo = new MagicSquare();

        Integer[][] test1 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        display(test1);
        System.out.println(demo.check(test1));

        Integer[][] test2 = {{4, 9, 2, 6}, {3, 5, 7, 6}, {8, 1, 6, 6}};
        display(test2);
        System.out.println(demo.check(test2));

        Integer[][] test3 = {{4, 9, 2}, {3, 5, 7}};
        display(test3);
        System.out.println(demo.check(test3));

        Integer[][] test4 = {{4, 9, 2}, {8, 1, 6}, {3, 5, 7}};
        display(test4);
        System.out.println(demo.check(test4));

        Integer[][] test5 = {{10, 3, 8}, {5, 7, 9}, {6, 11, 4}};
        display(test5);
        System.out.println(demo.check(test5));

        Integer[][] test6 = {{17, 10, 15}, {12, 14, 16}, {13, 18, 11}};
        display(test6);
        System.out.println(demo.check(test6));
    }

    public static void display(Integer[][] input)
    {
        System.out.println("");
        for (int r = 0; r < input.length; r++)
        {
            String display = "";
            for (int c = 0; c < input[r].length; c++)
            {
                display += input[r][c] + " ";
            }
            System.out.println(display);
        }
    }
}
