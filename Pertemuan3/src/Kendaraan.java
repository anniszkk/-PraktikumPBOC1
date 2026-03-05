/*Nama File     : Garis.java
  Deskripsi     : berisi atribut dan method dalam class Garis
  Pembuat       : Annis Fakhiroh Akbar
  Tanggal       : 27 Februari 2026 */

public class Kendaraan {
    /*************ATRIBUT*******************/
    private String noPlat;
    private String jenis;
    private static int counterKendaraan;

    /*************METHOD********************/
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
        counterKendaraan++;
    }

    public Kendaraan(String noPlat,String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
        counterKendaraan++;
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public static int getCounterKendaraan() {
        return counterKendaraan;
    }

    public void printKendaraan() {
        System.out.println("Kendaraan ini punya nomor plat = " + this.noPlat + " dan berjenis = " + this.jenis);
    }
}
