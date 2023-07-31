import javax.swing.JOptionPane;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class TaskB
{
    public static void main(String[] args)
    {
        String skiOne = JOptionPane.showInputDialog("Enter the name of the first skier.");
        Double timeOne = Double.parseDouble(JOptionPane.showInputDialog("Enter the time in seconds."));
        String skiTwo = JOptionPane.showInputDialog("Enter the name of the second skier.");
        Double timeTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter the time in seconds."));
        String skiThree = JOptionPane.showInputDialog("Enter the name of the third skier.");
        Double timeThree = Double.parseDouble(JOptionPane.showInputDialog("Enter the time in seconds."));
        
        String first = "";
        String second = "";
        String third = "";

        if (timeOne > timeTwo && timeOne < timeThree) {
            first = skiThree;
            second = skiOne;
            third = second;
        }
        else if ((timeOne > timeTwo && timeOne > timeThree) && (timeTwo > timeThree)) {
            first = skiOne;
            second = skiTwo;
            third = skiThree;
        }
        else if ((timeOne > timeTwo && timeOne > timeThree) && (timeTwo < timeThree)) {
            first = skiOne;
            second = skiThree;
            third = skiTwo;
        }
        else if ((timeOne > timeTwo && timeOne > timeThree) && (timeTwo == timeThree)) {
            first = skiOne;
            second = skiTwo;
            third = skiThree;
        }
        else if ((timeOne < timeTwo && timeOne < timeThree) && (timeTwo > timeThree)) {
            first = skiThree;
            second = skiTwo;
            third = skiOne;
        }
        else if ((timeOne < timeTwo && timeOne < timeThree) && (timeTwo < timeThree)) {
            first = skiTwo;
            second = skiTwo;
            third = skiOne;
        }
        else if ((timeOne < timeTwo && timeOne < timeThree) && (timeTwo == timeThree)) {
            first = skiThree;
            second = skiTwo;
            third = skiOne;
        }
        else {
            first = skiOne;
            second = skiTwo;
            third = skiThree;
        }
        
        JOptionPane.showMessageDialog(null, "Places:\n1. " + first + "\n2. " + second + "\n3. " + third);
    }
}