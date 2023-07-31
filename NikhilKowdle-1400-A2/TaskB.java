import javax.swing.JOptionPane;

public class TaskB
{
    public static void main(String[] args)
    {
        Double tip = 0.2;
        Double tax = 0.0725;
        Integer people = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of people in the party."));
        Double totalBill = Double.parseDouble(JOptionPane.showInputDialog("Enter the total bill amount before tax and tip."));
        Double perPerson = ((totalBill * (1 + tip)) * (1 + tax)) / people;

        JOptionPane.showMessageDialog(null, "For " + people + " each person needs to pay:\n" + perPerson);
    }
}