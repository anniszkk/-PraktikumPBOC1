/*Nama File     : Pengusaha.java
  Deskripsi     : berisi atribut dan method dalam class Pengusaha
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 29 Maret 2026 */

// import java.text.DecimalFormat;
import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

public class Pengusaha extends Manusia implements Pajak {
    /************ATRIBUT****************/
    private String npwp;
    private static int counterPengusaha = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat Pengusaha tanpa parameter
    public Pengusaha() {
        counterPengusaha++;
    }

    //konstruktor untuk membuat Pengusaha dengan nilai nama, tgl_mulai_kerja, alamat, pendapatan, dan npwp tertentu
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //SELEKTOR
    //mengembalikan npwp dari Pengusaha
    public String getNpwp() {
        return npwp;
    }

    //mengembalikan jumlah objek Pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    //MUTATOR
    //mengeset npwp dengan nilai baru NPWP
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    //METHOD LAINNYA
    //menampilkan nama, tanggal mulai kerja, alamat, pendapatan, dan npwp yang dimiliki Pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }

    //menghitung masa kerja Pengusaha
    @Override
    public int hitungMasaKerja() {
        return java.time.Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 1;
    }

    //menghitung pajak x persen dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
} //end class Pengusaha