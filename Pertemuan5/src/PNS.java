/*Nama File     : PNS.java
  Deskripsi     : berisi atribut dan method dalam class PNS
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 29 Maret 2026 */

// import java.text.DecimalFormat;
import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

public class PNS extends Manusia implements Pajak {
    /************ATRIBUT****************/
    private String nip;
    private static int counterPNS = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat PNS tanpa parameter
    public PNS() {
        counterPNS++;
    }

    //konstruktor untuk membuat PNS dengan nilai nama, tgl_mulai_kerja, alamat, pendapatan, dan nip tertentu
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama,tgl_mulai_kerja,alamat,pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //SELEKTOR
    //mengembalikan nip dari PNS
    public String getNip() {
        return nip;
    }

    //mengembalikan jumlah objek PNS 
    public static int getCounterPNS() {
        return counterPNS;
    }

    //MUTATOR
    //mengeset nip dengan nilai baru NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    //METHOD LAINNYA
    //menampilkan nama, tanggal mulai kerja, alamat, pendapatan, dan nip yang dimiliki PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }

    //menghitung masa kerja PNS
    @Override
    public int hitungMasaKerja() {
        return java.time.Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0;
    }

    //menghitung pajak x persen dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
} //end class PNS