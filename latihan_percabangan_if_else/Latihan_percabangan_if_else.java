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
public class Latihan_percabangan_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double harga, total, diskon = 0, totalakhir = 0, uangbayar, kembalian;
        int jumlah;
        
        System.out.println("### Program Percabangan If Else ###");
        System.out.println();
        
        System.out.print("Jumlah    : ");
        jumlah = input.nextInt();
        
        System.out.print("Harga     : ");
        harga = input.nextDouble();
        
        total = jumlah * harga;
        System.out.println("Total     : " + total);
        
        System.out.println();
        System.out.println("====================================");
        System.out.println();
        
        if (total<100000) {
            diskon = 0 * total;
            System.out.println("Anda Tidak Mendapatkan Diskon");
        } else if (total >= 10001&&total <= 200000) {
            diskon = 0.05 * total;
            System.out.println("Anda Mendapatkan Diskon [5%]");
        } else if (total >= 20001&&total <= 300000) {
            diskon = 0.1 * total;
            System.out.println("Anda Mendapatkan Diskon [10%]");
        } else if (total >= 30001&&total <= 400000) {
            diskon = 0.15 * total;
            System.out.println("Anda Mendapatkan Diskon [15%]");
        } else if (total >= 40001&&total <= 500000) {
            diskon = 0.2 * total;
            System.out.println("Anda Mendapatkan Diskon [20%]");
        } else if (total < 500001){
            diskon = 0.25 * total;
            System.out.println("Anda Mendapatkan Diskon [25%]");
        }
        
        System.out.println("Diskon      : " + diskon);
        totalakhir = total - diskon;
        System.out.println("Total Akhir : " + totalakhir);
        
        System.out.println();
        System.out.println("====================================");
        System.out.println();
        
        System.out.print("Uang Yang Di Bayar : ");
        uangbayar = input.nextDouble();
        
        if (uangbayar == totalakhir) {
            System.out.println("Uang Yang Di Bayarkan Pas");
        } else if (uangbayar > totalakhir){
            kembalian = uangbayar - totalakhir;
            System.out.println("Kembalian : " + kembalian);
        } else {
            System.out.println("Uang Yang Dibayarkan Kurang");
        }
    }
}
