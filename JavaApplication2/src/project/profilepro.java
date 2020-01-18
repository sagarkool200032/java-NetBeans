/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JFrame;




/**
 *
 * @author mac
 */
public class profilepro extends javax.swing.JFrame {

    /**
     * Creates new form profilepro
     */
    public profilepro() {
        initComponents();
        
        setLayout(null);
        setSize(997, 745);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        l2.setText(loginpro.t1.getText());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        jLabel1.setText("profile");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(230, 120, 240, 110);

        jTextField1.setText("jTextField1");
        jPanel3.add(jTextField1);
        jTextField1.setBounds(150, 70, 80, 180);
        jPanel3.add(l2);
        l2.setBounds(120, 280, 90, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, -20, 550, 450);

        jMenu1.setText("        Home     ");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("           Movies           ");

        jCheckBoxMenuItem1.setText("Now Showing");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jMenuItem1.setText("Coming Soon");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("          Search            ");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setText("         Account        ");

        jMenuItem3.setText("Profile");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuItem4.setText("Settings");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        homepage.setVisible(true);

        settings.setVisible(false);

        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        dev.setVisible(false);
this.setVisible(false);
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
        NowShowing.setVisible(true);

        settings.setVisible(false);
        homepage.setVisible(false);

        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        dev.setVisible(false);
this.setVisible(false);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();
        comingsoon.setVisible(true);

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);

        search.setVisible(false);
        profile.setVisible(false);
        dev.setVisible(false);
this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
        search.setVisible(true);

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);

        profile.setVisible(false);
        dev.setVisible(false);
this.setVisible(false);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();
        profile.setVisible(true);

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);

        dev.setVisible(false);
this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        settingspro settings = new settingspro();
        homepagepro homepage = new homepagepro();
        NowShowingPro NowShowing = new NowShowingPro();
        logoutpro logout = new logoutpro();
        comingsoonpro comingsoon = new comingsoonpro();
        searchpro search = new searchpro();
        profilepro profile = new profilepro();
        devpro dev = new devpro();
        settings.setVisible(true);

        homepage.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        dev.setVisible(false);
this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
        dev.setVisible(true);

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);
        logout.setVisible(false);
        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
this.setVisible(false);
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
        logout.setVisible(true);

        settings.setVisible(false);
        homepage.setVisible(false);
        NowShowing.setVisible(false);

        comingsoon.setVisible(false);
        search.setVisible(false);
        profile.setVisible(false);
        dev.setVisible(false);
this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(profilepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profilepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profilepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profilepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profilepro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l2;
    // End of variables declaration//GEN-END:variables
}
