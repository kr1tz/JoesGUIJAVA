

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class JoesAutoGUI extends JPanel
{
    protected RoutineServices routinePanel;
    protected NonroutineServices nonRoutinePanel;
    protected SummaryPanel summaryPanel;
    protected JPanel buttonPanel, titlePanel;
    protected JButton calcButton,
                        exitButton;
    protected JLabel label;                    
    protected ImageIcon image;
        
     
    public JoesAutoGUI()
    {
        // created a new JPanel call charges which will be used below.
        JPanel charges = new JPanel(new BorderLayout());
             
        
        
        routinePanel = new RoutineServices(); // adding the routine service panel which will be added to the JFrame later
        nonRoutinePanel = new NonroutineServices(); // adding the Nonroutine service panel which will be added to the JFrame later
        summaryPanel = new SummaryPanel(); //adding the summary panel to the JFrame
         
        buildTitlePanel(); // calling for the buildTitle Panel below
        buildButtonPanel(); // calling the buildButton Panel from below
        
        add(summaryPanel); // adding the summary panel to the Panel
        charges.add(titlePanel, BorderLayout.NORTH); // adding the titlePanel in the Charges Panel with the border set to NORTH
        charges.add(routinePanel, BorderLayout.WEST); // adding the routine panel in the charges panel with the border set to WEST
        charges.add(nonRoutinePanel, BorderLayout.SOUTH); //adding the non routine panel in the charges panel with the border set to SOUTH
        charges.add(buttonPanel,  BorderLayout.EAST); // adding the button panel in the charges panel with the border set to EAST
       
        
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP); //adding the JTabbedPane as tabbedPane and setting it to the TOP
        tabbedPane.addTab("Charges",  charges); // naming the tab "Charges" with calling the charges panel
       
        tabbedPane.addTab("Summary",  summaryPanel); //naming the tab "Summary" with calling the summary Panel
        
        tabbedPane.setSelectedIndex(0); //setting the selected index to 0
             
        add(tabbedPane); // adding the tabbedPane in the Panel
        
       
        
       
       
    }
    
    private void buildTitlePanel()
    {
        titlePanel = new JPanel(); // adding the titlePanel in the JPanel
        
        
        
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Setting the titlePanel in the center of the FlowLayout.
        
        image = new ImageIcon("car.gif"); // calling the car.gif in the class
        
        
        
        label = new JLabel("Joe's Automotive", image, JLabel.CENTER); // label of the title panel with calling the image
        titlePanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); // Left to right composition with the image then the label set.
        
       
        
        titlePanel.add(label); // adding the label panel in the titlepanel
        
                        
        
        
        validate(); // validates so that it works.
        
    }
    
    private void buildButtonPanel()
    {
        buttonPanel = new JPanel(); // adding the buttonPanel in the JPanel
        
        buttonPanel.setLayout(new GridLayout(5,1,5,5)); // setting the GridLayout
        
        calcButton = new JButton("Calculate Charges");   // naming the buttons - Calculate Charges Button
        
        
        exitButton = new JButton("Exit"); // naming the buttons - Exit buttong
        
        
        
        JoesAutoHandler handler = new JoesAutoHandler(this); // calls the handler Class to handle the events in which the event the buttons are pressed
        
        // adding the buttons in the Handler class and adds it the Listener which will calculate or exit the window
        calcButton.addActionListener(handler);   exitButton.addActionListener(handler);
        
        // adding the calcbutton and exitbutton to the buttonPanel.
        buttonPanel.add(calcButton);
       
        buttonPanel.add(exitButton);
        
        
        
    }
    
}
