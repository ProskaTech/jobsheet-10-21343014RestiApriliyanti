/*
 * Created By 21343014_Resti Apriliyanti
 */

public class Tugas2_Nilai {
    String nama, semester, ket;
    int nim;
    double ip;

    public void keterangan () {
        Tugas2_Nilai nilai = new Tugas2_Nilai();
        nilai.ip = 3.50;
        
        if (nilai.ip >= 3.5) {
            nilai.ket = "Mendapat 24 SKS";
            System.out.print(nilai.ket);
        }

        else if (nilai.ip >= 3.0) {
            nilai.ket = "Mendapat 22 SKS";
            System.out.print(nilai.ket);
        }

        else if (nilai.ip >= 2.5) {
            nilai.ket = "Mendapat 20 SKS";
            System.out.print(nilai.ket);
        }

        else if (nilai.ip >= 2.0) {
            nilai.ket = "Mendapat 18 SKS";
            System.out.print(nilai.ket);
        }

        else if (nilai.ip < 2.0) {
            nilai.ket = "Mendapat 15 SKS";
            System.out.print(nilai.ket);
        }

        else {
            nilai.ket = "Tidak Mendapat SKS";
            System.out.print(nilai.ket);
        }
    }
    
}
