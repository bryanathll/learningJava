package pert1;
public class arithmetic {
    public static void main(String[] args) {
        /* deklarasi variabel dan tipe data untuk
         bilangan1, bilangan2, hasil penjumlahan
         bilangan1 = 6
         bilangan2 = 5

         hasil penjumlahan = bilangan1+bilangan2
         tampilkan ke ouput hasil penjumlahan*/


        // ============ penjumlahan ============
        int bilangan1, bilangan2, hasil_penjumlahan;
        bilangan1 = 6;
        bilangan2 = 5;
        hasil_penjumlahan = bilangan1 + bilangan2;
        
        System.out.println( "hasil dari penjumlhan bilangan1 dan bilangan2 adalah:" + hasil_penjumlahan);
        // ============ penjumlahan end============

        
        // ============ perkalian ============
        int bill1, bill2, hasil_perkalian;
        bill1 = 4;
        bill2 = 6;
        hasil_perkalian = bill1 * bill2;

        System.out.println("hasil perkalian bill1 dan bill2 adalah: "+hasil_perkalian);
        // ============ perkalian end============

        

        // ============ pembagian ============
        double bil1, bil2, hasil_pembagian;
        bil1 = 18;
        bil2 = 3;
        hasil_pembagian = bil1 * bil2;

        System.out.println("hasil pembagian bill1 dan bill2 adalah: "+hasil_pembagian);
        // ============ pembagian end============
    }
}
