/*Nama File     : Kucing.java
  Deskripsi     : berisi atribut dan method dalam class Kucing
  Pembuat       : Annis Fakhiroh Akbar (24060124130110)
  Lab           : C1
  Tanggal       : 12 Mei 2026 */

public class Kucing extends Anabul {
    /************ATRIBUT****************/
    private double bobot; // bobot dalam kilogram

    /**********METHOD*******************/
    //KONSTRUKTOR
    //Konstruktor dengan parameter Nama dan bobot
    public Kucing (String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    //SELEKTOR
    //mengembalikan bobot Kucing
    public double getBobot() {
        return bobot;
    }

    //MUTATOR
    //mengubah bobot Kucing
    public void setBobot(double bobotBaru) {
        this.bobot = bobotBaru;
    }

    //METHOD LAINNYA
    //menampilkan jenis gerakan Kucing
    public void Gerak() {
        System.out.println("Gerak: Melata");
    }
    
    //menampilkan jenis suara Kucing
    public void Bersuara() {
        System.out.println("Suara: Meong");
    }
} //end class Kucing