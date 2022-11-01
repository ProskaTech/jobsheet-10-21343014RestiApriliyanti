/*
 * Created By 21343014_Resti Apriliyanti
 */

public class Latihan3_Inf {
    public static void main(String[] args) {
        Latihan3_Mahasiswa informatika = new Latihan3_Mahasiswa();
        Latihan3_Mahasiswa elektronika = new Latihan3_Mahasiswa();

        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 Informatika";
        informatika.univ = "Universitas Negeri Padang";

        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "Universitas Negeri Padang";

        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama    : " + informatika.nama);
        System.out.println("NIM     : " + informatika.nim);
        System.out.println("Jurusan : " + informatika.jur);
        System.out.println("Status  : " + informatika.univ);

        System.out.println("-----------------------------------");

        System.out.println("Data Mahasiswa ELektronika");
        System.out.println("Nama    : " + elektronika.nama);
        System.out.println("NIM     : " + elektronika.nim);
        System.out.println("Jurusan : " + elektronika.jur);
        System.out.println("Status  : " + elektronika.univ);

    }
    
}
