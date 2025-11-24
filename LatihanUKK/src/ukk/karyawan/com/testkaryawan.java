/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukk.karyawan.com;

/**
 *
 * @author LENOVO IP3
 */
public class testkaryawan {
    public static void main(String[] args) {
        Karyawan data = new Karyawan();
        
        data.setNIP("1234");
        data.setNama("yoga");
        data.setDivisi("Backend");
        System.out.println("======Data Karyawan======");
        System.out.println("NIP : " + data.getNIP());
        System.out.println("Nama : " + data.getNama());
        System.out.println("Divisi : " + data.getDivisi());
        System.out.println("=========================");
        
    }
}
