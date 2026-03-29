/*Nama File     : Petani.java
  Deskripsi     : berisi atribut dan method dalam class Petani
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 29 Maret 2026 */

// import java.text.DecimalFormat;
import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
public class Petani extends Manusia implements Pajak {
    /************ATRIBUT****************/
    private String asal_kota;
    private static int counterPetani = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat Petani tanpa parameter
    public Petani() {
        counterPetani++;
    }

    //konstruktor untuk membuat Petani dengan nilai nama, tgl_mulai_kerja, alamat, pendapatan, dan asal_kota tertentu
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //SELEKTOR
    //mengembalikan asal_kota dari Petani
    public String getAsalKota() {
        return asal_kota;
    }

    //mengembalikan jumlah objek Petani 
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    //MUTATOR
    //mengeset asal_Kota dengan nilai baru asal kota
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    //METHOD LAINNYA
    //menampilkan nama, tanggal mulai kerja, alamat, pendapatan, dan asal kota yang dimiliki Petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }

    //menghitung masa kerja Petani
    @Override
    public int hitungMasaKerja() {
        return java.time.Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 1;
    }

    //menghitung pajak x persen dari pendapatan
    @Override
    public double hitungPajak() {
        return 0;
    }
} //end class Petani