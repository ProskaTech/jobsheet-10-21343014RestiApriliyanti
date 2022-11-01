/*
 * Created By 21343014_Resti Apriliyanti
 */

import java.util.Scanner;

public class Latihan2_Manusia {
    String nama, tempat_lahir, tgl_lahir;
    int berat_badan, tinggi_badan;

    public void inputdata(){
        Scanner input = new Scanner(System.in);

        System.out.print ("Masukkan Nama Lengkap \t : ");
        nama = input.nextLine();

        System.out.print ("Masukkan Tempat Lahir \t : ");
        tempat_lahir = input.nextLine();

        System.out.print ("Masukkan Tanggal Lahir \t : ");
        tgl_lahir = input.nextLine();

        System.out.print ("Masukkan Berat Badan \t : ");
        berat_badan = input.nextInt();

        System.out.print ("Masukkan Tinggi Badan \t : ");
        tinggi_badan = input.nextInt();

        input.close();

    }

    public void identitas() {
        System.out.println("Nama Saya \t : " + nama);
        System.out.println("Tempat Lahir \t : " + tempat_lahir);
        System.out.println("Tangal Lahir \t : " + tgl_lahir);
        System.out.println("Berat Badan \t : " + berat_badan + " Kg");
        System.out.println("Tinggi Badan \t : " + tinggi_badan + " Cm");
    }

    public static void main(String[] args) {
        Latihan2_Manusia A = new Latihan2_Manusia();
        A.inputdata();
        A.identitas();
    }
}
