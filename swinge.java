import javax.swing.*;
import java.awt.*;

public class swinge 
{
 public static void main(String args[])
 {
  JFrame jf = new JFrame("Swing");
  Container c = jf.getContentPane();
  
  JLabel l1 = new JLabel("Username");
  JTextField t1 = new JTextField(10);
  
  JLabel l2 = new JLabel("Password");
  JTextField t2 = new JTextField(10);
  
  JButton b1 = new JButton("Submit");
  c.setLayout(new FlowLayout());
  
  c.add(l1);
  c.add(t1);
  c.add(l2);
  c.add(t2);
  c.add(b1);
  jf.setSize(400,400);
  jf.setVisible(true);
 }
}
