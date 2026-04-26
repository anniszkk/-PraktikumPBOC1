/*Nama File     : MahasiswaNo4.java
  Deskripsi     : berisi atribut dan method dalam class MahasiswaNo4
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class MahasiswaNo4 extends Civitasakademika {
    /************ATRIBUT****************/
    private String NIM;
    private Dosen Dosenwali;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama dan NIM
    public MahasiswaNo4(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
    }

    //MUTATOR
    //mengeset Dosenwali dengan nilai baru Dosen
    public void setWali(Dosen dosen) {
        this.Dosenwali = dosen;
    }

    //METHOD LAINNYA
    //mengembalikan Nomor peserta sesuai NIM
    @Override
    public String getNomor() {
        return NIM;
    }

    //menampilkan NIM, Nama, dan Dosenwali yang dimiliki Mahasiswa
    public void tampilDataMahasiswa() {
        if (Dosenwali != null) {
            System.out.println("NIM: " + NIM + " | Nama: " + getNama() + " | Dosen Wali: " + Dosenwali.getNama());
        } else {
            System.out.println("NIM: " + NIM + " | Nama: " + getNama() + " | Dosen Wali: Belum ditentukan");
        }
    }
} //end class MahasiswaNo4