/*Nama File     : Dosen.java
  Deskripsi     : berisi atribut dan method dalam class Dosen
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class Dosen extends Civitasakademika {
    /************ATRIBUT****************/
    private String NIP;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama dan NIP
    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    //METHOD LAINNYA
    //mengembalikan Nomor peserta sesuai NIP
    @Override
    public String getNomor() {
        return NIP;
    }
} //end class Dosen