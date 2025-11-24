/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukk.voting.com;

import java.util.Scanner;

/**
 *
 * @author LENOVO IP3
 */
public class PemilihanKetuaOsis {
    public static void main(String[] args) {
        int kandidatA = 0;
        int kandidatB = 0;
        String pilihan;
        boolean status = true;
        
        Scanner in = new Scanner(System.in);
        System.out.println("====Program Pemilihan Ketua OSIS====");
        System.out.println("Ketik Selesai Untuk Mengakhiri");
        System.out.println("================Hasil===============");
        while(status){
            System.out.println("=======Masukkan Pilihan Anda========");
            pilihan = in.nextLine();
            if(pilihan.equals("A")){
                kandidatA += 1;
            }
            if(pilihan.equals("B")){
                kandidatB += 1;
            }
            if(pilihan.equals("selesai")){
                status = false;
            }
        }
        System.out.println("================Hasil===============");
        System.out.println("Kandidat A : " + kandidatA);
        System.out.println("Kandidat B : " + kandidatB);
        System.out.println("====================================");
        
    }
}
