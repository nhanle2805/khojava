/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.BaiHatKaraOK;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class DSBHKaraOK {
    ArrayList<BaiHatKaraOK> dsOK;
    
    public DSBHKaraOK()
    {
        dsOK= new ArrayList<BaiHatKaraOK> ();
        
    }
    public void ThemBaiHat(BaiHatKaraOK h)
    {
        dsOK.add(h);
    }
        public ArrayList <BaiHatKaraOK> LOCTHEOTG( String ten)
        {
            ArrayList<BaiHatKaraOK> KQLOC= new ArrayList<BaiHatKaraOK>();
            for(int i=0; i<dsOK.size();i++)
            {
                String tacgia_i= dsOK.get(i).getTacgia();
            
                if(tacgia_i.equals(ten))
                    KQLOC.add(dsOK.get(i));
                
            }
            return KQLOC;
        }
    
}
