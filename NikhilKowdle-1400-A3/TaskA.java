import javax.swing.JOptionPane;

public class TaskA
{
    public static void main(String[] args)
    {
        Integer shortbread = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of shortbread you want."));
        Double price = shortbread * 5.0;
        Integer discount;
        Double discountPrice;

        if (shortbread >= 100) {
            discount = 50;
            discountPrice = price - (price*(discount/100.0));
        }
        else if (shortbread >= 50) {
            discount = 40;
            discountPrice = price - (price*(discount/100.0));
        }
        else if (shortbread >= 20) {
            discount = 30;
            discountPrice = price - (price*(discount/100.0));
        }
        else if (shortbread >= 10) {
            discount = 20;
            discountPrice = price - (price*(discount/100.0));
        }
        else {
            discount = 0;
            discountPrice = price - (price*(discount/100.0));
        }

        JOptionPane.showMessageDialog(null, "For " + shortbread + " shortbread you get a " + discount + "% discount, meaning you pay " + discountPrice);
    }
}