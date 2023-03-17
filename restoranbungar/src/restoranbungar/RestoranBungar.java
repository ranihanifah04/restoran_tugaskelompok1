/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoranbungar;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class RestoranBungar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nama,orang;
        int qty;
        double nasigoreng = 9999.99,ayambakar = 12345.67,steaksirloin = 21108.40,kwetiawsiram = 13579.13,kambingguling = 98765.43;
        
        
        System.out.println("Selamat Siang!");
        System.out.println("");
        System.out.print("Pesan Untuk Berapa Orang: ");
        qty = in.nextInt();
        System.out.print("Pesanan Atas Nama: ");
        nama = in.next();
        System.out.println("");
        
        System.out.println("Menu Spesial Kedai Roy Hari Ini");
        System.out.println("=============================");
        System.out.println("1. Nasi Goreng Spesial        Rp. " + nasigoreng);
        System.out.println("2. Ayam Bakar Spesial         Rp. " + ayambakar);
        System.out.println("3. Steak Sirloin Spesial      Rp. " + steaksirloin);
        System.out.println("4. Kwetiaw Siram Spesial      Rp. " + kwetiawsiram);
        System.out.println("5. Kambing Guling Spesial     Rp. " + kambingguling);
        System.out.println("");
        
        System.out.println("Pesanan Anda [Batas 10 Porsi]");
        System.out.println("");
        System.out.print("1. Nasi Goreng Spesial     = \t");
        int qtyNasiGoreng = in.nextInt();
        System.out.print("2. Ayam Bakar Spesial      = \t");
        int qtyAyamBakar = in.nextInt();
        System.out.print("3. Steak Sirloin Spesial   = \t");
        int qtySteakSirloin = in.nextInt();
        System.out.print("4. Kwetiaw Siram Spesial   =\t");
        int qtyKwetiawSiram = in.nextInt();
        System.out.print("5. Kambing Guling Spesial  =\t");
        int qtyKambingGuling = in.nextInt();
        System.out.println("");
        
        System.out.println("Selamat Menikmati Makanan Anda!");
        System.out.println("");
        
        System.out.println("Rincian Pembelian: ");
        double totalNasiGoreng = nasigoreng * qtyNasiGoreng;
        double totalAyamBakar = ayambakar * qtyAyamBakar;
        double totalSteakSirloin = steaksirloin * qtySteakSirloin;
        double totalKwetiawSiram = kwetiawsiram * qtyKwetiawSiram;
        double totalKambingGuling = kambingguling * qtyKambingGuling;
        double totalPembelian = totalNasiGoreng + totalAyamBakar + totalSteakSirloin + totalKwetiawSiram + totalKambingGuling;
        double discount = 10 * totalPembelian / 100;
        double setelahDiscount = totalPembelian - discount;
        double perOrang = setelahDiscount / qty;
        //System.out.println(perOrang);
        
        System.out.println("1. Nasi Goreng Spesial \t\t" + qtyNasiGoreng + " porsi " + "* Rp. " + nasigoreng + "     = " + " Rp. \t" + totalNasiGoreng);
        System.out.println("2. Ayam Bakar Spesial \t\t" + qtyAyamBakar + " porsi " + "* Rp. " + ayambakar + "    = " + " Rp. \t" + totalAyamBakar);
        System.out.println("3. Steak Sirloin Spesial \t" + qtySteakSirloin + " porsi " + "* Rp. " + steaksirloin +  "     = " + " Rp. \t" + totalSteakSirloin);
        System.out.println("4. Kwetiaw Siram Spesial \t" + qtyKwetiawSiram + " porsi " + "* Rp. " + kwetiawsiram + "    = " + " Rp. \t" + totalKwetiawSiram);
        System.out.println("5. Kambing Guling Spesial \t" + qtyKambingGuling + " porsi " + "* Rp. " + kambingguling + "    = " + " Rp. \t" + totalKambingGuling);
        System.out.println("===========================================================================================");
        
        System.out.println("Total Pembelian \t\t\t\t\t" + "  = " + " Rp. \t" + totalPembelian);
        System.out.println();
        System.out.println("Disc. 10% <Masa Promosi> \t\t\t\t" + "  = " + " Rp. \t" + discount);
        System.out.println("===========================================================================================");
        System.out.println("Total Pembelian Setelah Disc. 10% \t\t\t" + "  = " + " Rp. \t" + setelahDiscount);
        System.out.println();
        System.out.println("Pembelian Per Orang <Untuk " + qty + " Orang> \t\t\t" + "  = " + " Rp. \t" + perOrang);
        
    }
    
}
