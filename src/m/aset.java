/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rangora
 */
public class aset extends func {

    public aset() throws SQLException {
    }

    public int getUang(String username) throws SQLException {
        String query = "SELECT uang FROM player WHERE username = '" + username + "'";
        return getDataInt(query);
    }

    public String getIdKualitas(String kualitas) throws SQLException {
        String query = "SELECT `idKualitas` FROM `kualitas` WHERE `Kualitas` = '" + kualitas + "'";
        ResultSet hasil = con.getResult(query);
        hasil.next();
        String data = hasil.getString(1).toUpperCase();
        return data;
    }

    public int getJmlBuahAll(String username, int idBuah) throws SQLException {
        String query = "SELECT sum(JumlahBeli) from pembelianbuah a join player b on a.idPlayer = b.idPlayer "
                + "where a.idBuah='" + idBuah + "' and b.username='" + username + "'";
        System.out.println(query);
        return getDataInt(query);
    }

    public int getJmlBuah(String username, int idBuah, int idKualitas) throws SQLException {
        String query = "SELECT sum(JumlahBeli) from pembelianbuah a join player b on a.idPlayer = b.idPlayer "
                + "where a.idBuah='" + idBuah + "' and b.username='" + username + "' and "
                + "a.idKualitas='" + idKualitas + "'";
        System.out.println(query);
        return getDataInt(query);
    }

    public int getKualitasBuah(String username, int idBuah, int idKualitas) throws SQLException {
        String query = "SELECT JumlahBeli FROM player p join pembelianbuah "
                + "pb on p.idPlayer = pb.idPlayer "
                + "where pb.idBuah='" + idBuah + "' and p.username='" + username + "' and pb.idKualitas='" + idKualitas + "'";
        return getDataInt(query);
    }

    public int getJmlBahan(String username, int idBahan) throws SQLException {
        String query = "SELECT JumlahBeli from pembelianbahan a join player b on a.idPlayer = b.idPlayer "
                + "where a.idBahan='" + idBahan + "' and b.username='" + username + "'";
        return getDataInt(query);
    }

    public int getJmlProduk(String username, int idProduk, int idKualitas) throws SQLException {
        String query = "SELECT Jumlah from hasilpengolahan a join player b on a.idPlayer = b.idPlayer "
                + "where a.idProduk='" + idProduk + "' and a.idKualitas='" + idKualitas + "' and b.username='" + username + "'";
        return getDataInt(query);
    }
    public int getJmlProdukAll(String username, int idProduk) throws SQLException {
        String query = "SELECT sum(a.Jumlah) from hasilpengolahan a join player b on a.idPlayer = b.idPlayer "
                + "where a.idProduk='" + idProduk + "' and b.username='" + username + "'";
        return getDataInt(query);
    }

    public boolean insertAset(int idPlayer) {
        String query = "UPDATE `player` SET `uang` = 5000000 WHERE `player`.`idPlayer` = '" + idPlayer + "';";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean updateUang(int uang, String idPlayer) throws SQLException {
        String query = "UPDATE `player` SET `uang` = '" + (uang + "") + "' WHERE `player`.`idPlayer` = '" + idPlayer + "';";
        return getStatusQuery(query);
    }


    public boolean resetUang(String idPlayer) throws SQLException {
        String query = "UPDATE `player` SET `uang` = 5000000 WHERE `player`.`idPlayer` = '" + idPlayer + "';";
        System.out.println(query);
        return getStatusQuery(query);
    }

}
