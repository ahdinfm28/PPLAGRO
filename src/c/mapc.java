/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import m.aset;
import m.pembelian;
import v.mainmenu;
import v.map;
import v.pasarmap;

/**
 *
 * @author Farisya
 */
public class mapc {

    map vmap;
    pasarmap vmappasar;
    String username;
    aset maset;
    pembelian mharga;
    int number;

    public mapc(String username) throws SQLException {
        this.username = username;
        this.maset = new aset();
        this.vmap = new map();
        this.mharga = new pembelian();
        vmap.setVisible(true);
        vmap.klikKembali(new acttombolkembali());
        vmap.klikGudang(new actTombolGudang());
        vmap.klikPasar(new actTombolPasar());
        vmap.klikPabrik(new actTombolPabrik());
        vmap.setUang(maset.getUang(username) + "");
        vmap.setNama(username);
        System.out.println(username);
    }

    private class acttombolkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                mainmenu v = new mainmenu();
                cmenu c = new cmenu(v);

            } catch (InterruptedException ex) {
                Logger.getLogger(cmenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class actTombolPasar implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            try {
                pasarmap v = new pasarmap();
                pasarc c = new pasarc(username);
                Random();
                vmap.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(mapc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/pasarh.png"));
            vmap.pasar.setIcon(awal);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/pasar.png"));
            vmap.pasar.setIcon(awal);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }
    }

    private class actTombolGudang implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/gudangh.png"));
            vmap.gudang.setIcon(awal);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/gudang.png"));
            vmap.gudang.setIcon(awal);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }
    }

    private class actTombolPabrik implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/rumahover.png"));
            vmap.pabrik.setIcon(awal);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/pabrik.png"));
            vmap.pabrik.setIcon(awal);
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }
    }

    public int Random() {
        Random random = new Random();
        for (int counter = 1; counter <= 1; counter++) {
            number = 1+random.nextInt(3);
        }
        System.out.println(number);
        if (number == 1) {
            mharga.deleteHarga();
            mharga.insertHarga1();
            System.out.println("harga1 diinputkan");
        } else if (number == 2) {
            mharga.deleteHarga();
            mharga.insertHarga2();
            System.out.println("harga2 diinputkan");
        } else if (number == 3) {
            mharga.deleteHarga();
            mharga.insertHarga3();
            System.out.println("harga3 diinputkan");
        }
          return number;
    }
}
