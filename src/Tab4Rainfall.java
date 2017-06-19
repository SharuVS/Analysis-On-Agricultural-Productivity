
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class Tab4Rainfall extends javax.swing.JFrame 
{
    MainPage obj = new MainPage();
    String Crop = (String) obj.tab2crop.getSelectedItem();
    String State = (String) obj.tab1state.getSelectedItem();
    String Param = (String) obj.tab3param.getSelectedItem();
    BufferedImage image20,image21,image22,image23,image24,image25,image26,image27;
    JOptionPane describe;
    JOptionPane describe1;
    JOptionPane describe2;
   
    public Tab4Rainfall() 
    {
        initComponents();
        
        func20();
        func21();
        func22();
        func23();
        func24();
        func25();
        func26();
        func27();
        
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
                String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\readme.txt";
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
                String message[] = new String[7];
                message[0] = "These 7 plots depict the Month-wise Rainfall ";
                message[1] = "Measurements in the years 2004 , 2005 ,2006";
                message[2] = "2007 , 2008 , 2009, 2010 - respectively.";
                message[3] = "The points showing peaks represent the  ";
                message[4] = "rainfall in the monsoon season";
                message[5] = "X-Axis : Months";
                message[6] = "Y-Axis : Rainfall( in CM)";
                describe1.showMessageDialog(null , message," Description ",1);
            }
            
        });
        desc2.addActionListener(new ActionListener ()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                String message[] = new String[10];
                message[0] = "The two coloured lines represent the ";
                message[1] = "maximum and minimum rainfall range";
                message[2] = "This plot depicts whether the state";
                message[3] = "rainfall is feasible for the crop or not";
                message[4] = "It shows the feasible months which ";
                message[5] = "lie in the maximum and minimum rainfall ";
                message[6] = "showing the feasible months for the crop ";
                message[7] = "production";
                message[8] = "X-Axis : Months";
                message[9] = "Y-Axis : Rainfall( in CM)";
                describe2.showMessageDialog(null , message," Description ",1);
            }
            
        });
        
        btn20.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image20));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn21.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image21));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn22.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image22));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn23.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image23));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn24.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image24));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn25.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image25));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn26.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image26));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        btn27.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image27));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
            
        });
        
    }
    
    public void func20()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\label20.png";
        File f = new File(filePath);
        try 
        {
            image20 = ImageIO.read(f);
            Image imgAdjusted = image20.getScaledInstance(btn20.getWidth(), btn20.getHeight(),Image.SCALE_SMOOTH);
            btn20.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func21()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\label21.png";
        File f = new File(filePath);
        try 
        {
            image21 = ImageIO.read(f);
            Image imgAdjusted = image21.getScaledInstance(btn21.getWidth(), btn21.getHeight(),Image.SCALE_SMOOTH);
            btn21.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func22()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\label22.png";
        File f = new File(filePath);
        try 
        {
            image22 = ImageIO.read(f);
            Image imgAdjusted = image22.getScaledInstance(btn22.getWidth(), btn22.getHeight(),Image.SCALE_SMOOTH);
            btn22.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func23()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\label23.png";
        File f = new File(filePath);
        try 
        {
            image23 = ImageIO.read(f);
            Image imgAdjusted = image23.getScaledInstance(btn23.getWidth(), btn23.getHeight(),Image.SCALE_SMOOTH);
            btn23.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func24()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\label24.png";
        File f = new File(filePath);
        try 
        {
            image24 = ImageIO.read(f);
            Image imgAdjusted = image24.getScaledInstance(btn24.getWidth(), btn24.getHeight(),Image.SCALE_SMOOTH);
            btn24.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func25()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\label25.png";
        File f = new File(filePath);
        try 
        {
            image25 = ImageIO.read(f);
            Image imgAdjusted = image25.getScaledInstance(btn25.getWidth(), btn25.getHeight(),Image.SCALE_SMOOTH);
            btn25.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    
    public void func26()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\label26.png";
        File f = new File(filePath);
        try 
        {
            image26 = ImageIO.read(f);
            Image imgAdjusted = image26.getScaledInstance(btn26.getWidth(), btn26.getHeight(),Image.SCALE_SMOOTH);
            btn26.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func27()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Rainfall\\label27.png";
        File f = new File(filePath);
        try 
        {
            image27 = ImageIO.read(f);
            Image imgAdjusted = image27.getScaledInstance(btn27.getWidth(), btn27.getHeight(),Image.SCALE_SMOOTH);
            btn27.setIcon(new ImageIcon(imgAdjusted));
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
        jLabel1 = new javax.swing.JLabel();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        desc1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn27 = new javax.swing.JButton();
        desc2 = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rainfall Analysis");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Month-wise Rainfall from 2004-2010");

        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        desc1.setText("Description");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setText("Rainfall Required for the Crop Vs the State Rainfall ");

        desc2.setText("Description");

        Close.setText("Home");

        Exit.setText("Exit");

        Result.setText("Result");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desc1)
                .addGap(211, 211, 211))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(121, 121, 121)
                                    .addComponent(Close)
                                    .addGap(155, 155, 155)
                                    .addComponent(Exit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Result))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(desc2)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 335, Short.MAX_VALUE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn26, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(btn25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 34, 34)
                .addComponent(desc1)
                .addGap(88, 88, 88)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Close)
                            .addComponent(Exit)
                            .addComponent(Result))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(desc2)
                        .addGap(106, 106, 106))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn25ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Tab4Rainfall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tab4Rainfall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tab4Rainfall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tab4Rainfall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new Tab4Rainfall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Result;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton desc1;
    private javax.swing.JButton desc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
