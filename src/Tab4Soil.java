
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

public class Tab4Soil extends javax.swing.JFrame 
{
    MainPage obj = new MainPage();
    String Crop = (String) obj.tab2crop.getSelectedItem();
    String State = (String) obj.tab1state.getSelectedItem();
    String Param = (String) obj.tab3param.getSelectedItem();
    BufferedImage image1;
    BufferedImage image2;
    JOptionPane describe;
    public Tab4Soil() 
    {
        initComponents();
        func1();
        func2();
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
                String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Soil\\readme.txt";
                
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
                message[0] = "The figure shows the states aligned according to the type of soil.";
                message[1] = "The types of soil found are -Alluvial , Black , Coastal Alluvial, ";
                message[2] = "Desert , Laterite ,Loamy , Mountain & Red Soil. ";
                message[3] = "X-Axis - Soil Type ";
                message[4] = "Y-Axis - No. of States aligned.";
                   
                describe.showMessageDialog(null , message," Description ",1);
            }
            
        });
        desc2.addActionListener(new ActionListener ()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                String message[] = new String[5];
                message[0] = " This plot shows the Required Crop Soil Vs State Soil.";
                message[1] = " if any one of the crop soil matches with the state soil, the plot produces a match. ";
                message[2] = " The Circle represents the feasible Crop Soils and Triangle represents the State Soil.";
                message[3] = " X-Axis - Soil Type ";
                message[4] = " Y-Axis - 1";
                
                describe.showMessageDialog(null , message," Description ",1);
            }
            
        });
        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                JFrame frm = new JFrame();
                frm.setSize(1200, 800);
                JLabel lbl = new JLabel();
                lbl.setBounds(0, 0, 1200 , 800);
                lbl.setIcon(new ImageIcon(image1));
                JScrollPane pane = new JScrollPane(lbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                frm.add(pane);
                frm.setVisible(true);
                frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
    }
    
    public void func1()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Soil\\label0.png";
        //System.out.println(filePath);
        File f = new File(filePath);
        try 
        {
            image1 = ImageIO.read(f);
            Image imgAdjusted = image1.getScaledInstance(btn1.getWidth(), btn1.getHeight(),Image.SCALE_SMOOTH);
            btn1.setIcon(new ImageIcon(imgAdjusted));
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
    public void func2()
    {
        String filePath = "C:\\Users\\Sharu\\Documents\\NetBeansProjects\\Projectfinal\\Images\\"+State+"\\"+Crop+"\\Soil\\label1.png";
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        desc1 = new javax.swing.JButton();
        desc2 = new javax.swing.JButton();
        Result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Soil Analysis");

        Close.setText("Home");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        Exit.setText("Exit");

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Depiction of different types of Soil found in different states");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Plot showing the Required Soil Vs  Crop Soil");

        desc1.setText("Description");

        desc2.setText("Description");

        Result.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Close)
                        .addGap(84, 84, 84)
                        .addComponent(Exit)
                        .addGap(92, 92, 92)
                        .addComponent(Result))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc1))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close)
                    .addComponent(Exit)
                    .addComponent(Result))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseActionPerformed

    
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
            java.util.logging.Logger.getLogger(Tab4Soil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tab4Soil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tab4Soil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tab4Soil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() 
            {
                JFrame frm = new Tab4Soil();
                frm.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Result;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton desc1;
    private javax.swing.JButton desc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
