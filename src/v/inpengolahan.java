/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Farisya
 */
public class inpengolahan extends javax.swing.JFrame {

    /**
     * Creates new form inpengolahan
     */
    public inpengolahan() {
        initComponents();
        this.popup.setLocationRelativeTo(this);
        this.gif.setLocationRelativeTo(this);
    }

    public void klikKembali(ActionListener a) {
        this.back.addActionListener(a);
    }

    public void klikNext(ActionListener a) {
        this.next.addActionListener(a);
    }

    public void klikPrevious(ActionListener a) {
        this.previous.addActionListener(a);
    }

    public void klikJusMelon(ActionListener a) {
        this.btnjusmelon.addActionListener(a);
    }

    public void klikJusMangga(ActionListener a) {
        this.btnjusmangga.addActionListener(a);
    }

    public void klikJusApel(ActionListener a) {
        this.btnjusapel.addActionListener(a);
    }

    public void klikJusSemangka(ActionListener a) {
        this.btnjussemangka.addActionListener(a);
    }

    public void klikJusPisang(ActionListener a) {
        this.btnjuspisang.addActionListener(a);
    }

    public void klikKripikApel(ActionListener a) {
        this.btnkripikapel.addActionListener(a);
    }

    public void klikKripikMangga(ActionListener a) {
        this.btnkripikmangga.addActionListener(a);
    }

    public void klikKripikPisang(ActionListener a) {
        this.btnkripikpisang.addActionListener(a);
    }

    public void klikBrownisPisang(ActionListener a) {
        this.btnbrownispisang.addActionListener(a);
    }

    public void klikBrownisMangga(ActionListener a) {
        this.btnbrownismangga.addActionListener(a);
    }

    public void klikBrownisApel(ActionListener a) {
        this.btnbrownisapel.addActionListener(a);
    }

    public void klikBrownisMelon(ActionListener a) {
        this.btnbrownismelon.addActionListener(a);
    }

    public void klikBrownisSemangka(ActionListener a) {
        this.btnbrownissemangka.addActionListener(a);
    }

    public void klikEsBuah(ActionListener a) {
        this.btnesbuah.addActionListener(a);
    }

    public void klikSaladBuah(ActionListener a) {
        this.btnsaladbuah.addActionListener(a);
    }
    public void klikSalePisang(ActionListener a) {
        this.btnsalepisang.addActionListener(a);
    }

    public int setJmlMangga(int t) {
        mangga1.setText(t + "");
        mangga2.setText(t + "");
        mangga3.setText(t + "");
        mangga4.setText(t + "");
        mangga5.setText(t + "");
        return t;
    }

    public int setJmlApel(int t) {
        apel1.setText(t + "");
        apel2.setText(t + "");
        apel3.setText(t + "");
        apel4.setText(t + "");
        apel5.setText(t + "");
        return t;
    }

    public int setJmlSemangka(int t) {
        semangka1.setText(t + "");
        semangka2.setText(t + "");
        semangka3.setText(t + "");
        semangka4.setText(t + "");
        return t;
    }

    public int setJmlMelon(int t) {
        melon1.setText(t + "");
        melon2.setText(t + "");
        melon3.setText(t + "");
        melon4.setText(t + "");
        return t;
    }

    public int setJmlPisang(int t) {
        pisang1.setText(t + "");
        pisang2.setText(t + "");
        pisang3.setText(t + "");
        pisang4.setText(t + "");
        return t;
    }

    public int setJmlMinyak(int t) {
        minyak1.setText(t + "");
        minyak2.setText(t + "");
        minyak3.setText(t + "");
        minyak4.setText(t + "");
        return t;
    }

    public int setJmlGula(int t) {
        gula1.setText(t + "");
        gula2.setText(t + "");
        gula3.setText(t + "");
        gula4.setText(t + "");
        gula5.setText(t + "");
        gula6.setText(t + "");
        gula7.setText(t + "");
        gula8.setText(t + "");
        gula9.setText(t + "");
        gula10.setText(t + "");
        return t;
    }

    public int setJmlSusu(int teks) {
        susu1.setText(teks + "");
        susu2.setText(teks + "");
        susu3.setText(teks + "");
        susu4.setText(teks + "");
        susu5.setText(teks + "");
        susu6.setText(teks + "");
        susu7.setText(teks + "");
        susu8.setText(teks + "");
        susu9.setText(teks + "");
        susu10.setText(teks + "");
        susu11.setText(teks + "");
        return teks;
    }

    public int setJmlPengembang(int teks) {
        sp1.setText(teks + "");
        sp2.setText(teks + "");
        sp3.setText(teks + "");
        sp4.setText(teks + "");
        sp5.setText(teks + "");
        return teks;
    }

    public int setJmlTepungT(int teks) {
        tt1.setText(teks + "");
        tt2.setText(teks + "");
        tt3.setText(teks + "");
        tt4.setText(teks + "");
        tt5.setText(teks + "");
        tt6.setText(teks + "");
        return teks;
    }

    public int setJmlTepungB(int teks) {
        tb1.setText(teks + "");
        return teks;
    }

    public int setJmlMentega(int teks) {
        mentega1.setText(teks + "");
        return teks;
    }

    public int setJmlMayo(int teks) {
        mayo1.setText(teks + "");
        return teks;

    }

    public int setJmlSirup(int teks) {
        sirup1.setText(teks + "");
        return teks;
    }

    public int setJmlTelur(int teks) {
        telur1.setText(teks + "");
        telur2.setText(teks + "");
        telur3.setText(teks + "");
        telur4.setText(teks + "");
        telur5.setText(teks + "");
        return teks;
    }

    public String getJmlMelon() {
        String x = melon1.getText();
        String y = melon2.getText();
        String z = melon3.getText();
        String a = melon4.getText();
        String get[] = {x, y, z, a};
        String hasil = null;
        for (int i = 0; i < 4; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlSemangka() {
        String x = semangka1.getText();
        String y = semangka2.getText();
        String z = semangka3.getText();
        String a = semangka4.getText();
        String get[] = {x, y, z, a};
        String hasil = null;
        for (int i = 0; i < 4; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlApel() {
        String x = apel1.getText();
        String y = apel2.getText();
        String z = apel3.getText();
        String a = apel4.getText();
        String b = apel5.getText();
        String get[] = {x, y, z, a, b};
        String hasil = null;
        for (int i = 0; i < 5; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlMangga() {
        String x = mangga1.getText();
        String y = mangga2.getText();
        String z = mangga3.getText();
        String a = mangga4.getText();
        String b = mangga5.getText();
        String get[] = {x, y, z, a, b};
        String hasil = null;
        for (int i = 0; i < 5; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlPisang() {
        String x = pisang1.getText();
        String y = pisang2.getText();
        String z = pisang3.getText();
        String a = pisang4.getText();
        String get[] = {x, y, z, a};
        String hasil = null;
        for (int i = 0; i < 4; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlMinyak() {
        String x = minyak1.getText();
        String y = minyak2.getText();
        String z = minyak3.getText();
        String get[] = {x, y, z};
        String hasil = null;
        for (int i = 0; i < 3; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlPengembang() {
        String x = sp1.getText();
        String y = sp2.getText();
        String z = sp3.getText();
        String a = sp4.getText();
        String b = sp5.getText();
        String get[] = {x, y, z, a, b};
        String hasil = null;
        for (int i = 0; i < 5; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlTelur() {
        String x = telur1.getText();
        String y = telur2.getText();
        String z = telur3.getText();
        String a = telur4.getText();
        String b = telur5.getText();
        String get[] = {x, y, z, a, b};
        String hasil = null;
        for (int i = 0; i < 5; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlTepungT() {
        String x = tt1.getText();
        String y = tt2.getText();
        String z = tt3.getText();
        String a = tt4.getText();
        String b = tt5.getText();
        String c = tt6.getText();
        String get[] = {x, y, z, a, b, c};
        String hasil = null;
        for (int i = 0; i < 6; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlGula() {
        String x = gula1.getText();
        String y = gula2.getText();
        String z = gula3.getText();
        String a = gula4.getText();
        String b = gula5.getText();
        String c = gula6.getText();
        String d = gula7.getText();
        String e = gula8.getText();
        String f = gula9.getText();
        String g = gula10.getText();
        String get[] = {x, y, z, a, b, c, d, e, f, g};
        String hasil = null;
        for (int i = 0; i < 10; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlSusu() {
        String x = susu1.getText();
        String y = susu2.getText();
        String z = susu3.getText();
        String a = susu4.getText();
        String b = susu5.getText();
        String c = susu6.getText();
        String d = susu7.getText();
        String e = susu8.getText();
        String f = susu9.getText();
        String g = susu10.getText();
        String h = susu11.getText();
        String get[] = {x, y, z, a, b};
        String hasil = null;
        for (int i = 0; i < 11; i++) {
            hasil = get[i];
        }
        return hasil;
    }

    public String getJmlMayo() {
        return mayo1.getText();
    }

    public String getJmlMentega() {
        return mentega1.getText();
    }

    public String getJmlSirup() {
        return sirup1.getText();
    }

    public String getJmlTepungB() {
        return tb1.getText();
    }

    public void klikBatal(ActionListener action) {
        this.batal.addActionListener(action);
    }

    public void klikKanan(ActionListener action) {
        this.right.addActionListener(action);
    }

    public void klikKiri(ActionListener action) {
        this.left.addActionListener(action);
    }

    public void klikOlah(ActionListener action) {
        this.olah.addActionListener(action);
    }

    public JFrame popup() {
        return popup;
    }

    public JLabel setGambar() {
        return gambar;
    }

    public void setTeksKualitas(String teks) {
        kualitas.setText(teks);
    }

    public String getTeksKualitas() {
        return kualitas.getText();
    }

    public JFrame nextpengolahan() {
        return nextpengolahan;
    }

    public JFrame gif() {
        return gif;
    }

//    public void popupgif() throws InterruptedException {
//        this.gif().setVisible(true);
//        bgif.setVisible(true);
//        loadbar.setVisible(true);
//        loadnum.setVisible(true);
//        for (int i = 0; i <= 100; i++) {
//            Thread.sleep(50); //milisecond
//            loadnum.setText(Integer.toString(i) + "%");
//            loadbar.setValue(i);
//            if (i == 100) {
//                loadbar.setVisible(false);
//                loadnum.setVisible(false);
//            }
//        }
//        this.gif().setVisible(false);
//    }

    public void tampilPesan1(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public void tampilPesan2(String pesan) {
        JOptionPane.showMessageDialog(popup, pesan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextpengolahan = new javax.swing.JFrame();
        btnsaladbuah = new javax.swing.JButton();
        btnesbuah = new javax.swing.JButton();
        btnbrownismelon = new javax.swing.JButton();
        btnbrownisapel = new javax.swing.JButton();
        btnbrownispisang = new javax.swing.JButton();
        btnbrownissemangka = new javax.swing.JButton();
        btnbrownismangga = new javax.swing.JButton();
        btnsalepisang = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        apel3 = new javax.swing.JLabel();
        mangga3 = new javax.swing.JLabel();
        semangka2 = new javax.swing.JLabel();
        mayo1 = new javax.swing.JLabel();
        susu11 = new javax.swing.JLabel();
        melon2 = new javax.swing.JLabel();
        apel4 = new javax.swing.JLabel();
        mangga4 = new javax.swing.JLabel();
        semangka3 = new javax.swing.JLabel();
        sirup1 = new javax.swing.JLabel();
        melon4 = new javax.swing.JLabel();
        pisang4 = new javax.swing.JLabel();
        telur5 = new javax.swing.JLabel();
        sp2 = new javax.swing.JLabel();
        tt6 = new javax.swing.JLabel();
        susu6 = new javax.swing.JLabel();
        gula10 = new javax.swing.JLabel();
        semangka4 = new javax.swing.JLabel();
        gula9 = new javax.swing.JLabel();
        sp1 = new javax.swing.JLabel();
        tt5 = new javax.swing.JLabel();
        telur4 = new javax.swing.JLabel();
        susu7 = new javax.swing.JLabel();
        susu8 = new javax.swing.JLabel();
        gula7 = new javax.swing.JLabel();
        sp4 = new javax.swing.JLabel();
        tt4 = new javax.swing.JLabel();
        telur1 = new javax.swing.JLabel();
        apel5 = new javax.swing.JLabel();
        susu9 = new javax.swing.JLabel();
        mangga5 = new javax.swing.JLabel();
        telur3 = new javax.swing.JLabel();
        tt3 = new javax.swing.JLabel();
        sp3 = new javax.swing.JLabel();
        gula8 = new javax.swing.JLabel();
        mentega1 = new javax.swing.JLabel();
        minyak4 = new javax.swing.JLabel();
        pisang3 = new javax.swing.JLabel();
        tb1 = new javax.swing.JLabel();
        tt1 = new javax.swing.JLabel();
        susu10 = new javax.swing.JLabel();
        melon3 = new javax.swing.JLabel();
        telur2 = new javax.swing.JLabel();
        tt2 = new javax.swing.JLabel();
        sp5 = new javax.swing.JLabel();
        gula6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        popup = new javax.swing.JFrame();
        left = new javax.swing.JButton();
        right = new javax.swing.JButton();
        gambar = new javax.swing.JLabel();
        kualitas = new javax.swing.JLabel();
        batal = new javax.swing.JButton();
        olah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gif = new javax.swing.JFrame();
        loadbar = new javax.swing.JProgressBar();
        loadnum = new javax.swing.JLabel();
        bgif = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        susu1 = new javax.swing.JLabel();
        gula1 = new javax.swing.JLabel();
        pisang1 = new javax.swing.JLabel();
        susu3 = new javax.swing.JLabel();
        gula3 = new javax.swing.JLabel();
        melon1 = new javax.swing.JLabel();
        susu2 = new javax.swing.JLabel();
        gula2 = new javax.swing.JLabel();
        semangka1 = new javax.swing.JLabel();
        susu4 = new javax.swing.JLabel();
        mangga1 = new javax.swing.JLabel();
        gula4 = new javax.swing.JLabel();
        susu5 = new javax.swing.JLabel();
        gula5 = new javax.swing.JLabel();
        apel1 = new javax.swing.JLabel();
        apel2 = new javax.swing.JLabel();
        minyak1 = new javax.swing.JLabel();
        pisang2 = new javax.swing.JLabel();
        minyak2 = new javax.swing.JLabel();
        minyak3 = new javax.swing.JLabel();
        mangga2 = new javax.swing.JLabel();
        btnjuspisang = new javax.swing.JButton();
        btnjusmelon = new javax.swing.JButton();
        btnjusmangga = new javax.swing.JButton();
        btnjussemangka = new javax.swing.JButton();
        btnjusapel = new javax.swing.JButton();
        btnkripikapel = new javax.swing.JButton();
        btnkripikpisang = new javax.swing.JButton();
        btnkripikmangga = new javax.swing.JButton();
        next = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        nextpengolahan.setUndecorated(true);
        nextpengolahan.setSize(new java.awt.Dimension(1366, 768));
        nextpengolahan.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsaladbuah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/saladbuah.png"))); // NOI18N
        btnsaladbuah.setBorder(null);
        btnsaladbuah.setBorderPainted(false);
        btnsaladbuah.setContentAreaFilled(false);
        btnsaladbuah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(btnsaladbuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 120));

        btnesbuah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/esbuah.png"))); // NOI18N
        btnesbuah.setBorder(null);
        btnesbuah.setBorderPainted(false);
        btnesbuah.setContentAreaFilled(false);
        btnesbuah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(btnesbuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 140, 130));

        btnbrownismelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownismelon.png"))); // NOI18N
        btnbrownismelon.setBorder(null);
        btnbrownismelon.setBorderPainted(false);
        btnbrownismelon.setContentAreaFilled(false);
        btnbrownismelon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(btnbrownismelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 130, 110));

        btnbrownisapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownisapel.png"))); // NOI18N
        btnbrownisapel.setBorder(null);
        btnbrownisapel.setBorderPainted(false);
        btnbrownisapel.setContentAreaFilled(false);
        btnbrownisapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(btnbrownisapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 140, 110));

        btnbrownispisang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownispisang.png"))); // NOI18N
        btnbrownispisang.setBorder(null);
        btnbrownispisang.setBorderPainted(false);
        btnbrownispisang.setContentAreaFilled(false);
        btnbrownispisang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(btnbrownispisang, new org.netbeans.lib.awtextra.AbsoluteConstraints(943, 117, 130, 120));

        btnbrownissemangka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownissemangka.png"))); // NOI18N
        btnbrownissemangka.setBorder(null);
        btnbrownissemangka.setBorderPainted(false);
        btnbrownissemangka.setContentAreaFilled(false);
        btnbrownissemangka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(btnbrownissemangka, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 325, 130, 130));

        btnbrownismangga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/brownismangga.png"))); // NOI18N
        btnbrownismangga.setBorder(null);
        btnbrownismangga.setBorderPainted(false);
        btnbrownismangga.setContentAreaFilled(false);
        btnbrownismangga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(btnbrownismangga, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 140, 120));

        btnsalepisang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/salepisang.png"))); // NOI18N
        btnsalepisang.setBorder(null);
        btnsalepisang.setBorderPainted(false);
        btnsalepisang.setContentAreaFilled(false);
        btnsalepisang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(btnsalepisang, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 130, 120));

        previous.setBorder(null);
        previous.setBorderPainted(false);
        previous.setContentAreaFilled(false);
        previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextpengolahan.getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 353, 90, 100));

        apel3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        apel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apel3.setText("0");
        nextpengolahan.getContentPane().add(apel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 40, 20));

        mangga3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        mangga3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mangga3.setText("0");
        nextpengolahan.getContentPane().add(mangga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 20, -1));

        semangka2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        semangka2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semangka2.setText("0");
        nextpengolahan.getContentPane().add(semangka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 20, -1));

        mayo1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        mayo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mayo1.setText("0");
        nextpengolahan.getContentPane().add(mayo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 20, -1));

        susu11.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu11.setText("0");
        nextpengolahan.getContentPane().add(susu11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 154, 20, 30));

        melon2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        melon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melon2.setText("0");
        nextpengolahan.getContentPane().add(melon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 20, 20));

        apel4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        apel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apel4.setText("0");
        nextpengolahan.getContentPane().add(apel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 20, -1));

        mangga4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        mangga4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mangga4.setText("0");
        nextpengolahan.getContentPane().add(mangga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 20, -1));

        semangka3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        semangka3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semangka3.setText("0");
        nextpengolahan.getContentPane().add(semangka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 20, -1));

        sirup1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        sirup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sirup1.setText("0");
        nextpengolahan.getContentPane().add(sirup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 30, -1));

        melon4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        melon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melon4.setText("0");
        nextpengolahan.getContentPane().add(melon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 30, -1));

        pisang4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        pisang4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pisang4.setText("0");
        nextpengolahan.getContentPane().add(pisang4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 114, 20, 20));

        telur5.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        telur5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telur5.setText("0");
        nextpengolahan.getContentPane().add(telur5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 160, 20, -1));

        sp2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        sp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp2.setText("0");
        nextpengolahan.getContentPane().add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 220, 20, -1));

        tt6.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        tt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tt6.setText("0");
        nextpengolahan.getContentPane().add(tt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 220, 30, -1));

        susu6.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu6.setText("0");
        nextpengolahan.getContentPane().add(susu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 160, 30, -1));

        gula10.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula10.setText("0");
        nextpengolahan.getContentPane().add(gula10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 114, 30, 20));

        semangka4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        semangka4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semangka4.setText("0");
        nextpengolahan.getContentPane().add(semangka4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 330, 20, -1));

        gula9.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula9.setText("0");
        nextpengolahan.getContentPane().add(gula9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 370, 20, 30));

        sp1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        sp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp1.setText("0");
        nextpengolahan.getContentPane().add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 434, 20, 20));

        tt5.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        tt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tt5.setText("0");
        nextpengolahan.getContentPane().add(tt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 440, 30, -1));

        telur4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        telur4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telur4.setText("0");
        nextpengolahan.getContentPane().add(telur4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 380, 30, -1));

        susu7.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu7.setText("0");
        nextpengolahan.getContentPane().add(susu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 330, 30, -1));

        susu8.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu8.setText("0");
        nextpengolahan.getContentPane().add(susu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 20, -1));

        gula7.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula7.setText("0");
        nextpengolahan.getContentPane().add(gula7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 30, -1));

        sp4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        sp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp4.setText("0");
        nextpengolahan.getContentPane().add(sp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 30, -1));

        tt4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        tt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tt4.setText("0");
        nextpengolahan.getContentPane().add(tt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 30, -1));

        telur1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        telur1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telur1.setText("0");
        nextpengolahan.getContentPane().add(telur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 20, 20));

        apel5.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        apel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apel5.setText("0");
        nextpengolahan.getContentPane().add(apel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 20, -1));

        susu9.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu9.setText("0");
        nextpengolahan.getContentPane().add(susu9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 20, -1));

        mangga5.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        mangga5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mangga5.setText("0");
        nextpengolahan.getContentPane().add(mangga5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 20, -1));

        telur3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        telur3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telur3.setText("0");
        nextpengolahan.getContentPane().add(telur3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 20, -1));

        tt3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        tt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tt3.setText("0");
        nextpengolahan.getContentPane().add(tt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 20, -1));

        sp3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        sp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp3.setText("0");
        nextpengolahan.getContentPane().add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 20, -1));

        gula8.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula8.setText("0");
        nextpengolahan.getContentPane().add(gula8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 554, 20, 20));

        mentega1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        mentega1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mentega1.setText("0");
        nextpengolahan.getContentPane().add(mentega1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 20, 20));

        minyak4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        minyak4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minyak4.setText("0");
        nextpengolahan.getContentPane().add(minyak4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, 20, -1));

        pisang3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        pisang3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pisang3.setText("0");
        nextpengolahan.getContentPane().add(pisang3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 20, -1));

        tb1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        tb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tb1.setText("0");
        nextpengolahan.getContentPane().add(tb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 20, -1));

        tt1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        tt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tt1.setText("0");
        nextpengolahan.getContentPane().add(tt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 20, -1));

        susu10.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu10.setText("0");
        nextpengolahan.getContentPane().add(susu10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 20, -1));

        melon3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        melon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melon3.setText("0");
        nextpengolahan.getContentPane().add(melon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 20, -1));

        telur2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        telur2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telur2.setText("0");
        nextpengolahan.getContentPane().add(telur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 424, 20, 30));

        tt2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        tt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tt2.setText("0");
        nextpengolahan.getContentPane().add(tt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 30, 20));

        sp5.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        sp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp5.setText("0");
        nextpengolahan.getContentPane().add(sp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 30, 20));

        gula6.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula6.setText("0");
        nextpengolahan.getContentPane().add(gula6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 30, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/inpengolahan2.png"))); // NOI18N
        background.setText("jLabel1");
        nextpengolahan.getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, -1));

        popup.setUndecorated(true);
        popup.setSize(new java.awt.Dimension(550, 634));
        popup.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/left.png"))); // NOI18N
        left.setBorder(null);
        left.setBorderPainted(false);
        left.setContentAreaFilled(false);
        left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/right.png"))); // NOI18N
        right.setBorder(null);
        right.setBorderPainted(false);
        right.setContentAreaFilled(false);
        right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));
        popup.getContentPane().add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, 150));

        kualitas.setFont(new java.awt.Font("DFPOP1-W9", 0, 18)); // NOI18N
        kualitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        popup.getContentPane().add(kualitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 324, 130, 70));

        batal.setBorder(null);
        batal.setBorderPainted(false);
        batal.setContentAreaFilled(false);
        batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 503, 160, 80));

        olah.setBorder(null);
        olah.setBorderPainted(false);
        olah.setContentAreaFilled(false);
        olah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popup.getContentPane().add(olah, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 503, 160, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/popupengolahan.png"))); // NOI18N
        popup.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        gif.setUndecorated(true);
        gif.setSize(new java.awt.Dimension(340, 340));
        gif.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadbar.setForeground(new java.awt.Color(204, 204, 204));
        gif.getContentPane().add(loadbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, 30));

        loadnum.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        loadnum.setForeground(new java.awt.Color(255, 255, 255));
        loadnum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadnum.setText("100");
        gif.getContentPane().add(loadnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 34, 30, 20));

        bgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/giphysdfwe.gif"))); // NOI18N
        gif.getContentPane().add(bgif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, -1, -1));

        susu1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu1.setText("0");
        getContentPane().add(susu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 40, 30));

        gula1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula1.setText("0");
        getContentPane().add(gula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 30, 30));

        pisang1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        pisang1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pisang1.setText("0");
        getContentPane().add(pisang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 40, 30));

        susu3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu3.setText("0");
        getContentPane().add(susu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 40, 30));

        gula3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula3.setText("0");
        getContentPane().add(gula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 40, 30));

        melon1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        melon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melon1.setText("0");
        getContentPane().add(melon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 40, 30));

        susu2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu2.setText("0");
        getContentPane().add(susu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 40, 30));

        gula2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula2.setText("0");
        getContentPane().add(gula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 40, 40));

        semangka1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        semangka1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semangka1.setText("0");
        getContentPane().add(semangka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 414, 40, 30));

        susu4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu4.setText("0");
        getContentPane().add(susu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 40, 30));

        mangga1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        mangga1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mangga1.setText("0");
        getContentPane().add(mangga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 40, 30));

        gula4.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula4.setText("0");
        getContentPane().add(gula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 40, 30));

        susu5.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        susu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susu5.setText("0");
        getContentPane().add(susu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 120, 40, 30));

        gula5.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        gula5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gula5.setText("0");
        getContentPane().add(gula5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 170, 40, 30));

        apel1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        apel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apel1.setText("0");
        getContentPane().add(apel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 200, 40, 40));

        apel2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        apel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apel2.setText("0");
        getContentPane().add(apel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 340, 40, 30));

        minyak1.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        minyak1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minyak1.setText("0");
        getContentPane().add(minyak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 410, 40, 30));

        pisang2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        pisang2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pisang2.setText("0");
        getContentPane().add(pisang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 560, 50, 30));

        minyak2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        minyak2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minyak2.setText("0");
        getContentPane().add(minyak2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 630, 50, 30));

        minyak3.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        minyak3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minyak3.setText("0");
        getContentPane().add(minyak3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 30, 30));

        mangga2.setFont(new java.awt.Font("DFPOP1-W9", 0, 14)); // NOI18N
        mangga2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mangga2.setText("0");
        getContentPane().add(mangga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 50, 30));

        btnjuspisang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/juspisang.png"))); // NOI18N
        btnjuspisang.setBorder(null);
        btnjuspisang.setBorderPainted(false);
        btnjuspisang.setContentAreaFilled(false);
        btnjuspisang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnjuspisang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 140, 140));

        btnjusmelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/jusmelon.png"))); // NOI18N
        btnjusmelon.setBorder(null);
        btnjusmelon.setBorderPainted(false);
        btnjusmelon.setContentAreaFilled(false);
        btnjusmelon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnjusmelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 120, 140));

        btnjusmangga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/jusmangga.png"))); // NOI18N
        btnjusmangga.setBorder(null);
        btnjusmangga.setBorderPainted(false);
        btnjusmangga.setContentAreaFilled(false);
        btnjusmangga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnjusmangga, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 320, 130, -1));

        btnjussemangka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/jussemangka.png"))); // NOI18N
        btnjussemangka.setBorder(null);
        btnjussemangka.setBorderPainted(false);
        btnjussemangka.setContentAreaFilled(false);
        btnjussemangka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnjussemangka, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 130, 130));

        btnjusapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/jusapel.png"))); // NOI18N
        btnjusapel.setBorder(null);
        btnjusapel.setBorderPainted(false);
        btnjusapel.setContentAreaFilled(false);
        btnjusapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnjusapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 120, 130));

        btnkripikapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/kripikapel.png"))); // NOI18N
        btnkripikapel.setBorder(null);
        btnkripikapel.setBorderPainted(false);
        btnkripikapel.setContentAreaFilled(false);
        btnkripikapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnkripikapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 140, 130));

        btnkripikpisang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/kripikpisang.png"))); // NOI18N
        btnkripikpisang.setBorder(null);
        btnkripikpisang.setBorderPainted(false);
        btnkripikpisang.setContentAreaFilled(false);
        btnkripikpisang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnkripikpisang, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 120, 140));

        btnkripikmangga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/kripikmangga.png"))); // NOI18N
        btnkripikmangga.setBorder(null);
        btnkripikmangga.setBorderPainted(false);
        btnkripikmangga.setContentAreaFilled(false);
        btnkripikmangga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnkripikmangga, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 110, 120));

        next.setBorder(null);
        next.setBorderPainted(false);
        next.setContentAreaFilled(false);
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1233, 333, 110, 110));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui export/inpengolahan.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        ImageIcon awal = new ImageIcon(getClass().getResource("/ui export/backhover.png"));
        back.setIcon(awal); // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(inpengolahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inpengolahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inpengolahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inpengolahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inpengolahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apel1;
    private javax.swing.JLabel apel2;
    private javax.swing.JLabel apel3;
    private javax.swing.JLabel apel4;
    private javax.swing.JLabel apel5;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton batal;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bgif;
    public javax.swing.JButton btnbrownisapel;
    public javax.swing.JButton btnbrownismangga;
    public javax.swing.JButton btnbrownismelon;
    public javax.swing.JButton btnbrownispisang;
    public javax.swing.JButton btnbrownissemangka;
    public javax.swing.JButton btnesbuah;
    public javax.swing.JButton btnjusapel;
    public javax.swing.JButton btnjusmangga;
    public javax.swing.JButton btnjusmelon;
    public javax.swing.JButton btnjuspisang;
    public javax.swing.JButton btnjussemangka;
    public javax.swing.JButton btnkripikapel;
    public javax.swing.JButton btnkripikmangga;
    public javax.swing.JButton btnkripikpisang;
    public javax.swing.JButton btnsaladbuah;
    public javax.swing.JButton btnsalepisang;
    private javax.swing.JLabel gambar;
    private javax.swing.JFrame gif;
    private javax.swing.JLabel gula1;
    private javax.swing.JLabel gula10;
    private javax.swing.JLabel gula2;
    private javax.swing.JLabel gula3;
    private javax.swing.JLabel gula4;
    private javax.swing.JLabel gula5;
    private javax.swing.JLabel gula6;
    private javax.swing.JLabel gula7;
    private javax.swing.JLabel gula8;
    private javax.swing.JLabel gula9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kualitas;
    public javax.swing.JButton left;
    private javax.swing.JProgressBar loadbar;
    private javax.swing.JLabel loadnum;
    private javax.swing.JLabel mangga1;
    private javax.swing.JLabel mangga2;
    private javax.swing.JLabel mangga3;
    private javax.swing.JLabel mangga4;
    private javax.swing.JLabel mangga5;
    private javax.swing.JLabel mayo1;
    private javax.swing.JLabel melon1;
    private javax.swing.JLabel melon2;
    private javax.swing.JLabel melon3;
    private javax.swing.JLabel melon4;
    private javax.swing.JLabel mentega1;
    private javax.swing.JLabel minyak1;
    private javax.swing.JLabel minyak2;
    private javax.swing.JLabel minyak3;
    private javax.swing.JLabel minyak4;
    private javax.swing.JButton next;
    private javax.swing.JFrame nextpengolahan;
    private javax.swing.JButton olah;
    private javax.swing.JLabel pisang1;
    private javax.swing.JLabel pisang2;
    private javax.swing.JLabel pisang3;
    private javax.swing.JLabel pisang4;
    private javax.swing.JFrame popup;
    private javax.swing.JButton previous;
    public javax.swing.JButton right;
    private javax.swing.JLabel semangka1;
    private javax.swing.JLabel semangka2;
    private javax.swing.JLabel semangka3;
    private javax.swing.JLabel semangka4;
    private javax.swing.JLabel sirup1;
    private javax.swing.JLabel sp1;
    private javax.swing.JLabel sp2;
    private javax.swing.JLabel sp3;
    private javax.swing.JLabel sp4;
    private javax.swing.JLabel sp5;
    private javax.swing.JLabel susu1;
    private javax.swing.JLabel susu10;
    private javax.swing.JLabel susu11;
    private javax.swing.JLabel susu2;
    private javax.swing.JLabel susu3;
    private javax.swing.JLabel susu4;
    private javax.swing.JLabel susu5;
    private javax.swing.JLabel susu6;
    private javax.swing.JLabel susu7;
    private javax.swing.JLabel susu8;
    private javax.swing.JLabel susu9;
    private javax.swing.JLabel tb1;
    private javax.swing.JLabel telur1;
    private javax.swing.JLabel telur2;
    private javax.swing.JLabel telur3;
    private javax.swing.JLabel telur4;
    private javax.swing.JLabel telur5;
    private javax.swing.JLabel tt1;
    private javax.swing.JLabel tt2;
    private javax.swing.JLabel tt3;
    private javax.swing.JLabel tt4;
    private javax.swing.JLabel tt5;
    private javax.swing.JLabel tt6;
    // End of variables declaration//GEN-END:variables
}
