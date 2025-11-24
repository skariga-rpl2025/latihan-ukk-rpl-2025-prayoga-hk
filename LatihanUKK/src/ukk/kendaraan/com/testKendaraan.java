/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukk.kendaraan.com;

/**
 *
 * @author LENOVO IP3
 */
public class testKendaraan {
    public static void main(String[] args) {
        Kendaraan bermotor = new Kendaraan();
        bermotor.setNopol("N 3456 QSR");
        bermotor.setmerk("Toyota corola ae101");
        
        System.out.println("======Data Karyawan======");
        System.out.println("NoPol : " + bermotor.getNopol());
        System.out.println("Merk : " + bermotor.getmerk());
        System.out.println("Tahun : " + bermotor.gettahun());
        System.out.println("=========================");
        
    }
}
