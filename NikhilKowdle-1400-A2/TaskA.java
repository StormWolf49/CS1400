import javax.swing.JOptionPane;

public class TaskA
{
    public static void main(String[] args)
    {
        Double recipeButterGrams = 125.0;
        Double recipeButterOz = 4.0;
        Double recipeSugarGrams = 55.0;
        Double recipeSugarOz = 2.0;
        Double recipeFlourGrams = 180.0;
        Double recipeFlourOz = 6.0;

        Double shortbread = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of shortbread you want."));
        Double butterGrams = recipeButterGrams * (shortbread/24);
        Double butterOz = recipeButterOz * (shortbread/24);
        Double sugarGrams = recipeSugarGrams * (shortbread/24);
        Double sugarOz = recipeSugarOz * (shortbread/24);
        Double flourGrams = recipeFlourGrams * (shortbread/24);
        Double flourOz = recipeFlourOz * (shortbread/24);

        JOptionPane.showMessageDialog(null, "For " + shortbread + " shortbread you need:\n" + butterGrams + "g/" + butterOz + "oz butter\n" + sugarGrams + "g/" + sugarOz + "oz sugar\n" + flourGrams + "g/" + flourOz + "oz plain flour");
    }
}