/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvd;

import DAL.KetNoi;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class ThuNghiem {
     public static void main(String[] args) throws SQLException {
         // tạo  kết nối 
         KetNoi k= new KetNoi ("localhost","qlsv","root","");
         Connection KN =k.layKetNoi();
         System.out.print("lại sai rồi");
     }
}
