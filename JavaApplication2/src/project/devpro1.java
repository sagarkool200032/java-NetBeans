/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.Statement;  
import java.sql.ResultSet;  
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class devpro1 extends javax.swing.JFrame {

    /**
     * Creates new form devpro1
     */
    public devpro1() {
        initComponents();
        
        setLayout(null);
        setSize(997, 745);
        
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/mac/Desktop/MySql/IP/pro/small logo.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 210, 130);

        p1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr_no", "Movie_Name", "Time", "Location", "Cinema"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(p1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 40, 780, 580);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Cinema:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 350, 100, 20);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Time:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 270, 38, 17);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Movie Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 230, 100, 16);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Location:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 310, 100, 16);
        getContentPane().add(t5);
        t5.setBounds(110, 340, 90, 26);
        getContentPane().add(t1);
        t1.setBounds(110, 180, 90, 26);
        getContentPane().add(t2);
        t2.setBounds(110, 220, 90, 26);
        getContentPane().add(t3);
        t3.setBounds(110, 260, 90, 26);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4);
        t4.setBounds(110, 300, 90, 26);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Sr no:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 190, 40, 17);

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 450, 97, 29);

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(900, 630, 93, 29);

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton3.setText("ENTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 400, 88, 29);

        jButton4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(50, 500, 94, 29);

        jButton5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton5.setText("FETCH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(540, 630, 93, 29);

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/mac/Desktop/MySql/IP/pro/bg.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(780, 0, 390, 400);

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/mac/Desktop/MySql/IP/pro/bg.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(690, 390, 390, 400);

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/mac/Desktop/MySql/IP/pro/bg.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 0, 390, 400);

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/mac/Desktop/MySql/IP/pro/bg.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 390, 400);

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/mac/Desktop/MySql/IP/pro/bg.png")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 400, 390, 400);

        jLabel12.setIcon(new javax.swing.ImageIcon("/Users/mac/Desktop/MySql/IP/pro/bg.png")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 390, 390, 400);

        jMenuBar1.setForeground(new java.awt.Color(9, 0, 0));

        jMenu1.setText("                   Home                   ");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Home");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("                           Movies           ");

        jCheckBoxMenuItem1.setText("Now Showing");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("                                 Search            ");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Search");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("                            Account                                      ");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Dev");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Logout");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();

        settings.setVisible(false);
        dev.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        this.setVisible(false);

        homepage.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();

        settings.setVisible(false);

        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        dev.setVisible(false);
        this.setVisible(false);

        homepage.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:

        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();

        settings.setVisible(false);
        homepage.setVisible(false);

        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        dev.setVisible(false);
        this.setVisible(false);

        NowShowing.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);

        profile.setVisible(false);
        dev.setVisible(false);
        this.setVisible(false);

        search.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handlin
        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);

        profile.setVisible(false);
        dev.setVisible(false);
        this.setVisible(false);

        search.setVisible(true);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        this.setVisible(false);

        dev.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:

        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);

        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        dev.setVisible(false);
        this.setVisible(false);

        logout.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {
            
            Class.forName("java.sql.Driver");
            
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school?zeroDateTimeBehavior=convertToNull"
                    ,"root","1Dtsalon"); 
      String ta,tb,tc,td,te;
        ta=t1.getText();
        tb=t2.getText();
        tc=t3.getText();
        td=t4.getText();
        te=t5.getText();
    // code to execute SQL queries goes here...
     
     
                String sql = "INSERT INTO Movies (Sr_no,Movie_Name,Time,Location,Cinema) VALUES (?, ?, ?, ?, ?)";
 
                
PreparedStatement statement = conn.prepareStatement(sql);
statement.setString(1, ta);
statement.setString(2, tb);
statement.setString(3, tc);
 statement.setString(4, td);
 statement.setString(5, te);
 
int rowsInserted = statement.executeUpdate();
if (rowsInserted > 0) {
    JOptionPane.showMessageDialog(this,"A new user was inserted successfully!");
    
    
    
}   
}catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error");
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)p1.getModel();
        try{
            Class.forName("java.sql.Driver");
            
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school?zeroDateTimeBehavior=convertToNull"
                    ,"root","1Dtsalon");
            Statement stmt=conn.createStatement();
            String query="Select * from movies;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                String d1,d2,d3,d4,d5;
                d1=rs.getString("Sr_no");
                d2=rs.getString("Movie_Name");
                d3=rs.getString("Time");
                d4=rs.getString("Location");
                d5=rs.getString("Cinema");
                model.addRow(new Object[]{d1,d2,d3,d4,d5});
              
            }
            model.addRow(new Object[]{"","",""});
            rs.close();
            stmt.close();
            conn.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
            Class.forName("java.sql.Driver");
            
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school?zeroDateTimeBehavior=convertToNull"
                    ,"root","1Dtsalon"); 
      String ta,tb,tc,td,te;
        ta=t1.getText();
        tb=t2.getText();
        tc=t3.getText();
        td=t4.getText();
        te=t5.getText();
    // code to execute SQL queries goes here...
     
     
                String sql = "UPDATE movies SET Movie_Name=?,Time=?, location=?,Cinema=? WHERE Sr_no=?";
 
                
PreparedStatement statement = conn.prepareStatement(sql);
statement.setString(1, tb);
statement.setString(2, tc);
statement.setString(3, td);
 statement.setString(4, te);
 statement.setString(5, ta);
 
int rowsInserted = statement.executeUpdate();
if (rowsInserted > 0) {
    JOptionPane.showMessageDialog(this,"Update Sucessful");
    
    
    
}   
}catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error");
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         try {
            
            Class.forName("java.sql.Driver");
            
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school?zeroDateTimeBehavior=convertToNull"
                    ,"root","1Dtsalon"); 
      String ta,tb,tc;
        ta=t1.getText();
        tb=t2.getText();
        tc=t3.getText();
    // code to execute SQL queries goes here...
     
     
                String sql = "DELETE FROM Movies WHERE Sr_no=?";
 
                
PreparedStatement statement = conn.prepareStatement(sql);
statement.setString(1, ta);

 
int rowsDeleted = statement.executeUpdate();
if (rowsDeleted > 0) {
    JOptionPane.showMessageDialog(this,"deleted successfully!");
    
    
    
}   
}catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error");
}
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        
        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();
                
                
               settings.setVisible(false);
               homepage.setVisible(false);
               NowShowing.setVisible(false);
               logout.setVisible(false);
               comingsoon.setVisible(false);
               
               profile.setVisible(false);
               dev.setVisible(false);
               this.setVisible(false);
               
               search.setVisible(true);        // TODO add your
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(devpro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(devpro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(devpro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(devpro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new devpro1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable p1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
