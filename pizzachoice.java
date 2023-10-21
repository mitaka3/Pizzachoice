/**
 *
 * @author user
 */
import javax.swing.*;
public class PizzaChoice {
    public static void main (String[] args)
    {

       
       int x;
        String [] PizzaSize = {"Small","Medium","Large","ExtraLarge"};
        String ps;
        double [] Price = {6.99,8.99,12.50,15.00};
        boolean validPizza = false;
        double itemprice = 0.0;
        
        ps = JOptionPane.showInputDialog(null,"Enter the Pizza Size that you want: ");
        for (x=0 ; x< PizzaSize.length; ++x)
            if(ps.equals(PizzaSize[x]))
            {
                    validPizza = true;
                    itemprice = Price[x];
            }
                    if (validPizza)
            JOptionPane.showMessageDialog(null,"Pizza that you have ordered is size " + ps + " which costs: " + itemprice);
        
        else
            JOptionPane.showMessageDialog(null, "Invalid Pizza");
        
        
    }
}