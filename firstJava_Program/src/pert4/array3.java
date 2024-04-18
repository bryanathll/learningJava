package pert4;

public class array3 {
    public static void main(String[] args) {
        String nama[]={"mira","budi","agus","tuti"};
        char gender[] = {'L','P'};
        int umur[]= {30,25,53,45};
        double nilai[] = {80.50, 70.60, 90.50, 85.50};
        int i;


        System.out.println("Nama yang dipilih: "+nama[0]);
        System.out.println("Gender yang dipilih: "+ gender[1]);
        System.out.println("Umur yang dipilih: "+umur[2]);
        System.out.println("Nilai yang dipilih: "+nilai[3]);

        for(i=0; i<nama.length; i++){
            System.out.println(nama[i]);
        }
    }
    
}
