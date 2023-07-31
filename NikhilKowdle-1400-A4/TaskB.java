import java.util.Scanner;
import java.io.*;

public class TaskB
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of a file: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        Integer line = 1;

        while(inputFile.hasNext())
        {
            String str = inputFile.nextLine();
            System.out.println("Line " + line + ": " + str);
            line++;
        }

        inputFile.close();
        keyboard.close();
    }
}