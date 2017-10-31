/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.inpengolahan;
import v.mainmenu;
import v.pasarmap;

/**
 *
 * @author Farisya
 */
public class pengolahanc {

    String username;
    inpengolahan vpengolahan;

    public pengolahanc(String username) {
        this.username = username;
        this.vpengolahan = new inpengolahan();
        vpengolahan.setVisible(true);
        vpengolahan.klikKembali(new acttombolkembali());
    }

    private class acttombolkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                pasarmap v = new pasarmap();
                pasarc c = new pasarc(username);
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
