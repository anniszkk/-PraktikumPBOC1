/*Nama File     : Anjing.java
  Deskripsi     : berisi atribut dan method dalam class Anjing
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 26 April 2026 */

public class Anjing extends Anabul {
    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama
    public Anjing(String Nama) {
        super(Nama);
    }

    //METHOD LAINNYA
    //menampilkan jenis gerakan Anjing
    public void Gerak() {
        System.out.println("Gerak: Melata");
    }

    //menampilkan jenis suara Anjing
    public void Bersuara() {
        System.out.println("Suara: Guk-guk");
    }
} //end class Anjing