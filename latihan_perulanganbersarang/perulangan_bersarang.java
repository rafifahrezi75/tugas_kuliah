package com.mycompany.latihanjava;

import java.util.Scanner;

public class perulangan_bersarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total = 0, grandTotal = 0, bayar = 0, kembalian = 0, diskon, uangBayar;
        double totalPemasukanOwner = 0;
        
        int pilihLevelProgram = 0, pilihMenu = 0, pilihSubMenu = 0, jumlah = 0, kartuMember;
        
        //harga produk
        double sateAyam = 1500, sateKambing = 3000, pecelLaukAyam = 13000, pecelLaukEmpal = 15000,
                penyetanTahu = 5000, penyetanTelur = 7000, penyetanAyam = 10000, harga = 0;
        
        do{
            System.out.println("### Program Kasir ###\n");
            
            System.out.println("1. Aplikasi Kasir\n2. Aplikasi Admin\n3. Aplikasi Owner\n4. Exit\n");
            System.out.print("Pilih Level anda : ");
            pilihLevelProgram = input.nextInt();
            
            switch(pilihLevelProgram){
                case 1: //kasir
                    grandTotal = 0;
                    
                    System.out.println("\n### Progam Kasir Level Kasir ###\n");
                    
                        do{
                            System.out.println("Daftar Menu");
                            System.out.println("1. Sate");
                            System.out.println("2. Pecel");
                            System.out.println("3. Penyetan");
                            System.out.println("4. Selesai");

                            System.out.println("\n===============================================\n");
                    
                            System.out.print("Pilih : ");
                            pilihMenu = input.nextInt();
                            switch(pilihMenu){
                                case 1:
                                    
                                    do{
                                        System.out.println("Sate     :");
                                        System.out.println("    [1] Ayam    : [Rp. " + sateAyam + "] per tusuk");
                                        System.out.println("    [2] Kambing : [Rp. " + sateKambing + "] per tusuk");
                                        System.out.println("    [3] Selesai\n");
                                        
                                        System.out.print("Pilih Sub Menu : ");
                                        pilihSubMenu = input.nextInt();

                                        switch(pilihSubMenu){
                                            case 1:
                                                System.out.println("Sate Ayam [Rp. " + sateAyam + "]");
                                                System.out.print("Jumlah : ");
                                                jumlah = input.nextInt();

                                                total = jumlah * sateAyam;
                                                System.out.println("Total : Rp. " + total);

                                                grandTotal = total + grandTotal;
                                                System.out.println("Total Semua : Rp. " + grandTotal);

                                                System.out.println();

                                                break;
                                            case 2:
                                                System.out.println("Sate Kambing [Rp. " + sateKambing + "]");
                                                System.out.print("Jumlah : ");
                                                jumlah = input.nextInt();

                                                total = jumlah * sateKambing;
                                                System.out.println("Total : Rp. " + total);

                                                grandTotal = total + grandTotal;
                                                System.out.println("Total Semua : Rp. " + grandTotal + "\n");
                                                break;
                                            case 3:
                                                System.out.println("Terima Kasih Telah Berbelanja !\n");
                                                break;
                                            default:
                                                System.out.println("Pilihan Anda Tidak Valid !\n");
                                        }
                                    }while(pilihSubMenu != 3 );
                                    
                                break;
                            
                                case 2: 
                                    do{
                                        System.out.println("Pecel     :");
                                        System.out.println("    [1] Lauk Ayam    : [Rp. " + pecelLaukAyam + "] per tusuk");
                                        System.out.println("    [2] Lauk Empal   : [Rp. " + pecelLaukEmpal + "] per tusuk");
                                        System.out.println("    [3] Selesai\n");
                                        
                                        System.out.print("Pilih Sub Menu : ");
                                        pilihSubMenu = input.nextInt();

                                        switch(pilihSubMenu){
                                            case 1:
                                                System.out.println("Lauk Ayam [Rp. " + pecelLaukAyam + "]");
                                                System.out.print("Jumlah : ");
                                                jumlah = input.nextInt();

                                                total = jumlah * pecelLaukAyam;
                                                System.out.println("Total : Rp. " + total);

                                                grandTotal = total + grandTotal;
                                                System.out.println("Total Semua : Rp. " + grandTotal + "\n");

                                                break;
                                            case 2:
                                                System.out.println("Lauk Empal [Rp. " + pecelLaukEmpal + "]");
                                                System.out.print("Jumlah : ");
                                                jumlah = input.nextInt();

                                                total = jumlah * pecelLaukEmpal;
                                                System.out.println("Total : Rp. " + total);

                                                grandTotal = total + grandTotal;
                                                System.out.println("Total Semua : Rp. " + grandTotal + "\n");
                                                break;
                                            case 3:
                                                System.out.println("Terima Kasih Telah Berbelanja !\n");
                                                System.out.println();
                                                break;
                                            default:
                                                System.out.println("Pilihan Anda Tidak Valid !\n");
                                        }
                                    }while(pilihSubMenu != 3 );
                                break;
                                
                                case 3:
                                    do{
                                        System.out.println("3. Penyetan     :");
                                        System.out.println("    [1] Lauk Tahu / Tempe : [Rp. " + penyetanTahu + "]  per porsi");
                                        System.out.println("    [2] Lauk Telur        : [Rp. " + penyetanTelur + "]  per porsi");
                                        System.out.println("    [3] Lauk Ayam         : [Rp. " + penyetanAyam + "] per porsi");
                                        System.out.println("    [4] Selesai\n");
                                        
                                        System.out.print("Pilih Sub Menu : ");
                                        pilihSubMenu = input.nextInt();

                                        switch(pilihSubMenu){
                                            case 1:
                                                System.out.println("Lauk Tahu / Tempe : [Rp. " + penyetanTahu + "]");
                                                System.out.print("Jumlah : ");
                                                jumlah = input.nextInt();

                                                total = jumlah * penyetanTahu;
                                                System.out.println("Total : Rp. " + total);

                                                grandTotal = total + grandTotal;
                                                System.out.println("Total Semua : Rp. " + grandTotal + "\n");

                                                break;
                                            case 2:
                                                System.out.println("Lauk Telur        : [Rp. " + penyetanTelur + "]");
                                                System.out.print("Jumlah : ");
                                                jumlah = input.nextInt();

                                                total = jumlah * penyetanTelur;
                                                System.out.println("Total : Rp. " + total);

                                                grandTotal = total + grandTotal;
                                                System.out.println("Total Semua : Rp. " + grandTotal + "\n");
                                                break;
                                            case 3:
                                                System.out.println("Lauk Ayam         : [Rp. " + penyetanAyam + "]");
                                                System.out.print("Jumlah : ");
                                                jumlah = input.nextInt();

                                                total = jumlah * penyetanAyam;
                                                System.out.println("Total : Rp. " + total);

                                                grandTotal = total + grandTotal;
                                                System.out.println("Total Semua : Rp. " + grandTotal + "\n");
                                                break;
                                            case 4:
                                                System.out.println("Terima Kasih Telah Berbelanja !\n");
                                                break;
                                            default:
                                                System.out.println("Pilihan Anda Tidak Valid !\n");
                                        }
                                    }while(pilihSubMenu != 4 );
                                break;
                                
                                case 4:
                                    System.out.println("Apakah Anda Mempunyai Kartu Member Y/N?");
                                    System.out.println("[1. Y]");
                                    System.out.println("[2. N]");
                                    System.out.print("Pilih [1, 2] : ");
                                    kartuMember = input.nextInt();

                                    System.out.println();

                                    if (kartuMember == 1){
                                        System.out.println("Anda Mendapatkan Diskon Sebesar [5%]");
                                        System.out.println("Total Semua : Rp. " + grandTotal);
                                        diskon = 0.05 * grandTotal;
                                        System.out.println("Diskon : Rp. " + diskon);
                                        grandTotal = grandTotal - diskon;
                                        System.out.println("Total Akhir : Rp. " + grandTotal);
                                        System.out.println();
                                    } else if (kartuMember == 2){
                                        System.out.println("Anda Tidak Mendapatkan Diskon");
                                        diskon = 0 * grandTotal;
                                        System.out.println("Diskon : Rp. " + diskon);
                                        System.out.println("Total Akhir : Rp. " + grandTotal);
                                        System.out.println();
                                    } else {
                                        System.out.println("Jawaban Anda Tidak Valid");
                                        System.out.println();
                                         System.exit(0);
                                    }
                                    
                                    System.out.println("===============================================\n");
                                    
                                    System.out.print("Uang Yang Di Bayar : ");
                                    uangBayar = input.nextDouble();

                                    if (uangBayar == grandTotal) {
                                        System.out.println("Uang Yang Di Bayarkan Pas");
                                    } else if (uangBayar > grandTotal){
                                        kembalian = uangBayar - grandTotal;
                                        System.out.println("Kembalian : Rp. " + kembalian);
                                    } else {
                                        System.out.println("Uang Yang Dibayarkan Kurang");
                                    }

                                    totalPemasukanOwner += grandTotal;
                                    System.out.println();
                                    
                                break;
                            }
                            
                        }while(pilihMenu!=4);
                    break;
                case 2: //admin
                    
                    System.out.println("\n### Progam Kasir Level Admin ###\n");
                    
                    do {
                         System.out.println("Daftar Menu");
                        System.out.println("1. Sate");
                        System.out.println("2. Pecel");
                        System.out.println("3. Penyetan");
                        System.out.println("4. Selesai");
                        
                        System.out.println("\n===============================================\n");

                        System.out.print("Pilih : ");
                        pilihMenu = input.nextInt();
                        switch(pilihMenu){
                            case 1:

                                do{
                                    System.out.println("Sate     :");
                                    System.out.println("    [1] Ayam    : [Rp. " + sateAyam + "] per tusuk");
                                    System.out.println("    [2] Kambing : [Rp. " + sateKambing + "] per tusuk");
                                    System.out.println("    [3] Selesai");

                                    System.out.println();
                                    System.out.print("Pilih Sub Menu Yang Akan Dirubah Harga : ");
                                    pilihSubMenu = input.nextInt();

                                    switch(pilihSubMenu){
                                        case 1:
                                            System.out.println("Sate Ayam [Rp. " + sateAyam + "]");
                                            System.out.print("Masukkan Harga Baru Sate Ayam : ");
                                            sateAyam = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + sateAyam);

                                            System.out.println();

                                            break;
                                        case 2:
                                            System.out.println("Sate Kambing [Rp. " + sateKambing + "]");
                                            System.out.print("Masukkan Harga Baru Sate Kambing : ");
                                            sateKambing = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + sateKambing);

                                            System.out.println();
                                            break;
                                        case 3:
                                            System.out.println("Selesai !");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("Pilihan Anda Tidak Valid !");
                                    }
                                }while(pilihSubMenu != 3 );

                            break;

                            case 2: 
                                do{
                                    System.out.println("Pecel     :");
                                    System.out.println("    [1] Lauk Ayam    : [Rp. " + pecelLaukAyam + "] per tusuk");
                                    System.out.println("    [2] Lauk Empal   : [Rp. " + pecelLaukEmpal + "] per tusuk");
                                    System.out.println("    [3] Selesai");

                                    System.out.println();
                                    System.out.print("Pilih Sub Menu : ");
                                    pilihSubMenu = input.nextInt();

                                    switch(pilihSubMenu){
                                        case 1:
                                            System.out.println("Lauk Ayam [Rp. " + pecelLaukAyam + "]");
                                            System.out.print("Masukkan Harga Baru Pecel Lauk Ayam : ");
                                            pecelLaukAyam = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + pecelLaukAyam);

                                            System.out.println();

                                            break;
                                        case 2:
                                            System.out.println("Lauk Empal [Rp. " + pecelLaukEmpal + "]");
                                            System.out.print("Masukkan Harga Baru Pecel Lauk Empal : ");
                                            pecelLaukEmpal = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + pecelLaukEmpal);

                                            System.out.println();
                                            break;
                                        case 3:
                                            System.out.println("Selesai !");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("Pilihan Anda Tidak Valid !");
                                    }
                                }while(pilihSubMenu != 3 );
                            break;

                            case 3:
                                do{
                                    System.out.println("3. Penyetan     :");
                                    System.out.println("    [1] Lauk Tahu / Tempe : [Rp. " + penyetanTahu + "]  per porsi");
                                    System.out.println("    [2] Lauk Telur        : [Rp. " + penyetanTelur + "]  per porsi");
                                    System.out.println("    [3] Lauk Ayam         : [Rp. " + penyetanAyam + "] per porsi");
                                    System.out.println("    [4] Selesai\n");
                                    System.out.print("Pilih Sub Menu : ");
                                    pilihSubMenu = input.nextInt();
                                    
                                    System.out.println();

                                    switch(pilihSubMenu){
                                        case 1:
                                            System.out.println("Lauk Tahu / Tempe : [Rp. " + penyetanTahu + "]");
                                            System.out.print("Masukkan Harga Baru Penyetan Lauk Tahu / Tempe : ");
                                            penyetanTahu = input.nextDouble();

                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + penyetanTahu + "\n");

                                            break;
                                        case 2:
                                            System.out.println("Lauk Telur        : [Rp. " + penyetanTelur + "]");
                                            System.out.print("Masukkan Harga Baru Penyetan Lauk Telur : ");
                                            penyetanTelur = input.nextDouble();

                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + penyetanTelur + "\n");
                                            break;
                                        case 3:
                                            System.out.println("Lauk Ayam         : [Rp. " + penyetanAyam + "]");
                                            System.out.print("Masukkan Harga Baru Penyetan Lauk Ayam : ");
                                            penyetanAyam = input.nextDouble();

                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + penyetanTelur + "\n");
                                            break;
                                        case 4:
                                            System.out.println("Selesai !");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("Pilihan Anda Tidak Valid !");
                                    }
                                }while(pilihSubMenu != 4 );
                            break;

                            case 4:
                            break;
                        }
                    }while(pilihMenu!=4);
                    break;
                case 3: //Owner
                    System.out.println("\n### Progam Kasir Level Owner ###\n");
                    
                    System.out.println("Total Semua Pemasukan : Rp. " + totalPemasukanOwner + "\n");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Valid!");
            }
            
        }while(pilihLevelProgram != 4);
        
    }
}
