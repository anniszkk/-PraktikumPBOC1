/*Nama File     : AngkaSialException.java
  Deskripsi     : Eksepsi buatan sendiri, menolak masukan angka 13!
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 16 April 2026 */

public class AngkaSialException extends Exception {
    /**********METHOD*******************/
    //KONSTRUKTOR
    //konstruktor untuk membuat AngkaSialException dengan pesan default
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
} //end class AngkaSialException