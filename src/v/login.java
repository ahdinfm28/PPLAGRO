/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Farisya
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(this);
        createAkun.setLocationRelativeTo(this);

    }

    public void klikKembali(ActionListener action) {
        back.addActionListener(action);
    }

    public void klikLogin(ActionListener action) {
        buttonlogin.addActionListener(action);
    }

    public void klikBuatAkun(ActionListener action) {
        buttoncreate.addActionListener(action);
    }

    public void klikTambahAkun(ActionListener a) {
        buttontambah.addActionListener(a);
    }

    public void klikBatal(ActionListener a) {
        buttonbatal.addActionListener(a);
    }

    public String getUsername() {
        String username = tf_uname.getText();
        System.out.println("' " + username + " '");
        return username;
    }


    public String getUsernameCreate() {
        String username = tf_createusername.getText();
        return username;
    }

    public void setUsernameCreate(String text) {
        this.tf_createusername.setText(text);
    }


    public void setUsername(String text) {
        this.tf_uname.setText(text);
    }


    public void tampilPesan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public void tampilPesanCreate(String pesan) {
        JOptionPane.showMessageDialog(createAkun, pesan);
    }

    public int tampilYesNo(String pesan) {
        return JOptionPane.showConfirmDialog(this, pesan, null, JOptionPane.YES_NO_OPTION);
    }

    public JFrame createAccount() {
        return createAkun;
    }

    public JButton createButton() {
        return buttoncreate;
    }

    public JButton cancelButton() {
        return buttonbatal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAkun = new javax.swing.JFrame();
        tf_createusername = new javax.swing.JTextField();
        buttontambah = new javax.swing.JButton();
        buttonbatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttoncreate = new javax.swing.JButton();
        buttonlogin = new javax.swing.JButton();
        back = new javax.swing.JButton();
        tf_uname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        createAkun.setMaximizedBounds(new java.awt.Rectangle(0, 0, 484, 519));
        createAkun.setUndecorated(true);
        createAkun.setSize(new java.awt.Dimension(439, 410));
        createAkun.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_createusername.setBackground(new java.awt.Color(255, 255, 204));
        tf_createusername.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        tf_createusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_createusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0)));
        createAkun.getContentPane().add(tf_createusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 320, 50));

        buttontambah.setBorder(null);
        buttontambah.setBorderPainted(false);
        buttontambah.setContentAreaFilled(false);
        buttontambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAkun.getContentPane().add(buttontambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 140, 50));

        buttonbatal.setBorder(null);
        buttonbatal.setBorderPainted(false);
        buttonbatal.setContentAreaFilled(false);
        buttonbatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAkun.getContentPane().add(buttonbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 130, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/buatakun.png"))); // NOI18N
        createAkun.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttoncreate.setBorder(null);
        buttoncreate.setBorderPainted(false);
        buttoncreate.setContentAreaFilled(false);
        buttoncreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(buttoncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 160, 70));

        buttonlogin.setBorder(null);
        buttonlogin.setBorderPainted(false);
        buttonlogin.setContentAreaFilled(false);
        buttonlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(buttonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 160, 70));

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 110, 90));

        tf_uname.setBackground(new java.awt.Color(255, 255, 204));
        tf_uname.setFont(new java.awt.Font("DFPOP1-W9", 0, 24)); // NOI18N
        tf_uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0)));
        getContentPane().add(tf_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 360, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/Login.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/backhover.png"));
        back.setIcon(awal);        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/back.png"));
        back.setIcon(awal);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton buttonbatal;
    private javax.swing.JButton buttoncreate;
    private javax.swing.JButton buttonlogin;
    private javax.swing.JButton buttontambah;
    private javax.swing.JFrame createAkun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tf_createusername;
    private javax.swing.JTextField tf_uname;
    // End of variables declaration//GEN-END:variables
}
