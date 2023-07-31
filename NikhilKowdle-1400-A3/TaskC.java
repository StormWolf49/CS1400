import javax.swing.JOptionPane;

public class TaskC
{
    public static void main(String[] args)
    {
        Integer position = Integer.parseInt(JOptionPane.showInputDialog("Enter a number from 1, 2, and 3 position."));

        switch (position)
        {
            case 1:
            System.out.println("You won!");
            break;

            case 2:
            System.out.println("You were so close!");
            break;
            
            case 3:
            System.out.println("You were so close!");
            break;

            default:
            System.out.println("Time to train harder!");
        }
    }
}