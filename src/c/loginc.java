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
import m.aset;
import m.pembelian;
import m.pengolahan;
import m.player;
import v.login;
import v.mainmenu;
import v.map;

/**
 *
 * @author Farisya
 */
public class loginc {

    mapc vmap;
    player mplayer;
    aset maset;
    login vlogin;
    mainmenu vmain;
    cmenu menu;
    pembelian mbeli;
    pengolahan molah;

    public loginc() throws SQLException {

        this.vlogin = new login();
        this.mplayer = new player();
        this.maset = new aset();
        this.mbeli = new pembelian();
        this.molah = new pengolahan();
        vlogin.setVisible(true);
        vlogin.klikLogin(new acttombolLogin());
        vlogin.klikKembali(new acttombolKembali());
        vlogin.klikBuatAkun(new acttombolCreate());
        vlogin.klikTambahAkun(new acttombolTambahAkun());
        vlogin.klikBatal(new acttombolBatal());
    }

    private class acttombolKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                vlogin.dispose();
                mainmenu v = new mainmenu();
                cmenu c = new cmenu(v);

//  vlogin.dispose();
//vmain.enable();
//  mainmenu v = new mainmenu();
            } catch (InterruptedException ex) {
                Logger.getLogger(loginc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String uname = vlogin.getUsername();
                if (vlogin.getUsername().isEmpty()) {
                    vlogin.tampilPesan("Username gabole kosong");
                } else if (vlogin.getPassword().isEmpty()) {
                    vlogin.tampilPesan("Password gabole kosong");
                } else if (mplayer.getPlayer(vlogin.getUsername(), vlogin.getPassword())) {
                    map v = new map();
                    new mapc(uname, v);
                    System.out.println(uname);
                    vlogin.dispose();
                } else {
                    vlogin.tampilPesan("Username/Password Salah");
                    vlogin.setUsername("");
                    vlogin.setPassword("");
                }
            } catch (SQLException ex) {
                System.out.println("ada sesuatu");
            }
        }

    }

    private class acttombolCreate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vlogin.createAccount().setVisible(true);
            System.out.println("coba");
            vlogin.disable();
        }
    }

    private class acttombolTambahAkun implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int idPlayer = mplayer.cekIdP();
                String uname = vlogin.getUsernameCreate();
                String pass = vlogin.getPasswordCreate();
                System.out.println(uname);
                if (uname.equals("")) {
                    vlogin.tampilPesanCreate("username harus diisi");
                } else if (pass.equals("")) {
                    vlogin.tampilPesanCreate("password harus diisi");
                } else if (vlogin.getUsernameCreate().equals(mplayer.cekUsername(uname))) {
                    vlogin.tampilPesanCreate("Username telah digunakan!");
                } else {
                    mplayer.insertPlayer(idPlayer, vlogin.getUsernameCreate(), vlogin.getPasswordCreate());
                    maset.insertAset(maset.cekIdAset(), idPlayer);
                    mbeli.insertBeliBuah(String.valueOf(idPlayer));
                    mbeli.insertBeliBahan(String.valueOf(idPlayer));
                    molah.insertHasilOlah(String.valueOf(idPlayer));
                    vlogin.tampilPesanCreate("Akun berhasil dibuat");
                    vlogin.setUsernameCreate("");
                    vlogin.setPasswordCreate("");
                    vlogin.createAccount().setVisible(false);
                    vlogin.enable();
                    System.out.println("isine" + mplayer.cekUsername(vlogin.getUsernameCreate()));
                }
            } catch (SQLException ex) {
                Logger.getLogger(loginc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class acttombolBatal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vlogin.enable();
            vlogin.createAccount().dispose();
        }
    }
}
