package pert8;
import java.util.Scanner;
public class PerhitunganNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ============ variable ============
        String nama, nim;
        char grade;
        int n_ts, n_uts, n_tm, n_uas, n_absen;
        double n_akhir;
        // ============ variable end ============

        // ============ Input Nilai UPB ============ 
        System.out.println("=========== Masukkan Nilai Mahasiswa UPB (===========");
        System.out.print("Masukkan Nama                   :");
        nama = input.nextLine();
        System.out.print("Masukkan NIM                    :");
        nim = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran        :");
        n_absen = input.nextInt();
        System.out.print("Masukkan Nilai Tugas Struktur   :");
        n_ts = input.nextInt();
        System.out.print("Masukkan Nilai UTS              :");
        n_uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS              :");
        n_uas = input.nextInt();
        System.out.print("Masukkan Nilai Tugas Mandiri    :");
        n_tm = input.nextInt();
        // ============ Input Nilai UPB end ============

        // ============ Kondisi if else ============
        n_akhir = (0.10*n_absen + 0.10*n_ts + 0.15*n_tm + 0.30*n_uts + 0.35*n_uas);
        
        if (n_akhir >= 80 && n_akhir<= 99.99){
            grade = 'A';
        }else if (n_akhir >= 70 && n_akhir<= 79.99){
            grade = 'B';
        }else if (n_akhir >= 60 && n_akhir<= 69.99){
            grade = 'C';
        }else if(n_akhir >= 50 && n_akhir<= 59.99){
            grade = 'D';
        }else{
            grade = 'E';
        }
        // ============ Kondisi if else end ============

        
        if (grade == 'A'|| grade =='B' || grade =='C'){
            System.out.println(
                "\nMahasiswa dengan nama  : " + nama + 
                "\nNIM                    : " + nim + 
                "\nMemiliki Nilai akhir   : " + n_akhir + 
                "\ndengan grade           : " + grade + 
                "\nDinyatakan lulus!!!");
        }
        else {
            System.out.println("\nMahasiswa dengan nama" + nama + "\nNIM: " + nim + "\nMemiliki Nilai akhir: " + n_akhir + "\ndengan grade: " + grade + "\nDinyatakan Tidak Lulus!!!");
            }
            
    }
}
