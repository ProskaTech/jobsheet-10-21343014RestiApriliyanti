/*
 * Created By 21343014_Resti Apriliyanti
 */

public class Tugas2_NilaiMain {

    public static void main(String[] args) {
        Tugas2_Nilai nilai = new Tugas2_Nilai();
        nilai.nama = "Joni";
        nilai.nim = 12345;
        nilai.semester = "V";
        nilai.ip = 3.50;
        
        System.out.println("Nama Mahasiswa \t : " + nilai.nama);
        System.out.println("NIM \t\t : " + nilai.nim);
        System.out.println("Semester \t : " + nilai.semester);
        System.out.println("IP Semester Ini  : " + nilai.ip);
        System.out.print("Anda Berhak ");
        nilai.keterangan();
        System.out.print(" Pada Semester " + nilai.semester); 
        
    }
}
