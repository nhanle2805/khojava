/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author USER
 */
public class BTVD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tạo kết nối chuỗi đến CSDL
        String chuoiKN="jdbc:mysql://localhost:3306/qlsv";
        Connection KN;
        
        try {
             KN = DriverManager.getConnection(chuoiKN,"root","");
             System.out.println("ok nè");
            
            System.out.println("ko kết nối được");
            boolean toString = false;
            System.err.println(toString);// in lỗi
            // bước 2: tạo đối tượng statement
            Statement lenh= KN.createStatement();
            //BƯỚC 3:
            String strSQL = "select * from HoSo";
            // bước 4:
            ResultSet rs= lenh.executeQuery(strSQL);
            //bước 5:
            // in ra màn hình console
            while(rs.next())// duyệt cho đến bản ghi cuối cùng
            {
                String ms = rs.getString("MSSV");
                 String ten = rs.getString("HOTEN");
                  String malop = rs.getString("MALOP");
            System.out.println(ms + "\t" + "\t" + ten +"\t" +malop);
                
            }
            //bước 6
            KN.close();
            
            
                    
                    } catch (SQLException ex) {
            Logger.getLogger(BTVD.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}
