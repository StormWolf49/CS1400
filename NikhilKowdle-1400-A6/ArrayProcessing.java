public class ArrayProcessing
{
    public ArrayProcessing()
    {

    }
    
    public Integer getTotal(Integer[][] input)
    {
        Integer sum = 0;
        for (int r = 0; r < input.length; r++)
        {
            for (int c = 0; c < input[r].length; c++)
            {
                sum += input[r][c];
            }
        }
        return sum;
    }

    public Double getAverage(Integer[][] input)
    {
        Integer sum = 0;
        for (int r = 0; r < input.length; r++)
        {
            for (int c = 0; c < input[r].length; c++)
            {
                sum += input[r][c];
            }
        }
        Double average = (double)sum/(input.length * input[0].length);
        return average;
    }

    public Integer getRowTotal(Integer[][] input, Integer row)
    {
        Integer sum = 0;
        for (int c = 0; c < input[row].length; c++)
        {
            sum += input[row][c];
        }
        return sum;
    }

    public Integer getColumnTotal(Integer[][] input, Integer col)
    {
        Integer sum = 0;
        for (int r = 0; r < input.length; r++)
        {
            sum += input[r][col];
        }
        return sum;
    }

    public Integer getHighestInRow(Integer[][] input, Integer row)
    {
        Integer highest = 0;
        for (int c = 0; c < input[row].length; c++)
        {
            if(input[row][c] > highest)
            {
                highest = input[row][c];
            }
        }
        return highest;
    }

    public Integer getLowestInRow(Integer[][] input, Integer row)
    {
        Integer lowest = input[row][0];
        for (int c = 0; c < input[row].length; c++)
        {
            if(input[row][c] < lowest)
            {
                lowest = input[row][c];
            }
        }
        return lowest;
    }
}
