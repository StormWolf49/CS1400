import java.util.Random;

public class ArrayProcessingDemo
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Integer row = rand.nextInt(5)+1;
        Integer col = rand.nextInt(5)+1;
        Integer[][] test = new Integer[row][col];
        ArrayProcessing demo = new ArrayProcessing();
        
        System.out.println("");
        for (int r = 0; r < row; r++)
        {
            String display = "";
            for (int c = 0; c < col; c++)
            {
                test[r][c] = rand.nextInt(101);
                display += test[r][c] + " ";
            }
            System.out.println(display);
        }

        System.out.println("\nTotal: " + demo.getTotal(test));
        System.out.println("Average: " + demo.getAverage(test));
        Integer randRow = rand.nextInt(row);
        System.out.println("Row " + randRow + " Total: " + demo.getRowTotal(test, randRow));
        Integer randCol = rand.nextInt(col);
        System.out.println("Column " + randCol + " Total: " + demo.getColumnTotal(test, randCol));
        randRow = rand.nextInt(row);
        System.out.println("Row " + randRow + " Highest: " + demo.getHighestInRow(test, randRow));
        randRow = rand.nextInt(row);
        System.out.println("Row " + randRow + " Lowest: " + demo.getLowestInRow(test, randRow));
    }
}
