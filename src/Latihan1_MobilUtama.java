/*
 * Created By 21343014_Resti Apriliyanti
 */

public class Latihan1_MobilUtama {
    public static void main(String[] args) {
        Latihan1_Mobil Honda = new Latihan1_Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;

        System.out.println("Merek\t\t : " + Honda.merk);
        System.out.println("Warna\t\t : " + Honda.warna);
        System.out.println("Tahun Produksi\t : " + Honda.tahunproduksi);

        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
