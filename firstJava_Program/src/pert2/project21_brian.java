package pert2;

import java.util.Scanner;

public class project21_brian {
    public static void main(String[] args) {
        int nilai1, nilai2, hasil_penjumlahan, hasil_pengurangan;
        double rata_rata;
        Scanner masuk=new Scanner(System.in);

        System.out.println("Input Data Nilai1 dan Nilai2");
        System.out.print("Input Nilai I: ");
        nilai1 = masuk.nextInt();
        System.out.print("Input Nilai I: ");
        nilai2 = masuk.nextInt();
        hasil_penjumlahan = nilai1 + nilai2;
        hasil_pengurangan = nilai1 - nilai2;
        rata_rata = hasil_penjumlahan /2;
        
        System.out.println("Hasil penjumlahan Nilai 1 dan Nilai2: "+hasil_penjumlahan);
        System.out.println("Hasil pengurangan Nilai 1 dan Nilai2: "+hasil_pengurangan);
        System.out.println("Hasil rata rata Nilai 1 dan Nilai2: "+rata_rata);
    }
    
}
