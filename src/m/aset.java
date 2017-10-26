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
        String query = "SELECT Uang FROM aset a join player p on p.idPlayer = a.idPlayer WHERE p.username = '" + username + "'";
        return getDataInt(query);
    }

    public int getJmlGula(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 1 ";
        System.out.println(query);
        return getDataInt(query);
    }
    public int getJmlTepungB(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 2 ";
        return getDataInt(query);
    }
 
    public int getJmlPengembang(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 9 ";
        return getDataInt(query);
    }
 
    public int getJmlSusu(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 8";
        return getDataInt(query);
    }
 
    public int getJmlTelur(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 7 ";
        return getDataInt(query);
    }
 
    public int getJmlMayonais(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 6 ";
        return getDataInt(query);
    }
 
    public int getJmlSirup(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 5 ";
        return getDataInt(query);
    }
 
    public int getJmlMinyak(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 3 ";
        return getDataInt(query);
    }
    public int getJmlTepungT(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 10 ";
        return getDataInt(query);
    }
    public int getJmlMentega(String username) throws SQLException {
        String query = "SELECT sum(bb.JumlahBeli) from pembelianBahan bb join bahan b on b.idBahan = bb.idBahan JOIN "
                + "player p on p.idPlayer = bb.idPlayer WHERE p.username = '"+username+"' and bb.idBahan = 4";
        return getDataInt(query);
    }
 
    public int cekIdAset() throws SQLException {
        String query = "select IdAset from aset where IdAset = ";
        return checkId(query);
    }

    public boolean insertAset(int idAset, int idPlayer) {
        String query = "INSERT INTO `aset`(`idAset`, `idPlayer`, `Uang`) VALUES ('" + idAset + "','" + idPlayer + "','500000')";
        return getStatusQuery(query);
    }

    public boolean updateUang(int uang, String idPlayer) throws SQLException {
        String query = "UPDATE `aset` SET `Uang` = '" + (uang + "") + "' WHERE `aset`.`idAset` = '" + idPlayer + "';";
        return getStatusQuery(query);
    }

    public boolean insertDataSapi(int idSapi, String idPlayer) throws SQLException {
        String query = "INSERT INTO `sapiplayer` (`IdSapiPlayer`, `IdPlayer`, `IdJenisSapi`, `BeratSapi`, `UsiaSapi`) VALUES ('" + idSapi + "','" + idPlayer + "', '1', '500', '4')";
        return getStatusQuery(query);
    }
//
//    public boolean deleteSapi(int idSapi, String idPlayer) {
//        String query = "DELETE FROM `sapiplayer` WHERE `IdSapiPlayer` = " + idSapi + " and `IdPlayer` = " + idPlayer;
//        return getStatusQuery(query);
//    }


}
