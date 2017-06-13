/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.DSBHKaraOK;
import DTO.BaiHatKaraOK;

/**
 *
 * @author USER
 */
public class UngDungConsole {
    public static void main(String ts[])
    {
        BaiHatKaraOK Bai1 = new BaiHatKaraOK(" 500001","Ban Thân","Miu");
        BaiHatKaraOK Bai2 = new BaiHatKaraOK(" 500002","Tình Bạn","MABC");
        BaiHatKaraOK Bai3 = new BaiHatKaraOK(" 500003","Nơi Này","Sơn Tùng");
        BaiHatKaraOK Bai4 = new BaiHatKaraOK(" 500004","Ngã Tư","HQH");
        BaiHatKaraOK Bai5 = new BaiHatKaraOK(" 500005","Sân Trường","BDSK");
        
        BLL.DSBHKaraOK ds= new DSBHKaraOK();
        ds.ThemBaiHat(Bai1);
        ds.ThemBaiHat(Bai2);
        ds.ThemBaiHat(Bai3);
        ds.ThemBaiHat(Bai4);
        ds.ThemBaiHat(Bai5);
        
    }
}
