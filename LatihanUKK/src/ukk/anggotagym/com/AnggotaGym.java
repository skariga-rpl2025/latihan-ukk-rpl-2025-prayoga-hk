/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukk.anggotagym.com;

import java.util.Scanner;

/**
 *
 * @author LENOVO IP3
 */
public class AnggotaGym {
    public static void main(String[] args) {
        String Nama;
        String Daftar;
        int total = 0;
        boolean Status = true;
        
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("=================Daftar GYM================");
            System.out.print("Masukkan Nama : ");
            Nama = in.nextLine();
            System.out.print("Daftar anggota lagi?[ya/tidak]");
            Daftar = in.nextLine();
            total += 1;
            if(Daftar.equals("tidak")){
                Status = false;
            }
        }while(Status);
        System.out.println("===============================================");
        System.out.println("Total Anggota Yang Didaftarkan : " + total);
        System.out.println("===============================================");
    }
}
