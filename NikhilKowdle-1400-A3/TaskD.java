import javax.swing.JOptionPane;

public class TaskD
{
    public static void main(String[] args)
    {
        Double recipeButterOz = 4.0;
        Double recipeSugarOz = 2.0;
        Double recipeFlourOz = 6.0;

        Double shortbread = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of shortbread you want."));
        Double butterOz = recipeButterOz * (shortbread/24);
        Double sugarOz = recipeSugarOz * (shortbread/24);
        Double flourOz = recipeFlourOz * (shortbread/24);

        System.out.printf("Recipe for %7.2f shortbread (butter, sugar, flour):\nOunces:%7.2f\nOunces:%7.2f\nOunces:%7.2f", shortbread, butterOz, sugarOz, flourOz);
    }
}