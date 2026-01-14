import javax.swing.JOptionPane;

/*
// SumOfNumbers
// Captures first and second numbers
// and returns the sum
*/
public class SumOfNumbers {
    public static void main(String[] args) {
        String first = JOptionPane.showInputDialog("Enter the first floating number");
        String second = JOptionPane.showInputDialog("Enter the second floating number");

        float s1 = Float.parseFloat(first);
        float s2 = Float.parseFloat(second);

        float sum = s1 + s2;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
    }
}
