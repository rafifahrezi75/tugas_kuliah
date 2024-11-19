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
public class LatihanArrayMultiDimensi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int belilagi = 0;
         
        do{
            int pilih = 0, jumlah = 0, total = 0, baris = 0, kolom = 0, grandTotal = 0;
        
            String brg[] = new String[5];
            int nota[][]    = new int [5][3];
            do{
                System.out.println("==== Aplikasi Kasir ====\n");
                System.out.println("1. Kemeja\n2. Sandal\n3. Sepatu");
                System.out.println("4. Selesai");

                System.out.print("Pilih : ");
                pilih = input.nextInt();

                System.out.println();


                switch(pilih) {
                    case 1:

                        System.out.println("Kemeja [50.000]");
                        if(baris<5) {
                            brg[baris] = "Kemeja";
                            nota[baris][0] = 50000;

                            System.out.print("Jumlah : ");
                            jumlah = input.nextInt();

                            nota[baris][1] = jumlah;
                            nota[baris][2] = nota[baris][0] * nota[baris][1];

                            grandTotal += nota[baris][2];

                            baris++;

                            grandTotal += total;
                            System.out.println("Total Belanja : " + grandTotal);

                        } else {
                            System.out.println("Keranjang Penuh !");
                        }

                        System.out.println();

                    break;

                    case 2:

                        System.out.println("Sandal [16.000]");
                        if(baris<5) {
                            brg[baris] = "Sandal";
                            nota[baris][0] = 16000;

                            System.out.print("Jumlah : ");
                            jumlah = input.nextInt();

                            nota[baris][1] = jumlah;
                            nota[baris][2] = nota[baris][0] * nota[baris][1];

                            grandTotal += nota[baris][2];

                            baris++;

                            System.out.println("Total Belanja : " + grandTotal);

                        } else {
                            System.out.println("Keranjang Penuh !");
                        }

                        System.out.println();

                    break;

                    case 3:

                        System.out.println("Sepatu [300.000]");
                        if(baris<5) {
                            brg[baris] = "Sepatu";
                            nota[baris][0] = 300000;

                            System.out.print("Jumlah : ");
                            jumlah = input.nextInt();

                            nota[baris][1] = jumlah;
                            nota[baris][2] = nota[baris][0] * nota[baris][1];

                            grandTotal += nota[baris][2];

                            baris++;

                            System.out.println("Total Belanja : " + grandTotal);

                        } else {
                            System.out.println("Keranjang Penuh !");
                        }

                    break;

                    case 4:
                        System.out.println("Daftar Belanja Anda");
                            for (int i = 0; i < baris; i++) {
                                System.out.print((i + 1) + ". ");
                                System.out.print(brg[i] + "\t||\t");
                                System.out.print(nota[i][0] + "\t||\t");
                                System.out.print(nota[i][1] + "\t||\t");
                                System.out.println(nota[i][2]);
                            }

                        System.out.println("Terima Kasih !");
                    break;

                    default:
                        System.out.println("Pilihan Anda Tidak Valid !");
                }

            }while(pilih!=4);
            
            System.out.println("\nApakah Anda Ingin Melakukan Transaksi Lagi ?\n[1] Ya\n[2] Tidak");
            System.out.print("Pilih : ");
            
            belilagi = input.nextInt();

       }while(belilagi==1);
        
        System.out.println("Terima Kasih Telah Berbelanja !");
    }
}
