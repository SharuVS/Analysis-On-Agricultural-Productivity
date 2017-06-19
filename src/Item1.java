import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Item1 extends JFrame 
{
    private JLabel lbl;
    private JScrollPane pane;
    private JPanel panel;
    private File f;
    private String filePath = "C:\\Users\\hp\\Documents\\NetBeansProjects\\Project\\Images\\Item1.jpg";
    Item1()
    {
         
  
   
        lbl = new JLabel();
       // System.out.println("hi");
        pane = new JScrollPane();
        //System.out.println("hello");
        panel = new JPanel();
        //System.out.println("im fyn");
        lbl.setSize(3000, 3000);
        //System.out.println("hws lyf");
        f = new File(filePath);
        try 
        {
            //System.out.println("wassup");
            BufferedImage image = ImageIO.read(f);
            //System.out.println("im doing great");
            Image imgAdjusted = image.getScaledInstance(lbl.getWidth(), lbl.getHeight(),
            Image.SCALE_SMOOTH);
            //System.out.println("life is beautiful");
            lbl.setIcon(new ImageIcon(imgAdjusted));
            //System.out.println(":P :P");
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
         pane.add(lbl);
         //System.out.println(":P :/");
         panel.add(lbl);
         //System.out.println(":/ :)");
         add(panel);
         //System.out.println(":(");
    }
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {

            @Override
            public void run() 
            {
                JFrame frm = new Item1();
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            
        });
    }
}
