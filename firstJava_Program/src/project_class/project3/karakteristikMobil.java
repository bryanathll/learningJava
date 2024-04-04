package project_class.project3;

import java.util.Scanner;

public class karakteristikMobil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        mobil mobilku = new mobil();

        // mobilku.warna = "merah";
        // mobilku.jenis_mobil = "bus";
        // mobilku.tahun_produksi = 1999;

        // System.out.println("jenis mobilku adalah: " + mobilku.jenis_mobil);
        // System.out.println("warna mobilku adalah: " + mobilku.warna);
        // System.out.println("tahun produksi mobilku adalah: " + mobilku.tahun_produksi);
        

        System.out.print("jenis mobil: ");
        mobilku.jenis_mobil = input.nextLine();

        System.out.print("Warna mobil: ");
        mobilku.warna = input.nextLine();

        System.out.print("Merk mobil: ");
        mobilku.merk = input.nextLine();
        
        System.out.print("Tahun produksi: ");
        mobilku.tahun_produksi = input.nextInt();

        System.out.println();
        System.out.println("Jenis mobilku adalah: " + mobilku.jenis_mobil);;
        System.out.println("Warna mobilku adalah: " + mobilku.warna);;
        System.out.println("merk mobilku adalah: " + mobilku.merk);;
        System.out.println("Tahun produksi mobilku adalah: " + mobilku.tahun_produksi);;
    }    
}
