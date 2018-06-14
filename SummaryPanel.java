

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SummaryPanel extends JPanel
{
    // setting the variable to be used in the Summary Panel
    private int totalCustomers;
    private double totalRoutineCharges = 0.0;
    private double totalNonRoutineCharges = 0.0;
    private double totalTaxes = 0.0;
    private double totalCharges = 0.0;
    
    

    
    // labels for the Summary Panel
    protected final JLabel customerLabel;
    protected final JLabel routineChargesLabel;
    protected final JLabel nonRoutineChargeLabel;
    protected final JLabel taxesLabel;
    protected final JLabel chargesLabel;
    
    // textfield to out put results in case "Ok" is pressed
    protected final JTextField customerTextField;
    protected final JTextField routineChargeTextField;
    protected final JTextField nonRoutineChargeTextField;
    protected final JTextField taxesTextField;
    protected final JTextField chargesTextField;
    
    protected JPanel textLabel; //text label panel
    protected JPanel textField; // text field panel
    
    protected JPanel label; // label
    
    
    
    public SummaryPanel()
    {
        
      
        
        
        
        
               
       
        // customer using text field and label with  right justification
        customerLabel = new JLabel("Total Customers: ", JLabel.RIGHT); 
        customerTextField = new JTextField("0", 10); // initializes the text field to "0" and sets the text field to 10
        customerTextField.setHorizontalAlignment(JTextField.RIGHT); // sets the text box Horizontal right alignment
                
        // Routine services charge using text field and label with right justification
        
        routineChargesLabel = new JLabel("Total Routine Services: " , JLabel.RIGHT);
        routineChargeTextField = new JTextField("0",10); // initializes the text field to "0" and sets the text field to 10
        routineChargeTextField.setHorizontalAlignment(JTextField.RIGHT); // sets the text box Horizontal right alignment
        
        
         // Nonroutine services charge using text field and label with right justification
        nonRoutineChargeLabel = new JLabel("Total Non-Routine Services:", JLabel.RIGHT);
        nonRoutineChargeTextField = new JTextField("0",10); // initializes the text field to "0" and sets the text field to 10
        nonRoutineChargeTextField.setHorizontalAlignment(JTextField.RIGHT); // sets the text box Horizontal right alignment
        
        // taxes using text field and label with right justification
        taxesLabel = new JLabel("Total tax: ", JLabel.RIGHT);
        taxesTextField = new JTextField("0",10); // initializes the text field to "0" and sets the text field to 10
        taxesTextField.setHorizontalAlignment(JTextField.RIGHT); // sets the text box Horizontal right alignment
        
        
        
        
        // charges using text field and label with right justification
        chargesLabel = new JLabel("Total charges:", JLabel.RIGHT);
        chargesTextField = new JTextField("0",10); // initializes the text field to "0" and sets the text field to 10
        chargesTextField.setHorizontalAlignment(JTextField.RIGHT); // sets the text box Horizontal right alignment
         
        textField = new JPanel(); // Textbox Panel
        textLabel = new JPanel(); // Label Panel
        
        setLayout(new GridLayout(0,2,5,5)); // setting the GridLayout
        
        add(customerLabel);// adding customer label to the panel
        add(customerTextField); // adding customer text field to the panel
        
        add(routineChargesLabel); // adding the routine charges label to the Panel
        add(routineChargeTextField); // adding the routine charges text box to the panel
        
        add(nonRoutineChargeLabel); // adding the non routine charges label to the panel
        add(nonRoutineChargeTextField); // adding the non routine charges text box to the panel
        
        add(taxesLabel); // adding the taxes label to the panel
        add(taxesTextField); // adding the taxes text box to the panel
        
        add(chargesLabel); // adding the charges label to the panel
        add(chargesTextField); // adding the charges text field to the panel
             
        
        add(textLabel); // adds the label to the main panel
        add(textField); // adds the text boxes to the main panel
          
                       
        //setting the text field to false so that it is only read only text
        customerTextField.setEditable(false);
        routineChargeTextField.setEditable(false);
        nonRoutineChargeTextField.setEditable(false);
        taxesTextField.setEditable(false);
        chargesTextField.setEditable(false);
        
               
    }
    
    public int getTotalCustomers()
    {
        totalCustomers++; // increments customers        
        return totalCustomers; // gets total customers
    }

    public void setTotalCustomers(int totalCustomers)
    {
        this.totalCustomers = totalCustomers; // setting total customers
    }

    public double getTotalRoutineCharges()
    {               
        return totalRoutineCharges; // gets the routine charges
    }

    public void setTotalRoutineCharges(double totalRoutineCharges)
    {
        this.totalRoutineCharges = totalRoutineCharges; // sets the total routine charges
    }

    public double getTotalNonRoutineCharges()
    {
        return totalNonRoutineCharges; // gets the total non routine charges
    }

    public void setTotalNonRoutineCharges(double totalNonRoutineCharges)
    {
        this.totalNonRoutineCharges = totalNonRoutineCharges; // sets the non routine charges
    }
    
    public double getTotalTaxes()
    {   
        return totalTaxes; // gets the total taxes
    }

    public void setTotalTaxes(double totalTaxes)
    {
        this.totalTaxes = totalTaxes; // sets the total taxes
    }

    public double getTotalCharges()
    {             
        return totalCharges; // gets the total charges
    }

    public void setTotalCharges(double totalCharges)
    {
        this.totalCharges = totalCharges; // sets the total charges
    }
    
  
}
