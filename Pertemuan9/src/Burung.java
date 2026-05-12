/*Nama File     : Burung.java
  Deskripsi     : berisi atribut dan method dalam class Burung
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 12 Mei 2026 */

public class Burung extends Anabul {
    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama
    public Burung(String Nama) {
        super(Nama);
    }

    //METHOD LAINNYA
    //menampilkan jenis gerakan Burung
    public void Gerak() {
        System.out.println("Gerak: Terbang");
    }

    //menampilkan jenis suara Burung
    public void Bersuara() {
        System.out.println("Suara: Cuit");
    }
} //end class Burung