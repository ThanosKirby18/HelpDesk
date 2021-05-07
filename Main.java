import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main
{
  public static void main (String args[])
  {

      JFrame frame1 = new JFrame("Help Desk");
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // //YOU MUST HAVE THIS LINE
      frame1.setPreferredSize(new Dimension(500,500));
      frame1.setVisible(true);

      JPanel panel1 = new JPanel(new GridLayout(4, 4, 100, 100));
      panel1.setBackground(new Color(64, 103, 162));
      panel1.setVisible(true);


       JTextField labelBold = new JTextField("Sans Serif, Bold, 100, black");
       labelBold.setText("Help Desk");
       labelBold.setBounds(50, 0, 20, 20);
       labelBold.setFont(new Font("Sans Serif", Font.BOLD, 50));
        labelBold.setBackground(new Color(64, 103, 162));
       labelBold.setEditable(false);
       panel1.add(labelBold);
/*
       JTextArea labelBold2 = new JTextArea("Sans Serif, Bold, 100, black");
       labelBold2.setText("Cool Thing");
       labelBold2.setBounds(150,150, 20, 20);
       labelBold2.setFont(new Font("Sans Serif", Font.BOLD, 20));
       frame1.add(labelBold2);
*/

        frame1.pack();   
        frame1.getContentPane().add(BorderLayout.NORTH, panel1);  

  }//end main method
}//end class Main