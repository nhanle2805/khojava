/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistex1;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ArrayListEX1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> dsTenCay= new ArrayList<String>();
        dsTenCay.add("tre");
        dsTenCay.add("mít");
        dsTenCay.add("mía");
        dsTenCay.add("mãng cầu");
        dsTenCay.add("xoài");
        dsTenCay.add("bưởi");
        dsTenCay.add("chanh");
        dsTenCay.add("nho");
        // 1 in  ra danh sach 
        int SLphantu= dsTenCay.size();
        for(int i=0; i<SLphantu;i++)
           System.out.println(dsTenCay.get(i));
        
        //2. sửa Mít thành đu đủ
        dsTenCay.set(1, " Đu đủ");
        System.out.println(" sau khi đổi tên là:");
            for(int i=0; i<SLphantu;i++)
           System.out.println(dsTenCay.get(i));
            
         // 3. xóa phần tử thứ 1
         dsTenCay.remove(0);
         
         //4 xóa bưởi
         dsTenCay.remove("Bưởi");
         for(int i=0; i<SLphantu;i++)
           System.out.println(dsTenCay.get(i));
        
    }
    
}
