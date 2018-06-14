




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.BoxLayout;


public class RoutineServices extends JPanel
{
   
   //parallel arrays representing the service types and corresponding costs 
   public final String[] SERVICE_TYPES = { "Oil Change ($26.00)", "Lube Job ($18.00)", "Radiator Flush ($30.00)", "Transmission Flush ($80.00)", "Inspection ($15.00)", "Muffler Replacement ($100.00)", "Tire Rotation ($20.00)"};
   public final double[] SERVICE_CHARGES = { 26.00, 18.00, 30.00, 80.00, 15.00, 100.00, 20.00};
   
   // array for JCheckBox objects
   protected JCheckBox[] checkBoxes = new JCheckBox[SERVICE_TYPES.length];
   
   private double routineCost = 0.0;
     
   
   
   
   
   //Constructor
   public RoutineServices()
   {
          
        
       setLayout(new GridLayout(SERVICE_TYPES.length, 1)); // sets the grid layout with the length of the service type String.
                    
       setBorder(BorderFactory.createTitledBorder("Routine Services"));// adds the title routine services to the lined border
       
       //creates the check boxes and add them into the array of Routine Services
      
       for (int i = 0; i < checkBoxes.length; i++)
       {
           checkBoxes[i] = new JCheckBox(SERVICE_TYPES[i]);
           add(checkBoxes[i]);
       }
       
       
       
       
   }
   
   public double getCharges() //method for calculating the routine charges
   {
       
       
       for(int i = 0; i < checkBoxes.length; i++)
        if(checkBoxes[i].isSelected())
            routineCost += SERVICE_CHARGES[i];
        return routineCost;
   }
   
   public double getRoutineTotal() // new method for reseting the JOption Panel
   {
       double rTotal = 0.0;
       
       for(int i = 0; i < checkBoxes.length; i++)
        if(checkBoxes[i].isSelected())
            rTotal += SERVICE_CHARGES[i];
            return rTotal;
   }
    
    
   
}
