/*Nama File     : Datum.java
  Deskripsi     : Datum adalah kelas generik yang dapat menampung berbagai tipe data dengan menggunakan parameter tipe T.
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 3 Mei 2026 */

public class Datum<T> {
    /************ATRIBUT****************/
    private T isi;

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter isi
    public Datum(T isi) {
        this.isi = isi;
    }

    //SELEKTOR
    //mengembalikan nilai isi
    public T getIsi() {
        return isi;
    }

    //MUTATOR
    //mengubah nilai isi
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
} //end class Datum