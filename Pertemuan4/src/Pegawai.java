/*Nama File     : Pegawai.java
  Deskripsi     : berisi atribut dan method dalam class Pegawai
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 19 Maret 2026 */

import java.util.ArrayList;

public class Pegawai {
    /************ATRIBUT****************/
    private String nip;
    private String nama;
    private Tanggal tanggalLahir;
    private Tanggal tmt;
    private double gajiPokok;
    private static int counterPegawai = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat pegawai tanpa parameter
    public Pegawai() {
        counterPegawai++;
    }

    //konstruktor untuk membuat pegawai dengan nilai NIP, nama, tanggal lahir, TMT, dan gaji pokok tertentu
    public Pegawai(String nip, String nama, Tanggal tanggalLahir, Tanggal tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
        counterPegawai++;
    }

    //SELEKTOR
    //mengembalikan NIP dari pegawai
    public String getNip() {
        return nip;
    }

    //mengembalikan nama dari pegawai
    public String getNama() {
        return nama;
    }

    //mengembalikan tanggal lahir dari pegawai
    public Tanggal getTanggalLahir() {
        return tanggalLahir;
    }

    //mengembalikan TMT dari pegawai
    public Tanggal getTmt() {
        return tmt;
    }

    //mengembalikan gaji pokok dari pegawai
    public double getGajiPokok() {
        return gajiPokok;
    }

    //mengembalikan jumlah objek pegawai (dalam bentuk prosedur)
    public static void printCounterPegawai() {
        System.out.println("Jumlah objek Pegawai: " + counterPegawai);
    }

    //MUTATOR
    //mengeset NIP dengan nilai baru nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    //mengeset nama dengan nilai baru nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengeset tanggal lahir dengan nilai baru tanggalLahir
    public void setTanggalLahir(Tanggal tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    //mengeset TMT dengan nilai baru tmt
    public void setTmt(Tanggal tmt) {
        this.tmt = tmt;
    }

    //mengeset gaji pokok dengan nilai baru gajiPokok
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    //METHOD LAINNYA
    //mengembalikan list yang berisi [tahun,bulan] yang merupakan selisih antara TMT dan tanggal saat ini
    public ArrayList<Integer> masaKerja(Tanggal now) {
        return this.tmt.hitungSelisih(now);
    }

    //menampilkan NIP, nama, tanggal lahir, TMT, dan gaji pokok yang dimiliki pegawai
    public void printInfo(Tanggal now) {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir.printTanggal());
        System.out.println("TMT             : " + tmt.printTanggal());
        System.out.println("Gaji Pokok      : " + gajiPokok);
    }
} //end class Pegawai