/*Nama File     : Kendaraan.java
  Deskripsi     : berisi atribut dan method dalam class Kendaraan
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 5 Maret 2026 */

public class Kendaraan {
    /*************ATRIBUT*******************/
    private String noPlat;
    private String jenis;
    private static int counterKendaraan = 0;

    /*************METHOD********************/
    //KONSTRUKTOR
    //konstruktor untuk membuat kendaraan dengan No. Plat dan jenis kendaraan dikosongkan
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
        counterKendaraan++;
    }

    //konstruktor untuk membuat kendaraan dengan nilai No. Plat dan jenis kendaraan tertentu
    public Kendaraan(String noPlat,String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
        counterKendaraan++;
    }

    //SELEKTOR
    //mengembalikan nomor plat kendaraan
    public String getNoPlat() {
        return this.noPlat;
    }

    //mengembalikan jenis kendaraan (motor/mobil)
    public String getJenis() {
        return this.jenis;
    }

    //mengembalikan nilai counterKendaraan
    public static int getCounterKendaraan() {
        return counterKendaraan;
    }

    //MUTATOR
    //mengeset nomor plat dengan nilai baru string noPlat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    //mengeset jenis kendaraan dengan nilai baru string jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    //METHOD LAINNYA
    //mencetak data kendaraan
    public void printKendaraan() {
        System.out.println("Kendaraan ini punya nomor plat = " + this.noPlat + " dan berjenis = " + this.jenis);
    }
} //end class Kendaraan