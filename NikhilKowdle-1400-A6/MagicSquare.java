public class MagicSquare
{
    public MagicSquare()
    {

    }

    public boolean check(Integer[][] input)
    {
        Integer test = 0;
        Integer sum = 0;
        
        if(input.length != 3 || input[0].length != 3)
        {
            return false;
        }
        
        for (int c = 0; c < 3; c++)
        {
            test += input[0][c];
        }

        for (int r = 0; r < 3; r++)
        {
            sum = 0;
            for (int c = 0; c < 3; c++)
            {
                sum += input[r][c];
            }
            if(test != sum)
            {
                return false;
            }
        }

        for (int c = 0; c < 3; c++)
        {
            sum = 0;
            for (int r = 0; r < 3; r++)
            {
                sum += input[r][c];
            }
            if(test != sum)
            {
                return false;
            }
        }
        
        sum = 0;
        for (int x = 0; x < 3; x++)
        {
            sum += input[x][x];
        }
        if(test != sum)
        {
            return false;
        }

        sum = 0;
        for (int x = 0; x < 3; x++)
        {
            sum += input[2-x][2-x];
        }
        if(test != sum)
        {
            return false;
        }

        return true;
    }
}
