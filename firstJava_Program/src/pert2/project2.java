package pert2;

import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        String nama, alamat;
        int umur;
        char gender;

        Scanner ketik=new Scanner(System.in);

        System.out.println("Data yang akan diinput ");
        System.out.print("Input nama mahasiswa: ");
        nama = ketik.nextLine();
        System.out.print("Input Alamat: ");
        alamat = ketik.nextLine();
        System.out.print("Input Umur: ");
        umur = ketik.nextInt();
        System.out.println("Input gender: ");
        gender = ketik.next().charAt(0);


        System.out.println();
        System.out.println("Data yang sudah diinput");
        System.out.println("Nama yang diinput: "+ nama);
        System.out.println("Alamat yang diinput: "+ alamat);
        System.out.println("Umur yang diinput: "+ umur +" Tahun");
        System.out.println("Gender yang diinput: "+ gender);
    }    
}