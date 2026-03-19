/*Nama File     : Dosen.java
  Deskripsi     : berisi atribut dan method dalam class Dosen
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 19 Maret 2026 */

public class Dosen extends Pegawai {
    /************ATRIBUT****************/
    private String fakultas;
    private static int counterDosen = 0;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat dosen tanpa parameter
    public Dosen() {
        counterDosen++;
    }

    //konstruktor untuk membuat dosen dengan nilai NIP, nama, tanggal lahir, TMT, gaji pokok, dan fakultas tertentu
    public Dosen(String nip, String nama, Tanggal tanggalLahir, Tanggal tmt, double gajiPokok, String fakultas) {
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.fakultas = fakultas;
        counterDosen++;
    }

    //SELEKTOR
    //mengembalikan fakultas dari dosen
    public String getFakultas() {
        return fakultas;
    }

    //mengembalikan jumlah objek dosen (dalam bentuk prosedur)
    public static void printCounterDosen() {
        System.out.println("Jumlah objek Dosen: " + counterDosen);
    }

    //MUTATOR
    //mengeset fakultas dengan nilai baru fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    //METHOD LAINNYA
    //menampilkan NIP, nama, tanggal lahir, TMT, gaji pokok, dan fakultas yang dimiliki dosen
    @Override
    public void printInfo(Tanggal now) {
        super.printInfo(now);
        System.out.println("Fakultas        : " + fakultas);
    }
} //end class Dosen
