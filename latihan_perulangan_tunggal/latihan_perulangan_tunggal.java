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
public class latihan_perulangan_tunggal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double jumlah, total, diskon, kartumember, totalsemua = 0;
        int pilih = 0, pilihsubmenu = 0, harga = 0;;
        
        do{
             System.out.println("### Program Switch Case ###");
            System.out.println();

            System.out.println("Daftar Menu");
            System.out.println("1. Sate");
            System.out.println("2. Pecel");
            System.out.println("3. Penyetan");
            System.out.println("4. Selesai");
            
            System.out.println();
            System.out.println("===============================================");
            System.out.println();
            
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("1. Sate     :");
                    System.out.println("    [1.1] Ayam    : [1500] per tusuk");
                    System.out.println("    [1.2] Kambing : [3000] per tusuk");
                    
                    System.out.print("Pilih Sub Menu (Tanpa Titik) : ");
                    pilihsubmenu = input.nextInt();
                    
                    if (pilihsubmenu==11){
                        harga = 1500;
                    } else if (pilihsubmenu==12){
                        harga = 3000;
                    } else {
                        System.out.println("Sub Menu Yang Anda Pilih Tidak Ada");
                        System.exit(0);
                    }
                    
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();
                    total = harga * jumlah;
                    
                    System.out.println("Total : " + total);
                    
                    totalsemua = total + totalsemua;
                    System.out.println("Total Semua : " + totalsemua);
                    break;

                case 2:
                    System.out.println("2. Pecel     :");
                    System.out.println("    [2.1] Lauk Ayam    : [13000] per porsi");
                    System.out.println("    [2.2] Lauk Empal   : [15000] per porsi");
                    
                    System.out.print("Pilih Sub Menu (Tanpa Titik) : ");
                    pilihsubmenu = input.nextInt();
                    
                    if (pilihsubmenu==21){
                        harga = 13000;
                    } else if (pilihsubmenu==22){
                    harga = 15000;
                    } else {
                        System.out.println("Sub Menu Yang Anda Pilih Tidak Ada");
                        System.exit(0);
                    }
                    
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();
                    total = harga * jumlah;
                    
                    System.out.println("Total : " + total);
                    
                    totalsemua = total + totalsemua;
                    System.out.println("Total Semua : " + totalsemua);
                    break;
                case 3:
                    System.out.println("3. Penyetan     :");
                    System.out.println("    [3.1] Lauk Tahu / Tempe : [5000]  per porsi");
                    System.out.println("    [3.2] Lauk Telur        : [7000]  per porsi");
                    System.out.println("    [3.3] Lauk Ayam         : [10000] per porsi");
                    
                    System.out.print("Pilih Sub Menu (Tanpa Titik) : ");
                    pilihsubmenu = input.nextInt();
                    
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
                        System.exit(0);
                    }
                    
                    System.out.print("Jumlah : ");
                    
                    jumlah = input.nextInt();
                    total = harga * jumlah;
                    
                    System.out.println("Total : " + total);
                    
                    totalsemua = total + totalsemua;
                    System.out.println("Total Semua : " + totalsemua);
                    break;
                case 4:
                    System.out.println("Total Semua : " + totalsemua);
                    System.out.println("Terima Kasih Telah Berbelanja !");
                    break;
                    
                default :
                    System.out.println("Pilihan Anda Zonk !");
            }
        }while(pilih!=4);
        
        System.out.println("Apakah Anda Mempunyai Kartu Member Y/N?");
        System.out.println("[1. Y]");
        System.out.println("[2. N]");
        System.out.print("Pilih [1, 2] : ");
        kartumember = input.nextInt();
        
        System.out.println();
        
        if (kartumember == 1){
            System.out.println("Anda Mendapatkan Diskon Sebesar [5%]");
            System.out.println("Total Semua : " + totalsemua);
            diskon = 0.05 * totalsemua;
            System.out.println("Diskon : " + diskon);
            totalsemua = totalsemua - diskon;
            System.out.println("Total Akhir : " + totalsemua);
        } else if (kartumember == 2){
            System.out.println("Anda Tidak Mendapatkan Diskon");
            diskon = 0 * totalsemua;
            System.out.println("Diskon : " + diskon);
            System.out.println("Total Akhir : " + totalsemua);
        } else {
            System.out.println("Jawaban Anda Tidak Valid");
        }
    }
}
