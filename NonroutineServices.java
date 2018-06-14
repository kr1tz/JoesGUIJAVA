


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.GroupLayout;

public class NonroutineServices extends JPanel
{
    private final double LABOUR_RATE = 85.00; // Labour rate for nonroutine services
    
    protected JLabel partsLabel; // parts label
    protected JLabel labourLabel; // labour lable
    
    protected JTextField partsTextField; // text field for parts
    protected JTextField labourTextField; // text field for labour
    
    protected JPanel panel; // adding it to the panel
    
    private double nonRoutineCost = 0.0;
        
    
    public NonroutineServices()
    {
        panel = new JPanel(); // calling the JPanel
        
        setLayout(new GridLayout(2, 2)); // using GridLayout of 2 rows and 2 columns
        
        setBorder(BorderFactory.createTitledBorder("Nonroutine Services")); // setting the title
        
        partsLabel = new JLabel("Parts Charges"); // setting the label for parts
        labourLabel = new JLabel("Hours of Labour"); // setting the label for hours of labour
       
        
        // set size of text field of 10 
        partsTextField = new JTextField("0",10);           
        labourTextField = new JTextField("0",10);
        
        // setting the alignment to the right
        labourTextField.setHorizontalAlignment(JTextField.RIGHT);
        partsTextField.setHorizontalAlignment(JTextField.RIGHT);
        
        // addding the GUI text, label to the panel
        add(partsLabel);
        add(partsTextField);
        add(labourLabel);        
        add(labourTextField);
        
        
    }
    
    public double getCharges() // getting the charges for the non routine services
    {
               
        // converting double into String to calculate double        
        return nonRoutineCost = Double.parseDouble(partsTextField.getText()) + (Double.parseDouble(labourTextField.getText()) * LABOUR_RATE);
    }
    
    public double getNonRoutineTotal() // new method for reseting JOption Panel
    {
        double nRtotal = 0.0;
        
        return nRtotal = Double.parseDouble(partsTextField.getText()) + (Double.parseDouble(labourTextField.getText()) * LABOUR_RATE);
    }
    
   
   
}
