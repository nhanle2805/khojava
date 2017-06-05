/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class HoSo {
    Connection KN;
    public static void Them(String ms, String ten, String malop) throws SQLException{
        Statement lenh = KN.createStatement();
        String sqlThem ="insert into HOSO values('"+ ms +"','"+ ten +"','" +malop +"')";
        
        
    }
    
    
}
