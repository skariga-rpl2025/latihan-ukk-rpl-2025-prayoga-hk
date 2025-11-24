/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukk.kendaraan.com;

/**
 *
 * @author LENOVO IP3
 */
public class Kendaraan {
    private String Nopol;
    private String merk;
    private String tahun;
    
    public String getNopol(){
        return Nopol;
    }
    public void setNopol(String Nopol){
        this.Nopol = Nopol;
    }
    public String getmerk(){
        return merk;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public String gettahun(){
        return tahun;
    }
    public void settahun(String tahun){
        this.tahun = tahun;
    }
}
