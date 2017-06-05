/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class KetNoi {
    String tenMayChu;
    String tenCSDL;
    String tenDangNhap;
    String mkDangNhap;
    
    public KetNoi(String tenMayChu, String tenCSDL, String tenDangNhap, String mkDangNhap)
    {
        this.tenMayChu = tenMayChu;
        this.tenCSDL = tenCSDL;
        this.tenDangNhap = tenDangNhap;
        this.mkDangNhap = mkDangNhap;
    }  
    public Connection layKetNoi() throws SQLException
            
    {
        String chuoiKN = "jdbc:mysql://"+tenMayChu+ "/" + tenCSDL;
            return DriverManager.getConnection(chuoiKN,tenDangNhap,mkDangNhap);
            
        
    }
            
    
    
}
