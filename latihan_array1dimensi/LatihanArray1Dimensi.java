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
public class LatihanArray1Dimensi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pilih = 0;
        int item = 0;
        
        String belanja[] = new String[5];
        int harga[] = new int[5];
        int jumlah[] = new int[5];
        int total[] = new int[5];
        
        int grandTotal = 0;
        
        do{
            System.out.println("==== Kasir Toko Sugeng ====\n");
            System.out.println("1. Ayam Geprek\t[ 13.000 ]");
            System.out.println("2. Soto Ayam\t[ 12.000 ]");
            System.out.println("3. Pecel Lele\t[ 8.000 ]");
            System.out.println("4. Bebek Goreng\t[ 15.000 ]");
            System.out.println("5. Mie Ayam\t[ 12.000 ]");
            System.out.println("6. Selesai\n");
            
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    if(item < belanja.length){
                        belanja[item] = "Ayam Geprek";
                        harga[item] = 13000;
                        
                        System.out.print("Jumlah : ");
                        jumlah[item] = input.nextInt();
                        
                        total[item] = harga[item] * jumlah[item];
                        
                        grandTotal += total[item];
                        
                    } else {
                        System.out.println("Keranjang Penuh !");
                    }
                break;
                
                case 2:
                    if(item < belanja.length){
                        belanja[item] = "Soto Ayam";
                        harga[item] = 12000;
                        
                        System.out.print("Jumlah : ");
                        jumlah[item] = input.nextInt();
                        
                        total[item] = harga[item] * jumlah[item];
                        
                        grandTotal += total[item];
                        
                    } else {
                        System.out.println("Keranjang Penuh !");
                    }
                break;
                
                case 3:
                    if(item < belanja.length){
                        belanja[item] = "Pecel Lele";
                        harga[item] = 8000;
                        
                        System.out.print("Jumlah : ");
                        jumlah[item] = input.nextInt();
                        
                        total[item] = harga[item] * jumlah[item];
                        
                        grandTotal += total[item];
                        
                    } else {
                        System.out.println("Keranjang Penuh !");
                    }
                break;
                
                case 4:
                    if(item < belanja.length){
                        belanja[item] = "Bebek Goreng";
                        harga[item] = 15000;
                        
                        System.out.print("Jumlah : ");
                        jumlah[item] = input.nextInt();
                        
                        total[item] = harga[item] * jumlah[item];
                        
                        grandTotal += total[item];
                        
                    } else {
                        System.out.println("Keranjang Penuh !");
                    }
                break;
                
                case 5:
                    if(item < belanja.length){
                        belanja[item] = "Mie Ayam";
                        harga[item] = 12000;
                        
                        System.out.print("Jumlah : ");
                        jumlah[item] = input.nextInt();
                        
                        total[item] = harga[item] * jumlah[item];
                        
                        grandTotal += total[item];
                        
                    } else {
                        System.out.println("Keranjang Penuh !");
                    }
                break;
                
                case 6:
                    System.out.println("\nDaftar Belanja Anda !\n");
                    for (int i = 0; i < item; i++) {
                        System.out.print((i+1) + "\t||\t " + belanja[i]);
                        System.out.print("\t||\t [ " + harga[i] + " ]" );
                        System.out.print("\t||\t [ " + jumlah[i] + " ] ");
                        System.out.println("\t||\t "  + total[i]);
                    }
                    
                    System.out.println("\nTotal Semua : " + grandTotal);
                break;
                
                default:
                    System.out.println("Pilihan Anda Tidak Valid !");
            }
            
            item++;
            
            if(item > 5){
                System.out.println("Keranjang Penuh");
                break;
            }
            
        }while(pilih!=6);
    }
}
