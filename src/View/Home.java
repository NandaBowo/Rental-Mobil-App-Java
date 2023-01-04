/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuMobilBtn = new javax.swing.JButton();
        pinjamMobilBtn = new javax.swing.JButton();
        keluarBtn = new javax.swing.JButton();
        dataPinjamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homePnl.setBackground(new java.awt.Color(0, 255, 171));
        homePnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Rental Mobil");

        menuMobilBtn.setBackground(new java.awt.Color(51, 51, 255));
        menuMobilBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        menuMobilBtn.setForeground(new java.awt.Color(227, 252, 191));
        menuMobilBtn.setText("Menu Mobil");
        menuMobilBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuMobilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMobilBtnActionPerformed(evt);
            }
        });

        pinjamMobilBtn.setBackground(new java.awt.Color(51, 51, 255));
        pinjamMobilBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        pinjamMobilBtn.setForeground(new java.awt.Color(227, 252, 191));
        pinjamMobilBtn.setText("Pinjam Mobil");
        pinjamMobilBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinjamMobilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamMobilBtnActionPerformed(evt);
            }
        });

        keluarBtn.setBackground(new java.awt.Color(255, 0, 0));
        keluarBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 16)); // NOI18N
        keluarBtn.setForeground(new java.awt.Color(255, 255, 255));
        keluarBtn.setText("Keluar");
        keluarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });

        dataPinjamBtn.setBackground(new java.awt.Color(51, 51, 255));
        dataPinjamBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 16)); // NOI18N
        dataPinjamBtn.setForeground(new java.awt.Color(227, 252, 191));
        dataPinjamBtn.setText("Data Pinjam");
        dataPinjamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataPinjamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPinjamBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePnlLayout = new javax.swing.GroupLayout(homePnl);
        homePnl.setLayout(homePnlLayout);
        homePnlLayout.setHorizontalGroup(
            homePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePnlLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(homePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keluarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(homePnlLayout.createSequentialGroup()
                        .addComponent(menuMobilBtn)
                        .addGap(27, 27, 27)
                        .addComponent(pinjamMobilBtn)
                        .addGap(18, 18, 18)
                        .addComponent(dataPinjamBtn))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        homePnlLayout.setVerticalGroup(
            homePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(homePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuMobilBtn)
                    .addComponent(pinjamMobilBtn)
                    .addComponent(dataPinjamBtn))
                .addGap(18, 18, 18)
                .addComponent(keluarBtn)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMobilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMobilBtnActionPerformed
        try {
            // TODO add your handling code here:
            CarList cl = new CarList();
            
            this.setVisible(false);
            cl.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuMobilBtnActionPerformed

    private void pinjamMobilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamMobilBtnActionPerformed
        // TODO add your handling code here:
        CarRent cr = new CarRent();
        
        this.setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_pinjamMobilBtnActionPerformed

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarBtnActionPerformed

    private void dataPinjamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPinjamBtnActionPerformed
        // TODO add your handling code here:
        RentList rl = new RentList();
        
        this.setVisible(false);
        rl.setVisible(true);
    }//GEN-LAST:event_dataPinjamBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataPinjamBtn;
    private javax.swing.JPanel homePnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JButton menuMobilBtn;
    private javax.swing.JButton pinjamMobilBtn;
    // End of variables declaration//GEN-END:variables
}
