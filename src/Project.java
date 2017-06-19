import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class Project 
{   
    static int width =  1000, height = 1000;   
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() 
            {
                
                JFrame mainpage = new MainPage();
                mainpage.setSize(width, height);
                mainpage.setVisible(true);
                mainpage.setBackground(Color.white);
                mainpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
            }
        });
    }
}
class MainPage extends JFrame
{
    private JSplitPane splitpane1 ;
    private JSplitPane splitpane2;
    private JLabel label ;
    private JTabbedPane tabbedpane ;
    private JPanel panel;
    private JList list;
    private JPanel mainpanel;
    private String item0 =  "YOU MAY FIND THIS INTERESTING";
    private String item1 =  "Major Vegitaion in India";
    private String item2 =  "Major Crops" ;
    private String item3 =  "Agriculture in India";
    private String item4 =  "Indian Agricultural Labours";
    private String item5 =  "Indian Council of Agricultural Research";
    private String item6 =  "Land and Soil types in India";
    private String[] listitems = {item0 ,item1 , item2 ,item3 , item4 };
    private JPanel tab1;
    private JPanel tab2;
    private JPanel tab3;
    private JPanel tab4;
    private JLabel tab1label;
    public JComboBox tab1state;
    public String combostate = " ";   //this string
    public JComboBox tab2crop;
    public String combocrop = " ";      //this string
    private String state1, state2,state3 , state4, state5 ,state6 , state7 , state8,state9, state10,state11;
    private String crop1 ,crop2 , crop3 , crop4 , crop5,crop6 ,crop7 , crop8 , crop9 , crop10 ;
    private JLabel tab2label;
    private JButton btn;
    private String message;
    private JOptionPane option;
    public JComboBox tab3param;
    private String param1;
    private String param2;
    private String param3;
    public String comboparam;
    
    MainPage()
    {
        state1 = "Andhra Pradesh";
        state2 = "Arunachal Pradesh";
        state3 = "Assam";
        state4 = "Gujarat";
        state5 = "Karnataka";
        state6 = "Madhya Pradesh";
        state7 = "Maharashtra";
        state8 = "Punjab";
        state9 = "Rajasthan";
        state10 = "Tamilnadu";
        state11 = "Uttar Pradesh";
        
        crop1 = "Rice";
        crop2 = "Wheat";
        crop3 = "Jute";
        crop4 = "Sugarcane";
        crop5 = "Rubber";
        crop6 = "Coffee";
        crop7 = "Tea";
        crop8 = "Cardamom";
        crop9 = "Cotton";
        crop10 = "Jowar";
        label = new JLabel();
        label.setSize(400, 400);
        panel = new JPanel();
        list = new JList();
        tab1label = new JLabel("Select Region : ");
        tab2label = new JLabel("Select Crop : ");
        tab1state = new JComboBox();
        tab2crop = new JComboBox();
        tabbedpane = new JTabbedPane();
        tab1 = new JPanel();
        tab2 = new JPanel();
        tab3 = new JPanel();
        tab4 = new JPanel();
        btn = new JButton("Analyze");
        tab3param = new JComboBox();
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Project\\Images\\label1.jpg";
        File f = new File(filePath);
        try 
        {
            BufferedImage image = ImageIO.read(f);
            Image imgAdjusted = image.getScaledInstance(label.getWidth(), label.getHeight(),
            Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
        list.setListData(listitems);
        list.setSize(500, 500);
        panel.add(list , BorderLayout.CENTER);
        list.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e) 
            {
                String url = (String) list.getSelectedValue();
                
                if(url.equals(item1.trim()))
                {
                    JFrame mp = new MainPage();
                    JFrame frm = new Item1();
                    frm.setVisible(true);
                     mp.setEnabled(false);
                    frm.setFocusableWindowState(true);
                    frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                }
                else 
                if(url.equals(item2.trim()))
                {
                    JFrame mp = new MainPage();
                    JFrame frm =  new Item2();
                    frm.setVisible(true);
                    mp.setEnabled(false);
                    frm.setFocusableWindowState(true);
                    frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                }
                else
                if(url.equals(item3.trim()))
                {
                    JFrame mp = new MainPage();
                    JFrame frm = new Item3();
                    frm.setVisible(true);
                    mp.setEnabled(false);
                    frm.setFocusableWindowState(true);
                    frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    mp.setEnabled(true);
                }
                else
                if(url.equals(item4.trim()))
                {
                    JFrame mp = new MainPage();
                    JFrame frm = new Item4();
                    frm.setVisible(true);
                    mp.setEnabled(false);
                    frm.setFocusableWindowState(true);
                    frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    mp.setEnabled(true);
                }
                else
                if(url.equals(item5.trim()))
                {
                    JFrame mp = new MainPage();
                    JFrame frm = new Item5();
                    frm.setVisible(true);
                    mp.setEnabled(false);
                    frm.setFocusableWindowState(true);
                    frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    mp.setEnabled(true);
                }
                else
                if(url.equals(item6.trim()))
                {
                    JFrame mp = new MainPage();
                    JFrame frm = new Item6();
                    frm.setVisible(true);
                    mp.setEnabled(false);
                    frm.setFocusableWindowState(true);
                    frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    mp.setEnabled(true);
                }
            }
            
        });
        param1 = "Temperature";
        param2 = "Rainfall";
        param3 = "Soil";
        tab1.add(tab1label , BorderLayout.CENTER);
        tab1.add(tab1state , BorderLayout.EAST);
        tab2.add(tab2label , BorderLayout.CENTER);
        tab2.add(tab2crop , BorderLayout.EAST);
        tab1state.setSelectedItem(state1);
        tab1state.addItem(state1);
        tab1state.addItem(state2);
        tab1state.addItem(state3);
        tab1state.addItem(state4);
        tab1state.addItem(state5);
        tab1state.addItem(state6);
        tab1state.addItem(state7);
        tab1state.addItem(state8);
        tab1state.addItem(state9);
        tab1state.addItem(state10);
        tab1state.addItem(state11);
        tab2crop.addItem(crop1);
        tab2crop.addItem(crop2);
        tab2crop.addItem(crop3);
        tab2crop.addItem(crop4);
        tab2crop.addItem(crop5);
        tab2crop.addItem(crop6);
        tab2crop.addItem(crop7);
        tab2crop.addItem(crop8);
        tab2crop.addItem(crop9);
        tab2crop.addItem(crop10);
        tab2crop.setSelectedItem(crop1);
        tabbedpane.addTab("Select Region", tab1);
        tabbedpane.addTab("Select Crop", tab2);
        tabbedpane.addTab("Select Parameter",tab3);
        tabbedpane.addTab("Analysis", tab4);
        tabbedpane.setEnabledAt(1, false);
        tabbedpane.setEnabledAt(2, false);
        btn.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(comboparam == "Soil")
                {
                    JFrame frm = new Tab4Soil();
                    frm.setVisible(true);
                    frm.setSize(1000, 1000);
                    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                else if(comboparam == "Temperature")
                {
                    JFrame frm = new Tab4Temperature();
                    frm.setVisible(true);
                    frm.setSize(1000, 1000);
                    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                else if(comboparam == "Rainfall")
                {
                    JFrame frm = new Tab4Rainfall();
                    frm.setVisible(true);
                    frm.setSize(1000, 1000);
                    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
            
        });
        tab3param.addItem(param1);
        tab3param.addItem(param2);
        tab3param.addItem(param3);
        tab3.add(tab3param);
        
        tab4.add(btn);
        tab1state.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                tab2.setVisible(true);
                tabbedpane.setEnabledAt(0,false);
                tabbedpane.setEnabledAt(1, true);
                //tab2.setVisible(true);
                combostate = (String) tab1state.getSelectedItem();
            }
        });
        tab2crop.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                tab2.setVisible(false);
                tabbedpane.setEnabledAt(2, true);
                tab3.setVisible(true);
                tabbedpane.setEnabledAt(1,false);
                combocrop = (String) tab2crop.getSelectedItem();
                 
            }
            
        });
        tab3param.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                tab3.setVisible(true);
                tabbedpane.setEnabledAt(1,false);
                tabbedpane.setEnabledAt(2, true);
                //tab2.setVisible(true);
                comboparam = (String) tab3param.getSelectedItem();
                message = "You have selected "+combostate+" as your Region of search"+" and "+combocrop+" as your search crop and "+comboparam+" is the seleceted Parameter for Analysis..";
                option.showMessageDialog(null , message," Analysis ",1);
            }
        });
        
        splitpane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT ,label , panel );
        splitpane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT , splitpane1 , tabbedpane);
        splitpane2.setSize(2000, 2000);
        mainpanel = new JPanel();
        mainpanel.add(splitpane2 , BorderLayout.CENTER);
        add(mainpanel);
    }
}