/*Nama File     : DosenTetap.java
  Deskripsi     : berisi atribut dan method dalam class DosenTetap
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 19 Maret 2026 */

import java.util.ArrayList;

public class DosenTetap extends Dosen {
    /************ATRIBUT****************/
    private String nidn;
    private final int bup = 65;
    private final double tunjangan = 0.02;
    private static int counterDosenTetap = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat dosen tetap tanpa parameter
    public DosenTetap() {
        counterDosenTetap++;
    }

    //konstruktor untuk membuat dosen tetap dengan nilai NIP, nama, tanggal lahir, TMT, gaji pokok, fakultas, dan NIDN tertentu
    public DosenTetap(String nip, String nidn, String nama, Tanggal tanggalLahir, Tanggal tmt, String fakultas, double gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
        counterDosenTetap++;
    }

    //SELEKTOR
    //mengembalikan NIDN dari dosen tetap
    public String getNidn() {
        return nidn;
    }

    //mengembalikan jumlah objek dosen tetap (dalam bentuk prosedur)
    public static void printCounterDosenTetap() {
        System.out.println("Jumlah objek Dosen Tetap: " + counterDosenTetap);
    }

    //MUTATOR
    //mengeset NIDN dengan nilai baru nidn
    public void setNidn(String nidn) {
        this.nidn = nidn;
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

    //menampilkan informasi lengkapp dari dosen tetap
    @Override
    public void printInfo(Tanggal now) {
        super.printInfo(now);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Masa Kerja      : " + this.masaKerja(now).get(0) + " tahun " + this.masaKerja(now).get(1) + " bulan");
        System.out.println("Tanggal Pensiun : " + this.tanggalPensiun());
        System.out.println("Tunjangan       : 2% x " + this.masaKerja(now).get(0) + " x Rp " + this.getGajiPokok() + " = Rp. "+ this.tunjangan(now));
    }
} //end class DosenTetap