package pert4;

import java.util.Scanner;

public class project_array {
    public static void main(String[] args) {

        Scanner ketik = new Scanner(System.in);

        String[][] meja = new String[2][3];

        // mengisi setiap meja
        for(int bar = 0; bar < meja.length; bar++)
        {
            for(int kol=0; kol < meja[bar].length; kol++)
            {
                System.out.format("siapa yang akan duduk di meja [%d, %d]: ", bar, kol);
                meja[bar][kol]=ketik.nextLine();
            }
        }

        // menampilkan isi array
        System.out.println("-------------------------------------------------");

        for(int bar = 0; bar<meja.length; bar++){
            for(int kol = 0; kol<meja[bar].length; kol++ ){
                System.out.format("|%s| \t", meja[bar][kol]);
            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");
    }
}