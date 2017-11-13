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
import javax.swing.JOptionPane;
import m.aset;
import m.pembelian;
import m.pengolahan;
import m.player;
import v.inpengolahan;
import v.mainmenu;
import v.map;
import v.pasarmap;

/**
 *
 * @author Farisya
 */
public class pengolahanc {

    String username;
    aset maset;
    inpengolahan vpengolahan;
    pembelian mbeli;
    pengolahan molah;
    player mplayer;
    int kualitas = 1;
    int jml = 1, jmlproduk = 1;
    int apel, pisang, melon, semangka, mangga;
    int susu, minyak, gula, mayo, mentega, sirup, tepungt, tepungb, pengembang, telur;
    boolean stjusmelon = false, stjusmangga = false, stjusapel = false, stjussemangka = false, stjuspisang = false;
    boolean stkripikapel = false, stkripikpisang = false, stkripikmangga = false;
    boolean stbrownismelon = false, stbrownisapel = false, stbrownismangga = false, stbrownispisang = false, stbrownissemangka = false;
    boolean stesbuah = false, stsaladbuah = false, stsale = false;
    int jusmelon, jusmangga, jusapel, juspisang, jussemangka, kripikapel, kripikpisang, kripikmangga;
    int brownismelon, brownisapel, brownismangga, brownispisang, brownissemangka, esbuah, saladbuah, sale;

    public pengolahanc(String username) throws SQLException {
        this.username = username;
        this.vpengolahan = new inpengolahan();
        this.maset = new aset();
        this.mplayer = new player();
        this.molah = new pengolahan();
        vpengolahan.setVisible(true);
        vpengolahan.klikKembali(new acttombolkembali());
        vpengolahan.klikNext(new acttombolnext());
        vpengolahan.klikPrevious(new acttombolprevious());
        vpengolahan.klikBatal(new acttombolbatal());
        vpengolahan.klikKanan(new acttombolKanan());
        vpengolahan.klikKiri(new acttombolKiri());
        vpengolahan.klikOlah(new acttombolOlah());

        vpengolahan.klikJusMelon(new acttombolJusMelon());
        vpengolahan.klikJusApel(new acttombolJusApel());
        vpengolahan.klikJusMangga(new acttombolJusMangga());
        vpengolahan.klikJusSemangka(new acttombolJusSemangka());
        vpengolahan.klikJusPisang(new acttombolJusPisang());
        vpengolahan.klikBrownisApel(new acttombolBrownisApel());
        vpengolahan.klikBrownisMangga(new acttombolBrownisMangga());
        vpengolahan.klikBrownisMelon(new acttombolBrownisMelon());
        vpengolahan.klikBrownisPisang(new acttombolBrownisPisang());
        vpengolahan.klikBrownisSemangka(new acttombolBrownisSemangka());
        vpengolahan.klikKripikApel(new acttombolKripikApel());
        vpengolahan.klikKripikMangga(new acttombolKripikMangga());
        vpengolahan.klikKripikPisang(new acttombolKripikPisang());
        vpengolahan.klikEsBuah(new acttombolEsbuah());
        vpengolahan.klikSaladBuah(new acttombolSaladBuah());
        vpengolahan.klikSalePisang(new acttombolSalePisang());

        apel = vpengolahan.setJmlApel(maset.getJmlBuahAll(username, 1));
        mangga = vpengolahan.setJmlMangga(maset.getJmlBuahAll(username, 3));
        pisang = vpengolahan.setJmlPisang(maset.getJmlBuahAll(username, 2));
        melon = vpengolahan.setJmlMelon(maset.getJmlBuahAll(username, 5));
        semangka = vpengolahan.setJmlSemangka(maset.getJmlBuahAll(username, 4));
        susu = vpengolahan.setJmlSusu(maset.getJmlBahan(username, 8));
        minyak = vpengolahan.setJmlMinyak(maset.getJmlBahan(username, 3));
        gula = vpengolahan.setJmlGula(maset.getJmlBahan(username, 1));
        telur = vpengolahan.setJmlTelur(maset.getJmlBahan(username, 7));
        pengembang = vpengolahan.setJmlPengembang(maset.getJmlBahan(username, 9));
        tepungt = vpengolahan.setJmlTepungT(maset.getJmlBahan(username, 10));
        tepungb = vpengolahan.setJmlTepungB(maset.getJmlBahan(username, 2));
        sirup = vpengolahan.setJmlSirup(maset.getJmlBahan(username, 5));
        mayo = vpengolahan.setJmlMayo(maset.getJmlBahan(username, 6));
        mentega = vpengolahan.setJmlMentega(maset.getJmlBahan(username, 4));

        cekkomposisi();
    }

    private class acttombolkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                map v = new map();
                mapc c = new mapc(username);
                vpengolahan.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class acttombolnext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vpengolahan.setVisible(false);
            vpengolahan.nextpengolahan().setVisible(true);
        }
    }

    private class acttombolprevious implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vpengolahan.setVisible(true);
            vpengolahan.nextpengolahan().setVisible(false);
        }
    }

    public void cekkomposisi() {
        if (melon < 1 || gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownismelon.setEnabled(false);
        } else if (melon >= 1 && gula >= 30 && mentega >=6  && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownismelon.setEnabled(true);
        }
        if (semangka < 1 || gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownissemangka.setEnabled(false);
        } else if (semangka >= 1 && gula >= 30 && mentega >=6  && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownissemangka.setEnabled(true);
        }
        if (pisang < 1 ||gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownispisang.setEnabled(false);
        } else if (pisang >= 1 && gula >= 30 && mentega >=6  && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownispisang.setEnabled(true);
        }
        if (apel < 1 || gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownisapel.setEnabled(false);
        } else if (apel >= 1 && gula >= 30 && mentega >=6  && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownisapel.setEnabled(true);
        }
        if (mangga < 1 ||gula < 30 || mentega < 6 || tepungt < 40 || telur < 10 || pengembang < 1) {
            vpengolahan.btnbrownismangga.setEnabled(false);
        } else if (mangga >= 1 && gula >= 30 && mentega >=6  && tepungt >= 40 && telur >= 10 && pengembang >= 1) {
            vpengolahan.btnbrownismangga.setEnabled(true);
        }
        if (melon < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjusmelon.setEnabled(false);
        } else if (melon >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjusmelon.setEnabled(true);
        }
        if (pisang < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjuspisang.setEnabled(false);
        } else if (pisang >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjuspisang.setEnabled(true);
        }
        if (semangka < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjussemangka.setEnabled(false);
        } else if (semangka >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjussemangka.setEnabled(true);
        }
        if (apel < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjusapel.setEnabled(false);
        } else if (apel >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjusapel.setEnabled(true);
        }
        if (mangga < 1 || susu < 10 || gula < 20) {
            vpengolahan.btnjusmangga.setEnabled(false);
        } else if (mangga >= 1 && susu >= 10 && gula >= 20) {
            vpengolahan.btnjusmangga.setEnabled(true);
        }
        if (apel < 1 || minyak < 3 || gula<10) {
            vpengolahan.btnkripikapel.setEnabled(false);
        } else if (apel >= 1 && minyak >= 1 && gula>=10) {
            vpengolahan.btnkripikapel.setEnabled(true);
        }
        if (pisang < 1 || minyak < 3 || gula<10) {
            vpengolahan.btnkripikpisang.setEnabled(false);
        } else if (pisang >= 1 && minyak >= 1 && gula>=10) {
            vpengolahan.btnkripikpisang.setEnabled(true);
        }
        if (mangga < 1 || minyak < 3 || gula<10) {
            vpengolahan.btnkripikmangga.setEnabled(false);
        } else if (mangga >= 1 && minyak >= 1 && gula>=10) {
            vpengolahan.btnkripikmangga.setEnabled(true);
        }
        if (pisang < 1 || minyak < 5 || mentega < 1 || tepungb < 1 || tepungt < 12 || gula<25) {
            vpengolahan.btnsalepisang.setEnabled(false);
        } else if (pisang >= 1 && minyak >= 5 && mentega >= 1 && tepungb >= 1 && tepungt >= 12 && gula>=25) {
            vpengolahan.btnsalepisang.setEnabled(true);
        }
        if (apel < 1 || melon < 1 || mangga < 1 || semangka < 1 || susu < 25 || mayo < 13) {
            vpengolahan.btnsaladbuah.setEnabled(false);
        } else if (apel >= 1 && melon >= 1 && mangga >= 1 && semangka >= 1 && susu >= 25 && mayo >= 13) {
            vpengolahan.btnsaladbuah.setEnabled(true);
        }
        if (apel < 1 || melon < 1 || mangga < 1 || semangka < 1 || sirup < 1) {
            vpengolahan.btnesbuah.setEnabled(false);
        } else if (apel >= 1 && melon >= 1 && mangga >= 1 && semangka >= 1 && sirup >= 1) {
            vpengolahan.btnesbuah.setEnabled(true);
        }
    }

    private class acttombolJusMelon implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("POP UP PENGOLAHAN");
            stjusmelon = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/melon.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);

        }
    }

    private class acttombolJusMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stjusmangga = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mangga.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolJusApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stjusapel = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/apel.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolJusSemangka implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stjussemangka = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/semangka.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolJusPisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stjuspisang = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolKripikPisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stkripikpisang = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolKripikApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stkripikapel = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/apel.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolKripikMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stkripikmangga = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mangga.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisMangga implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownismangga = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/mangga.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisApel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownisapel = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/apel.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisPisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownispisang = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisSemangka implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownissemangka = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/semangka.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolBrownisMelon implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stbrownismelon = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/melon.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolSalePisang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stsale = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/pisang.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolSaladBuah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stsaladbuah = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/saladbuah.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private class acttombolEsbuah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stesbuah = true; //untuk pengecekan di tombol belinya nanti
            vpengolahan.popup().setVisible(true);
            vpengolahan.enable();
            vpengolahan.setGambar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/esbuah.png")));
            vpengolahan.setTeksKualitas("Baik");
            vpengolahan.left.setVisible(false);
            vpengolahan.right.setVisible(true);
        }
    }

    private void JusMelonAction() throws SQLException, InterruptedException {
        int idbuah = 5;
        int idproduk = 4;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                melon = melon - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, melon);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 10));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlMelon(melon);
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void JusApelAction() throws SQLException, InterruptedException {
        int idbuah = 1;
        int idproduk = 1;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                apel = apel - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, apel);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 10));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlApel(apel);
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void JusSemangkaAction() throws SQLException, InterruptedException {
        int idbuah = 1;
        int idproduk = 4;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                semangka = semangka - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, semangka);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 10));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlSemangka(semangka);
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void JusPisangAction() throws SQLException, InterruptedException {
        int idbuah = 2;
        int idproduk = 2;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                pisang = pisang - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, pisang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 10));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlPisang(pisang);
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void JusManggaAction() throws SQLException, InterruptedException {
        int idbuah = 3;
        int idproduk = 3;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                mangga = mangga - 1;
                susu = susu - 10;
                gula = gula - 20;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, mangga);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 8, susu);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 10));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlMangga(mangga);
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlGula(gula);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisManggaAction() throws SQLException, InterruptedException {
        int idbuah = 3;
        int idproduk = 13;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                mangga = mangga - 1;
                mentega = mentega - 6;
                gula = gula - 40;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, mangga);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 4, mentega);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 10, tepungt);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 9, pengembang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlMangga(mangga);
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisMelonAction() throws SQLException, InterruptedException {
        int idbuah = 5;
        int idproduk = 11;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                melon = melon - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, melon);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 4, mentega);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 10, tepungt);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 9, pengembang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlMelon(melon);
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisSemangkaAction() throws SQLException, InterruptedException {
        int idbuah = 4;
        int idproduk = 12;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                semangka = semangka - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, semangka);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 4, mentega);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 10, tepungt);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 9, pengembang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlSemangka(semangka);
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisPisangAction() throws SQLException, InterruptedException {
        int idbuah = 2;
        int idproduk = 9;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                pisang = pisang - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, pisang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 4, mentega);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 10, tepungt);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 9, pengembang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlPisang(pisang);
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void BrownisApelAction() throws SQLException, InterruptedException {
        int idbuah = 1;
        int idproduk = 10;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                apel = apel - 1;
                mentega = mentega - 6;
                gula = gula - 30;
                pengembang = pengembang - 1;
                telur = telur - 10;
                tepungt = tepungt - 40;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, apel);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 4, mentega);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 10, tepungt);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 9, pengembang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 7, telur);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 4));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlApel(apel);
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlTelur(telur);
                vpengolahan.setJmlPengembang(pengembang);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void KripikApelAction() throws SQLException, InterruptedException {
        int idbuah = 1;
        int idproduk = 6;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                apel = apel - 1;
                minyak = minyak - 3;
                gula = gula - 10;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, apel);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 3, minyak);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 3));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlApel(apel);
                vpengolahan.setJmlMinyak(minyak);
                vpengolahan.setJmlGula(gula);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void KripikPisangAction() throws SQLException, InterruptedException {
        int idbuah = 2;
        int idproduk = 8;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                pisang = pisang - 1;
                minyak = minyak - 3;
                gula=gula-10;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, pisang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 3, minyak);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 3));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlPisang(pisang);
                vpengolahan.setJmlMinyak(minyak);
                vpengolahan.setJmlGula(gula);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void KripikManggaAction() throws SQLException, InterruptedException {
        int idbuah = 3;
        int idproduk = 7;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                mangga = mangga - 1;
                minyak = minyak - 3;
                gula = gula - 10;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, mangga);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 3, minyak);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 3));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlMangga(mangga);
                vpengolahan.setJmlMinyak(minyak);
                vpengolahan.setJmlGula(gula);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void SalePisangAction() throws SQLException, InterruptedException {
        int idbuah = 2;
        int idproduk = 14;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int cekkualitas = maset.getKualitasBuah(username, idbuah, getIdKualitas);
        if (cekkualitas >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                pisang = pisang - 1;
                minyak = minyak - 5;
                mentega = mentega - 1;
                tepungb = tepungb - 1;
                tepungt = tepungt - 12;
                gula = gula - 25;
                molah.updateStokBuah(mplayer.getIdPlayer(username), idbuah, getIdKualitas, pisang);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 3, minyak);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 10, tepungt);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 2, tepungb);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 4, mentega);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 1, gula);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 3));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlPisang(pisang);
                vpengolahan.setJmlMinyak(minyak);
                vpengolahan.setJmlMentega(mentega);
                vpengolahan.setJmlTepungT(tepungt);
                vpengolahan.setJmlGula(gula);
                vpengolahan.setJmlTepungB(tepungb);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else {
            vpengolahan.tampilPesan2("Anda tidak memiliki buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void EsBuahAction() throws SQLException, InterruptedException {
        int idproduk = 15;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int kualitasapel = maset.getKualitasBuah(username, 1, getIdKualitas);
        int kualitasmangga = maset.getKualitasBuah(username, 3, getIdKualitas);
        int kualitassemangka = maset.getKualitasBuah(username, 4, getIdKualitas);
        int kualitasmelon = maset.getKualitasBuah(username, 5, getIdKualitas);
        if (kualitasapel >= 1 && kualitasmangga >= 1 && kualitassemangka >= 1 && kualitasmelon >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                melon = melon - 1;
                mangga = mangga - 1;
                apel = apel - 1;
                semangka = semangka - 1;
                sirup = sirup - 1;
                molah.updateStokBuah(mplayer.getIdPlayer(username), 1, getIdKualitas, apel);
                molah.updateStokBuah(mplayer.getIdPlayer(username), 3, getIdKualitas, mangga);
                molah.updateStokBuah(mplayer.getIdPlayer(username), 4, getIdKualitas, semangka);
                molah.updateStokBuah(mplayer.getIdPlayer(username), 5, getIdKualitas, melon);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 5, sirup);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 50));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlApel(apel);
                vpengolahan.setJmlSemangka(semangka);
                vpengolahan.setJmlMangga(mangga);
                vpengolahan.setJmlMelon(melon);
                vpengolahan.setJmlSirup(sirup);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else if (kualitasapel < 1 && kualitasmangga < 1 && kualitassemangka < 1 && kualitasmelon < 1) {
            vpengolahan.tampilPesan2("Anda tidak memiliki beberapa buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private void SaladBuahAction() throws SQLException, InterruptedException {
        int idproduk = 16;
        int getIdKualitas = Integer.valueOf(maset.getIdKualitas(vpengolahan.getTeksKualitas()));
        System.out.println(getIdKualitas);
        int kualitasapel = maset.getKualitasBuah(username, 1, getIdKualitas);
        int kualitasmangga = maset.getKualitasBuah(username, 3, getIdKualitas);
        int kualitassemangka = maset.getKualitasBuah(username, 4, getIdKualitas);
        int kualitasmelon = maset.getKualitasBuah(username, 5, getIdKualitas);
        if (kualitasapel >= 1 && kualitasmangga >= 1 && kualitassemangka >= 1 && kualitasmelon >= 1) {
            int Pilih = JOptionPane.showConfirmDialog(null, "Anda jadi mengolah?", "Konfirmasi Pengolahan", JOptionPane.YES_NO_OPTION);
            if (Pilih == 0) {
                melon = melon - jml;
                mangga = mangga - jml;
                apel = apel - jml;
                semangka = semangka - jml;
                susu = susu - 25;
                mayo = mayo - 13;
                molah.updateStokBuah(mplayer.getIdPlayer(username), 1, getIdKualitas, apel);
                molah.updateStokBuah(mplayer.getIdPlayer(username), 3, getIdKualitas, mangga);
                molah.updateStokBuah(mplayer.getIdPlayer(username), 4, getIdKualitas, semangka);
                molah.updateStokBuah(mplayer.getIdPlayer(username), 5, getIdKualitas, melon);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 8, susu);
                molah.updateStokBahan(mplayer.getIdPlayer(username), 6, mayo);
                molah.tambahProduk(idproduk, getIdKualitas, mplayer.getIdPlayer(username),
                        (maset.getJmlProduk(username, idproduk, getIdKualitas) + 25));
                //  vpengolahan.popupgif();
                vpengolahan.tampilPesan2("Pengolahan Berhasil");
                vpengolahan.setJmlApel(apel);
                vpengolahan.setJmlSemangka(semangka);
                vpengolahan.setJmlMangga(mangga);
                vpengolahan.setJmlMelon(melon);
                vpengolahan.setJmlSusu(susu);
                vpengolahan.setJmlMayo(mayo);
                vpengolahan.popup().setVisible(false);
                vpengolahan.enable();
            } else {
                vpengolahan.popup().setVisible(true);
            }
        } else if (kualitasapel < 1 && kualitasmangga < 1 && kualitassemangka < 1 && kualitasmelon < 1) {
            vpengolahan.tampilPesan2("Anda tidak memiliki beberapa buah dengan kualitas " + vpengolahan.getTeksKualitas());
        }
    }

    private class acttombolKanan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            kualitas = kualitas + 1;
            if (kualitas == 2) {
                vpengolahan.left.setVisible(true);
                vpengolahan.right.setVisible(true);
                vpengolahan.setTeksKualitas("Sedang");
            } else if (kualitas == 3) {
                vpengolahan.left.setVisible(true);
                vpengolahan.right.setVisible(false);
                vpengolahan.setTeksKualitas("Rendah");
            }
        } 
    }

    private class acttombolKiri implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            kualitas = kualitas - 1;
            if (kualitas == 1) {
                vpengolahan.left.setVisible(false);
                vpengolahan.setTeksKualitas("Baik");
            } else if (kualitas == 2) {
                vpengolahan.left.setVisible(true);
                vpengolahan.right.setVisible(true);
                vpengolahan.setTeksKualitas("Sedang");
            }
        }
    }

    private class acttombolOlah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (stjusmelon) {
                try {
                    JusMelonAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stjusapel) {
                try {
                    JusApelAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stjusmangga) {
                try {
                    JusManggaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stjussemangka) {
                try {
                    JusSemangkaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stjuspisang) {
                try {
                    JusPisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stkripikapel) {
                try {
                    KripikApelAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stkripikmangga) {
                try {
                    KripikManggaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stkripikpisang) {
                try {
                    KripikPisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownismangga) {
                try {
                    BrownisManggaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownismelon) {
                try {
                    BrownisMelonAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownispisang) {
                try {
                    BrownisPisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stbrownissemangka) {
                try {
                    BrownisSemangkaAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stsale) {
                try {
                    SalePisangAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stsaladbuah) {
                try {
                    SaladBuahAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stesbuah) {
                try {
                    EsBuahAction();
                } catch (SQLException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pengolahanc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            cekkomposisi();
        }
    }

    private class acttombolbatal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vpengolahan.enable();
            vpengolahan.popup().dispose();
            stjusmelon = false;
            kualitas = 1;
            jml = 1;
        }
    }
}
