/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjava;

import java.util.Scanner;

/**
 *
 * @author RAFI
 */
public class Latihan_switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlah, pilihmenu, pilihsubmenu, kartumember;
        double harga = 0, diskon, total = 0;
        
        System.out.println("### Program Switch Case ###");
        System.out.println();
        
        System.out.println("Daftar Menu");
        System.out.println("1. Sate     :");
        System.out.println("    [1.1] Ayam    : [1500] per tusuk");
        System.out.println("    [1.2] Kambing : [3000] per tusuk");
        System.out.println("2. Pecel     :");
        System.out.println("    [2.1] Lauk Ayam    : [13000] per porsi");
        System.out.println("    [2.2] Lauk Empal   : [15000] per porsi");
        System.out.println("3. Penyetan     :");
        System.out.println("    [3.1] Lauk Tahu / Tempe : [5000]  per porsi");
        System.out.println("    [3.2] Lauk Telur        : [7000]  per porsi");
        System.out.println("    [3.3] Lauk Ayam         : [10000] per porsi");
        
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        
        System.out.print("Pilih Menu : ");
        pilihmenu = input.nextInt();
        
        if (pilihmenu>3){
            System.out.println("Menu Yang Anda Pilih Tidak Ada");
            System.exit(0);
        }
        
        System.out.print("Pilih Sub Menu (Tanpa Titik) : ");
        pilihsubmenu = input.nextInt();
        
        switch (pilihmenu) {
            case 1 :
                if (pilihsubmenu==11){
                    harga = 1500;
                } else if (pilihsubmenu==12){
                harga = 3000;
                } else {
                    System.out.println("Sub Menu Yang Anda Pilih Tidak Ada");
                }
                break;
                
            case 2 :
                if (pilihsubmenu==21){
                    harga = 13000;
                } else if (pilihsubmenu==22){
                harga = 15000;
                } else {
                    System.out.println("Sub Menu Yang Anda Pilih Tidak Ada");
                }
                break;
                
            case 3 :
                switch (pilihsubmenu){
                    case 31 :
                        harga = 5000;
                        break;
                    case 32 :
                        harga = 7000;
                        break;
                    case 33 :
                        harga = 10000;
                        break;
                    default:
                    System.out.println("Sub Menu Yang Anda Pilih Tidak Ada");
                }
                break;
        }
        
        System.out.print("Jumlah    : ");
        jumlah = input.nextInt();
        
        total = harga*jumlah;
        System.out.println("Total   : " + total);
        
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        
        System.out.println("Apakah Anda Mempunyai Kartu Member Y/N?");
        System.out.println("[1. Y]");
        System.out.println("[2. N]");
        System.out.print("Pilih [1, 2] : ");
        kartumember = input.nextInt();
        
        System.out.println();
        
        if (kartumember == 1){
            System.out.println("Anda Mendapatkan Diskon Sebesar [5%]");
            diskon = 0.05 * total;
            System.out.println("Diskon : " + diskon);
            total = total - diskon;
            System.out.println("Total Akhir : " + total);
        } else if (kartumember == 2){
            System.out.println("Anda Tidak Mendapatkan Diskon");
            diskon = 0 * total;
            System.out.println("Diskon : " + diskon);
            System.out.println("Total Akhir : " + total);
        } else {
            System.out.println("Jawaban Anda Tidak Valid");
        }
    }
}
