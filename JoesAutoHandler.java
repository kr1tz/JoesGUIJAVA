


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class JoesAutoHandler implements ActionListener 
{
    private final double TAX_RATE = 0.05; // tax rate variable
    protected JoesAutoGUI gui; // calls GUI
    
    private static double rTotal = 0.0;
    private static double nrTotal = 0.0;
    private static double sTotal = 0.0;
    private static double taxTotal = 0.0;
    private static double finalTotal = 0.0;
    
   
     
    
   public JoesAutoHandler(JoesAutoGUI gui)
   {
       this.gui = gui; // variable for the gui
   }
   
      
   public void actionPerformed(ActionEvent e)
   {
       
       
       double subTotal,
                     tax,
                        total,
                            routineTotal,                                 
                                    nonRoutineTotal;
        int customers;
        
        
       if(e.getSource() == gui.calcButton) //button Listener
       
          { 
           
           customers = gui.summaryPanel.getTotalCustomers();// calls the increment from the summary panel in getTotalCustomers method.
           rTotal = gui.routinePanel.getCharges();
           nrTotal = gui.nonRoutinePanel.getCharges();
           sTotal = rTotal + nrTotal;
           taxTotal = sTotal * TAX_RATE;
           finalTotal = sTotal + taxTotal;
         
           
           DecimalFormat fmt = new DecimalFormat("$#,##0.00"); // proper format for decimal
           
           int dialogButton = JOptionPane.OK_CANCEL_OPTION; // variable to call the OK, Cancel Window pane
           
            // calling to get total and to reset JOption Panel     
           routineTotal = gui.routinePanel.getRoutineTotal();
           nonRoutineTotal = gui.nonRoutinePanel.getNonRoutineTotal();
           subTotal = routineTotal + nonRoutineTotal;
           tax = subTotal * TAX_RATE;
           total = subTotal + tax;
           
           int result = JOptionPane.showConfirmDialog(null, "Routine Charges: " + fmt.format(routineTotal)+ "\n" +
                                              "Non-Routine Charges: " + fmt.format(nonRoutineTotal) + "\n" +
                                               "Subtotal: " + fmt.format(subTotal) + "\n" +
                                               "Tax: " + fmt.format(tax) + "\n" +
                                               "Total: " + fmt.format(total), "Confirm Customer Receipt", dialogButton,
                                               JOptionPane.INFORMATION_MESSAGE);
                                              
                                          
                                               
                                              
           if(result == JOptionPane.OK_OPTION) // Result sent to Text box in summary panel after pressing OK button
           {              
                                                                                              
            gui.summaryPanel.customerTextField.setText("" + customers); // calling the gui, in the summarypanel and the customer text field   
            gui.summaryPanel.routineChargeTextField.setText("" + fmt.format(rTotal)); // calling the gui, in the summary panel and routine text field
            gui.summaryPanel.nonRoutineChargeTextField.setText("" + fmt.format(nrTotal)); // calling the gui. in the summary panel and non routine text field
            gui.summaryPanel.taxesTextField.setText("" + fmt.format(taxTotal)); // calling the gui, in the summary panel and the taxes text field
            gui.summaryPanel.chargesTextField.setText("" + fmt.format(finalTotal));// calling the gui, in the summary panel and total charges text field
                               
                                                        
                                                        
           }
                                                    
                                                    
                                         
                                                                                
                                                   
                                                      
                                   
                                              
                                                   
                                      
       
        
    }else if(e.getSource() == gui.exitButton) System.exit(0);  // exits program 
    
}
}
