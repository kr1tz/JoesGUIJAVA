

import java.awt.*;
import javax.swing.*;

public class JoesAutoClient extends JFrame
{
  private JoesAutoGUI gui; // adding the gui to the JFrame
 
  
  
 
  
 public JoesAutoClient()
  {
      
      
      JFrame frame = new JFrame(); //  creating a new JFrame to be added
      JoesAutoGUI gui = new JoesAutoGUI(); // calling the gui
      gui.setOpaque(false); // setting to Opaque to false to make nothing transluscent
      
      frame.setTitle("Joe's Automotive"); // setting the title for the Frame
      frame.setLocationRelativeTo(null); // setting the window location
      frame.setResizable(false); // not resizable
      frame.setContentPane(gui); //adding the contentpane to gui and the Frame          
      
      
      frame.pack(); // packing to the content pane
      
      frame.setVisible(true); // setting the visibility so that it can be seen
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // press the exit to close the window
  }
  
   public static void main(String[] args)
   {
       new JOptionPane();
       new JoesAutoClient(); 
   }
}