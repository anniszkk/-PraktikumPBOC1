/*Nama File     : Tendik.java
  Deskripsi     : berisi atribut dan method dalam class Tendik
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 19 Maret 2026 */

import java.util.ArrayList;

public class Tendik extends Pegawai {
    /************ATRIBUT****************/
    private String bidang;
    private final int bup = 55;
    private final double tunjangan = 0.01;
    private static int counterTendik = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat tendik tanpa parameter
    public Tendik() {
        counterTendik++;
    }

    //konstruktor untuk membuat tendik dengan nilai NIP, nama, tanggal lahir, TMT, gaji pokok, dan bidang tertentu
    public Tendik(String nip, String nama, Tanggal tanggalLahir, Tanggal tmt, String bidang, double gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
        counterTendik++;
    }

    //SELEKTOR
    //mengembalikan bidang dari tendik
    public String getBidang() {
        return bidang;
    }

    //mengembalikan jumlah objek tendik (dalam bentuk prosedur)
     public static void printCounterTendik() {
        System.out.println("Jumlah objek Tendik: " + counterTendik);
    }

    //MUTATOR
    //mengeset bidang dengan nilai baru bidang
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    //METHOD LAINNYA
    //mengembalikan string dalam format contoh dd <Januari> yyyy yang merupakan tanggal pensiun, dihitung dari tanggal lahir + BUP
    //dan jatuh pada tanggal 1 bulan berikutnya
    public String tanggalPensiun() {
        int pensiunTahun = getTanggalLahir().getTahun() + bup;
        int pensiunBulan = getTanggalLahir().getBulan() + 1;
        int pensiunHari = 1;
        if (pensiunBulan > 12) {
            pensiunBulan = 1;
            pensiunTahun++;
        }
        Tanggal hasil = new Tanggal(pensiunHari, pensiunBulan, pensiunTahun);
        return hasil.printTanggal();
    }

    //mengembalikan jumlah tunjangan yang dihitung dari persen tunjangan * masa kerja (tahun) * gaji pokok
    public double tunjangan(Tanggal now) {
        ArrayList<Integer> masaKerja = this.masaKerja(now);
        return tunjangan * masaKerja.get(0) * this.getGajiPokok();
    }

    //menampilkan informasi lengkap dari tendik
    @Override
    public void printInfo(Tanggal now) {
        super.printInfo(now);
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + this.masaKerja(now).get(0) + " tahun " + this.masaKerja(now).get(1) + " bulan");
        System.out.println("Tanggal Pensiun : " + this.tanggalPensiun());
        System.out.println("Tunjangan       : 1% x " + this.masaKerja(now).get(0) + " x Rp " + this.getGajiPokok() + " = Rp. "+ this.tunjangan(now));
    }
}// end class Tendik