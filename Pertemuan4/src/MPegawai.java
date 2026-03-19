/*Nama File     : Pegawai.java
  Deskripsi     : berisi atribut dan method dalam class Pegawai
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 19 Maret 2026 */

public class MPegawai {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS TANGGAL------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Tanggal T1 = new Tanggal();
        Tanggal T2 = new Tanggal(30,6, 2006); //tanggal lahir
        Tanggal T3 = new Tanggal(28,4, 2015); //TMT
        Tanggal T4 = new Tanggal(19, 3, 2026); //tanggal sekarang
        Tanggal T5 = new Tanggal(20,11, 2020); //TMT
        Tanggal T6 = new Tanggal(5,5,1990); //tanggal lahir
        Tanggal T7 = new Tanggal(1,1,2015); //TMT
        Tanggal T8 = new Tanggal(8,7,2000); //tanggal lahir
        Tanggal T9 = new Tanggal(9,6,2026); //tanggal berakhir kontrak
        Tanggal T10 = new Tanggal(19, 3, 2027); //tanggal berakhir kontrak
        System.out.println("Tanggal: " + T1.printTanggal());
        System.out.println("Tanggal: " + T2.printTanggal());
        System.out.println();
        System.out.println("2. Cek mutator untuk tanggal T1 yang belum punya data");
        T1.setHari(26);
        T1.setBulan(9);
        T1.setTahun(2004);
        System.out.println("Tanggal: " + T1.printTanggal());
        System.out.println();
        System.out.println("3. Cek selektor untuk tanggal T2");
        System.out.println("Tanggal T2 punya hari: " + T2.getHari());
        System.out.println("Tanggal T2 punya bulan: " + T2.getBulan());
        System.out.println("Tanggal T2 punya tahun: " + T2.getTahun());
        System.out.println();
        System.out.println("4. Cek method lainnya:");
        System.out.println("Nama bulan dari tanggal T1: " + T1.getNamaBulan());
        System.out.println("Selisih tanggal T1 dan T2 adalah " + (T1.hitungSelisih(T2).get(0)) + " tahun " + T1.hitungSelisih(T2).get(1) + " bulan");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS PEGAWAI------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Pegawai P1 = new Pegawai("25001", "Kurni", T2, T3, 10000000);
        P1.printInfo(T4);
        System.out.println();
        System.out.println("2. Cek mutator untuk pegawai P1");
        P1.setNip("30405");
        P1.setNama("Zaky");
        P1.setTanggalLahir(T1);
        P1.setTmt(T5);
        P1.setGajiPokok(20000000);
        P1.printInfo(T4);
        System.out.println();
        System.out.println("3. Cek selektor untuk pegawai P1");
        System.out.println("Pegawai P1 punya NIP: " + P1.getNip());
        System.out.println("Pegawai P1 punya Nama: " + P1.getNama());
        System.out.println("Pegawai P1 punya tanggal lahir: " + P1.getTanggalLahir().printTanggal());
        System.out.println("Pegawai P1 punya TMT: " + P1.getTmt().printTanggal());
        System.out.println("Pegawai P1 punya gaji pokok: " + P1.getGajiPokok());
        System.out.println();
        System.out.println("4. Cek method lainnya:");
        Pegawai.printCounterPegawai();
        System.out.println("Masa kerja dari pegawai P1: " + P1.masaKerja(T4).get(0) + " tahun " + P1.masaKerja(T4).get(1) + " bulan");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS DOSEN------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Dosen D1 = new Dosen("440440", "Dena", T2, T5, 1200000, "Sains dan Matematika");
        D1.printInfo(T4);
        System.out.println();
        System.out.println("2. Cek mutator untuk Dosen D1");
        D1.setFakultas("Informatika");
        D1.printInfo(T4);
        System.out.println();
        System.out.println("3. Cek selektor untuk dosen D1");
        System.out.println("Dosen D1 berasal dari fakultas: " + D1.getFakultas());
        System.out.println();
        System.out.println("4. Cek method lainnya:");
        Dosen.printCounterDosen();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS DOSEN TETAP------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Dosen DT1 = new DosenTetap("9545647548", "78647324", "Andi", T6, T7, "Sains dan Matematika", 5000000);
        DT1.printInfo(T4);
        System.out.println();
        System.out.println("2. Cek mutator untuk Dosen Tetap DT1");
        ((DosenTetap)DT1).setNidn("349567");
        DT1.printInfo(T4);
        System.out.println();
        System.out.println("3. Cek selektor untuk dosen Tetap DT1");
        System.out.println("Dosen tetap DT1 punya NIDN: " + ((DosenTetap)DT1).getNidn());
        System.out.println();
        System.out.println("4. Cek method lainnya:");
        DosenTetap.printCounterDosenTetap();
        System.out.println("Tanggal pensiun dosen tetap DT1: " + ((DosenTetap)DT1).tanggalPensiun());
        System.out.println("Tunjangan dosen tetap DT1: " + ((DosenTetap)DT1).tunjangan(T4));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS DOSEN TAMU------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Dosen DTA1 = new DosenTamu("2434838", "2847291", "Gea", T8, T5, "Ilmu dan Budaya", 4300000, T9);
        DTA1.printInfo(T4);
        System.out.println();
        System.out.println("2. Cek mutator untuk Dosen Tamu DTA1");
        ((DosenTamu)DTA1).setNidk("3284958");
        ((DosenTamu)DTA1).setTanggalBerakhir(T10);
        DTA1.printInfo(T4);
        System.out.println();
        System.out.println("3. Cek selektor untuk dosen Tamu DTA1");
        System.out.println("Dosen tamu DTA1 punya NIDK: " + ((DosenTamu)DTA1).getNidk());
        System.out.println("Dosen tamu DTA1 punya tanggal berakhir kontrak: " + ((DosenTamu)DTA1).getTanggalBerakhir().printTanggal());
        System.out.println();
        System.out.println("4. Cek method lainnya:");
        DosenTamu.printCounterDosenTamu();
        System.out.println("Masa kontrak berakhir dosen tamu DTA1: " + ((DosenTamu)DTA1).masaKontrakBerakhir(T4) + " bulan");
        System.out.println("Tunjangan DTA1: " + ((DosenTamu)DTA1).tunjangan());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------TEST UNTUK CLASS TENDIK------------");
        System.out.println("1. Cek konstruktor tanpa parameter dan berparameter");
        Tendik Ten1 = new Tendik("3239492", "Reina", T6, T5, "Kemasyarakatan", 4500000);
        Ten1.printInfo(T4);
        System.out.println();
        System.out.println("2. Cek mutator untuk Tendik Ten1");
        Ten1.setBidang("Pendidikan");
        Ten1.printInfo(T4);
        System.out.println();
        System.out.println("3. Cek selektor untuk Tendik Ten1");
        System.out.println("Tendik Ten1 berasal dari bidang: " + Ten1.getBidang());
        System.out.println();
        System.out.println("4. Cek method lainnya:");
        System.out.println("Tendik Ten1 akan pensiun pada tanggal: " + Ten1.tanggalPensiun());
        System.out.println("Tendik Ten1 punya tunjangan sebesar: " + Ten1.tunjangan(T4));
    }
}