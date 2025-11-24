/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukk.kalkulator.com;

import java.util.Scanner;

/**
 *
 * @author LENOVO IP3
 */
public class Kalkulator {
    public static void main(String[] args) {
        double hasil;
        System.out.println("=====Pilihan Menu=====");
        System.out.println("1. Penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        
        Scanner in = new Scanner(System.in);
        System.out.println("======Pilih Menu======");
        int pilihhan = in.nextInt();
        System.out.println("====Masukkan Angka====");
        System.out.print("masukkan angka ke 1 : ");
        double angkaA = in.nextDouble();
        System.out.print("masukkan angka ke 2 : ");
        double angkaB = in.nextDouble();
        System.out.println("========Hasil==========");
        
        switch(pilihhan){
            case 1:
                hasil = angkaA + angkaB;
                System.out.println("hasil : " + hasil);
                break;
            case 2:
                hasil = angkaA - angkaB;
                System.out.println("hasil : " + hasil);
                break;
            case 3:
                hasil = angkaA * angkaB;
                System.out.println("hasil : " + hasil);
                break;
            case 4:
                hasil = angkaA / angkaB;
                System.out.println("hasil : " + hasil);
                break;
            default:
                System.out.println("Error, Piihan Tidak Tersedia");
                break;
        }        
    }
}
