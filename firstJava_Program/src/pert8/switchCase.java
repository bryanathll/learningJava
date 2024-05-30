package pert8;
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, hati hati");
                break;
            case "hijau":
                System.out.println("Lampu hijau, jalan");
                break;
            default:
                System.out.println("warna lampu salah");;
        }
    }
    
}
