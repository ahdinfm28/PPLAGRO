/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import c.pasarc;
import c.supermarketc;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Farisya
 */
public class map extends javax.swing.JFrame {

    /**
     * Creates new form map
     */
    public map() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().width;
        int y = (int) tk.getScreenSize().height;
        this.setSize(x, y);
    }

    public void klikPasar(MouseListener a) {
        pasar.addMouseListener(a);
    }

    public void klikGudang(MouseListener a) {
        gudang.addMouseListener(a);
    }

    public void klikPabrik(MouseListener a) {
        pabrik.addMouseListener(a);
    }

    public void klikKembali(ActionListener action) {
        back.addActionListener(action);
    }

    public void setUang(String text) {
        this.labeluang.setText(text);
    }

    public void setNama(String t) {
        this.user.setText(t);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gudang = new javax.swing.JLabel();
        pabrik = new javax.swing.JLabel();
        pasar = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        labeluang = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(gudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 280, 440));

        pabrik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pabrik, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 470, 380));

        pasar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 380, 350));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/back.png"))); // NOI18N
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        labeluang.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        labeluang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeluang.setToolTipText("");
        getContentPane().add(labeluang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 160, 50));

        user.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/map.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1412, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/backhover.png"));
        back.setIcon(awal);        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/back.png"));
        back.setIcon(awal); 
    }//GEN-LAST:event_backMouseExited

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
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    public javax.swing.JLabel gudang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labeluang;
    public javax.swing.JLabel pabrik;
    public javax.swing.JLabel pasar;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
