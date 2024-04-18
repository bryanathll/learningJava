package pert4;

public class array {
    public static void main(String[] args) {
        // String [] nama = {"brian", "donny", "agus"};
        
        // System.out.println(nama[2]);

        int[] angka = new int[5];

        angka[0]=1;
        angka[1]=1;
        angka[2]=1;
        angka[3]=1;
        angka[4]=1;

        // System.out.println(angka[0]);

        for(int i= 0; i < angka.length; i++ ){
            System.out.println("angka ke"+i+ "=" + angka[i]);
        }
    } 
}
