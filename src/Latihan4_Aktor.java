/*
 * Created By 21343014_Resti Apriliyanti
 */

public class Latihan4_Aktor {
    String nama;
    int umur;

    Latihan4_Aktor(String n, int u) {
        nama = n;
        umur = u;
    }

    void tampilAktor(){
        System.out.println("Namaku : " + nama);
        System.out.println("Umurku : " + umur + " Tahun");
    }

    public static void main(String[] args) {
        Latihan4_Aktor a;

        a = new Latihan4_Aktor("Ronaldo",33);
        a.tampilAktor();
        System.out.println("============");

        a = new Latihan4_Aktor("Messi",34);
        a.tampilAktor();
        System.out.println("============");
    }
    
}
