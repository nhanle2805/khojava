/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author USER
 */
public class BaiHatKaraOK {
    private String maso;
    private String tenbai;
    private String tacgia;
    public BaiHatKaraOK()
    {
        maso=" ";
        tenbai=" ";
        tacgia=" ";
        
    }
    public BaiHatKaraOK( String ms, String bh, String tg)
    {
        maso=ms;
        tenbai=bh;
        tacgia=tg;
    }
    // xây dựng hàm getter/ setter

    /**
     * @return the maso
     */
    public String getMaso() {
        return maso;
    }

    /**
     * @param maso the maso to set
     */
    public void setMaso(String maso) {
        this.maso = maso;
    }

    /**
     * @return the tenbai
     */
    public String getTenbai() {
        return tenbai;
    }

    /**
     * @param tenbai the tenbai to set
     */
    public void setTenbai(String tenbai) {
        this.tenbai = tenbai;
    }

    /**
     * @return the tacgia
     */
    public String getTacgia() {
        return tacgia;
    }

    /**
     * @param tacgia the tacgia to set
     */
    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }
    
    public String toString()
    {
        String tam="";
     tam = maso+" - "+tenbai+" - "+tacgia;
        return tam;
    }
}
