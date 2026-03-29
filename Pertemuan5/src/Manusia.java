/*Nama File     : Manusia.java
  Deskripsi     : berisi atribut dan method dalam class Manusia
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 29 Maret 2026 */

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    /************ATRIBUT****************/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat Manusia tanpa parameter
    public Manusia() {
        counterMns++;
    }

    //konstruktor untuk membuat Manusia dengan nilai nama, tgl_mulai_kerja, alamat, dan pendapatan tertentu
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }    

    //SELEKTOR
    //mengembalikan nama Manusia
    public String getNama() {
        return nama;
    }

    //mengembalikan tanggal mulai kerja dari Manusia
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    //mengembalikan alamat Manusia
    public String getAlamat() {
        return alamat;
    }

    //mengembalikan pendapatan Manusia
    public double getPendapatan() {
        return pendapatan;
    }

    //mengembalikan jumlah objek Manusia
    public static int getCounterMns() {
        return counterMns;
    }

    //MUTATOR
    //mengeset nama dengan nilai baru nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengeset tgl_mulai_kerja dengan nilai baru tanggal mulai kerja
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    //mengeset alamat dengan nilai baru alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //mengeset pendapatan dengan nilai baru pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    //METHOD LAINNYA
    //menampilkan nama, tanggal mulai kerja, alamat, dan pendapatan yang dimiliki Manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Alamat: "+ alamat);
        System.out.println("Pendapatan: " + new DecimalFormat("'Rp '###,###.00").format(pendapatan));
    }

    //menghitung masa kerja Manusia
    public abstract int hitungMasaKerja();

    //menggunakan bentuk string ke LocalDate, agar dalam main class tidak perlu parsing manual
    public static LocalDate konversiTanggal(String tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(tanggal, formatter);
    }
} //end class Manusia