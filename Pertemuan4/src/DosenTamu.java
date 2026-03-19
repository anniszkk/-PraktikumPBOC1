/*Nama File     : DosenTamu.java
  Deskripsi     : berisi atribut dan method dalam class DosenTamu
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 19 Maret 2026 */

import java.util.ArrayList;

public class DosenTamu extends Dosen {
    /************ATRIBUT****************/
    private String nidk;
    private Tanggal tanggalBerakhirKontrak;
    private final double tunjangan = 0.025;
    private static int counterDosenTamu = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat dosen tamu tanpa parameter
    public DosenTamu() {
        counterDosenTamu++;
    }

    //konstruktor untuk membuat dosen tamu dengan nilai NIP, nama, tanggal lahir, TMT, gaji pokok, fakultas, NIDK, dan tanggal berakhir kontrak tertentu
    public DosenTamu(String nip, String nidk, String nama, Tanggal tanggalLahir, Tanggal tmt, String fakultas, double gajiPokok, Tanggal tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
        counterDosenTamu++;
    }

    //SELEKTOR
    //mengembalikan NIDK dari dosen tamu
    public String getNidk() {
        return nidk;
    }

    //mengembalikan tanggal berakhir kontrak dari dosen tamu
    public Tanggal getTanggalBerakhir() {
        return tanggalBerakhirKontrak;
    }

    //mengembalikan jumlah objek dosen tamu (dalam bentuk prosedur)
    public static void printCounterDosenTamu() {
        System.out.println("Jumlah objek Dosen Tamu: " + counterDosenTamu);
    }

    //MUTATOR
    //mengeset NIDK dengan nilai baru nidk
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    //mengeset tanggal berakhir kontrak dengan nilai baru tanggalBerakhirKontrak
    public void setTanggalBerakhir(Tanggal tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    //METHOD LAINNYA
    //mengembalikan sisa kontrak (bulan) yang dihitung dari selisih tanggal berakhir kontrak dan tanggal saat ini
    public int masaKontrakBerakhir(Tanggal now) {
        ArrayList<Integer> selisih = now.hitungSelisih(tanggalBerakhirKontrak);
        return (selisih.get(0) * 12) + selisih.get(1);
    }

    //mengembalikan jumlah tunjangan yang dihitung dari persen tunjangan * gaji pokok
    public double tunjangan() {
        return tunjangan * getGajiPokok();
    }

    //menampilkan informasi lengkap dari dosen tamu
    @Override
    public void printInfo(Tanggal now) {
        super.printInfo(now);
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Masa Kerja      : " + this.masaKerja(now).get(0) + " tahun " + this.masaKerja(now).get(1) + " bulan");
        System.out.println("Sisa Kontrak    : " + this.masaKontrakBerakhir(now) + " bulan");
        System.out.println("Tunjangan       : 2.5% x " + this.getGajiPokok() + " = Rp. "+ this.tunjangan());
    }
} //end class DosenTamu