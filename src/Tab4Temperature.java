
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Tab4Temperature extends javax.swing.JFrame 
{
    MainPage obj = new MainPage();
    String Crop = (String) obj.tab2crop.getSelectedItem();
    String State = (String) obj.tab1state.getSelectedItem();
    String Param = (String) obj.tab3param.getSelectedItem();
    BufferedImage image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12 , image13 , image14 ,image15,image16,image17 ,image18,image19;
    JOptionPane describe;
    JOptionPane describe1;
    JOptionPane describe2;
    JOptionPane describe3;
    JOptionPane describe4;
    public Tab4Temperature()
    {
        initComponents();
        func2();
        func3();
        func4();
        func5();
        func6();
        func7();
        func8();
        func9();
        func10();
        func11();
        func12();
        func13();
        func14();
        func15();
        func16();
        func17();
        func18();
        func19();
        Exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                System.exit(0);
            }
        });
        Close.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                dispose();
            }
        });
        Result.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\readme.txt";
                try 
                {
                    File file = new File(filePath);
                    
                    java.util.List<String> line = Files.readAllLines(Paths.get(filePath));
                    
                    describe.showMessageDialog(null , line," Description ",1);
                }
                catch(Exception e)
                {
                    
                }
            }
            
        });
        desc1.addActionListener(new ActionListener ()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                String message[] = new String[5];
                message[0] = "These Histograms show the frequency  ";
                message[1] = "of Particular range of temperature  ";
                message[2] = "attained , no of times in a month ";
                message[3] = "X-Axis : Temperature (in *c) ";
                message[4] = "Y-Axis : Frequency";
                describe1.showMessageDialog(null , message," Description ",1);
            }
            
        });
        desc2.addActionListener(new ActionListener ()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                String message[] = new String[7];
                message[0] = "These Plots show the Variation ";
                message[1] = "of the mean temperature of 12  ";
                message[2] = "months . this plots suggests  ";
                message[3] = "the low temperature month as winter ";
                message[4] = "and high temperature month as summer";
                message[5] = "X-Axis : Temperature (in *c) ";
                message[6] = "Y-Axis : Frequency";
                describe2.showMessageDialog(null , message," Description ",1);
            }
            
        });
        desc3.addActionListener(new ActionListener ()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                String message[] = new String[10];
                message[0] = " These 4 plots depict the variation";
                message[1] = "of temperature over the period of 110 years";
                message[2] = " - taken 3 months at a time . It also suggests";
                message[3] = "whether the state temperature is feasible for";
                message[4] = "the crop or not. It shows the feasible months";
                message[5] = "which lie in the maximum and minimum temperature";
                message[6] = "region - indicating the feasible months for crop";
                message[7] = "production";
                message[8] = " X-Axis - Year[1901-2010]";
                message[9] = " Y-Axis - Temperature (in *c)";
                describe3.showMessageDialog(null , message," Description ",1);
            }
            
        });
        desc4.addActionListener(new ActionListener ()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                String message[] = new String[9];
                message[0] = " The two coloured lines represent the ";
                message[1] = " maximum and minimum temperature range for the crop.";
                message[2] = " The Plot depicts whether the state temperature ";
                message[3] = "is feasible for the Crop or not. ";
                message[4] = "It shows the feasithe months which lie in the";
                message[5] = "maximum and minimum temperature region";
                message[6] = "which are feasible for Crops";
                message[7] = "X-Axis : Months (Jan-Dec)";
                message[8] = "Y-Axis : Temperature";
                describe4.showMessageDialog(null , message," Description ",1);
            }
            
        });
        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image2));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image3));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image4));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image5));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image6));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image7));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image8));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image9));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn10.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image10));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn11.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image11));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn12.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image12));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn13.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image13));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn14.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image14));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn15.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image15));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn16.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image16));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn17.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image17));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn18.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image18));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn19.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image19));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
    }
    
    public void func2()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label2.png";
        File f = new File(filePath);
        try 
        {
            image2 = ImageIO.read(f);
            Image imgAdjusted = image2.getScaledInstance(btn2.getWidth(), btn2.getHeight(),Image.SCALE_SMOOTH);
            btn2.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func3()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label3.png";
        File f = new File(filePath);
        try 
        {
            image3 = ImageIO.read(f);
            Image imgAdjusted = image3.getScaledInstance(btn3.getWidth(), btn3.getHeight(),Image.SCALE_SMOOTH);
            btn3.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func4()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label4.png";
        File f = new File(filePath);
        try 
        {
            image4 = ImageIO.read(f);
            Image imgAdjusted = image4.getScaledInstance(btn4.getWidth(), btn4.getHeight(),Image.SCALE_SMOOTH);
            btn4.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func5()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label5.png";
        File f = new File(filePath);
        try 
        {
            image5 = ImageIO.read(f);
            Image imgAdjusted = image5.getScaledInstance(btn5.getWidth(), btn5.getHeight(),Image.SCALE_SMOOTH);
            btn5.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func6()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label6.png";
        File f = new File(filePath);
        try 
        {
            image6 = ImageIO.read(f);
            Image imgAdjusted = image6.getScaledInstance(btn6.getWidth(), btn6.getHeight(),Image.SCALE_SMOOTH);
            btn6.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func7()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label7.png";
        File f = new File(filePath);
        try 
        {
            image7 = ImageIO.read(f);
            Image imgAdjusted = image7.getScaledInstance(btn7.getWidth(), btn7.getHeight(),Image.SCALE_SMOOTH);
            btn7.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    
    public void func8()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label8.png";
        File f = new File(filePath);
        try 
        {
            image8 = ImageIO.read(f);
            Image imgAdjusted = image8.getScaledInstance(btn8.getWidth(), btn8.getHeight(),Image.SCALE_SMOOTH);
            btn8.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func9()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label9.png";
        File f = new File(filePath);
        try 
        {
            image9 = ImageIO.read(f);
            Image imgAdjusted = image9.getScaledInstance(btn9.getWidth(), btn9.getHeight(),Image.SCALE_SMOOTH);
            btn9.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func10()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label10.png";
        File f = new File(filePath);
        try 
        {
            image10 = ImageIO.read(f);
            Image imgAdjusted = image10.getScaledInstance(btn10.getWidth(), btn10.getHeight(),Image.SCALE_SMOOTH);
            btn10.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func11()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label11.png";
        File f = new File(filePath);
        try 
        {
            image11 = ImageIO.read(f);
            Image imgAdjusted = image11.getScaledInstance(btn11.getWidth(), btn11.getHeight(),Image.SCALE_SMOOTH);
            btn11.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func12()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label12.png";
        File f = new File(filePath);
        try 
        {
            image12 = ImageIO.read(f);
            Image imgAdjusted = image12.getScaledInstance(btn12.getWidth(), btn12.getHeight(),Image.SCALE_SMOOTH);
            btn12.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func13()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label13.png";
        File f = new File(filePath);
        try 
        {
            image13 = ImageIO.read(f);
            Image imgAdjusted = image13.getScaledInstance(btn13.getWidth(), btn13.getHeight(),Image.SCALE_SMOOTH);
            btn13.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func14()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label14.png";
        File f = new File(filePath);
        try 
        {
            image14 = ImageIO.read(f);
            Image imgAdjusted = image14.getScaledInstance(btn14.getWidth(), btn14.getHeight(),Image.SCALE_SMOOTH);
            btn14.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func15()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label15.png";
        File f = new File(filePath);
        try 
        {
            image15 = ImageIO.read(f);
            Image imgAdjusted = image15.getScaledInstance(btn15.getWidth(), btn15.getHeight(),Image.SCALE_SMOOTH);
            btn15.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func16()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label16.png";
        File f = new File(filePath);
        try 
        {
            image16 = ImageIO.read(f);
            Image imgAdjusted = image16.getScaledInstance(btn16.getWidth(), btn16.getHeight(),Image.SCALE_SMOOTH);
            btn16.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func17()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label17.png";
        File f = new File(filePath);
        try 
        {
            image17 = ImageIO.read(f);
            Image imgAdjusted = image17.getScaledInstance(btn17.getWidth(), btn17.getHeight(),Image.SCALE_SMOOTH);
            btn17.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func18()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label18.png";
        File f = new File(filePath);
        try 
        {
            image18 = ImageIO.read(f);
            Image imgAdjusted = image18.getScaledInstance(btn18.getWidth(), btn18.getHeight(),Image.SCALE_SMOOTH);
            btn18.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func19()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Temperature\\label19.png";
        File f = new File(filePath);
        try 
        {
            image19 = ImageIO.read(f);
            Image imgAdjusted = image19.getScaledInstance(btn19.getWidth(), btn19.getHeight(),Image.SCALE_SMOOTH);
            btn19.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        desc1 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        desc2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        desc3 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        desc4 = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Analysis");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel19.setText("Frequency of Temperature reached in the months over the year");

        btn7.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Variation of Mean Temperature over the 12 months");

        desc1.setText("Description");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Variation of State Temperature from the year 1901 - 2010 Vs the Required Temperature Set");

        desc2.setText("Decsription");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setText("Temperature Required for the Crop Vs the State Temperature over the Year");

        desc3.setText("Description");

        desc4.setText("Description");

        Close.setText("Home");

        Exit.setText("Exit");

        Result.setText("Result");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)))
                                .addGap(148, 148, 148)
                                .addComponent(desc1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(desc2)
                                .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(desc4)
                                .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(Close)
                        .addGap(176, 176, 176)
                        .addComponent(Exit)
                        .addGap(125, 125, 125)
                        .addComponent(Result))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(desc3)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(desc1)
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desc2)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(desc4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Close)
                            .addComponent(Exit)
                            .addComponent(Result))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(desc3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1464, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tab4Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tab4Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tab4Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tab4Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() 
            {
                new Tab4Temperature().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Result;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton desc1;
    private javax.swing.JButton desc2;
    private javax.swing.JButton desc3;
    private javax.swing.JButton desc4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
