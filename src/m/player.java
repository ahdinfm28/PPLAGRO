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
 * @author Farisya
 */
public class player extends func {

    ResultSet rs;
    koneksi con;

    public player() throws SQLException {
        this.con = new koneksi();
        con = new koneksi();
    }

    public int cekIdP() throws SQLException { //buat cek apakah id ada atau kosong
        String query = "select idPlayer from player where idPlayer = ";
        return checkId(query);
    }

    public boolean insertPlayer(int idPlayer, String username, String password) {
        String query = "INSERT INTO `player` (`idPlayer`, `username`, `password`) VALUES ('" + idPlayer + "', '" + username
                + "', '" + password + "')";
        return getStatusQuery(query);
    }

    public boolean getPlayer(String username, String password) throws SQLException {
        String query = "SELECT * FROM `player` WHERE  username = '" + username + "' AND password ='" + password + "'";
        boolean status = false;
        try {
            rs = con.getResult(query);
            if (rs.next()) {
                status = true;
            }
        } catch (SQLException e) {
            System.out.println("Salah");
        }
        return status;
    }

    public String getIdPlayer(String username) throws SQLException {
        String query = "SELECT `idPlayer` FROM `player` WHERE `username` = '" + username + "'";
        ResultSet hasil = con.getResult(query);
        hasil.next();
        String data = hasil.getString(1).toUpperCase();
        return data;
    }

    public boolean cekUsername(String username) throws SQLException {
        String query = "SELECT `username` FROM `player` WHERE  username = '" + username + "'";
        boolean status = false;
        try {
            rs = con.getResult(query);
            if (rs.next()) {
                status = true;
            }
        } catch (SQLException e) {
        }
        return status;
    }
}
