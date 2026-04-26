/*Nama File     : Civitasakademika.java
  Deskripsi     : Civitasakademika merupakan superclass untuk kelas Dosen dan Mahasiswa
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public abstract class Civitasakademika {
    /************ATRIBUT****************/
    private String Nama;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama
    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    //SELEKTOR
    //mengembalikan Nama Civitasakademika
    public String getNama() {
        return Nama;
    }

    //mengembalikan Nomor peserta sesuai NIM/NIP
    abstract public String getNomor();
} //end class Civitasakademika